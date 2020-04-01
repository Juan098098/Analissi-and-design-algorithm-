package vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InicioJPanel extends javax.swing.JPanel {

    private Principal principal;

    /**
     * Creates new form InicioJPanel
     */
    public InicioJPanel(Principal principal) throws IOException {
        this.principal = principal;
        initComponents();
        agregarJButton.setOpaque(false);
        agregarJButton.setContentAreaFilled(false);
        agregarJButton.setBorderPainted(false);

        modificarJButton.setOpaque(false);
        modificarJButton.setContentAreaFilled(false);
        modificarJButton.setBorderPainted(false);

        eliminarJButton.setOpaque(false);
        eliminarJButton.setContentAreaFilled(false);
        eliminarJButton.setBorderPainted(false);
        principal.persistencia.guardar(principal.paises);
        principal.paises.ordenarPorBrbujaCont();
        String contagios = principal.paises.mostrarPaisesContagiados();
        paisesContagiadosJTextArea.setText(contagios);

        principal.paises.ordenarPorBrbujaMuer();
        String muertes = principal.paises.mostrarPaisesMuertes();
        paisesMuertesJTextArea.setText(muertes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        paisesContagiadosJTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        agregarJButton = new javax.swing.JButton();
        modificarJButton = new javax.swing.JButton();
        eliminarJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        paisesMuertesJTextArea = new javax.swing.JTextArea();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setBackground(new java.awt.Color(0, 17, 48));

        paisesContagiadosJTextArea.setBackground(new java.awt.Color(5, 5, 41));
        paisesContagiadosJTextArea.setColumns(20);
        paisesContagiadosJTextArea.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        paisesContagiadosJTextArea.setForeground(new java.awt.Color(0, 153, 204));
        paisesContagiadosJTextArea.setRows(5);
        jScrollPane1.setViewportView(paisesContagiadosJTextArea);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de Paises:");

        jPanel1.setBackground(new java.awt.Color(12, 12, 66));

        agregarJButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        agregarJButton.setForeground(new java.awt.Color(255, 255, 255));
        agregarJButton.setText("Agregar Pais");
        agregarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJButtonActionPerformed(evt);
            }
        });

        modificarJButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        modificarJButton.setForeground(new java.awt.Color(255, 255, 255));
        modificarJButton.setText("Modificar Pais");
        modificarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarJButtonActionPerformed(evt);
            }
        });

        eliminarJButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        eliminarJButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarJButton.setText("Eliminar Pais");
        eliminarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(agregarJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(agregarJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(modificarJButton)
                .addGap(175, 175, 175)
                .addComponent(eliminarJButton)
                .addGap(20, 20, 20))
        );

        paisesMuertesJTextArea.setBackground(new java.awt.Color(5, 5, 41));
        paisesMuertesJTextArea.setColumns(20);
        paisesMuertesJTextArea.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        paisesMuertesJTextArea.setForeground(new java.awt.Color(0, 153, 204));
        paisesMuertesJTextArea.setRows(5);
        jScrollPane2.setViewportView(paisesMuertesJTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void agregarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJButtonActionPerformed
        agregar();
    }//GEN-LAST:event_agregarJButtonActionPerformed

    private void modificarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarJButtonActionPerformed
        modificar();
    }//GEN-LAST:event_modificarJButtonActionPerformed

    private void eliminarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJButtonActionPerformed
        eliminar();
    }//GEN-LAST:event_eliminarJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarJButton;
    private javax.swing.JButton eliminarJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton modificarJButton;
    private javax.swing.JTextArea paisesContagiadosJTextArea;
    private javax.swing.JTextArea paisesMuertesJTextArea;
    // End of variables declaration//GEN-END:variables
    private void agregar() {
        principal.irAAgregar(this);
    }

    private void eliminar() {
        principal.irAEliminar(this);
    }

    private void modificar() {
        principal.irAModificar(this);
    }


}
