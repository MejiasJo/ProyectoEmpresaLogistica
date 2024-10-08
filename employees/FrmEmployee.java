/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package employees;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author zulay
 */
public class FrmEmployee extends javax.swing.JInternalFrame {

    private Employee employ;
    private EmployeeList list;

    HashMap<String, Double> puestoSalario;

    /**
     * Creates new form FrmEmployee
     */
    public FrmEmployee() {
        initComponents();
        puestoSalario();
    }

    public Employee getEmplo() {
        return employ;
    }

    public void setEmplo(Employee emplo) {
        this.employ = emplo;
    }

    public EmployeeList getList() {
        return list;
    }

    public void setList(EmployeeList list) {
        this.list = list;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpDate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtPuesto = new javax.swing.JComboBox<>();
        btnNew = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administar Empleados");

        jPanel1.setBackground(new java.awt.Color(217, 246, 248));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Magnifier_64.png"))); // NOI18N
        jLabel6.setText("Registro Empleados ");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Identificación");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        txtIdentificacion.setBackground(new java.awt.Color(152, 202, 202));
        txtIdentificacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(0, 0, 0));

        txtNombre.setBackground(new java.awt.Color(152, 202, 202));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Nacimiento ");

        txtFechaNacimiento.setBackground(new java.awt.Color(152, 202, 202));
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));
        txtFechaNacimiento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefono");

        txtTelefono.setBackground(new java.awt.Color(152, 202, 202));
        txtTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Correo ");

        txtCorreo.setBackground(new java.awt.Color(152, 202, 202));
        txtCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Salario");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Puesto ");

        txtSalario.setEditable(false);
        txtSalario.setBackground(new java.awt.Color(152, 202, 202));
        txtSalario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(0, 0, 0));

        btnAdd.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UserAdd_64.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.setToolTipText("");
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UserRemove_64.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUpDate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UserEdit_64.png"))); // NOI18N
        btnUpDate.setText("Actualizar");
        btnUpDate.setBorderPainted(false);
        btnUpDate.setContentAreaFilled(false);
        btnUpDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpDate.setVerifyInputWhenFocusTarget(false);
        btnUpDate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnUpDate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpDateActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_64 (2).png"))); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.setVerifyInputWhenFocusTarget(false);
        btnSearch.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtPuesto.setBackground(new java.awt.Color(152, 202, 202));
        txtPuesto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtPuesto.setForeground(new java.awt.Color(0, 0, 0));
        txtPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agente de Ventas", "Encargado de Inventario", "Gerente de Sucursal", "Recepcionista", "Conductor de Reparto", "Técnico en Mantenimiento de Flota", "" }));

        btnNew.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 0, 0));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_receipt_64.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.setBorderPainted(false);
        btnNew.setContentAreaFilled(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerifyInputWhenFocusTarget(false);
        btnNew.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(222, 222, 222)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd)
                                .addGap(55, 55, 55)
                                .addComponent(btnDelete)
                                .addGap(63, 63, 63)
                                .addComponent(btnUpDate)
                                .addGap(58, 58, 58)))
                        .addComponent(btnSearch)
                        .addGap(21, 21, 21)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(542, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(btnUpDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
            LocalDate fecha = LocalDate.parse(this.txtFechaNacimiento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String identificacion = this.txtIdentificacion.getText();
            String nombre = this.txtNombre.getText();
            String telefono = this.txtTelefono.getText();
            String correo = this.txtCorreo.getText();
            String puesto = String.valueOf(this.txtPuesto.getSelectedItem());
            double salario = verificarPuestoSalario();

            this.txtIdentificacion.setEditable(false);
            this.txtNombre.setEditable(false);
            this.txtFechaNacimiento.setEditable(false);
            this.txtTelefono.setEditable(false);
            this.txtCorreo.setEditable(false);

            employ = new Employee(puesto, salario, identificacion, nombre, fecha, telefono, correo);
            list.addEmployee(employ);

            this.btnAdd.setEnabled(false);
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "No ingreso la Fecha de Nacimiento");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            this.list.removeEmployee(employ.getId());

            this.txtIdentificacion.setText("");
            this.txtNombre.setText("");
            this.txtFechaNacimiento.setText("");
            this.txtTelefono.setText("");
            this.txtCorreo.setText("");

            employ = null;
            this.btnDelete.setEnabled(false);
            this.btnUpDate.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpDateActionPerformed

        String identificacion = this.txtIdentificacion.getText();
        String telefono = this.txtTelefono.getText();
        String correo = this.txtCorreo.getText();
        String puesto = String.valueOf(this.txtPuesto.getSelectedItem());
        double salario = verificarPuestoSalario();

        employ = this.list.findEmployeeById(identificacion);
        employ.setPhone(telefono);
        employ.setEmail(correo);
        employ.setPosition(puesto, salario);
        this.list.updateEmployee(employ);

        this.btnDelete.setEnabled(false);
        this.btnUpDate.setEnabled(false);

    }//GEN-LAST:event_btnUpDateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        FrmSearchEmployee frm = new FrmSearchEmployee(null, true);
        frm.setList(list);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.employ = frm.getEmployee();
        if (employ != null) {
            this.txtFechaNacimiento.setText(employ.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            this.txtFechaNacimiento.setText(employ.getBirthDate().toString());
            this.txtIdentificacion.setText(employ.getId());
            this.txtNombre.setText(employ.getName());
            this.txtTelefono.setText(employ.getPhone());
            this.txtCorreo.setText(employ.getEmail());
            this.txtPuesto.setSelectedItem(employ.getPosition());
            this.txtSalario.setText(String.valueOf(this.verificarPuestoSalario()));

            this.txtIdentificacion.setEditable(false);
            this.txtNombre.setEditable(false);
            this.txtFechaNacimiento.setEditable(false);
            this.txtTelefono.setEditable(true);
            this.txtCorreo.setEditable(true);

            this.btnUpDate.setEnabled(true);
            this.btnDelete.setEnabled(true);
        }
        this.btnAdd.setEnabled(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.txtIdentificacion.setEditable(true);
        this.txtNombre.setEditable(true);
        this.txtFechaNacimiento.setEditable(true);
        this.txtTelefono.setEditable(true);
        this.txtCorreo.setEditable(true);

        this.txtIdentificacion.setText("");
        this.txtNombre.setText("");
        this.txtFechaNacimiento.setText("");
        this.txtTelefono.setText("");
        this.txtCorreo.setText("");

        this.btnAdd.setEnabled(true);
        this.btnDelete.setEnabled(false);
        this.btnUpDate.setEnabled(false);
    }//GEN-LAST:event_btnNewActionPerformed

    public void puestoSalario() {
        puestoSalario = new HashMap<>();

        puestoSalario.put("Agente de Ventas", 400000.00);
        puestoSalario.put("Encargado de Inventario", 350000.00);
        puestoSalario.put("Gerente de Sucursal", 700000.00);
        puestoSalario.put("Recepcionista", 425000.00);
        puestoSalario.put("Conductor de Reparto", 375000.00);
        puestoSalario.put("Técnico en Mantenimiento de Flota", 525000.00);
    }

    public double verificarPuestoSalario() {
        double salario = puestoSalario.get(String.valueOf(this.txtPuesto.getSelectedItem()));
        return salario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtPuesto;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
