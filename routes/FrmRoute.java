
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package routes;

import java.util.Arrays;
import java.util.HashSet;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import routes.FrmSearchRoute;
import routes.Listdesnation;
import routes.Route;

/**
 *
 * @author Usuario
 */
public class FrmRoute extends javax.swing.JInternalFrame {

    private static int count = 1;
    Listdesnation list;
    Route rout;
    DefaultTableModel tabla;

    public Route getEmplo() {
        return rout;
    }

    public void setEmplo(Route emplo) {
        this.rout = emplo;
    }

    public Listdesnation getList() {
        return list;
    }

    public void setList(Listdesnation list) {
        this.list = list;
    }

    /**
     * Creates new form FrmRoute
     */
    public FrmRoute() {
        initComponents();
        this.BotAdd.setEnabled(true);
        this.btnLimpiar.setEnabled(true);
        this.btnSearch.setEnabled(true);
        this.setLocale(null);
        list = new Listdesnation();
    }

    public void destino() {

        String[] descriptionsArray = TxTDescripList.getText().split(",");
        //HashSet<String> listDescriptions = new HashSet<>(Arrays.asList(descriptionsArray)); 
        for (String destino : descriptionsArray) {
            rout.addDestiny(destino);
        }
    }

    public void comprovacionDesti() throws Exception {
        String text = "Separe los destinos con  ','";
        if (this.TxTDescripList.getText().toLowerCase().equals(text.toLowerCase())
                || this.TxTDescripList.getText().equals("")) {
            throw new Exception();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BotAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TxTCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxTDescripList = new javax.swing.JTextField();
        TxTDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxTName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Administrador de rutas de entrega");

        jPanel2.setBackground(new java.awt.Color(217, 246, 248));
        jPanel2.setForeground(new java.awt.Color(152, 202, 202));

        jPanel4.setBackground(new java.awt.Color(217, 246, 248));
        jPanel4.setDoubleBuffered(false);

        BotAdd.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BotAdd.setForeground(new java.awt.Color(0, 0, 0));
        BotAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping_add_64.png"))); // NOI18N
        BotAdd.setText("Agregar");
        BotAdd.setBorderPainted(false);
        BotAdd.setContentAreaFilled(false);
        BotAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotAdd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping_add_72.png"))); // NOI18N
        BotAdd.setVerifyInputWhenFocusTarget(false);
        BotAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAddActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_64 (2).png"))); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_72 (1).png"))); // NOI18N
        btnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_receipt_64.png"))); // NOI18N
        btnLimpiar.setText("Limpiar ");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_receipt_72.png"))); // NOI18N
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Codigo");

        TxTCode.setEditable(false);
        TxTCode.setBackground(new java.awt.Color(152, 202, 202));
        TxTCode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxTCode.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Destinos ");

        TxTDescripList.setBackground(new java.awt.Color(152, 202, 202));
        TxTDescripList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxTDescripList.setForeground(new java.awt.Color(0, 0, 0));
        TxTDescripList.setText("Separe los destinos con  ','");
        TxTDescripList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTDescripListActionPerformed(evt);
            }
        });

        TxTDescription.setBackground(new java.awt.Color(152, 202, 202));
        TxTDescription.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxTDescription.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        TxTName.setBackground(new java.awt.Color(152, 202, 202));
        TxTName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxTName.setForeground(new java.awt.Color(0, 0, 0));

        btnDelete.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping_cancel_64.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setEnabled(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping_cancel_72.png"))); // NOI18N
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping_update_64.png"))); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setEnabled(false);
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping_update_72.png"))); // NOI18N
        btnUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BotAdd)
                        .addGap(42, 42, 42)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxTCode, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxTName, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxTDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxTDescripList, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxTCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxTDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxTDescripList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BotAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping_96.png"))); // NOI18N
        jLabel6.setText("Rutas de entrega");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAddActionPerformed
        try {
            comprovacionDesti();
            this.TxTCode.setEditable(false);
            this.TxTName.setEditable(false);
            this.TxTDescription.setEditable(false);
            this.TxTDescripList.setEditable(false);

            String nombre = this.TxTName.getText();
            String description = this.TxTDescription.getText();

            rout = new Route(nombre, description);
            destino();
            list.addRount(rout);

            BotAdd.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "El campo destino no puede estar vacio o se debe separar por ','");
        }

    }//GEN-LAST:event_BotAddActionPerformed

    private void TxTDescripListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTDescripListActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_TxTDescripListActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        FrmSearchRoute frm = new FrmSearchRoute(null, true);
        frm.setList(list);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.rout = frm.getRout();
        rout = frm.getRout();
        if (this.list != null) {
            this.TxTCode.setText(String.valueOf(list.getCode()));
            this.TxTName.setText(list.getName());
            this.TxTDescription.setText(list.getDescription());

            String[] descriptionsArray = list.getDescription().split(",");
            HashSet<String> listDescriptions = new HashSet<>(Arrays.asList(descriptionsArray));

            this.TxTDescripList.setText(String.join(",", listDescriptions));

            this.TxTCode.setEditable(false);
            this.TxTName.setEditable(false);
            this.TxTDescription.setEditable(false);
            this.TxTDescripList.setEditable(false);

            this.btnUpdate.setEnabled(true);
            this.btnDelete.setEnabled(true);

    }//GEN-LAST:event_btnSearchActionPerformed

        this.BotAdd.setEnabled(true);
    }


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        this.TxTCode.setEditable(true);
        this.TxTDescription.setEditable(true);
        this.TxTName.setEditable(true);
        this.TxTDescripList.setEditable(true);

        this.TxTCode.setText("");
        this.TxTDescription.setText("");
        this.TxTName.setText("");
        this.TxTDescripList.setText("Separe los destinos con  ',' ");

        this.BotAdd.setEnabled(true);
        this.btnDelete.setEnabled(false);
        this.btnUpdate.setEnabled(false);


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            this.list.deleteRoute(rout.getCode());

            this.TxTCode.setText("");
            this.TxTDescription.setText("");
            this.TxTName.setText("");
            this.TxTDescripList.setText("");

            list = null;
            this.btnDelete.setEnabled(false);
            this.btnUpdate.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int code = Integer.parseInt(this.TxTCode.getText());
        String nombre = this.TxTName.getText();
        String description = this.TxTDescription.getText();
        String[] descriptionsArray = TxTDescripList.getText().split(",");
        HashSet<String> listDescriptions = new HashSet<>(Arrays.asList(descriptionsArray));

        rout = this.list.searchRoute(code);
        list.setDescription(description);
        this.list.updateRout(rout);

        this.btnDelete.setEnabled(false);
        this.btnUpdate.setEnabled(false);

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAdd;
    private javax.swing.JTextField TxTCode;
    private javax.swing.JTextField TxTDescripList;
    private javax.swing.JTextField TxTDescription;
    private javax.swing.JTextField TxTName;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
