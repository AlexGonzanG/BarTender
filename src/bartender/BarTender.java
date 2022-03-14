package bartender;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import database.Conexion;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

/**
 * Clase que implementa solución para que el Bartender determine si el número de vasos es divisible uniformemente.
 *
 * @author Alexander Gonzalez.
 */
@SuppressWarnings("serial")
public class BarTender extends JFrame {
    /** Contenedor de panel. */
    private JPanel             contentPane;
    /** Número de iteraciones que indico el cliente. */
    private JTextField         iteraciones;
    /** Número de pila que el cliente quiere validar. */
    private JTextField         numPila;
    /** Valor del Array P de números primos. */
    private ArrayList<Integer> numPrimos  = new ArrayList<>();
    /** Array que almacena la pila que se obtiene desde la base de datos. */
    private ArrayList<Integer> arrayA     = new ArrayList<>();
    /** Array que almacena los vasos divisibles uniformemente. */
    private ArrayList<Integer> arrayB     = new ArrayList<>();
    /** Array que almacena los vasos no divisibles uniformemente. */
    private ArrayList<Integer> arrayAi    = new ArrayList<>();
    /** Array que almacena la respuesta */
    private ArrayList<Integer> respuesta  = new ArrayList<>();
    /** Número de iteraciones indicadas por el cliente */
    int                        numeroIteraciones;
    /** Número de Pila indicadas por el cliente */
    int                        numeroPila;
    /** Contador de arrego B */
    int                        contadorB  = 0;
    /** Contador de arreglo Ai */
    int                        contadorAi = 0;

    /**
     * Launch the application.
     * 
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    BarTender frame = new BarTender();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public BarTender() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel labelNumIteraciones = new JLabel("N\u00FAmero Iteraciones: ");
        labelNumIteraciones.setBounds(66, 45, 132, 14);
        contentPane.add(labelNumIteraciones);

        JLabel labelNumPila = new JLabel("N\u00FAmero Pila:");
        labelNumPila.setBounds(66, 103, 132, 14);
        contentPane.add(labelNumPila);

        iteraciones = new JTextField();
        iteraciones.setBounds(208, 42, 86, 20);
        contentPane.add(iteraciones);
        iteraciones.setColumns(10);

        numPila = new JTextField();
        numPila.setBounds(208, 100, 86, 20);
        contentPane.add(numPila);
        numPila.setColumns(10); 

        JButton btnNewButton = new JButton(Constants.EJECUTAR);
        btnNewButton.addActionListener(new ActionListener() {

            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                numPrimos.add(0, 2);
                numPrimos.add(1, 3);
                numPrimos.add(2, 5);
                numPrimos.add(3, 7);
                numPrimos.add(4, 11);
                numPrimos.add(5, 13);
                numPrimos.add(5, 17);

                if (!(iteraciones.getText().trim().equals(Constants.VACIO) || numPila.getText().trim().equals(Constants.VACIO))) {

                    if (!(validar(iteraciones.getText().trim()) || validar(numPila.getText().trim()))) {

                        numeroIteraciones = Integer.parseInt(iteraciones.getText().trim());
                        numeroPila = Integer.parseInt(numPila.getText().trim());

                        getPilaArray(numPila.getText().trim());

                        for (int i = 0; i <= numeroIteraciones - 1; i++) {
                            for (int j = 0; j < arrayA.size(); j++) {
                                if (validateValue(arrayA.get(j), numPrimos.get(i))) {

                                    arrayB.add(contadorB, arrayA.get(j));
                                    respuesta.add(contadorB, arrayB.get(contadorB));
                                    contadorB++;
                                }
                                else {
                                    arrayAi.add(contadorAi, arrayA.get(j));
                                    contadorAi++;
                                }
                            }

                            orderResponseArray(arrayB, arrayAi, i);
                            
                          
                            if (i > (numeroIteraciones - 1)) {
                                
                                for (int w = 0; w < arrayAi.size(); w++) {
                                    Collections.reverse(respuesta);
                                    System.out.print(Constants.RESPUESTA + w);
                                    ordenarArray(respuesta);
                                    System.out.println(Constants.VACIO);
                                    respuesta.add(arrayAi.get(w));
                                }
                                
                            }
                            else {
                                Collections.reverse(respuesta);
                                System.out.print(Constants.RESPUESTA);
                                ordenarArray(respuesta);
                                System.out.println(Constants.VACIO);
                            }
                            
                            
                            arrayA.clear();
                            arrayA = (ArrayList<Integer>) arrayAi.clone();
                            arrayAi.clear();
                            arrayB.clear();
                            contadorAi = 0;
                            contadorB = 0;
                            Collections.reverse(respuesta);
                        }
                        Collections.reverse(respuesta);
                        System.out.println(Constants.OUTPUT + "\n" + Constants.RESPUESTA + respuesta);
                        JOptionPane.showMessageDialog(null, Constants.OUTPUT + "\n" + Constants.RESPUESTA + respuesta);
                        respuesta.clear();
                        arrayA.clear();
                        arrayAi.clear();
                        arrayB.clear();
                        contadorAi = 0;
                        contadorB = 0;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, Constants.NO_NUMERIC);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, Constants.NO_VACIO);
                }
            }
        });
        btnNewButton.setBounds(154, 167, 89, 23);
        contentPane.add(btnNewButton);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 101, 22);
        contentPane.add(menuBar);

        JMenu mnNewMenu = new JMenu("Opciones");
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
        mnNewMenu.add(mntmNewMenuItem);
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
     * Metodo que obtiene la Pila de la base de datos.
     * 
     * @param numPila Dato enviado por el cliente para la pila que se requiere validar.
     * @return arrayA con la pila de datos.
     */

