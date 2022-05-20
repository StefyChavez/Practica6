/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author admin
 */
public class Ventana3 extends JFrame {
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private JComboBox jComboBox1;
    private List<JCheckBox> jCheckboxList;
    private List<JButton> jButtonList;
    
    
    public Ventana3 (String title) throws HeadlessException {
        super(title);
        this.setSize(500,500);
        this.setLocation(30, 230);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(new Color(203, 203, 203));
        this.jPanel1.setLayout(new GridLayout(15,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarCombo();
        this.iniciarChecks();
        this.iniciarBotones();
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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(new Color(44, 90, 220));
        this.jPanelList.get(0).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        this.jPanelList.get(0).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.jPanelList.get(1).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(2).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(3).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(4).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(5).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(6).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(7).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(8).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(9).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(10).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(11).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(12).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(13).setBackground(new Color(203, 203, 203));
        this.jPanelList.get(14).setBackground(new Color(203, 203, 203));

        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanel1.add(this.jPanelList.get(9));
        this.jPanel1.add(this.jPanelList.get(10));
        this.jPanel1.add(this.jPanelList.get(11));
        this.jPanel1.add(this.jPanelList.get(12));
        this.jPanel1.add(this.jPanelList.get(13));
        this.jPanel1.add(this.jPanelList.get(14));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel(" Crear Grupo "));
        this.jLabelList.add(new JLabel(" Preiodo Académico: "));
        this.jLabelList.add(new JLabel(" 2022 - 2022 "));
        this.jLabelList.add(new JLabel(" Sede: "));
        this.jLabelList.add(new JLabel(" Matriz Cuenca "));
        this.jLabelList.add(new JLabel(" Campus/Extension: "));
        this.jLabelList.add(new JLabel(" El Vecino "));
        this.jLabelList.add(new JLabel(" Modalidad: "));
        this.jLabelList.add(new JLabel(" Presencial "));
        this.jLabelList.add(new JLabel(" Carrera: "));
        this.jLabelList.add(new JLabel(" Agropecuaria "));
        this.jLabelList.add(new JLabel(" Código de Proyecto: "));
        this.jLabelList.add(new JLabel(" Agropecuaria Nueva o Rediseño "));
        this.jLabelList.add(new JLabel(" Asignatura: "));
        this.jLabelList.add(new JLabel(" E-CV-IAG-003 Botánica "));
        this.jLabelList.add(new JLabel(" Nombre del grupo: "));
        this.jLabelList.add(new JLabel(" Cupos por Grupo: "));
        this.jLabelList.add(new JLabel(" Autorización calificación sobre 100: "));
        this.jLabelList.add(new JLabel(" Seleccionar Jornada del Grupo: "));
        this.jLabelList.add(new JLabel(" Oferta por estudiante: "));
        this.jLabelList.add(new JLabel(" Aplica Cambio de Grupo: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(1).add(this.jLabelList.get(2));
        this.jPanelList.get(2).add(this.jLabelList.get(3));
        this.jPanelList.get(2).add(this.jLabelList.get(4)); 
        this.jPanelList.get(3).add(this.jLabelList.get(5)); 
        this.jPanelList.get(3).add(this.jLabelList.get(6));
        this.jPanelList.get(4).add(this.jLabelList.get(7)); 
        this.jPanelList.get(4).add(this.jLabelList.get(8));
        this.jPanelList.get(5).add(this.jLabelList.get(9)); 
        this.jPanelList.get(5).add(this.jLabelList.get(10));
        this.jPanelList.get(6).add(this.jLabelList.get(11)); 
        this.jPanelList.get(6).add(this.jLabelList.get(12));
        this.jPanelList.get(7).add(this.jLabelList.get(13)); 
        this.jPanelList.get(7).add(this.jLabelList.get(14));
        this.jPanelList.get(8).add(this.jLabelList.get(15)); 
        this.jPanelList.get(9).add(this.jLabelList.get(16));
        this.jPanelList.get(10).add(this.jLabelList.get(17));
        this.jPanelList.get(11).add(this.jLabelList.get(18));
        this.jPanelList.get(12).add(this.jLabelList.get(19));
        this.jPanelList.get(13).add(this.jLabelList.get(20));
        
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
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        
        this.jTextFieldList.get(8).setColumns(15);
        this.jPanelList.get(8).add(this.jTextFieldList.get(8));
        this.jTextFieldList.get(9).setColumns(10);
        this.jPanelList.get(9).add(this.jTextFieldList.get(9));
    }
    
    public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem(" ");
        this.jComboBox1.addItem("SI");
        this.jComboBox1.addItem("NO");
        this.jPanelList.get(10).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem(" Jornadas Disponibles ");
        this.jComboBox1.addItem("Matutina");
        this.jComboBox1.addItem("Vespertina");
        this.jComboBox1.addItem("Diurna");
        this.jPanelList.get(11).add(this.jComboBox1);
        
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem(" ");
        this.jComboBox1.addItem("SI");
        this.jComboBox1.addItem("NO");
        this.jPanelList.get(13).add(this.jComboBox1);
    }
    
    public void iniciarChecks(){
        this.jCheckboxList = new ArrayList<>();
        this.jCheckboxList.add(new JCheckBox("Nuevos"));
        
        this.jPanelList.get(12).add(this.jCheckboxList.get(0));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jPanelList.get(14).add(this.jButtonList.get(0));
        this.jButtonList.add(new JButton("Cancelar"));
        this.jPanelList.get(14).add(this.jButtonList.get(1));
    }
    
}
