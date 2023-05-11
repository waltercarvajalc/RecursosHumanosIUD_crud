/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDate;
import model.Funcionario;

/**
 *
 * @author Familia
 */
public class FuncionarioDto extends Funcionario{
    
    private String estadoCivil;
    private String tipoId;

    public FuncionarioDto(){
        
    }
    
    public FuncionarioDto(int id, String numeroIdentificacion, String nombres, String apellidos, String sexo, String direccion, String telefono, LocalDate fechaNacimiento, String estadoCivil, String tipoId) {
        super(id, numeroIdentificacion, nombres, apellidos, sexo, direccion, telefono, fechaNacimiento);
        this.estadoCivil = estadoCivil;
        this.tipoId = tipoId;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }
    
}
