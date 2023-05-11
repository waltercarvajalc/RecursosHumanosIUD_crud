/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Familia
 */
public class GrupoFamiliar {
    
    private int id;
    private String nombre;
    private Funcionario funcionarioId;
    private Parentesco parentescoId;

    public GrupoFamiliar(){
        
    }
    
    public GrupoFamiliar(int id, String nombre, Funcionario funcionarioId, Parentesco parentescoId) {
        this.id = id;
        this.nombre = nombre;
        this.funcionarioId = funcionarioId;
        this.parentescoId = parentescoId;
    }

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Funcionario getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Funcionario funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public Parentesco getParentescoId() {
        return parentescoId;
    }

    public void setParentescoId(Parentesco parentescoId) {
        this.parentescoId = parentescoId;
    }
    
    
}
