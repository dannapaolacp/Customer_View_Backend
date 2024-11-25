package com.backend;

import com.backend.controller.ClientController;
import com.backend.model.ClientModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase utilizada para pruebas unitarias de la aplicación Backend.
 */
class BackendApplicationTests {

    /**
     * Prueba unitaria para validar el funcionamiento del método getClient del controlador
     */
    @Test
    void testGetClient() {
        // Crear una instancia del controlador
        ClientController controller = new ClientController();

        // Ejecutar método getClient
        ClientModel client = controller.getClient("C", "123456");

        // Validar que los datos del cliente devueltos sean correctos
        assertEquals("José", client.getFirstName(), "El primer nombre no coincide");
        assertEquals("Luis", client.getMiddleName(), "El segundo nombre no coincide");
        assertEquals("Pérez", client.getLastName(), "El primer apellido no coincide");
        assertEquals("Bogotá", client.getCity(), "La ciudad no coincide");
    }
}
