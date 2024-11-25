package com.backend.controller;

import com.backend.model.ClientModel;
import com.backend.exception.validationsClient;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Controlador REST para manejo de solicitudes relacionadas con el cliente.
 */
@Slf4j
@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    /**
     * Endpoint para obtener información de un cliente.
     *
     * @param type     Tipo de documento ("C" o "P").
     * @param document Número de documento del cliente.
     * @return Un objeto `ClientModel` con los datos del cliente.
     */
    @GetMapping
    public ClientModel getClient(
            // Definir parámetros
            @RequestParam("type") String type,
            @RequestParam("document") String document
    ) {
        // Registrar el inicio de la solicitud con los parámetros recibidos.
        log.info("Solicitud recibida - Tipo: {}, Documento: {}", type, document);

        // Validar tipo de documento: debe ser "C" (cédula) o "P" (pasaporte).
        if (!type.equals("C") && !type.equals("P")) {
            log.error("Tipo de documento no permitido: {}", type);
            throw new validationsClient("Tipo de documento inválido. Solo se permite 'C' o 'P'.");
        }

        // Validar que el número de documento no sea nulo o vacío.
        if (document == null || document.trim().isEmpty()) {
            log.error("El número de documento es nulo o vacío");
            throw new validationsClient("El número de documento es obligatorio.");
        }

        // Registrar que las validaciones se completaron exitosamente.
        log.info("Validaciones completadas. Generando respuesta con datos del cliente.");

        // Crear un cliente con información fija
        ClientModel client = new ClientModel(
                "José",          
                "Luis",       
                "Pérez",    
                "González", 
                "123456789",     
                "Calle Falsa 123", 
                "Bogotá"        
        );

        // Registrar los datos generados del cliente en el log (modo debug).
        log.debug("Datos del cliente generados: {}", client);

        // Retornar el cliente generado.
        return client;
    }
}
