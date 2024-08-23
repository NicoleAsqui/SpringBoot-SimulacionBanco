package com.example.demoSpring.integration;

import com.example.demoSpring.model.Cliente;
import com.example.demoSpring.repository.ClienteRepository;
import com.example.demoSpring.services.ClienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class ClientServiceIntegrationTest {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteRepository clienteRepository;

    @BeforeEach
    public void setUp() {
        clienteRepository.deleteAll();
    }

    @Test
    public void testSaveAndFindById() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Jose Lema");
        Cliente savedCliente = clienteService.save(cliente);

        Optional<Cliente> foundCliente = clienteService.findById(savedCliente.getId());
        assertTrue(foundCliente.isPresent());
        assertEquals("Jose Lema", foundCliente.get().getNombre());
    }

    @Test
    public void testDeleteById() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Jose Lema");
        Cliente savedCliente = clienteService.save(cliente);

        clienteService.deleteById(savedCliente.getId());

        Optional<Cliente> foundCliente = clienteService.findById(savedCliente.getId());
        assertFalse(foundCliente.isPresent());
    }
}
