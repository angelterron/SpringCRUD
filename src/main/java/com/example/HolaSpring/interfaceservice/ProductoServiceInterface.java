/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.HolaSpring.interfaceservice;

import com.example.HolaSpring.models.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author aterron
 */
public interface ProductoServiceInterface {
    /**
     * obtener todos los registros
     * @return 
     */
    public List<Producto> obtener();
    
    /**
     * obtener registros por id
     * @param id
     * @return 
     */
    public Optional<Producto> obtenerPorId(int id);
    
    /**
     * guardar producto
     * @param producto 
     */
    public void guardar(Producto producto);
    
    /**
     * eliminar producto
     * @param id 
     */
    public void eliminar(int id);
    
}
