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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author admin
 */
public class Ventana2b extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    
    
    public Ventana2b (String title) throws HeadlessException {
        super(title);
        this.setSize(500,500);
        this.setLocation(1100, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(9,0));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarBotones();
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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(new Color(44, 90, 220));
        this.jPanelList.get(0).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jPanelList.get(0).setBorder(new EmptyBorder(10, 10, 10, 10));
        this.jPanelList.get(1).setBackground(Color.white);
        this.jPanelList.get(2).setBackground(Color.white);
        this.jPanelList.get(3).setBackground(Color.white);
        this.jPanelList.get(4).setBackground(Color.white);
        this.jPanelList.get(5).setBackground(Color.white);
        this.jPanelList.get(6).setBackground(Color.white);
        this.jPanelList.get(7).setBackground(Color.white);
        this.jPanelList.get(8).setBackground(Color.white);
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INFORMACIÓN DE CARRERA "));
        this.jLabelList.add(new JLabel("Periodo Académico:   2022 - 2022 "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Jornada: ")); 
        this.jLabelList.add(new JLabel("Fecha de Resgistro: 20/05/2022 ")); 
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        
        
    }
       
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));
        this.jPanelList.get(8).add(this.jButtonList.get(0));   
    }

    public void iniciarCombo(){     
               
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
        this.jComboBox1.addItem("Presencial");
        this.jComboBox1.addItem("Virtual");     
        this.jPanelList.get(3).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Matriz Cuenca");
        this.jComboBox1.addItem("Quito");
        this.jComboBox1.addItem("Guayaquil");     
        this.jPanelList.get(4).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("El Vecino");
        this.jComboBox1.addItem("Centenario");
        this.jComboBox1.addItem("Maria Auxiliadora");
        this.jComboBox1.addItem("El Girón");
        this.jComboBox1.addItem("Extension Cayambe");
        this.jComboBox1.addItem("Sur");
        this.jPanelList.get(5).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Selecciones una Opcion");
        this.jComboBox1.addItem("Matutina");
        this.jComboBox1.addItem("Vespertina");
        this.jComboBox1.addItem("Diurna");
        this.jPanelList.get(6).add(this.jComboBox1);
    }
}
