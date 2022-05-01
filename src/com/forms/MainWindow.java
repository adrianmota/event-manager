package com.forms;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.util.List;
import com.entities.Event;
import com.services.EventService;

public class MainWindow extends javax.swing.JFrame {

    private static MainWindow windowItself;
    CreateEventWindow createEventWindow = new CreateEventWindow();
    EditEventWindow editEventWindow = new EditEventWindow();
    DefaultTableModel tableModel;
    EventService eventServiceObj = new EventService();
    List<Event> events;
    String eventRecordId;

    private MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        this.showDataInTable();
    }
    
    public static MainWindow getInstance() {
        if (windowItself == null) {
            windowItself = new MainWindow();
            return windowItself;
        }
        
        return windowItself;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSpinner1 = new javax.swing.JSpinner();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEventos = new javax.swing.JTable();
        btnMostrarEventos = new javax.swing.JButton();
        jlblTextBuscarEvento = new javax.swing.JLabel();
        jlblTxtNoEventos = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEventos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tablaEventos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha", "Hora de inicio", "Hora de termino", "Lugar", "Nota"
            }
        ));
        tablaEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEventos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 976, 310));

        btnMostrarEventos.setText("Mostrar eventos");
        btnMostrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEventosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 518, 140, -1));

        jlblTextBuscarEvento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblTextBuscarEvento.setForeground(new java.awt.Color(255, 255, 255));
        jlblTextBuscarEvento.setText("Buscar Evento");
        getContentPane().add(jlblTextBuscarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 63, -1, 27));

        jlblTxtNoEventos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jlblTxtNoEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 159, 255, -1));

        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 63, 628, 30));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 63, -1, 27));

        btnCrear.setText("Crear Evento");
        btnCrear.setBorder(null);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 108, 90, 30));

        btnModificar.setText("Modificar Evento");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 108, -1, 30));

        btnEliminar.setText("Eliminar Evento");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 108, -1, 30));

        button2.setText("Salir");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 518, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eventos o Reuniones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 9, -1, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo 3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1035, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showDataInTable() {
        this.events = eventServiceObj.listEvents();
        this.defineEventsTable();
        this.fillEventsTable(events);
    }

    private void fillFieldsOfEditEventWindow(String[] valoresEvento) {
        this.editEventWindow.setTextOfTxtId(valoresEvento[0]);
        this.editEventWindow.setTextOfTxtfNombreEvento(valoresEvento[1]);
        this.editEventWindow.setTextOfTxtfFecha(valoresEvento[2]);
        this.editEventWindow.setTextOfTxtfHoraInicio(valoresEvento[3]);
        this.editEventWindow.setTextOfTxtfHoraFinal(valoresEvento[4]);
        this.editEventWindow.setTextOfTxtfLugarEvento(valoresEvento[5]);
        this.editEventWindow.setTextOfTxtfNotaEvento(valoresEvento[6]);
    }

    private void defineEventsTable() {
        String[] titles = {"id", "Nombre", "fecha", "Hora inicio", "Hora despedida", "Lugar", "Nota"};
        this.tableModel = new DefaultTableModel(null, titles);
        this.tablaEventos.setModel(this.tableModel);
    }

    private void fillEventsTable(List<Event> eventos) {
        for (Event evento : eventos) {
            String[] objEvento = {String.valueOf(evento.getId()), evento.getName(), evento.getDate(), evento.getStartTime(), evento.getEndTime(), evento.getPlace(), evento.getQuote()};
            this.tableModel.addRow(objEvento);
        }
    }

    private void validateAndSearchEvent() {
        String data = txtBuscador.getText();
        this.txtBuscador.setText("");
        this.jlblTxtNoEventos.setText("");
        this.events = eventServiceObj.searchEvents(data);
        
        if (this.events != null) {
            if (!this.events.isEmpty()) {
                this.defineEventsTable();
                this.fillEventsTable(events);
            } else {
                this.defineEventsTable();
                this.fillEventsTable(events);
                this.jlblTxtNoEventos.setText("No se encontraron registros");
            }
        }
    }

    private void btnMostrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEventosActionPerformed
        this.showDataInTable();
        this.jlblTxtNoEventos.setText("");
    }//GEN-LAST:event_btnMostrarEventosActionPerformed

    private void tablaEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEventosMouseClicked
        String[] valoresEvento = new String[7];
        if (evt.getClickCount() == 1) {
            JTable registroEvento = (JTable) evt.getSource();
            for (int indiceValor = 0; indiceValor < valoresEvento.length; indiceValor++) {
                valoresEvento[indiceValor] = registroEvento.getModel().getValueAt(registroEvento.getSelectedRow(), indiceValor).toString();
            }
            this.fillFieldsOfEditEventWindow(valoresEvento);
        }
        this.eventRecordId = valoresEvento[0];
    }//GEN-LAST:event_tablaEventosMouseClicked

    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.validateAndSearchEvent();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        this.createEventWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.editEventWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eventServiceObj.deleteEvent(this.eventRecordId);
        this.showDataInTable();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarEventos;
    private javax.swing.JButton button2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel jlblTextBuscarEvento;
    private javax.swing.JLabel jlblTxtNoEventos;
    private javax.swing.JTable tablaEventos;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables

}
