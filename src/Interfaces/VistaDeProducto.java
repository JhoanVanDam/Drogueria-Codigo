/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.ConexionDB;
import Clases.MetodosDeDB;
import Clases.Productos;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class VistaDeProducto extends javax.swing.JFrame {

    ArrayList<Productos> Prod;
    MetodosDeDB MetodosDB = new MetodosDeDB();
    int y, x;
    short siguiente;

    /**
     * Creates new form VistaDeProducto
     */
    public VistaDeProducto() {
        initComponents();
        Iniciarcomponentes();
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/Iconos/Iconobarra2.png")).getImage());

    }

    public boolean buscarproducto(String Nombre) {
        int k;
        for (k = 0; k < this.Prod.size(); k++) {
            if (this.Prod.get(k).getNombre().equals(Nombre)) {
                return true;
            }
        }
        return false;
    }

    public void llenarproductos() {
        this.Prod = this.MetodosDB.consultartodoslosdatos();
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
        jLabel4 = new javax.swing.JLabel();
        TituloAgregar = new javax.swing.JLabel();
        txtCosto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtCod = new javax.swing.JLabel();
        txtSeHanVendido = new javax.swing.JLabel();
        txtCanti1 = new javax.swing.JLabel();
        txtSeHanVendido1 = new javax.swing.JLabel();
        txtCanti2 = new javax.swing.JLabel();
        txtCosto1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JLabel();
        txtCod1 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JLabel();
        btnsiguiente = new javax.swing.JLabel();
        btnanterior = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Regresarbtn = new javax.swing.JLabel();
        txtUbicacion1 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/consulta (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 100));

        TituloAgregar.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        TituloAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/TituloConsultarProd.png"))); // NOI18N
        jPanel1.add(TituloAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 400, 60));

        txtCosto.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtCosto.setText("Costo");
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 250, -1));

        txtNombre.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtNombre.setText("Nombre");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 250, -1));

        txtPrecio.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        txtPrecio.setText("Precio");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 140, -1));

        txtCod.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtCod.setText("Codigo");
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 250, -1));

        txtSeHanVendido.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtSeHanVendido.setText("Se han vendido");
        jPanel1.add(txtSeHanVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 250, -1));

        txtCanti1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtCanti1.setText("Cantidad");
        jPanel1.add(txtCanti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 250, -1));

        txtSeHanVendido1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtSeHanVendido1.setForeground(new java.awt.Color(51, 51, 255));
        txtSeHanVendido1.setText("Se han vendido");
        jPanel1.add(txtSeHanVendido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 130, -1));

        txtCanti2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtCanti2.setForeground(new java.awt.Color(51, 51, 255));
        txtCanti2.setText("Cantidad");
        jPanel1.add(txtCanti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 130, -1));

        txtCosto1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtCosto1.setForeground(new java.awt.Color(51, 51, 255));
        txtCosto1.setText("Costo");
        jPanel1.add(txtCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 130, -1));

        txtNombre1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(51, 51, 255));
        txtNombre1.setText("Nombre");
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, -1));

        txtCod1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtCod1.setForeground(new java.awt.Color(51, 51, 255));
        txtCod1.setText("Codigo");
        jPanel1.add(txtCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, -1));

        txtPrecio1.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        txtPrecio1.setForeground(new java.awt.Color(51, 51, 255));
        txtPrecio1.setText("Precio");
        jPanel1.add(txtPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, -1));

        btnsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/proximo.png"))); // NOI18N
        btnsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsiguienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsiguienteMouseExited(evt);
            }
        });
        btnsiguiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsiguienteKeyPressed(evt);
            }
        });
        jPanel1.add(btnsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 50, 50));

        btnanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/anterior.png"))); // NOI18N
        btnanterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnanteriorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnanteriorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnanteriorMouseExited(evt);
            }
        });
        btnanterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnanteriorKeyPressed(evt);
            }
        });
        jPanel1.add(btnanterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, 50));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Minimize.png"))); // NOI18N
        Minimizar.setText("jLabel2");
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 20, 20));

        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atrasnegro.png"))); // NOI18N
        Regresarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresarbtnMouseExited(evt);
            }
        });
        jPanel1.add(Regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        txtUbicacion1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtUbicacion1.setForeground(new java.awt.Color(51, 51, 255));
        txtUbicacion1.setText("Ubicacion");
        jPanel1.add(txtUbicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 130, -1));

        txtUbicacion.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtUbicacion.setText("Ubicacion");
        jPanel1.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteMouseClicked
        this.btnSiguienteMet();
    }//GEN-LAST:event_btnsiguienteMouseClicked

    private void btnanteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnanteriorMouseEntered
        btnanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/anteriorazul.png")));
    }//GEN-LAST:event_btnanteriorMouseEntered

    private void btnanteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnanteriorMouseClicked
        this.btnAnteriorMet();
    }//GEN-LAST:event_btnanteriorMouseClicked

    private void btnanteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnanteriorMouseExited
        btnanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/anterior.png")));
    }//GEN-LAST:event_btnanteriorMouseExited

    private void btnsiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteMouseEntered
        btnsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/siguienteazul.png")));
    }//GEN-LAST:event_btnsiguienteMouseEntered

    private void btnsiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteMouseExited
        btnsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/proximo.png")));
    }//GEN-LAST:event_btnsiguienteMouseExited

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void RegresarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarbtnMouseClicked
        this.regresar();
    }//GEN-LAST:event_RegresarbtnMouseClicked

    private void RegresarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarbtnMouseEntered
        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atras azul.png")));
    }//GEN-LAST:event_RegresarbtnMouseEntered

    private void RegresarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarbtnMouseExited
        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atrasnegro.png")));
    }//GEN-LAST:event_RegresarbtnMouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnanteriorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnanteriorKeyPressed
        evt.setKeyCode(226);
        this.btnAnteriorMet();
    }//GEN-LAST:event_btnanteriorKeyPressed

    private void btnsiguienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsiguienteKeyPressed
        
    }//GEN-LAST:event_btnsiguienteKeyPressed
    public void TextoApagado(boolean si) {
        if (si == true) {
            this.txtSeHanVendido.setVisible(true);
            this.txtCod.setVisible(true);
            this.txtCosto.setVisible(true);
            this.txtNombre.setVisible(true);
            this.txtPrecio.setVisible(true);
            this.txtCanti1.setVisible(true);
            this.txtSeHanVendido1.setVisible(true);
            this.txtCod1.setVisible(true);
            this.txtCosto1.setVisible(true);
            this.txtNombre1.setVisible(true);
            this.txtPrecio1.setVisible(true);
            this.txtCanti2.setVisible(true);
            this.txtUbicacion.setVisible(true);
            this.txtUbicacion1.setVisible(true);
        } else {
            this.txtSeHanVendido.setVisible(false);
            this.txtCod.setVisible(false);
            this.txtCosto.setVisible(false);
            this.txtNombre.setVisible(false);
            this.txtPrecio.setVisible(false);
            this.txtCanti1.setVisible(false);
            this.txtSeHanVendido1.setVisible(false);
            this.txtCod1.setVisible(false);
            this.txtCosto1.setVisible(false);
            this.txtNombre1.setVisible(false);
            this.txtPrecio1.setVisible(false);
            this.txtCanti2.setVisible(false);
            this.txtUbicacion.setVisible(false);
            this.txtUbicacion1.setVisible(false);

        }
    }

    public void Iniciarcomponentes() {
        this.Prod = new ArrayList<>();
        this.llenarproductos();
        this.siguiente = 0;
        this.setLocationRelativeTo(null);
        this.TextoApagado(false);
    }

    public void regresar() {
        ProductosI principal = new ProductosI();
        principal.setVisible(true);
        this.dispose();
    }

    public void btnAnteriorMet() {
        this.txtCanti1.setText(this.Prod.get(siguiente).getCantidad());
        this.txtCod.setText(this.Prod.get(siguiente).getCodigo());
        this.txtCosto.setText(this.Prod.get(siguiente).getPrecioDeCompra());
        this.txtNombre.setText(this.Prod.get(siguiente).getNombre());
        this.txtPrecio.setText(this.Prod.get(siguiente).getPrecioDeVenta());
        this.txtSeHanVendido.setText(this.Prod.get(siguiente).getVentasDesde());
        this.txtUbicacion.setText(this.Prod.get(siguiente).getUbicacion());
        this.TextoApagado(true);
        if (this.siguiente > 0) {
            this.siguiente--;
        }
    }

    public void btnSiguienteMet() {
        this.txtCanti1.setText(this.Prod.get(siguiente).getCantidad());
        this.txtCod.setText(this.Prod.get(siguiente).getCodigo());
        this.txtCosto.setText(this.Prod.get(siguiente).getPrecioDeCompra());
        this.txtNombre.setText(this.Prod.get(siguiente).getNombre());
        this.txtPrecio.setText(this.Prod.get(siguiente).getPrecioDeVenta());
        this.txtSeHanVendido.setText(this.Prod.get(siguiente).getVentasDesde());
        this.txtUbicacion.setText(this.Prod.get(siguiente).getUbicacion());
        this.TextoApagado(true);

        if (this.siguiente < this.Prod.size() - 1) {
            this.siguiente++;
        }
    }
    public void EventosIzqu(){
        KeyListener Ev = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
               
               btnAnteriorMet();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        };
        this.btnanterior.addKeyListener(Ev);
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
            java.util.logging.Logger.getLogger(VistaDeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDeProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Regresarbtn;
    private javax.swing.JLabel TituloAgregar;
    private javax.swing.JLabel btnanterior;
    private javax.swing.JLabel btnsiguiente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCanti1;
    private javax.swing.JLabel txtCanti2;
    private javax.swing.JLabel txtCod;
    private javax.swing.JLabel txtCod1;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtCosto1;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNombre1;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtPrecio1;
    private javax.swing.JLabel txtSeHanVendido;
    private javax.swing.JLabel txtSeHanVendido1;
    private javax.swing.JLabel txtUbicacion;
    private javax.swing.JLabel txtUbicacion1;
    // End of variables declaration//GEN-END:variables

   
}
