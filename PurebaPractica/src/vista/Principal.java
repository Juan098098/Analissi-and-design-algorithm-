package vista;

import controlador.Carrito;
import controlador.Productos;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author contr
 */
public class Principal extends javax.swing.JFrame {

    public InicioJPanel inicioJPanel;
    public AgregarJPanel agregarJPanel;
    public EliminarJPanel eliminarJPanel;
    public ModificarJPanel modificarJPanel;
    public ReporteDiaJPanel reporteDiaJPanel;
    public AgregarCarritoJPanel agregarCarritoJPanel;

    public Carrito carrito;

    public VentanaDialog ventanaDialog;

    public Productos productos;

    public String usuarioActual;
    //acumula ventas del dia
    public double totalVentas;
    public String registroVentas;
    //Acumula total de una venta
    public double subtotalCarrito;
    public double subtotal;

    public Principal() {
        productos = new Productos();
        carrito = new Carrito();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Panaderia");
        setName("pricipalJFrame");
        setResizable(true);
        pack();
        setLocationRelativeTo(null);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void iniciar() {
        inicioJPanel = new InicioJPanel(this);
        inicioJPanel.setVisible(true);
        add(inicioJPanel);
        pack();
        setLocationRelativeTo(null);
    }

    protected void irAgregar() {
        agregarJPanel = new AgregarJPanel(this);
        ventanaDialog = new VentanaDialog(this, agregarJPanel, "Ventana", false, false);
    }

    protected void irEliminar() {
        eliminarJPanel = new EliminarJPanel(this);
        ventanaDialog = new VentanaDialog(this, eliminarJPanel, "Ventana", false, false);
    }
    protected void irModificar() {
        modificarJPanel = new ModificarJPanel(this);
        ventanaDialog = new VentanaDialog(this, modificarJPanel, "Ventana", false, false);
    }

    protected void irReporte() {
        reporteDiaJPanel = new ReporteDiaJPanel(this);
        ventanaDialog = new VentanaDialog(this, reporteDiaJPanel, "Ventana", false, false);
    }

    protected void irAgregarCarrito() {
        agregarCarritoJPanel = new AgregarCarritoJPanel(this);
        ventanaDialog = new VentanaDialog(this, agregarCarritoJPanel, "Ventana", false, false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
