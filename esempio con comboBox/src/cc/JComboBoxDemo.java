package cc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
/*  w w w.  j av  a2 s  . c om*/
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;



import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxDemo extends JFrame {

    private JComboBox comboBox;
    private JLabel label;
    private static final String[] names = {
            "bulb1",
            "bulb2",
            "bulb3"};



    JComboBoxDemo() {
        super("JCombobox Demo");

        setLayout(new FlowLayout());
        comboBox = new JComboBox(names);
        add(comboBox);
        
    }

    public static void main(String[] args) {
        JComboBoxDemo jComboBoxDemo = new JComboBoxDemo();
        jComboBoxDemo.setSize(350, 150);
        jComboBoxDemo.setVisible(true);
    }

}