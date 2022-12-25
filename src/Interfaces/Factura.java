/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;


import Clases.FacturaClase;
import Clases.MetodosDeDB;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Jhoan
 */
public class Factura extends javax.swing.JFrame {

    String nombre;
    MetodosDeDB MetodosDB = new MetodosDeDB();
    private static FacturaClase Fact = new FacturaClase();
    int y, x;
    

    /**
     * Creates new form Factura
     */
    public Factura(FacturaClase Prod) {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/Iconos/Iconobarra2.png")).getImage());

       
        this.Ciudad.setText(this.Ciudad.getText() + ":  " + Prod.getCiudad());
        this.Fecha.setText(this.Fecha.getText() + ":  " + Prod.getFecha());
        this.Valor.setText(this.Valor.getText() + ":  " + Prod.getValor());
        this.numerofactura.setText(this.numerofactura.getText() + ":  " + Prod.getNfactura());
        

        this.nombre = Prod.getNfactura();

        this.MetodosDB.SubirFactura(Prod.getCiudad(), Prod.getFecha(),
                Prod.getNfactura(), Prod.getCantidad(),
                (Integer.parseInt(Prod.getValor()) * Integer.parseInt(Prod.getCantidad())) + "",
                Prod.getDescripcion());
        
        for(int k=0;k<Prod.getProd().size();k++){
            this.Tablaprod.setValueAt(Prod.getProd().get(k).getNombre(), k, 0);
            this.Tablaprod.setValueAt(Prod.getProd().get(k).getCantidad(), k, 1);
            this.Tablaprod.setValueAt(Prod.getProd().get(k).getPrecioDeVenta(), k, 2);
            
           
        }

    }

    public void regresar() {
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Ciudad = new javax.swing.JLabel();
        numerofactura = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        Valor = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        Capturabtn = new javax.swing.JLabel();
        capturatxt = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        Tablaprod = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/NubiaFactura.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 50));

        Fecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Fecha.setText("Fecha");
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 220, -1));

        Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ciudad.setText("Ubicacion");
        jPanel1.add(Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 220, -1));

        numerofactura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numerofactura.setText("N.Factura");
        jPanel1.add(numerofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 220, -1));

        Telefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Telefono.setText("Teléfono:  ");
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 220, -1));

        correo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        correo.setText("Correo:");
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 220, -1));

        Valor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Valor.setText("Valor");
        jPanel1.add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 240, 40));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit2.png"))); // NOI18N
        Salir.setText("jLabel2");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 20, 20));

        Capturabtn.setBackground(new java.awt.Color(255, 0, 102));
        Capturabtn.setForeground(new java.awt.Color(255, 51, 153));
        Capturabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/screenshot (1).png"))); // NOI18N
        Capturabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CapturabtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CapturabtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CapturabtnMouseExited(evt);
            }
        });
        jPanel1.add(Capturabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 50, 50));

        capturatxt.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        capturatxt.setText("Capturar pantalla");
        jPanel1.add(capturatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        Scroll.setBackground(new java.awt.Color(255, 255, 255));
        Scroll.setBorder(null);
        Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll.setHorizontalScrollBar(null);

        Tablaprod.setAutoCreateRowSorter(true);
        Tablaprod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablaprod.setEnabled(false);
        Tablaprod.setGridColor(new java.awt.Color(255, 255, 255));
        Tablaprod.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tablaprod.setShowGrid(false);
        Scroll.setViewportView(Tablaprod);
        if (Tablaprod.getColumnModel().getColumnCount() > 0) {
            Tablaprod.getColumnModel().getColumn(0).setResizable(false);
            Tablaprod.getColumnModel().getColumn(1).setResizable(false);
            Tablaprod.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 210, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        this.regresar();
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit.png")));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit2.png")));
    }//GEN-LAST:event_SalirMouseExited

    private void CapturabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CapturabtnMouseClicked
        this.Capturabtn.setVisible(false);
        this.capturatxt.setVisible(false);
        try {
            this.capturapantalla();
        } catch (IOException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CapturabtnMouseClicked

    private void CapturabtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CapturabtnMouseEntered
        Capturabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/screenshot.png"))); // NOI18N

    }//GEN-LAST:event_CapturabtnMouseEntered

    private void CapturabtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CapturabtnMouseExited
        Capturabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/screenshot (1).png"))); // NOI18N

    }//GEN-LAST:event_CapturabtnMouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
    public void capturapantalla() throws IOException, AWTException {
        Rectangle rectangleTam = new Rectangle(this.getLocation().x, this.getLocation().y, this.getWidth(), this.getHeight());
        System.out.println(rectangleTam);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(rectangleTam);
        ImageIO.write(image, "png", new File("Facturas/" + this.nombre + ".png"));
    }

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura(Fact).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Capturabtn;
    private javax.swing.JLabel Ciudad;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Salir;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JTable Tablaprod;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Valor;
    private javax.swing.JLabel capturatxt;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numerofactura;
    // End of variables declaration//GEN-END:variables
}