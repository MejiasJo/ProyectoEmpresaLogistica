/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import customers.CustomerList;
import customers.FrmCustumer;
import employees.EmployeeList;
import employees.FrmEmployee;
import javax.swing.JFrame;
import packages.PackagesList;
import packages.frmPackage;
import routes.FrmRoute;
import routes.Listdesnation;
import shipments.FrmShipment;
import shipments.ShipmentHistory;
import shipments.ShipmentQueue;

/**
 *
 * @author zulay
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private FrmCustumer frmCustomer;
    private FrmRoute frmRoute;
    private frmPackage frmpackage;
    private FrmEmployee frmEmployee;
    private FrmShipment frmShipment;
    
    CustomerList customerList;
    Listdesnation routeList;
    PackagesList packageList;
    EmployeeList employeesList;
    ShipmentHistory shipmentHistory;
    ShipmentQueue shipmentQueue;
    
    
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frmCustomer = new FrmCustumer();
        frmRoute = new FrmRoute();
        frmpackage = new frmPackage();
        frmEmployee = new FrmEmployee();
        frmShipment = new FrmShipment();
        
        customerList = new CustomerList();
        routeList = new Listdesnation();
        packageList = new PackagesList();
        employeesList = new EmployeeList();
        shipmentHistory = new ShipmentHistory();
        shipmentQueue = new ShipmentQueue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskTop = new javax.swing.JDesktopPane();
        btnCostumer = new javax.swing.JButton();
        btnPackage = new javax.swing.JButton();
        btnShipment = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnRoute = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina Principal Envios Logistica ");

        deskTop.setBackground(new java.awt.Color(217, 246, 248));

        btnCostumer.setBackground(new java.awt.Color(152, 202, 202));
        btnCostumer.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnCostumer.setForeground(new java.awt.Color(0, 0, 0));
        btnCostumer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/custumer_76.png"))); // NOI18N
        btnCostumer.setText("Clientes");
        btnCostumer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnCostumer.setDefaultCapable(false);
        btnCostumer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCostumer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/custumer_92.png"))); // NOI18N
        btnCostumer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCostumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerActionPerformed(evt);
            }
        });

        btnPackage.setBackground(new java.awt.Color(152, 202, 202));
        btnPackage.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnPackage.setForeground(new java.awt.Color(0, 0, 0));
        btnPackage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cajaenvio_72.png"))); // NOI18N
        btnPackage.setText("Paquetes");
        btnPackage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnPackage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPackage.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cajaenvio_92.png"))); // NOI18N
        btnPackage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPackageActionPerformed(evt);
            }
        });

        btnShipment.setBackground(new java.awt.Color(152, 202, 202));
        btnShipment.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnShipment.setForeground(new java.awt.Color(0, 0, 0));
        btnShipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito_72.png"))); // NOI18N
        btnShipment.setText("Gestion de Envios");
        btnShipment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnShipment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnShipment.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito_92.png"))); // NOI18N
        btnShipment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnShipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShipmentActionPerformed(evt);
            }
        });

        btnEmployee.setBackground(new java.awt.Color(152, 202, 202));
        btnEmployee.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(0, 0, 0));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee_72.png"))); // NOI18N
        btnEmployee.setText("Empleados");
        btnEmployee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmployee.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee_92.png"))); // NOI18N
        btnEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnRoute.setBackground(new java.awt.Color(152, 202, 202));
        btnRoute.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        btnRoute.setForeground(new java.awt.Color(0, 0, 0));
        btnRoute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ruta_72.png"))); // NOI18N
        btnRoute.setText("Rutas");
        btnRoute.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnRoute.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoute.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ruta_92.png"))); // NOI18N
        btnRoute.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRouteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(152, 202, 202));
        jLabel1.setFont(new java.awt.Font("Arial Narrow", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shipping_96.png"))); // NOI18N
        jLabel1.setText("Envios Logística");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jLabel1.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bienvenidos a envios Logística, por favor seleccione alguna opción:");

        deskTop.setLayer(btnCostumer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskTop.setLayer(btnPackage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskTop.setLayer(btnShipment, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskTop.setLayer(btnEmployee, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskTop.setLayer(btnRoute, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskTop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskTop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskTopLayout = new javax.swing.GroupLayout(deskTop);
        deskTop.setLayout(deskTopLayout);
        deskTopLayout.setHorizontalGroup(
            deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskTopLayout.createSequentialGroup()
                .addGroup(deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deskTopLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addGroup(deskTopLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCostumer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPackage, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnShipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(deskTopLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(430, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deskTopLayout.setVerticalGroup(
            deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deskTopLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCostumer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShipment, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnPackage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskTop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskTop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRouteActionPerformed
        frmRoute.setList(routeList);
        this.deskTop.add(frmRoute);
        frmRoute.setLocation((this.deskTop.getWidth()-frmRoute.getWidth())/2, 
                (this.deskTop.getHeight()-frmRoute.getHeight())/2);
        frmRoute.setVisible(true);
    }//GEN-LAST:event_btnRouteActionPerformed

    private void btnCostumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerActionPerformed
        frmCustomer.setList(customerList);
        this.deskTop.add(frmCustomer);
        frmCustomer.setLocation((this.deskTop.getWidth()-frmCustomer.getWidth())/2, 
                (this.deskTop.getHeight()-frmCustomer.getHeight())/2);
        frmCustomer.setVisible(true);
    }//GEN-LAST:event_btnCostumerActionPerformed

    private void btnPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPackageActionPerformed
        frmpackage.setList(customerList);
        frmpackage.setGlobalPackage(packageList);
        this.deskTop.add(frmpackage);
        frmpackage.setLocation((this.deskTop.getWidth()-frmpackage.getWidth())/2, 
                (this.deskTop.getHeight()-frmpackage.getHeight())/2);
        frmpackage.setVisible(true);
    }//GEN-LAST:event_btnPackageActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        frmEmployee.setList(employeesList);
        this.deskTop.add(frmEmployee);
        frmEmployee.setLocation((this.deskTop.getWidth()-frmEmployee.getWidth())/2, 
                (this.deskTop.getHeight()-frmEmployee.getHeight())/2);
        frmEmployee.setVisible(true);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnShipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShipmentActionPerformed
        frmShipment.setListas(customerList, packageList,
                routeList, shipmentHistory,shipmentQueue);
        this.deskTop.add(frmShipment);
        frmShipment.setLocation((this.deskTop.getWidth()-frmShipment.getWidth())/2, 
                (this.deskTop.getHeight()-frmShipment.getHeight())/2);
        frmShipment.setVisible(true);
    }//GEN-LAST:event_btnShipmentActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostumer;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnPackage;
    private javax.swing.JButton btnRoute;
    private javax.swing.JButton btnShipment;
    private javax.swing.JDesktopPane deskTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
