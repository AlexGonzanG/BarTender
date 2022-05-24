package contactos;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Ingeniero Alexander Gonzalez.
 */
@SuppressWarnings("serial")
public class RegistrarUsuarios extends javax.swing.JFrame {

    int            contador      = 0;
    Set<Contactos> datosContacto = new HashSet<>();

    public RegistrarUsuarios() {
        this.initComponents();
        this.setTitle("Registrar nuevo contacto - Sesion de Administrador");
        this.setIconImage(new ImageIcon(this.getClass().getResource("/img/Admin.jpg")).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * Metodo que realiza la validacion de campos del formulario.
     */
    public void validarCampos() {
        if (this.jTextField1_nombre.getText().equals("") || this.jTextField1_identificacion.getText().equals("")
            || this.jTextField1_direccion.getText().equals("") || this.jTextField1_telefono.getText().equals("")) {

            if (this.jTextField1_nombre.getText().equals("")) {
                this.jTextField1_nombre.setBackground(Color.red);
                this.contador++;
            }
            else {
                this.jTextField1_nombre.setBackground(Color.green);
            }
            if (this.jTextField1_identificacion.getText().equals("")) {
                this.jTextField1_identificacion.setBackground(Color.red);
                this.contador++;
            }
            else {
                this.jTextField1_identificacion.setBackground(Color.green);
            }
            if (this.jTextField1_direccion.getText().equals("")) {
                this.jTextField1_direccion.setBackground(Color.red);
                this.contador++;
            }
            else {
                this.jTextField1_direccion.setBackground(Color.green);
            }
            if (this.jTextField1_telefono.getText().equals("")) {
                this.jTextField1_telefono.setBackground(Color.red);
                this.contador++;
            }
            else {
                this.jTextField1_telefono.setBackground(Color.green);
            }
            JOptionPane.showMessageDialog(null, "Debe Diligenciar todos los campos");
        }

        if ((this.validar(this.jTextField1_identificacion.getText().trim()) || this.validar(this.jTextField1_telefono.getText().trim()))) {

            this.jTextField1_telefono.setBackground(Color.red);
            this.jTextField1_identificacion.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Identificacion y telefono deben ser númericos");
            this.contador++;
        }
    }

    /**
     * Metodo que inicializa los componentes del frame.
     */
    private void initComponents() {
        this.jLabel1 = new javax.swing.JLabel();
        this.jLabel2 = new javax.swing.JLabel();
        this.jLabel3 = new javax.swing.JLabel();
        this.jLabel4 = new javax.swing.JLabel();
        this.jLabel5 = new javax.swing.JLabel();
        this.jTextField1_nombre = new javax.swing.JTextField();
        this.jTextField1_identificacion = new javax.swing.JTextField();
        this.jTextField1_direccion = new javax.swing.JTextField();
        this.jTextField1_telefono = new javax.swing.JTextField();
        this.jButton1_Agregar = new javax.swing.JButton();
        this.jLabel8 = new javax.swing.JLabel();
        this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        this.jLabel1.setText("Registro de Contactos");
        this.jLabel2.setText("Nombre:");
        this.jLabel3.setText("Identificacion: ");
        this.jLabel4.setText("Direccion: ");
        this.jLabel5.setText("Telefono: ");
        this.jButton1_Agregar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/AgregarUs.jpg")));
        this.jButton1_Agregar.addActionListener(evt -> RegistrarUsuarios.this.jButton1ActionPerformed(evt));
        this.jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10));
        this.jLabel8.setText("Creado por Ing Alexander Gonzalez G.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
            layout.createSequentialGroup().addGap(51, 51, 51).addGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField1_direccion,
                    javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE).addComponent(this.jLabel2).addComponent(
                        this.jLabel4).addComponent(this.jTextField1_nombre)).addPreferredGap(
                            javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE).addGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(
                                        this.jLabel3).addComponent(this.jTextField1_identificacion, javax.swing.GroupLayout.DEFAULT_SIZE,
                                            142, Short.MAX_VALUE).addComponent(this.jLabel5).addComponent(
                                                this.jTextField1_telefono)).addComponent(this.jButton1_Agregar)).addGap(36, 36,
                                                    36)).addGroup(
                                                        layout.createSequentialGroup().addGroup(layout.createParallelGroup(
                                                            javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                                layout.createSequentialGroup().addGap(154, 154, 154).addComponent(
                                                                    this.jLabel1)).addGroup(
                                                                        layout.createSequentialGroup().addGap(147, 147,
                                                                            147).addComponent(this.jLabel8))).addContainerGap(161,
                                                                                Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
            layout.createSequentialGroup().addGap(34, 34, 34).addComponent(this.jLabel1).addGap(18, 18, 18).addGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(
                    this.jLabel3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                            this.jTextField1_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(
                                this.jTextField1_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(
                                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                                        this.jLabel4).addComponent(this.jLabel5)).addPreferredGap(
                                            javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
                                                layout.createParallelGroup(
                                                    javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                                                        this.jTextField1_direccion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(this.jTextField1_telefono,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(26, 26, 26).addGroup(
                                                                layout.createParallelGroup(
                                                                    javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
                                                                        layout.createSequentialGroup().addPreferredGap(
                                                                            javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGap(
                                                                                18, 18, 18)).addComponent(
                                                                                    this.jButton1_Agregar)).addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        21, Short.MAX_VALUE).addComponent(
                                                                                            this.jLabel8)));
        this.pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.contador = 0;
        this.validarCampos();
        if (this.contador == 0) {
            Contactos contactos = new Contactos();
            contactos.setIdentificacion(this.jTextField1_identificacion.getText().trim());
            contactos.setTelefono(this.jTextField1_telefono.getText().trim());
            contactos.setNombre(this.jTextField1_nombre.getText().trim());
            contactos.setDireccion(this.jTextField1_direccion.getText().trim());
            InterfazAdmin.datosContacto.add(contactos);
            for (Contactos contacto : InterfazAdmin.datosContacto) {
                if (contacto.getNombre().equals(this.jTextField1_nombre.getText().trim())) {
                    JOptionPane.showMessageDialog(null, "Contacto creado exitosamente \n" + contacto.getNombre() + " "
                        + contacto.getTelefono() + " " + contacto.getDireccion() + " " + contacto.getIdentificacion());
                }
            }
            
            this.setVisible(false);
        }
       
    }

    /**
     * Metodo que valida si un dato es númerico
     * 
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
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new RegistrarUsuarios().setVisible(true));
    }

    private javax.swing.JButton    jButton1_Agregar;
    private javax.swing.JLabel     jLabel1;
    private javax.swing.JLabel     jLabel2;
    private javax.swing.JLabel     jLabel3;
    private javax.swing.JLabel     jLabel4;
    private javax.swing.JLabel     jLabel5;
    private javax.swing.JLabel     jLabel8;
    private javax.swing.JTextField jTextField1_identificacion;
    private javax.swing.JTextField jTextField1_nombre;
    private javax.swing.JTextField jTextField1_telefono;
    private javax.swing.JTextField jTextField1_direccion;

}
