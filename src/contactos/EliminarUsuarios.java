package contactos;

import java.awt.Color;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Ingeniero Alexander Gonzalez.
 */
@SuppressWarnings("serial")
public class EliminarUsuarios extends javax.swing.JFrame {

    int contador = 0;

    public EliminarUsuarios() {

        this.initComponents();
        this.setTitle("Eliminar contacto");
        this.setIconImage(new ImageIcon(this.getClass().getResource("/img/Admin.jpg")).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * Metodo que realiza la validacion de campos del formulario.
     */
    public void validarCampos() {
        if (this.jTextField1_telefono.getText().equals("") && this.jTextField1_identificacion.getText().equals("")) {
            if (this.jTextField1_telefono.getText().equals("")) {
                this.jTextField1_telefono.setBackground(Color.red);
            }
            else {
                this.jTextField1_telefono.setBackground(Color.green);
            }
            if (this.jTextField1_identificacion.getText().equals("")) {
                this.jTextField1_identificacion.setBackground(Color.red);
            }
            else {
                this.jTextField1_identificacion.setBackground(Color.green);
            }
            this.contador++;
            JOptionPane.showMessageDialog(null, "Debe Diligenciar minimo un campo.");
        }

        if ((this.validar(this.jTextField1_identificacion.getText().trim()) || this.validar(this.jTextField1_telefono.getText().trim()))) {

            this.jTextField1_telefono.setBackground(Color.red);
            this.jTextField1_identificacion.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Identificacion o telefono deben ser númericos");
            this.contador++;
        }
    }

    /**
     * Metodo que inicializa los componentes del frame.
     */
    private void initComponents() {
        this.jLabel1 = new javax.swing.JLabel();
        this.jLabelIdentificacion = new javax.swing.JLabel();
        this.jLabelTelefono = new javax.swing.JLabel();
        this.jTextField1_identificacion = new javax.swing.JTextField();
        this.jTextField1_telefono = new javax.swing.JTextField();
        this.jButton1Eliminar = new javax.swing.JButton();
        this.jLabel8 = new javax.swing.JLabel();
        this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        this.jLabel1.setText("Eliminar Contactos:");
        this.jLabelIdentificacion.setText("Identificacion:");
        this.jLabelTelefono.setText("Telefono: ");
        this.jButton1Eliminar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/eliminar.png")));
        this.jButton1Eliminar.addActionListener(evt -> EliminarUsuarios.this.jButton1EliminarContactos(evt));
        this.jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        this.jLabel8.setText("Creado por Ing Alexander Gonzalez G.");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
            layout.createSequentialGroup().addGap(51, 51, 51).addGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField1_telefono,
                    javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE).addComponent(this.jLabelIdentificacion).addComponent(
                        this.jLabelTelefono).addComponent(this.jTextField1_identificacion)).addPreferredGap(
                            javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE).addGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                        .addComponent(this.jTextField1_identificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 142,
                                            Short.MAX_VALUE))

                                    .addComponent(this.jButton1Eliminar)).addGap(36, 36, 36)).addGroup(
                                        layout.createSequentialGroup().addGroup(
                                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                layout.createSequentialGroup().addGap(154, 154, 154).addComponent(
                                                    this.jLabel1)).addGroup(
                                                        layout.createSequentialGroup().addGap(147, 147, 147).addComponent(
                                                            this.jLabel8))).addContainerGap(161, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
            layout.createSequentialGroup().addGap(34, 34, 34).addComponent(this.jLabel1).addGap(18, 18, 18).addGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                    this.jLabelIdentificacion)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                            this.jTextField1_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(
                                this.jTextField1_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
                                    18).addGroup(
                                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                                            this.jLabelTelefono)).addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
                                                    layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                                                            this.jTextField1_telefono, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(26, 26, 26).addGroup(
                                                                layout.createParallelGroup(
                                                                    javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
                                                                        layout.createSequentialGroup().addPreferredGap(
                                                                            javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                            .addGap(18, 18, 18).addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)).addComponent(
                                                                                    this.jButton1Eliminar)).addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        21, Short.MAX_VALUE).addComponent(
                                                                                            this.jLabel8)));

        this.pack();
    }

    private void jButton1EliminarContactos(java.awt.event.ActionEvent evt) {
        this.contador = 0;
        this.validarCampos();
        if (!this.jTextField1_identificacion.getText().equals("")) {
            this.eliminaPorIdentificacion(this.jTextField1_identificacion.getText());
        }
        if (!this.jTextField1_telefono.getText().equals("")) {
            this.eliminaPorTelefono(this.jTextField1_telefono.getText());
        }
       
    }

    /*
     * Metodo que valida si un dato es númerico
     * @param cadena Dato a validar si es númerico.
     * @return true/false segun la validación.
     */
    public boolean validar(String cadena) {
        if (cadena.matches("[0-9]*")) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Metodo que elimina un contacto cuando se realiza por la opcion de Identificación.
     */
    public void eliminaPorIdentificacion(String identificacion) {
        Iterator<Contactos> it = InterfazAdmin.datosContacto.iterator();
        if(!InterfazAdmin.datosContacto.isEmpty()) {        
        while (it.hasNext()) {
            if (!it.next().getIdentificacion().equals(identificacion)) {
                JOptionPane.showMessageDialog(null, "El contacto " + identificacion + " no existe puede crearlo. \n");
                RegistrarUsuarios registrar = new RegistrarUsuarios();
                registrar.setVisible(true);
                this.setVisible(false);
                break;
            }
            else {
                it.remove();
                JOptionPane.showMessageDialog(null, "Contacto " + identificacion + " eliminado exitosamente \n");
                break;
            }
        }
        this.jTextField1_telefono.setText("");
        this.jTextField1_identificacion.setText("");
        this.setVisible(false);
        }else {
            JOptionPane.showMessageDialog(null, "No existen contactos para eliminar puede crearlos. \n");
            RegistrarUsuarios registrar = new RegistrarUsuarios();
            registrar.setVisible(true);
            this.setVisible(false);
        }
        
    }

    /**
     * Metodo que elimina un contacto cuando se realiza por la opcion de Telefono.
     */
    public void eliminaPorTelefono(String telefono) {
        Iterator<Contactos> it = InterfazAdmin.datosContacto.iterator();
        if(!InterfazAdmin.datosContacto.isEmpty()) {     
        while (it.hasNext()) {
            if (!it.next().getTelefono().equals(telefono)) {
                JOptionPane.showMessageDialog(null, "El contacto " + telefono + " no existe puede crearlo. \n");
                RegistrarUsuarios registrar = new RegistrarUsuarios();
                registrar.setVisible(true);
                this.setVisible(false);
                break;
            }
            else {
                it.remove();
                JOptionPane.showMessageDialog(null, "Contacto " + telefono + " eliminado exitosamente \n");
                break;
            }
        }
        this.jTextField1_telefono.setText("");
        this.jTextField1_identificacion.setText("");
        this.setVisible(false);
    }else {
        JOptionPane.showMessageDialog(null, "No existen contactos para eliminar puede crearlos. \n");
        RegistrarUsuarios registrar = new RegistrarUsuarios();
        registrar.setVisible(true);
        this.setVisible(false);
    }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new EliminarUsuarios().setVisible(true));
    }

    private javax.swing.JButton    jButton1Eliminar;
    private javax.swing.JLabel     jLabel1;
    private javax.swing.JLabel     jLabelIdentificacion;
    private javax.swing.JLabel     jLabelTelefono;
    private javax.swing.JLabel     jLabel8;
    private javax.swing.JTextField jTextField1_telefono;
    private javax.swing.JTextField jTextField1_identificacion;

}
