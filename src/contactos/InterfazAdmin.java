package contactos;

import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;

/**
 * @author Ingeniero Alexander Gonzalez.
 */
@SuppressWarnings("serial")
public class InterfazAdmin extends javax.swing.JFrame {

    public static Set<Contactos> datosContacto = new HashSet<>();

    public InterfazAdmin() {
        this.initComponents();
        this.setTitle("Sesion de Administrador");
        this.setIconImage(new ImageIcon(this.getClass().getResource("/img/Admin.jpg")).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    /**
     * Metodo que inicializa los componentes del frame.
     */
    private void initComponents() {

        this.boton_RegUsuarios = new javax.swing.JButton();
        this.boton_Gestionar = new javax.swing.JButton();
        this.boton_Eliminar = new javax.swing.JButton();
        this.jLabel1 = new javax.swing.JLabel();
        this.jLabel2 = new javax.swing.JLabel();
        this.jLabel3 = new javax.swing.JLabel();
        this.jLabel8 = new javax.swing.JLabel();
        this.jLabel7 = new javax.swing.JLabel();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.boton_RegUsuarios.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/AgregarUs.jpg")));
        this.boton_RegUsuarios.setMaximumSize(new java.awt.Dimension(257, 257));
        this.boton_RegUsuarios.setMinimumSize(new java.awt.Dimension(257, 257));
        this.boton_RegUsuarios.addActionListener(evt -> InterfazAdmin.this.boton_RegUsuariosActionPerformed(evt));

        this.boton_Gestionar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/GestionUsl.jpg")));
        this.boton_Gestionar.addActionListener(evt -> InterfazAdmin.this.boton_GestionarActionPerformed(evt));

        this.boton_Eliminar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/eliminar.png")));
        this.boton_Eliminar.addActionListener(evt -> InterfazAdmin.this.boton_EliminarActionPerformed(evt));

        this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        this.jLabel1.setText("Registrar Contacto");
        this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        this.jLabel2.setText("Gestionar Contactos");
        this.jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        this.jLabel3.setText("Eliminar Contacto");
        this.jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10));
        this.jLabel8.setText("Creado por Ing Alexander Gonzalez G.");
        this.jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        this.jLabel7.setText("Bienvenid@ ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
            javax.swing.GroupLayout.Alignment.TRAILING,
            layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(
                this.jLabel8).addGap(153, 153, 153)).addGroup(layout.createSequentialGroup().addGap(51, 51, 51).addGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        layout.createSequentialGroup().addComponent(this.jLabel7).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)).addGroup(
                                layout.createSequentialGroup().addGroup(
                                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                                        this.boton_RegUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                        javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(this.jLabel1,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(17, 17, 17).addGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                    layout.createSequentialGroup().addGap(52, 52, 52)).addGroup(
                                                        layout.createSequentialGroup().addGap(41, 41, 41).addGroup(
                                                            layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                                                                    this.boton_Gestionar, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                                    javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(
                                                                        this.jLabel2)))).addPreferredGap(
                                                                            javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                            48, Short.MAX_VALUE).addGroup(
                                                                                layout.createParallelGroup(
                                                                                    javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                                                                                        this.boton_Eliminar,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        100,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(
                                                                                            this.jLabel3)).addGap(36, 36, 36)))));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
            layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel7).addGap(12, 12, 12).addGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.boton_Eliminar,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.boton_Gestionar,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(
                                this.boton_RegUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                javax.swing.GroupLayout.PREFERRED_SIZE))).addPreferredGap(
                                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(
                                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                                            this.jLabel2).addGroup(
                                                layout.createParallelGroup(
                                                    javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                                                        this.jLabel3).addComponent(this.jLabel1))).addGap(45, 45, 45).addGroup(
                                                            layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)).addPreferredGap(
                                                                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(
                                                                        layout.createParallelGroup(
                                                                            javax.swing.GroupLayout.Alignment.LEADING)).addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                36, Short.MAX_VALUE).addComponent(this.jLabel8)));
        this.pack();
    }

    /**
     * Metodo para dirigir a la Interfaz de registro de contactos.
     */
    private void boton_RegUsuariosActionPerformed(java.awt.event.ActionEvent evt) {
        RegistrarUsuarios registrar = new RegistrarUsuarios();
        registrar.setVisible(true);
    }
    
    /**
     * Metodo para dirigir a la Interfaz de gestión de contactos.
     */
    private void boton_GestionarActionPerformed(java.awt.event.ActionEvent evt) {
        GestionarUsuarios gestionar = new GestionarUsuarios();
        gestionar.setVisible(true);
    }
    
    /**
     * Metodo para dirigir a la Interfaz de eliminar contactos.
     */
    private void boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {
        EliminarUsuarios eliminar = new EliminarUsuarios();
        eliminar.setVisible(true);
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
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException
            | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new InterfazAdmin().setVisible(true);
        });
    }

    private javax.swing.JButton boton_Gestionar;
    private javax.swing.JButton boton_RegUsuarios;
    private javax.swing.JButton boton_Eliminar;
    private javax.swing.JLabel  jLabel1;
    private javax.swing.JLabel  jLabel2;
    private javax.swing.JLabel  jLabel3;
    public javax.swing.JLabel   jLabel7;
    private javax.swing.JLabel  jLabel8;

}
