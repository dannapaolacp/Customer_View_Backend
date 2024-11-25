package com.backend.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa la información básica de un cliente.
 */
@Getter
@Setter
public class ClientModel {
    //Atributos de la clase
    private String firstName;      
    private String middleName;     
    private String lastName;      
    private String secondLastName; 
    private String phone;          
    private String address;        
    private String city;           

    /**
     * Constructor para inicializar un cliente con toda su información básica.
     * 
     * @param firstName      
     * @param middleName     
     * @param lastName       
     * @param secondLastName 
     * @param phone          
     * @param address       
     * @param city           
     */
    public ClientModel(String firstName, String middleName, String lastName, String secondLastName, String phone, String address, String city) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
    }
}
