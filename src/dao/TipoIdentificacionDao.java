/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.TipoIdentificacion;

/**
 *
 * @author Familia
 */
public interface TipoIdentificacionDao {
    
    List<TipoIdentificacion> findAll();
    
}
