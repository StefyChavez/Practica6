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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author admin
 */
public class Ventana1 extends JFrame {

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;

    public Ventana1(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 200);
        this.setLocation(20, 20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

    public void iniciarComponentes() {
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(5, 1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarCombo();
        this.iniciarBotones();
    }

    public void iniciarPaneles() {
        this.jPanelList = new ArrayList<>();
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
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));

    }

    public void iniciarEtiquetas() {
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INSCRIBETE "));
        this.jLabelList.add(new JLabel("Selecciones una sede: "));
        this.jLabelList.add(new JLabel("Tipo de Documento: "));
        this.jLabelList.add(new JLabel("Ingrese su identificacion: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));

    }

    public void iniciarTextos() {
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(3).setColumns(15);
        this.jPanelList.get(3).add(this.jTextFieldList.get(3));
    }

    public void iniciarBotones() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));
        this.jPanelList.get(4).add(this.jButtonList.get(0));
    }

    public void iniciarCombo() {
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Matriz Cuenca");
        this.jComboBox1.addItem("Quito");
        this.jComboBox1.addItem("Guayaquil");
        this.jPanelList.get(1).add(this.jComboBox1);

        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Cedula");
        this.jComboBox1.addItem("Pasaporte");
        this.jPanelList.get(2).add(this.jComboBox1);
    }
}
