/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HolaSpring.service;

import com.example.HolaSpring.data.ProductoData;
import com.example.HolaSpring.interfaceservice.ProductoServiceInterface;
import com.example.HolaSpring.models.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aterron
 */
@Service
public class ProductoService implements ProductoServiceInterface{
    
    @Autowired
    private ProductoData productoData;

    @Override
    public List<Producto> obtener() {
        return (List<Producto>) productoData.findAll();
    }

    @Override
    public Optional<Producto> obtenerPorId(int id) {
        return productoData.findById(id);
    }

    @Override
    public void guardar(Producto producto) {
        productoData.save(producto);
    }

    @Override
    public void eliminar(int id) {
        productoData.deleteById(id);
    }
    
}
