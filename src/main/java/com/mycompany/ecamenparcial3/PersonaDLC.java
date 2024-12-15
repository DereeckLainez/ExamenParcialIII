/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecamenparcial3;

/**
 *
 * @author deree
 */
public class PersonaDLC {

    private String Nombre;
    private String Edad;
    private String Direccion;
    private String Telefono;
    
    public PersonaDLC (String Nombre, String Edad, String Direccion, String Telefono){
        this.Nombre=Nombre;
        this.Edad=Nombre;
        this.Direccion=Direccion;
        this.Telefono=Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    }
