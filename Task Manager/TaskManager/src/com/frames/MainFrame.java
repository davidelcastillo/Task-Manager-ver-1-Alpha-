package com.frames;

import Weather.WeatherApp;
import com.frames.Clase_label.TextBubbleBorder;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.border.AbstractBorder;
import org.json.simple.JSONObject;

/**
 *
 * @author Usuario
 */
public class MainFrame extends javax.swing.JFrame {
    private JSONObject weatherData = WeatherApp.getWeatherData ();
    int xMouse, yMouse;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setResizable(false);
        Bg = new javax.swing.JPanel();
        AbstractBorder brdrWlm = new TextBubbleBorder(new java.awt.Color(31, 43, 55),2,11,9,false);
        WlmPanel = new javax.swing.JPanel();
        WlmLb = new javax.swing.JLabel();
        AbstractBorder brdrAccp = new TextBubbleBorder(new java.awt.Color(0, 74, 173),3,11,3,false);
        AccpBm = new javax.swing.JPanel();
        AccpLb = new javax.swing.JLabel();
        weatherConditionImage = new javax.swing.JLabel(loadImage("src/assets/cloudy.png"));
        CityTx = new javax.swing.JLabel();
        temperatureTx = new javax.swing.JLabel();
        Separador = new javax.swing.JPanel();
        FinLb = new javax.swing.JLabel();
        ExtBm = new javax.swing.JPanel();
        ExtTxt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        TodoLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("League Spartan ExtraBold", 1, 14)); // NOI18N
        setLocationByPlatform(true);
        setName("MainFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(48, 51, 71));
        Bg.setForeground(new java.awt.Color(48, 51, 71));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WlmPanel.setBackground(new java.awt.Color(31, 43, 55));

        WlmLb.setFont(new java.awt.Font("League Spartan ExtraBold", 1, 82)); // NOI18N
        WlmLb.setForeground(new java.awt.Color(255, 255, 255));
        WlmLb.setText("Welcome");

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

        AccpLb.setBackground(new java.awt.Color(255, 255, 255));
        AccpLb.setFont(new java.awt.Font("League Spartan ExtraBold", 1, 48)); // NOI18N
        AccpLb.setForeground(new java.awt.Color(255, 255, 255));
        AccpLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccpLb.setText("New");

        javax.swing.GroupLayout AccpBmLayout = new javax.swing.GroupLayout(AccpBm);
        AccpBm.setLayout(AccpBmLayout);
        AccpBmLayout.setHorizontalGroup(
            AccpBmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccpBmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AccpLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AccpBmLayout.setVerticalGroup(
            AccpBmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccpLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        CityTx.setFont(new java.awt.Font("League Spartan", 1, 36)); // NOI18N
        CityTx.setForeground(new java.awt.Color(204, 204, 204));
        CityTx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CityTx.setText("Salta");

        temperatureTx.setFont(new java.awt.Font("League Spartan", 1, 48)); // NOI18N
        temperatureTx.setForeground(new java.awt.Color(204, 204, 204));
        temperatureTx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temperatureTx.setText("10°C");

        javax.swing.GroupLayout WlmPanelLayout = new javax.swing.GroupLayout(WlmPanel);
        WlmPanel.setLayout(WlmPanelLayout);
        WlmPanelLayout.setHorizontalGroup(
            WlmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WlmPanelLayout.createSequentialGroup()
                .addComponent(WlmLb)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(WlmPanelLayout.createSequentialGroup()
                .addGroup(WlmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WlmPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(AccpBm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WlmPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(temperatureTx)
                        .addGap(18, 18, 18)
                        .addComponent(CityTx))
                    .addGroup(WlmPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(weatherConditionImage, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WlmPanelLayout.setVerticalGroup(
            WlmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WlmPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(WlmLb)
                .addGap(18, 18, 18)
                .addComponent(weatherConditionImage, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(WlmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureTx)
                    .addComponent(CityTx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(AccpBm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        AccpBm.setBorder(brdrAccp);
        String weatherCondition = (String) weatherData.get("weather_condition");

        switch (weatherCondition) {
            case "Clear":
            weatherConditionImage.setIcon(loadImage("src/assets/clear.png"));
            break;
            case "Cloudy":
            weatherConditionImage.setIcon(loadImage("src/assets/cloudy.png"));
            break;
            case "Rain":
            weatherConditionImage.setIcon(loadImage("src/assets/rain.png"));
            break;
            case "Snow":
            weatherConditionImage.setIcon(loadImage("src/assets/snow.png"));
            break;
        }
        double temperature = (double) weatherData.get("temperature");

        temperatureTx.setText(temperature + " C");

        Bg.add(WlmPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 630));
        WlmPanel.setBorder(brdrWlm);

        Separador.setBackground(new java.awt.Color(24, 110, 225));

        javax.swing.GroupLayout SeparadorLayout = new javax.swing.GroupLayout(Separador);
        Separador.setLayout(SeparadorLayout);
        SeparadorLayout.setHorizontalGroup(
            SeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SeparadorLayout.setVerticalGroup(
            SeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        Bg.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 10, 570));

        FinLb.setFont(new java.awt.Font("League Spartan ExtraBold", 1, 24)); // NOI18N
        FinLb.setForeground(new java.awt.Color(255, 255, 255));
        FinLb.setText("Finished");
        Bg.add(FinLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        ExtBm.setBackground(new java.awt.Color(48, 51, 71));
        ExtBm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExtBm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExtBmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExtBmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExtBmMouseExited(evt);
            }
        });

        ExtTxt.setFont(new java.awt.Font("League Spartan ExtraBold", 1, 36)); // NOI18N
        ExtTxt.setForeground(new java.awt.Color(255, 255, 255));
        ExtTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExtTxt.setText("X");

        javax.swing.GroupLayout ExtBmLayout = new javax.swing.GroupLayout(ExtBm);
        ExtBm.setLayout(ExtBmLayout);
        ExtBmLayout.setHorizontalGroup(
            ExtBmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExtBmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExtBmLayout.setVerticalGroup(
            ExtBmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExtBmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Bg.add(ExtBm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 50, 50));

        header.setBackground(new java.awt.Color(48, 51, 71));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        TodoLb.setFont(new java.awt.Font("League Spartan ExtraBold", 1, 24)); // NOI18N
        TodoLb.setForeground(new java.awt.Color(255, 255, 255));
        TodoLb.setText("To do");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(TodoLb)
                .addContainerGap(653, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(TodoLb))
        );

        Bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccpBmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccpBmMouseClicked
        AddFrame frame = new AddFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_AccpBmMouseClicked

    private void ExtBmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExtBmMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExtBmMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void ExtBmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExtBmMouseEntered
      ExtBm.setBackground(new java.awt.Color(255, 80, 85));
    }//GEN-LAST:event_ExtBmMouseEntered

    private void ExtBmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExtBmMouseExited
       ExtBm.setBackground(new java.awt.Color(48, 51, 71));
    }//GEN-LAST:event_ExtBmMouseExited

    private void AccpBmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccpBmMouseEntered
        AccpBm.setBackground(new java.awt.Color(24, 110, 225));
    }//GEN-LAST:event_AccpBmMouseEntered

    private void AccpBmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccpBmMouseExited
         AccpBm.setBackground(new java.awt.Color(0, 74, 173));
    }//GEN-LAST:event_AccpBmMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        
    }
    /*
    Para encontrar la imagen para weather
    */
    private ImageIcon loadImage (String resourcePath) {
        try {
            BufferedImage image = ImageIO.read(new File(resourcePath));
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println ("No se pudo encontrar el recurso");
        return null;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccpBm;
    private javax.swing.JLabel AccpLb;
    private javax.swing.JPanel Bg;
    private javax.swing.JLabel CityTx;
    private javax.swing.JPanel ExtBm;
    private javax.swing.JLabel ExtTxt;
    private javax.swing.JLabel FinLb;
    private javax.swing.JPanel Separador;
    private javax.swing.JLabel TodoLb;
    private javax.swing.JLabel WlmLb;
    private javax.swing.JPanel WlmPanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel temperatureTx;
    private javax.swing.JLabel weatherConditionImage;
    // End of variables declaration//GEN-END:variables
}
