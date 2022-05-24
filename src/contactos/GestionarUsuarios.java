package contactos;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ingeniero Alexander Gonzalez.
 */
@SuppressWarnings("serial")
public class GestionarUsuarios extends javax.swing.JFrame {
    DefaultTableModel model   = new DefaultTableModel();
    String[]          agregar = new String[5];
    String            idUsuario;
    String            usernameUsuario;

    public GestionarUsuarios() {
        this.initComponents();
        this.model.addColumn("Nombre");
        this.model.addColumn("Identificacion");
        this.model.addColumn("Direccion");
        this.model.addColumn("Telefono");
        this.tablaUsuarios.setModel(this.model);
        this.setTitle("Gestionar Contactos - Sesion de Administrador");
        this.setIconImage(new ImageIcon(this.getClass().getResource("/img/Admin.jpg")).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.mostrarDatos();
    }

    /**
     * Metodo que recupera la coleccion de datos y los va agregando a la tabla.
     */
    public void mostrarDatos() {
        for (Contactos newContacts : InterfazAdmin.datosContacto) {
            this.agregar[0] = newContacts.getNombre();
            this.agregar[1] = newContacts.getIdentificacion();
            this.agregar[2] = newContacts.getDireccion();
            this.agregar[3] = newContacts.getTelefono();
            this.model.addRow(this.agregar);
        }
    }

    /**
     * Metodo que inicializa los componentes del frame.
     */
    private void initComponents() {
        this.jLabel1 = new javax.swing.JLabel();
        this.jLabel2 = new javax.swing.JLabel();
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.tablaUsuarios = new javax.swing.JTable();
        this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        this.jLabel1.setText("CONTACTOS REGISTRADOS");
        this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        this.jLabel2.setText("Creado por Ing Alexander Gonzalez G.");
        this.tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {{null, null, null, null},
                {null, null, null, null}, {null, null, null, null}, {null, null, null, null}},
            new String[] {"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestionarUsuarios.this.tablaUsuariosMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.tablaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
            layout.createSequentialGroup().addGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                    layout.createSequentialGroup().addGap(158, 158, 158).addComponent(this.jLabel2)).addGroup(
                        layout.createSequentialGroup().addGap(136, 136, 136).addComponent(this.jLabel1)).addGroup(
                            layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jScrollPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 404,
                                javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(57, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
            layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jLabel1).addGap(59, 59, 59).addComponent(this.jScrollPane1,
                javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE).addComponent(this.jLabel2)));
        this.pack();
    }

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {
        int seleccion = this.tablaUsuarios.rowAtPoint(evt.getPoint());
        this.idUsuario = String.valueOf(this.tablaUsuarios.getValueAt(seleccion, 0));
        this.usernameUsuario = String.valueOf(this.tablaUsuarios.getValueAt(seleccion, 2));
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
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new GestionarUsuarios().setVisible(true));
    }

    private javax.swing.JLabel      jLabel1;
    private javax.swing.JLabel      jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable       tablaUsuarios;
}
