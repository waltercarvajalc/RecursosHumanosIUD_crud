/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.FuncionarioDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;

/**
 *
 * @author Familia
 */
public class FuncionarioController {
        private FuncionarioDao funcionarioDao;

    public FuncionarioController(FuncionarioDao funcionarioDao) {
        this.funcionarioDao = funcionarioDao;
    }

    public DefaultTableModel llenarTabla() {
        DefaultTableModel tablaFuncionarios = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaFuncionarios.addColumn("ID");
        tablaFuncionarios.addColumn("Tipo Doc.");
        tablaFuncionarios.addColumn("N°Doc.");
        tablaFuncionarios.addColumn("Nombres");
        tablaFuncionarios.addColumn("Apellidos");
        tablaFuncionarios.addColumn("Fecha Nac.");
        tablaFuncionarios.addColumn("Estado Civil");
        List<Funcionario> funcionarios = funcionarioDao.findAll();
        String registros[] = new String[7];
        for (Funcionario f : funcionarios) {
            registros[0] = String.valueOf(f.getId());
            registros[1] = f.getTipoIdentificacionId().getNombre();
            registros[2] = f.getNumeroIdentificacion();
            registros[3] = f.getNombres();
            registros[4] = f.getApellidos();
            registros[5] = f.getFechaNacimiento().toString();
            registros[6] = f.getEstadoCivilId().getNombre();
            tablaFuncionarios.addRow(registros);
        }

        return tablaFuncionarios;
    }
    
    public Funcionario buscarFuncionario(String documento){
        Funcionario funcionario = funcionarioDao.findByDocumento(documento);
        return funcionario;
    }
    
    public int guardar(Funcionario funcionario){
        return funcionarioDao.save(funcionario);
    }
    
    public int editar(Funcionario funcionario){
        return funcionarioDao.update(funcionario);
    }
    
    public void eliminar(String documento){
        funcionarioDao.delete(documento);
    }
}
