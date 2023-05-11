/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.EstadoCivilDao;
import dao.EstadoCivilDaoImpl;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.EstadoCivil;

/**
 *
 * @author Familia
 */
public class EstadoCivilController {
        private final EstadoCivilDao estadoCivilDao;

    public EstadoCivilController(EstadoCivilDao estadoCivilDao) {
        this.estadoCivilDao = estadoCivilDao;
    }


    public DefaultComboBoxModel llenarSelector() {
        DefaultComboBoxModel selectorEstadosCiviles = new DefaultComboBoxModel();

        List<EstadoCivil> estadosCiviles = estadoCivilDao.findAll();
        for (EstadoCivil elem : estadosCiviles) {
            selectorEstadosCiviles.addElement(elem.getNombre());
        }
        return selectorEstadosCiviles;
    }
    
}
