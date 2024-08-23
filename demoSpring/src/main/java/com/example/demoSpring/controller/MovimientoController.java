package com.example.demoSpring.controller;

import com.example.demoSpring.model.Cuenta;
import com.example.demoSpring.model.Movimiento;
import com.example.demoSpring.repository.CuentaRepository;
import com.example.demoSpring.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {

    @Autowired
    private MovimientoRepository movimientoRepository;

    @Autowired
    private CuentaRepository cuentaRepository;

    @PostMapping
    public ResponseEntity<?> createMovimiento(@RequestBody Movimiento movimiento) {
        Optional<Cuenta> cuentaOpt = cuentaRepository.findById(movimiento.getId()); // Debes ajustar esto según el campo de la cuenta en Movimiento
        if (cuentaOpt.isPresent()) {
            Cuenta cuenta = cuentaOpt.get();
            if (cuenta.getSaldoInicial() + movimiento.getValor() < 0) {
                return ResponseEntity.badRequest().body("Saldo no disponible");
            }
            cuenta.setSaldoInicial(cuenta.getSaldoInicial() + movimiento.getValor());
            cuentaRepository.save(cuenta);
            movimiento.setFecha(LocalDateTime.now());
            return ResponseEntity.ok(movimientoRepository.save(movimiento));
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<?> getAllMovimientos() {
        return ResponseEntity.ok(movimientoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovimientoById(@PathVariable Long id) {
        Optional<Movimiento> movimiento = movimientoRepository.findById(id);
        return movimiento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
