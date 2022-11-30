/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HolaSpring.controller;

import com.example.HolaSpring.interfaceservice.ProductoServiceInterface;
import com.example.HolaSpring.models.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aterron
 */
@RestController
@RequestMapping
public class ProductoController {
    
    @Autowired
    private ProductoServiceInterface productoServiceInterface;
    
    @GetMapping("producto/obtener")
    public List<Producto> obtener(){
        return productoServiceInterface.obtener();                
        
    }
    
    @PostMapping("producto/obtener/id")
    public Optional<Producto> obtenerId(@RequestBody Producto entidad){
        return productoServiceInterface.obtenerPorId(entidad.getId());                
        
    }
    
    @PostMapping("producto")
    public void guardar(@RequestBody Producto entidad){
        productoServiceInterface.guardar(entidad);        
        
    }
    
    @PostMapping("producto/eliminar")
    public void eliminar(@RequestBody Producto entidad){
        productoServiceInterface.eliminar(entidad.getId());        
        
    }
    
}
