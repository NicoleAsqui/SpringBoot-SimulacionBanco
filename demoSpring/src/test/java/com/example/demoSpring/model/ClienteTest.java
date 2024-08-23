package com.example.demoSpring.model;

import com.example.demoSpring.model.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testClienteConstructor() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Jose Lema");
        cliente.setGenero("Masculino");
        cliente.setEdad(30);
        cliente.setIdentificacion("001");
        cliente.setDireccion("Otavalo sn y principal");
        cliente.setTelefono("098254785");
        cliente.setContrasena("1234");
        cliente.setEstado(true);

        // Verificar que los atributos se hayan establecido correctamente
        assertEquals("Jose Lema", cliente.getNombre());
        assertEquals("Masculino", cliente.getGenero());
        assertEquals(30, cliente.getEdad());
        assertEquals("001", cliente.getIdentificacion());
        assertEquals("Otavalo sn y principal", cliente.getDireccion());
        assertEquals("098254785", cliente.getTelefono());
        assertEquals("1234", cliente.getContrasena());
        assertTrue(cliente.isEstado()); // Cambié getEstado() a isEstado() para booleano
    }

    @Test
    public void testClienteGettersSetters() {
        // Crear un objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Marianela Montalvo");
        cliente.setGenero("Femenino");
        cliente.setEdad(28);
        cliente.setIdentificacion("002");
        cliente.setDireccion("Amazonas y NNUU");
        cliente.setTelefono("097548965");
        cliente.setContrasena("5678");
        cliente.setEstado(true);

        // Verificar que los atributos se hayan establecido correctamente
        assertAll("cliente",
                () -> assertEquals("Marianela Montalvo", cliente.getNombre()),
                () -> assertEquals("Femenino", cliente.getGenero()),
                () -> assertEquals(28, cliente.getEdad()),
                () -> assertEquals("002", cliente.getIdentificacion()),
                () -> assertEquals("Amazonas y NNUU", cliente.getDireccion()),
                () -> assertEquals("097548965", cliente.getTelefono()),
                () -> assertEquals("5678", cliente.getContrasena()),
                () -> assertTrue(cliente.isEstado()) // Cambié getEstado() a isEstado() para booleano
        );
    }
}
