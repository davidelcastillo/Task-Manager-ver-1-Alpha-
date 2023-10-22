package com.frames;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

import com.frames.Clase_label.TextBubbleBorder;

public class Prueba {
	public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                JPanel gui = new JPanel(new GridLayout(2,0,5,5));
                gui.setBorder(new EmptyBorder(10,10,10,10));
                gui.setBackground(Color.lightGray);
                
                AbstractBorder brdrRight = new TextBubbleBorder(Color.BLACK,2,16,16,false);
        
                
                JLabel l1 = new JLabel("Label 1");
                l1.setBorder(brdrRight);
                gui.add(l1);

                JPanel p1 = new JPanel();
                p1.add(new JLabel("Panel 1"));
                p1.setBorder(brdrRight);
                p1.setOpaque(false);
                gui.add(p1);

            
                JOptionPane.showMessageDialog(null, gui);
            }
        };
        SwingUtilities.invokeLater(r);
    }

}

