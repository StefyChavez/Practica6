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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author admin
 */
public class Ventana2 extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    
    
    public Ventana2 (String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        this.setLocation(600, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
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
        this.jPanelList.get(0).setBorder(new EmptyBorder(5, 5, 5, 5));
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
        this.jLabelList.add(new JLabel("Datos Personales "));
        this.jLabelList.add(new JLabel("Apellidos:    ORTIZ TERREROS"));
        this.jLabelList.add(new JLabel("Nombres:    JOSUE BENIGNO"));
        this.jLabelList.add(new JLabel("Género:    ECUATORIANO"));
        this.jLabelList.add(new JLabel("Correo Electrónico Personal:    Masculino"));
        this.jLabelList.add(new JLabel("Fecha de Nacimiento:    mortizo@yahoo.com"));
        this.jLabelList.add(new JLabel("Teléfono Domicilio:    072818314"));
        this.jLabelList.add(new JLabel("Teléfono Celular:    0984357640"));
        this.jLabelList.add(new JLabel("Whatsapp: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4)); 
        this.jPanelList.get(5).add(this.jLabelList.get(5)); 
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7)); 
        this.jPanelList.get(8).add(this.jLabelList.get(8));
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(8).setColumns(15);
        this.jPanelList.get(8).add(this.jTextFieldList.get(8));
    }
              
    
}
