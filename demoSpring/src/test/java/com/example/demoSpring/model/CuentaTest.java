package com.example.demoSpring.model;

import com.example.demoSpring.model.Cuenta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {

    @Test
    public void testCuentaConstructor() {
        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta("478758");
        cuenta.setTipoCuenta("Ahorros");
        cuenta.setSaldoInicial(2000.00);
        cuenta.setEstado(true);

        assertEquals("478758", cuenta.getNumeroCuenta());
        assertEquals("Ahorros", cuenta.getTipoCuenta());
        assertEquals(2000.00, cuenta.getSaldoInicial());
        assertTrue(cuenta.isEstado());
    }

    @Test
    public void testCuentaGettersSetters() {
        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta("225487");
        cuenta.setTipoCuenta("Corriente");
        cuenta.setSaldoInicial(100.00);
        cuenta.setEstado(true);


        assertAll("cuenta",
                () -> assertEquals("225487", cuenta.getNumeroCuenta()),
                () -> assertEquals("Corriente", cuenta.getTipoCuenta()),
                () -> assertEquals(100.00, cuenta.getSaldoInicial()),
                () -> assertTrue(cuenta.isEstado())
        );
    }
}
