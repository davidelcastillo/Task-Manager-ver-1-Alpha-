/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames;

import javax.swing.border.AbstractBorder;
import com.frames.Clase_label.TextBubbleBorder;
import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class AddFrame extends javax.swing.JFrame {

    int xMouse , yMouse;
    MainFrame main;
   
    public AddFrame(MainFrame main) {
        initComponents();
        this.main = main;
    }

    private AddFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        AbstractBorder brdrWlm = new TextBubbleBorder(new java.awt.Color(31, 43, 55),2,11,9,false);
        AddBg = new javax.swing.JPanel();
        InfoLb = new javax.swing.JLabel();
        AbstractBorder brdrRetn = new TextBubbleBorder(new java.awt.Color(255, 80, 85),3,11,3,false);
        BackBm = new javax.swing.JPanel();
        BackLb = new javax.swing.JLabel();
        AbstractBorder brdrAccp = new TextBubbleBorder(new java.awt.Color(0, 74, 173),3,11,3,false);
        AccpBm = new javax.swing.JPanel();
        AddLb = new javax.swing.JLabel();
        TitleTxt = new javax.swing.JTextField();
        AddNoteLb = new javax.swing.JLabel();
        TitleLb = new javax.swing.JLabel();
        InfoScrollPn = new javax.swing.JScrollPane();
        InfoTxt = new javax.swing.JEditorPane();
        header = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        AddBg.setBackground(new java.awt.Color(31, 43, 55));
        AddBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoLb.setFont(new java.awt.Font("League Spartan SemiBold", 0, 36)); // NOI18N
        InfoLb.setForeground(new java.awt.Color(255, 255, 255));
        InfoLb.setText("Info");
        AddBg.add(InfoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 30));

        BackBm.setBackground(new java.awt.Color(255, 80, 85));
        BackBm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackBmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackBmMouseExited(evt);
            }
        });

        BackLb.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 36)); // NOI18N
        BackLb.setForeground(new java.awt.Color(255, 255, 255));
        BackLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackLb.setText("<");
        BackLb.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout BackBmLayout = new javax.swing.GroupLayout(BackBm);
        BackBm.setLayout(BackBmLayout);
        BackBmLayout.setHorizontalGroup(
            BackBmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackBmLayout.createSequentialGroup()
                .addComponent(BackLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BackBmLayout.setVerticalGroup(
            BackBmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackBmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackLb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AddBg.add(BackBm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 70, 70));
        BackBm.setBorder(brdrRetn);

        AccpBm.setBackground(new java.awt.Color(0, 74, 173));
        AccpBm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccpBm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccpBmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccpBmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccpBmMouseExited(evt);
            }
        });

        AddLb.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 36)); // NOI18N
        AddLb.setForeground(new java.awt.Color(255, 255, 255));
        AddLb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AddLb.setText("Add");
        AddLb.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout AccpBmLayout = new javax.swing.GroupLayout(AccpBm);
        AccpBm.setLayout(AccpBmLayout);
        AccpBmLayout.setHorizontalGroup(
            AccpBmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccpBmLayout.createSequentialGroup()
                .addComponent(AddLb)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        AccpBmLayout.setVerticalGroup(
            AccpBmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccpBmLayout.createSequentialGroup()
                .addComponent(AddLb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AddBg.add(AccpBm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 90, 70));
        AccpBm.setBorder(brdrAccp);

        TitleTxt.setBackground(new java.awt.Color(48, 51, 71));
        TitleTxt.setFont(new java.awt.Font("League Spartan", 1, 24)); // NOI18N
        TitleTxt.setForeground(new java.awt.Color(204, 204, 204));
        TitleTxt.setBorder(null);
        TitleTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitleTxtMouseClicked(evt);
            }
        });
        TitleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleTxtActionPerformed(evt);
            }
        });
        AddBg.add(TitleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 340, 40));

        AddNoteLb.setFont(new java.awt.Font("League Spartan ExtraBold", 1, 82)); // NOI18N
        AddNoteLb.setForeground(new java.awt.Color(255, 255, 255));
        AddNoteLb.setText("Add Note");
        AddBg.add(AddNoteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        TitleLb.setFont(new java.awt.Font("League Spartan SemiBold", 0, 36)); // NOI18N
        TitleLb.setForeground(new java.awt.Color(255, 255, 255));
        TitleLb.setText("Titulo");
        AddBg.add(TitleLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        InfoScrollPn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        InfoTxt.setBackground(new java.awt.Color(48, 51, 71));
        InfoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InfoTxt.setFont(new java.awt.Font("League Spartan", 1, 24)); // NOI18N
        InfoTxt.setCaretColor(new java.awt.Color(48, 51, 71));
        InfoTxt.setSelectedTextColor(new java.awt.Color(48, 51, 71));
        InfoScrollPn.setViewportView(InfoTxt);

        AddBg.add(InfoScrollPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 340, 150));

        header.setBackground(new java.awt.Color(31, 43, 55));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                headerMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        AddBg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddBg, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        AddBg.setBorder(brdrWlm);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBmMouseClicked
        this.dispose();
    }//GEN-LAST:event_BackBmMouseClicked

    private void TitleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleTxtActionPerformed

    private void headerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseEntered
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMouseEntered

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void AccpBmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccpBmMouseEntered
        AccpBm.setBackground(new java.awt.Color(24, 110, 225));
    }//GEN-LAST:event_AccpBmMouseEntered

    private void AccpBmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccpBmMouseExited
        AccpBm.setBackground(new java.awt.Color(0, 74, 173));
    }//GEN-LAST:event_AccpBmMouseExited

    private void BackBmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBmMouseExited
        BackBm.setBackground(new java.awt.Color(255, 80, 85));
    }//GEN-LAST:event_BackBmMouseExited

    private void BackBmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBmMouseEntered
        BackBm.setBackground(new java.awt.Color(255, 36, 45));
    }//GEN-LAST:event_BackBmMouseEntered

    private void TitleTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleTxtMouseClicked

    private void AccpBmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccpBmMouseClicked
        String title = this.TitleTxt.getText();
        String info = this.InfoTxt.getText();
        main.addTx(title,info);
        this.dispose();
    }//GEN-LAST:event_AccpBmMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccpBm;
    private javax.swing.JPanel AddBg;
    private javax.swing.JLabel AddLb;
    private javax.swing.JLabel AddNoteLb;
    private javax.swing.JPanel BackBm;
    private javax.swing.JLabel BackLb;
    private javax.swing.JLabel InfoLb;
    private javax.swing.JScrollPane InfoScrollPn;
    private javax.swing.JEditorPane InfoTxt;
    private javax.swing.JLabel TitleLb;
    private javax.swing.JTextField TitleTxt;
    private javax.swing.JPanel header;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
