package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.*;

public class V1 {
    private JPanel pPrincipal;
    private JPanel pTitulo;
    private JPanel pCajas;
    private JPanel pBotones;
    private JLabel lTitulo;
    private JTextField tfApellidos;
    private JTextField tfDni;
    private JLabel lNombre;
    private JLabel lApellidos;
    private JLabel lDni;
    private JTextField tfNombre;
    private JButton bAceptar;
    private JButton bSalir;

    private String nombre;

    public V1() {
        bAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               fAceptar();
            }
        });
        bSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.getDatos();

            }
        });
        tfDni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //fAceptar();
                bAceptar.doClick();
            }
        });
    }

    public void fAceptar()
    {
        // Validar y enviar al Controlador
        if (datosCorrectos())
        {
            Main.crearPersona(nombre,tfApellidos.getText(),tfDni.getText());
            inicializar();
        }
    }
    public void inicializar()
    {
        // Vaciar las cajas y colocar el cursor en la primera.
        tfNombre.setText("");
        tfApellidos.setText("");
        tfDni.setText("");
        tfNombre.requestFocus();
    }
    public boolean datosCorrectos(){
        // Validar datos de entrada antes de darselos al Main.
        try
        {
            nombre=tfNombre.getText();

            if (nombre.isEmpty())
                throw new Exception("El nombre es un dato obligatorio");
            if (tfApellidos.getText().isEmpty())
                throw new Exception("Los apellidos son un dato obligatorio");
            if (tfDni.getText().isEmpty())
                throw new Exception("El dni es un dato obligatorio");

            return true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("V1");
        frame.setContentPane(new V1().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getPanel() {
        return pPrincipal;
    }
}
