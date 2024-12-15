/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecamenparcial3;

/**
 *
 * @author deree
 */
public class PacienteDLC {
    private Integer numeroHistorial;
    private String Enfermedad;

    public PacienteDLC(Integer numeroHistorial, String Enfermedad) {
        this.numeroHistorial = numeroHistorial;
        this.Enfermedad = Enfermedad;
    }

    public Integer getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(Integer numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }
    
    
}
