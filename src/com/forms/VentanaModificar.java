package com.forms;

import com.entities.Event;
import com.services.EventoService;

public class VentanaModificar extends javax.swing.JFrame {

    EventoService eventoService;

    public VentanaModificar() {
        initComponents();
        setLocationRelativeTo(null);
        this.eventoService = new EventoService();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlblIdLabel = new javax.swing.JLabel();
        jlblTextId = new javax.swing.JLabel();
        jlblMensajeAlUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfNombreEvento = new javax.swing.JTextField();
        txtfLugarEvento = new javax.swing.JTextField();
        txtfHoraInicio = new javax.swing.JTextField();
        txtfHoraFinal = new javax.swing.JTextField();
        txtfFecha = new javax.swing.JTextField();
        txtfNotaEvento = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha");
        jLabel1.setMaximumSize(new java.awt.Dimension(30, 16));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 172, 61, 27));

        jlblIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        jlblIdLabel.setText("ID");
        getContentPane().add(jlblIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 81, 25, 28));

        jlblTextId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTextId.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlblTextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 117, 27, 27));

        jlblMensajeAlUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jlblMensajeAlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 414, 265, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de Evento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 81, -1, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lugar del Evento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 81, -1, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora de Inicio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 178, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora Final");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 171, 63, 27));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripcion del Evento");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 252, 144, 29));
        getContentPane().add(txtfNombreEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 117, 180, 27));
        getContentPane().add(txtfLugarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 117, 162, 27));
        getContentPane().add(txtfHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 199, 84, 27));
        getContentPane().add(txtfHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 199, 75, 27));
        getContentPane().add(txtfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 199, 78, 27));
        getContentPane().add(txtfNotaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 288, 293, 30));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 378, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 378, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 378, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reunion2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 162, 507));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ModificarEvento.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 260, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo 3.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 550, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validarYModificarEvento(String nombreEvento, String fechaEvento, String horaInicio, String horaFinal, String lugarEvento, String notaEvento) {
        if (!nombreEvento.equals("") && !fechaEvento.equals("") && !horaInicio.equals("") && !horaFinal.equals("") && !lugarEvento.equals("") && !notaEvento.equals("")) {
            boolean fechaEsCorrecta = this.eventoService.verificarFecha(fechaEvento);
            if (fechaEsCorrecta) {
                Event evento = this.crearObjEvento();
                this.eventoService.modificarEvento(evento);
                this.limpiarCampos();
                this.setVisible(false);
            } else {
                this.jlblMensajeAlUsuario.setText("Introduciste la fecha de manera incorrecta");
            }
        } else {
            this.jlblMensajeAlUsuario.setText("Debes rellenar los campos requeridos");
        }
    }

    private Event crearObjEvento() {
        Event evento = new Event(Integer.parseInt(this.jlblTextId.getText()),
                this.txtfNombreEvento.getText(),
                this.txtfFecha.getText(),
                this.txtfHoraInicio.getText(),
                this.txtfHoraFinal.getText(),
                this.txtfLugarEvento.getText(),
                this.txtfNotaEvento.getText()
        );
        return evento;
    }

    private void limpiarCampos() {
        this.jlblTextId.setText("");
        this.txtfNombreEvento.setText("");
        this.txtfHoraInicio.setText("");
        this.txtfHoraFinal.setText("");
        this.txtfLugarEvento.setText("");
        this.txtfNotaEvento.setText("");
        this.txtfFecha.setText("");
    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.jlblMensajeAlUsuario.setText("");
        String nombreEvento = this.txtfNombreEvento.getText();
        String fechaEvento = this.txtfFecha.getText();
        String horaInicio = this.txtfHoraInicio.getText();
        String horaFinal = this.txtfHoraFinal.getText();
        String lugarEvento = this.txtfLugarEvento.getText();
        String notaEvento = this.txtfNotaEvento.getText();
        this.validarYModificarEvento(nombreEvento, fechaEvento, horaInicio, horaFinal, lugarEvento, notaEvento);
        VentanaInicio.vtnInicio.mostrarDatosTabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.jlblMensajeAlUsuario.setText("");
        this.limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        this.jlblMensajeAlUsuario.setText("");
        this.limpiarCampos();
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificar().setVisible(true);
            }
        });
    }

    public void setTextOfTxtfNombreEvento(String textNombreEvento) {
        this.txtfNombreEvento.setText(textNombreEvento);
    }

    public void setTextOfTxtfFecha(String textFecha) {
        this.txtfFecha.setText(textFecha);
    }

    public void setTextOfTxtfHoraFinal(String textHoraFinal) {
        this.txtfHoraFinal.setText(textHoraFinal);
    }

    public void setTextOfTxtfHoraInicio(String textHoraInicio) {
        this.txtfHoraInicio.setText(textHoraInicio);
    }

    public void setTextOfTxtId(String textId) {
        this.jlblTextId.setText(textId);
    }

    public void setTextOfTxtfLugarEvento(String textLugarEvento) {
        this.txtfLugarEvento.setText(textLugarEvento);
    }

    public void setTextOfTxtfNotaEvento(String textNotaEvento) {
        this.txtfNotaEvento.setText(textNotaEvento);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblIdLabel;
    private javax.swing.JLabel jlblMensajeAlUsuario;
    private javax.swing.JLabel jlblTextId;
    private javax.swing.JTextField txtfFecha;
    private javax.swing.JTextField txtfHoraFinal;
    private javax.swing.JTextField txtfHoraInicio;
    private javax.swing.JTextField txtfLugarEvento;
    private javax.swing.JTextField txtfNombreEvento;
    private javax.swing.JTextField txtfNotaEvento;
    // End of variables declaration//GEN-END:variables
}
