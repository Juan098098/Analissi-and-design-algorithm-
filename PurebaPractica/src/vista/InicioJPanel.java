/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author contr
 */
public class InicioJPanel extends javax.swing.JPanel {

    private Principal principal;

    /**
     * Creates new form InicioJPanel
     */
    public InicioJPanel(Principal principal) {
        this.principal = principal;
        initComponents();
        //Mostrar Lista de productos
        ProductosJTextArea.setText(principal.productos.mostrarLista());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProductosJTextArea = new javax.swing.JTextArea();
        terminaarVentaJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        carritoJTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        IrAgregarJButton = new javax.swing.JButton();
        IrEliminarJButton = new javax.swing.JButton();
        IrModificarJButton = new javax.swing.JButton();
        IrReporteJButton = new javax.swing.JButton();
        SalirJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        totalJLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        ProductosJTextArea.setBackground(new java.awt.Color(255, 255, 255));
        ProductosJTextArea.setColumns(20);
        ProductosJTextArea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ProductosJTextArea.setForeground(new java.awt.Color(0, 0, 0));
        ProductosJTextArea.setRows(5);
        jScrollPane1.setViewportView(ProductosJTextArea);

        terminaarVentaJButton.setText("Terminar Venta");
        terminaarVentaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminaarVentaJButtonActionPerformed(evt);
            }
        });

        carritoJTextArea.setBackground(new java.awt.Color(255, 255, 255));
        carritoJTextArea.setColumns(20);
        carritoJTextArea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        carritoJTextArea.setRows(5);
        jScrollPane2.setViewportView(carritoJTextArea);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        IrAgregarJButton.setText("Agregar Producto");
        IrAgregarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAgregarJButtonActionPerformed(evt);
            }
        });

        IrEliminarJButton.setText("Eliminar Producto");
        IrEliminarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrEliminarJButtonActionPerformed(evt);
            }
        });

        IrModificarJButton.setText("Modificar Producto");
        IrModificarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrModificarJButtonActionPerformed(evt);
            }
        });

        IrReporteJButton.setText("Reporte Del Dia");
        IrReporteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrReporteJButtonActionPerformed(evt);
            }
        });

        SalirJButton.setText("Cerrar sesion");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");

        jButton1.setText("Actualizar Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SalirJButton)
                    .addComponent(IrReporteJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IrModificarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IrEliminarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IrAgregarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addComponent(IrAgregarJButton)
                .addGap(66, 66, 66)
                .addComponent(IrEliminarJButton)
                .addGap(56, 56, 56)
                .addComponent(IrModificarJButton)
                .addGap(63, 63, 63)
                .addComponent(IrReporteJButton)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 596, Short.MAX_VALUE)
                .addComponent(SalirJButton)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Productos");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Venta");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Total:");

        jButton4.setText("Agregar al carrito");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        totalJLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        totalJLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalJLabel.setText("0$");

        jButton5.setText("Actualizar carrito");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 255, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(terminaarVentaJButton)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(totalJLabel)))
                        .addGap(18, 18, 18)
                        .addComponent(terminaarVentaJButton)
                        .addGap(14, 14, 14)))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IrAgregarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrAgregarJButtonActionPerformed
        principal.irAgregar();
    }//GEN-LAST:event_IrAgregarJButtonActionPerformed

    private void IrEliminarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrEliminarJButtonActionPerformed
        principal.irEliminar();
    }//GEN-LAST:event_IrEliminarJButtonActionPerformed

    private void IrModificarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrModificarJButtonActionPerformed
        principal.irModificar();
    }//GEN-LAST:event_IrModificarJButtonActionPerformed

    private void IrReporteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrReporteJButtonActionPerformed
        principal.irReporte();
    }//GEN-LAST:event_IrReporteJButtonActionPerformed

    private void terminaarVentaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminaarVentaJButtonActionPerformed
        terminarVenta();
    }//GEN-LAST:event_terminaarVentaJButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        principal.irAgregarCarrito();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarProductos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        imprimirCarrito();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IrAgregarJButton;
    private javax.swing.JButton IrEliminarJButton;
    private javax.swing.JButton IrModificarJButton;
    private javax.swing.JButton IrReporteJButton;
    private javax.swing.JTextArea ProductosJTextArea;
    private javax.swing.JButton SalirJButton;
    private javax.swing.JTextArea carritoJTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton terminaarVentaJButton;
    private javax.swing.JLabel totalJLabel;
    // End of variables declaration//GEN-END:variables

    private void vaciarCarrito() {
        principal.carrito.vaciarCarrito();
        principal.subtotalCarrito = 0;
        imprimirCarrito();
    }

    private void imprimirCarrito() {
        carritoJTextArea.setText("");
        carritoJTextArea.setText(principal.carrito.imprimir());
        mostrarProductos();
        totalJLabel.setText(String.valueOf(principal.subtotalCarrito) + "$");
    }

    private void terminarVenta() {
        principal.totalVentas = principal.totalVentas + principal.subtotalCarrito;
        principal.registroVentas = principal.registroVentas + " " + principal.carrito.imprimirFormatoVent();
        vaciarCarrito();
    }

    private void mostrarProductos() {
        ProductosJTextArea.setText(principal.productos.mostrarLista());
    }
}
