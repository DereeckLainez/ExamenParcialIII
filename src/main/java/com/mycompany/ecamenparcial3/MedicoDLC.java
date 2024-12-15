/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecamenparcial3;

/**
 *
 * @author deree
 */
public class MedicoDLC extends PersonaDLC{
    private String EspecialidadDL;
    private Integer AniosExperienciaDL;

    public MedicoDLC(String EspecialidadDL, Integer AniosExperienciaDL, String Nombre, String Edad, String Direccion, String Telefono) {
        super(Nombre, Edad, Direccion, Telefono);
        this.EspecialidadDL = EspecialidadDL;
        this.AniosExperienciaDL = AniosExperienciaDL;
    }

    public String getEspecialidadDL() {
        return EspecialidadDL;
    }

    public void setEspecialidadDL(String EspecialidadDL) {
        this.EspecialidadDL = EspecialidadDL;
    }

    public Integer getAniosExperienciaDL() {
        return AniosExperienciaDL;
    }

    public void setAniosExperienciaDL(Integer AniosExperienciaDL) {
        this.AniosExperienciaDL = AniosExperienciaDL;
    }
    
    
    
}
