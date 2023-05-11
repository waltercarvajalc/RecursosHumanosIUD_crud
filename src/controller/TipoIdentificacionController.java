/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.TipoIdentificacionDao;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.TipoIdentificacion;

/**
 *
 * @author Familia
 */
public class TipoIdentificacionController {
        
    private TipoIdentificacionDao tipoIdentificacionDao;

    public TipoIdentificacionController(TipoIdentificacionDao tipoIdentificacionDao) {
        this.tipoIdentificacionDao = tipoIdentificacionDao;
    }
    
    public DefaultComboBoxModel llenarSelector(){
        DefaultComboBoxModel selectorTipoID = new DefaultComboBoxModel();
        List<TipoIdentificacion> tiposID = tipoIdentificacionDao.findAll();
        for(TipoIdentificacion elem: tiposID){
            selectorTipoID.addElement(elem.getNombre());
        }
        return selectorTipoID;
    }
}
