/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.EstadoCivilController;
import controller.FuncionarioController;
import controller.TipoIdentificacionController;
import dao.EstadoCivilDao;
import dao.EstadoCivilDaoImpl;
import dao.FuncionarioDao;
import dao.FuncionarioDaoImpl;
import dao.TipoIdentificacionDao;
import dao.TipoIdentificacionDaoImpl;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import model.EstadoCivil;
import model.Funcionario;
import model.TipoIdentificacion;
import utils.Mensajes;

/**
 *
 * @author Familia
 */
public class FuncionariosGUI extends javax.swing.JFrame {
    
    private TipoIdentificacionController tipoIDCtrl;
    private EstadoCivilController estadosCivilesCtrl;
    private FuncionarioController funcionarioCtrl;

    /**
     * Creates new form Funcionarios
     */
    public FuncionariosGUI() {
        initComponents();
        init();
    }
    
    private void init() {
        llenarSelectorTipoId();
        llenarSelectorEstadoCivil();
        llenarTablaFuncionarios();
        cambiarEstadoBotones(false);
    }
    
    public void llenarSelectorTipoId() {
        TipoIdentificacionDao tipoIdentificacionDao = new TipoIdentificacionDaoImpl();
        tipoIDCtrl = new TipoIdentificacionController(tipoIdentificacionDao);
        JCBTiposID.setModel(tipoIDCtrl.llenarSelector());
    }
    
    public void llenarSelectorEstadoCivil() {
        EstadoCivilDaoImpl estadoCivilDao =  new EstadoCivilDaoImpl();
        estadosCivilesCtrl = new EstadoCivilController(estadoCivilDao);
        JCBEstadoCivil.setModel(estadosCivilesCtrl.llenarSelector());
    }
    
