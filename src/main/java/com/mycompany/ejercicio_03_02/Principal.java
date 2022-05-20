/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

/**
 *
 * @author admin
 */
public class Principal {
    
    public static void main(String [] args){
        
        var v1 = new Ventana1("Inscribete");
        v1.setVisible(true);
        
        var v2 = new Ventana2(" Datos Personales ");
        v2.setVisible(true);
        
        var v2b = new Ventana2b(" Informacion de Carrera ");
        v2b.setVisible(true);
        
        var v3 = new Ventana3("Crear Grupo");
        v3.setVisible(true);
        
        var v4 = new Ventana4(" Seleccion ");
        v4.setVisible(true);
        
    }
}