    public ArrayList<Integer> getPilaArray(String numPila) {

        try {
            Conexion conex = new Conexion();
            conex.conexionBd();
            PreparedStatement pst = conex.conexionBd().prepareStatement(Constants.QUERY_ARRAYS + numPila);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String bases = rs.getString(1);
                String[] receptor = bases.split(Constants.COMA);

                for (int i = 0; i < receptor.length; i++) {
                    this.arrayA.add(i, Integer.parseInt(receptor[i]));
                }
            }
            conex.conexionBd().close();
            rs.close();
            pst.getConnection().close();

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return arrayA;
    }

    /**
     * Metodo que realiza la valida si el número de vaso es divisible uniformemente por el número primo.
     * 
     * @param arrayA
     * @param numeroPrimo
     * @return True si el valor es divisible, false si no es divisible.
     */
    public boolean validateValue(int arrayA, int numeroPrimo) {

        if ((arrayA % numeroPrimo) == 0) {
            return true;
        }
        return false;
    }

    /**
     * Metodo que realiza el ordenamiento de la respuesta para los arreglos B y Ai.
     * 
     * @param arrayB2 Arreglo B a ordenar para la respuesta.
     * @param arrayAi Arreglo Ai a ordenar para la respuesta.
     * @param i numero de la Iteración
     */
    public void orderResponseArray(ArrayList<Integer> arrayB2, ArrayList<Integer> arrayAi, int i) {

        System.out.println(Constants.ITERACION + (i + 1));
        Collections.reverse(arrayB2);
        System.out.print(Constants.DIVISIBLES);
        ordenarArray(arrayB2);
        System.out.println(Constants.VACIO);
        Collections.reverse(arrayAi);
        System.out.print(Constants.NO_DIVISIBLES + (i + 1) + Constants.IGUAL);
        ordenarArray(arrayAi);
        System.out.println(Constants.VACIO);
    }

    /**
     * Metodo que realiza ordenamiento del arreglo.
     * 
     * @param array
     */
    public void ordenarArray(ArrayList<Integer> array) {

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != 0)
                System.out.print(array.get(i) + (i < array.size() - 1 ? Constants.COMA : Constants.VACIO));
        }
    }

    /**
     * Constantes de la clase.
     */

    public interface Constants {

        /** Sentencia de solicitud a la base de datos. */
        String QUERY_ARRAYS  = "select input_array from arrays where id =";
        /** Identificador de Iteración. */
        String ITERACION     = "Q";
        /** Identificador para los numeros divisibles en la respuesta. */
        String DIVISIBLES    = "B=";
        /** Identificador para los numeros NO divisibles en la respuesta. */
        String NO_DIVISIBLES = "A";
        /** Identificador del signo Igual. */
        String IGUAL         = "=";
        /** Identificador del Caracter coma. */
        String COMA          = ",";
        /** Identificador del Caracter coma. */
        String VACIO         = "";
        /** Identificador del Caracter coma. */
        String EJECUTAR      = "Ejecutar";
        /** Identificador para la respuesta. */
        String RESPUESTA     = "Respuesta=";
        /** Identificador para la salida.. */
        String OUTPUT        = "OUTPUT ";
        /** Identificador para no númerico. */
        String NO_NUMERIC    = " No es un numero";
        /** Identificador para indicar campos vacios. */
        String NO_VACIO      = "No puedes dejar campos vacios";

    }

}
