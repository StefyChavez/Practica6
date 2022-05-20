/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Ventana4 extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private JComboBox jComboBox1;
    
    
    public Ventana4 (String title) throws HeadlessException {
        super(title);
        this.setSize(1300,180);
        this.setLocation(300,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(3,3));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(0).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jPanelList.get(1).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(1).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jPanelList.get(2).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(2).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jPanelList.get(3).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(3).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jPanelList.get(4).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(4).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jPanelList.get(5).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(5).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jPanelList.get(6).setBackground(Color.white);
        this.jPanelList.get(6).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus/Extension: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Codigo del Proyecto: "));
        this.jLabelList.add(new JLabel("Modalidad: ")); 
        this.jLabelList.add(new JLabel("Periodo Académico: "));
        this.jLabelList.add(new JLabel("Fecha Inicio de Clases: 28/03/2022 al 06/08/2022 ")); 
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        
        
    }
    
            
    public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Matriz Cuenca");
        this.jComboBox1.addItem("Quito");
        this.jComboBox1.addItem("Guayaquil");     
        this.jPanelList.get(0).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("El Vecino");
        this.jComboBox1.addItem("Centenario");
        this.jComboBox1.addItem("Maria Auxiliadora");
        this.jComboBox1.addItem("El Girón");
        this.jComboBox1.addItem("Extension Cayambe");
        this.jComboBox1.addItem("Sur");
        this.jPanelList.get(1).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Arquitectura");
        this.jComboBox1.addItem("Agropecuaria");  
        this.jComboBox1.addItem("Administracion de Empresas");
        this.jComboBox1.addItem("Biomedicina");
        this.jComboBox1.addItem("Biotecnología");
        this.jComboBox1.addItem("Computacion");
        this.jComboBox1.addItem("Comunicacion");
        this.jComboBox1.addItem("Derecho");
        this.jComboBox1.addItem("Educación");
        this.jComboBox1.addItem("Electrónica y Automatización");
        this.jComboBox1.addItem("Ingeniería Civil");
        this.jPanelList.get(2).add(this.jComboBox1);
        
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Arquitectura Nueva o Rediseño");
        this.jComboBox1.addItem("Agropecuaria Nueva o Rediseño");  
        this.jComboBox1.addItem("Administración de Empresas Nueva o Rediseño");
        this.jComboBox1.addItem("Biomedicina Nueva ");
        this.jComboBox1.addItem("Biotecnología Nueva ");
        this.jComboBox1.addItem("Computacion  Rediseño");
        this.jComboBox1.addItem("Comunicación Nueva o Rediseño");
        this.jComboBox1.addItem("Derecho Nueva");
        this.jComboBox1.addItem("Educación Nueva o Rediseño");
        this.jComboBox1.addItem("Electrónica y Automatización Rediseño");
        this.jComboBox1.addItem("Ingeniería Civil Nueva ");
        this.jPanelList.get(3).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Presencial");
        this.jComboBox1.addItem("Virtal");
        this.jPanelList.get(4).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("2021 - 2022");
        this.jComboBox1.addItem("2021 - 2022");
        this.jComboBox1.addItem("2021 - 2021");
        this.jPanelList.get(5).add(this.jComboBox1);
    }
    
}