    public void llenarTablaFuncionarios() {
        FuncionarioDao funcionarioDao = new FuncionarioDaoImpl();
        funcionarioCtrl = new FuncionarioController(funcionarioDao);
        JTListaFuncionarios.setModel(funcionarioCtrl.llenarTabla());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGSelectorSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCBTiposID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JTFNumeroDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JRBSexoF = new javax.swing.JRadioButton();
        JRBSexoM = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        JFTFTelefono = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        JCBEstadoCivil = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        JDCFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTADireccion = new javax.swing.JTextArea();
        JBGuardarCambios = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTListaFuncionarios = new javax.swing.JTable();
        JBSalir = new javax.swing.JButton();
        JBRefrescar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestión Funcionarios");

        jLabel2.setText("Tipo ID:");

        JCBTiposID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBTiposID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBTiposIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Documento:");

        JTFNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumeroDocumentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombres:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Sexo:");

        JRBSexoF.setText("F");

        JRBSexoM.setText("M");

        jLabel7.setText("Teléfono:");

        JFTFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFTFTelefonoActionPerformed(evt);
            }
        });

        jLabel8.setText("Estado Civil:");

        JCBEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Fecha Nacimiento:");

        jLabel10.setText("Dirección:");

        JTADireccion.setColumns(20);
        JTADireccion.setRows(5);
        jScrollPane1.setViewportView(JTADireccion);

        JBGuardarCambios.setText("Guardar Cambios");
        JBGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarCambiosActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JTListaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTListaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTListaFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTListaFuncionarios);

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JBRefrescar.setText("Refrescar");
        JBRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRefrescarActionPerformed(evt);
            }
        });

        JBEliminar.setText("Eliminar");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBGuardarCambios)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(142, 142, 142)
                        .addComponent(JBGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JCBTiposID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JRBSexoF)
                                    .addGap(18, 18, 18)
                                    .addComponent(JRBSexoM)))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTFNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JFTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JCBEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JBRefrescar)
                            .addGap(18, 18, 18)
                            .addComponent(JBEliminar)
                            .addGap(18, 18, 18)
                            .addComponent(JBEditar))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCBTiposID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTFNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(JTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(JFTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(JRBSexoF)
                                .addComponent(JRBSexoM)
                                .addComponent(jLabel8)
                                .addComponent(JCBEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(JDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumeroDocumentoActionPerformed

    private void JBGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarCambiosActionPerformed
        // TODO add your handling code here:
        if (guardarCambios()) {
            Mensajes.mostrarMensaje("Guardado Exitoso", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            llenarTablaFuncionarios();
        };
    }//GEN-LAST:event_JBGuardarCambiosActionPerformed

    private void JCBTiposIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBTiposIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBTiposIDActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        cambiarEstadoBotones(false);
        limpiarCampos();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        // TODO add your handling code here:
        if (guardar()) {
            Mensajes.mostrarMensaje("Guardado Exitoso", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            llenarTablaFuncionarios();
        };
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        // TODO add your handling code here:
        if (Mensajes.mensajeConfirm("¿Seguro que desea salir?", "Salir Del Sistema")) {
            this.dispose();
        }
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRefrescarActionPerformed
        // TODO add your handling code here:
        init();
        limpiarCampos();
    }//GEN-LAST:event_JBRefrescarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        // TODO add your handling code here:
        JBGuardar.setEnabled(false);
        JBGuardarCambios.setEnabled(true);
        JBCancelar.setEnabled(true);
        editar();
    }//GEN-LAST:event_JBEditarActionPerformed
    
    

    private void JTListaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTListaFuncionariosMouseClicked
        // TODO add your handling code here:
        if (JTListaFuncionarios.getSelectedRow() != -1) {
            JBEditar.setEnabled(true);
            JBEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_JTListaFuncionariosMouseClicked

    private void JFTFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFTFTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFTFTelefonoActionPerformed
    
    public void cambiarEstadoBotones(boolean estado) {
        JBGuardarCambios.setEnabled(estado);
        JBEditar.setEnabled(estado);
        JBEliminar.setEnabled(estado);
        JBCancelar.setEnabled(estado);
        JBGuardar.setEnabled(!estado);
    }
    
    public boolean guardarCambios() {
        int result;
        Funcionario funcionario = new Funcionario();
        
        funcionario.setTipoIdentificacionId(new TipoIdentificacion(JCBTiposID.getSelectedIndex() + 1));
        funcionario.setEstadoCivilId(new EstadoCivil(JCBEstadoCivil.getSelectedIndex() + 1));
        funcionario.setDireccion(JTADireccion.getText().trim().toLowerCase());
        funcionario.setSexo(getSelectedButton());
        funcionario.setNombres(JTFNombres.getText().trim().toUpperCase());
        funcionario.setApellidos(JTFApellidos.getText().trim().toUpperCase());
        funcionario.setNumeroIdentificacion(JTFNumeroDocumento.getText().trim().toUpperCase());
        funcionario.setTelefono(JFTFTelefono.getText());
        if (JDCFechaNacimiento.getDate() != null) {
            funcionario.setFechaNacimiento(JDCFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            funcionario.setFechaNacimiento(LocalDate.now(ZoneId.systemDefault()));
        }
        if (comprobarDatosRequired()) {
            Mensajes.mostrarMensaje("Debe completar los campos obligatorios", "Advertencia", JOptionPane.WARNING_MESSAGE);
            result = 0;
        } else {
            result = funcionarioCtrl.editar(funcionario);
        }
        return result > 0;
    }
    
    public void editar() {
        String documento = (String) JTListaFuncionarios.getValueAt(JTListaFuncionarios.getSelectedRow(), 2);
        Funcionario funcionario = funcionarioCtrl.buscarFuncionario(documento);
        JTADireccion.setText(funcionario.getDireccion());
        if (funcionario.getSexo().equals("F")) {
            JRBSexoF.setSelected(true);
        } else {
            JRBSexoM.setSelected(true);
        }
        JTFNombres.setText(funcionario.getNombres());
        JTFApellidos.setText(funcionario.getApellidos());
        JTFNumeroDocumento.setText(funcionario.getNumeroIdentificacion());
        JFTFTelefono.setText(funcionario.getTelefono());
        JDCFechaNacimiento.setDate(Date.from(funcionario.getFechaNacimiento().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        JCBEstadoCivil.setSelectedIndex(funcionario.getEstadoCivilId().getId() - 1);
        JCBTiposID.setSelectedIndex(funcionario.getTipoIdentificacionId().getId() - 1);
        
    }
    
    public void eliminar() {
        String documento = (String) JTListaFuncionarios.getValueAt(JTListaFuncionarios.getSelectedRow(), 2);
        if (Mensajes.mensajeConfirm("¿Seguro que desea eliminar el funcionario?", "Eliminar")) {
            funcionarioCtrl.eliminar(documento);
            llenarTablaFuncionarios();
        }
        
    }
    
    public boolean guardar() {
        int result;
        Funcionario funcionario = new Funcionario();
        
        funcionario.setTipoIdentificacionId(new TipoIdentificacion(JCBTiposID.getSelectedIndex() + 1));
        funcionario.setEstadoCivilId(new EstadoCivil(JCBEstadoCivil.getSelectedIndex() + 1));
        funcionario.setDireccion(JTADireccion.getText().trim().toLowerCase());
        funcionario.setSexo(getSelectedButton());
        funcionario.setNombres(JTFNombres.getText().trim().toUpperCase());
        funcionario.setApellidos(JTFApellidos.getText().trim().toUpperCase());
        funcionario.setNumeroIdentificacion(JTFNumeroDocumento.getText().trim().toUpperCase());
        if (JFTFTelefono.isEditValid()) {
            funcionario.setTelefono(JFTFTelefono.getText());
        } else {
            funcionario.setTelefono("000-000-00-00");
        }
        
        if (JDCFechaNacimiento.getDate() != null) {
            funcionario.setFechaNacimiento(JDCFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            funcionario.setFechaNacimiento(LocalDate.now(ZoneId.systemDefault()));
        }
        if (comprobarDatosRequired()) {
            Mensajes.mostrarMensaje("Debe completar los campos obligatorios", "Advertencia", JOptionPane.WARNING_MESSAGE);
            result = 0;
        } else {
            result = funcionarioCtrl.guardar(funcionario);
        }
        
        return result > 0;
    }
    
    public boolean comprobarDatosRequired() {
        return JTFNumeroDocumento.getText().isBlank() || JTFNombres.getText().isBlank()
                || JTFApellidos.getText().isBlank() || JTADireccion.getText().isBlank();
    }
    
    public void limpiarCampos() {
        JTADireccion.setText("");
        JRBSexoF.setSelected(false);
        JRBSexoM.setSelected(false);
        JTFNombres.setText("");
        JTFApellidos.setText("");
        JTFNumeroDocumento.setText("");
        JFTFTelefono.setText("");
        JDCFechaNacimiento.setDate(null);
        JCBEstadoCivil.setSelectedIndex(0);
        JCBTiposID.setSelectedIndex(0);
    }
    
    public String getSelectedButton() {
        Enumeration<AbstractButton> buttons = BGSelectorSexo.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return "";
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
            java.util.logging.Logger.getLogger(FuncionariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionariosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGSelectorSexo;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBGuardarCambios;
    private javax.swing.JButton JBRefrescar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<String> JCBEstadoCivil;
    private javax.swing.JComboBox<String> JCBTiposID;
    private com.toedter.calendar.JDateChooser JDCFechaNacimiento;
    private javax.swing.JFormattedTextField JFTFTelefono;
    private javax.swing.JRadioButton JRBSexoF;
    private javax.swing.JRadioButton JRBSexoM;
    private javax.swing.JTextArea JTADireccion;
    private javax.swing.JTextField JTFApellidos;
    private javax.swing.JTextField JTFNombres;
    private javax.swing.JTextField JTFNumeroDocumento;
    private javax.swing.JTable JTListaFuncionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}