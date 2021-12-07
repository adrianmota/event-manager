package com.formularios;

import com.services.EventoService;
import com.entidades.Evento;

public class VentanaCrearEventos extends javax.swing.JFrame {

    EventoService eventoService;

    public VentanaCrearEventos() {
        initComponents();
        setLocationRelativeTo(null);
        this.eventoService = new EventoService();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensajeEventoAgregado = new javax.swing.JLabel();
        jlblMensajeAlUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfNombreEvento = new javax.swing.JTextField();
        txtfLugarEvento = new javax.swing.JTextField();
        txtfHoraInicio = new javax.swing.JTextField();
        txtfHoraFinal = new javax.swing.JTextField();
        txtfFecha = new javax.swing.JTextField();
        txtfNotaEvento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGuardarNewEvento = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(mensajeEventoAgregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlblMensajeAlUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jlblMensajeAlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 280, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del Evento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 108, 120, 22));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lugar del Evento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 108, 108, 22));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora Inicio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 212, 81, 18));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora Final");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 207, 70, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripcion del Evento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 297, 144, 26));
        getContentPane().add(txtfNombreEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 160, 27));
        getContentPane().add(txtfLugarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 170, 27));
        getContentPane().add(txtfHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 70, 29));
        getContentPane().add(txtfHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 70, 29));
        getContentPane().add(txtfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 90, 28));
        getContentPane().add(txtfNotaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 333, 250, 27));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 100, 20));

        btnGuardarNewEvento.setText("Guardar");
        btnGuardarNewEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNewEventoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarNewEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 80, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 90, -1));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 70, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reunion.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevoEvento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 220, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo 3.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 490, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validarYCrearEvento(String nombreEvento, String fechaEvento, String horaInicio, String horaFinal, String lugarEvento, String notaEvento) {
        if (!nombreEvento.equals("") && !fechaEvento.equals("") && !horaInicio.equals("") && !horaFinal.equals("") && !lugarEvento.equals("") && !notaEvento.equals("")) {
            boolean fechaEsCorrecta = eventoService.verificarFecha(fechaEvento);
            if (fechaEsCorrecta) {
                Evento evento = this.crearObjEvento();
                this.eventoService.agregarEvento(evento);
                this.limpiarCampos();
                this.jlblMensajeAlUsuario.setText("Se ha registrado el evento exitosamente");
            } else {
                this.jlblMensajeAlUsuario.setText("Introduciste la fecha de manera incorrecta");
            }
        } else {
            this.jlblMensajeAlUsuario.setText("Debes rellenar los campos requeridos");
        }
    }

    private Evento crearObjEvento() {
        Evento evento = new Evento(this.txtfNombreEvento.getText(),
                this.txtfFecha.getText(),
                this.txtfHoraInicio.getText(),
                this.txtfHoraFinal.getText(),
                this.txtfLugarEvento.getText(),
                this.txtfNotaEvento.getText()
        );
        return evento;
    }

    private void limpiarCampos() {
        this.txtfNombreEvento.setText("");
        this.txtfHoraInicio.setText("");
        this.txtfHoraFinal.setText("");
        this.txtfLugarEvento.setText("");
        this.txtfNotaEvento.setText("");
        this.txtfFecha.setText("");
    }

    private void btnGuardarNewEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNewEventoActionPerformed
        this.jlblMensajeAlUsuario.setText("");
        String nombreEvento = this.txtfNombreEvento.getText();
        String fechaEvento = this.txtfFecha.getText();
        String horaInicio = this.txtfHoraInicio.getText();
        String horaFinal = this.txtfHoraFinal.getText();
        String lugarEvento = this.txtfLugarEvento.getText();
        String notaEvento = this.txtfNotaEvento.getText();
        this.validarYCrearEvento(nombreEvento, fechaEvento, horaInicio, horaFinal, lugarEvento, notaEvento);
        VentanaInicio.vtnInicio.mostrarDatosTabla();
    }//GEN-LAST:event_btnGuardarNewEventoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.jlblMensajeAlUsuario.setText("");
        this.limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.jlblMensajeAlUsuario.setText("");
        this.limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrearEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarNewEvento;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jlblMensajeAlUsuario;
    private javax.swing.JLabel mensajeEventoAgregado;
    private javax.swing.JTextField txtfFecha;
    private javax.swing.JTextField txtfHoraFinal;
    private javax.swing.JTextField txtfHoraInicio;
    private javax.swing.JTextField txtfLugarEvento;
    private javax.swing.JTextField txtfNombreEvento;
    private javax.swing.JTextField txtfNotaEvento;
    // End of variables declaration//GEN-END:variables
}
