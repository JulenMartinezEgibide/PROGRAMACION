package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.company.*;

public class Ventana {
    private JPanel panelPrincipal;
    private JPanel panelCajas;
    private JPanel panelBotones;
    private JTextField tfDni;
    private JTextField tfNombre;
    private JTextField tfApellidos;
    private JButton bAceptar;
    private JButton bSalir;
    private JTextField tfCurso;
    private JLabel lDni;
    private JLabel lNombre;
    private JLabel lApellidos;
    private JLabel lCurso;
    private JPanel panelTitulo;
    private JLabel lApellidosError;

    private boolean alumnoEncontrado;
    private String operacion;

    public Ventana() {
        tfDni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fValidarBuscar();
            }
        });

        tfDni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent focusEvent) {
                super.focusLost(focusEvent);
                fValidarBuscar();
                // doclick es solo para los botones
            }
        });
        bAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fAceptar();
            }
        });
        tfApellidos.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                lApellidosError.setVisible(false);
            }
        });

        tfDni.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                tfDni.setBackground(Color.white);
            }
        });
    }

    public void fValidarBuscar()
    {
        if (fValidarDni()) {
            alumnoEncontrado = Main.buscarAlumno(tfDni.getText());
            if (alumnoEncontrado)
                fMostrarDatos();
            else
                operacion="alta";
            tfDni.setEditable(false); // ya no permitimos que lo cambie.
        }

    }
    public boolean fValidarDni()
    {
        try {
            if (tfDni.getText().isEmpty())
                throw new Exception("El dni es un dato obligatorio");

            // Formato
            //Pattern pattern=Pattern.compile("\\d{8}[TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke]");
            Pattern pattern = Pattern.compile("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
            Matcher matcher = pattern.matcher(tfDni.getText());
            if (matcher.matches()) {
                // Concordancia de la letra
                char letra = tfDni.getText().charAt(8);
                String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
                int numero = Integer.parseInt(tfDni.getText().substring(0, 8));
                numero = numero % 23;
                char letraCorrecta = letras.charAt(numero);
                if (letraCorrecta != letra)
                    throw new Exception("La letra del dni no es correcta");
            } else
                throw new Exception("El dni no tiene un formato adecuado");
            return true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            tfDni.requestFocus();
            tfDni.setBackground(Color.red);
            return false;

        }
    }

    public void fMostrarDatos()
    {
        tfNombre.setText(Main.getNombre());
        tfNombre.setEditable(false);
        tfApellidos.setText(Main.getApellidos());
        tfApellidos.setEditable(false);
        tfCurso.setText(Main.getCurso());
        tfCurso.setEditable(false);
        String opcion= JOptionPane.showInputDialog(null,"Si quieres dar de baja al alumno teclea 1 \n Si quieres cambiar de curso al alumno teclea 2");
        switch (opcion)
        {
            case "1":
                operacion = "baja";
                break;
            case "2":
                operacion = "cambio";
                tfCurso.setEditable(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no válida");
        }
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void fAceptar()
    {
        if (operacion.equals("alta"))
        {
            // El dni ya está validado
            if (fValidarNombre() && fValidarApellidos() && fValidarCurso()) {
                Main.altaAlumno(tfDni.getText(), tfNombre.getText(), tfApellidos.getText());
                limpiar();
            }

        }
        else
            if (operacion.equals("cambio")) {
                if (fValidarCurso()) {
                    Main.modificarAlumno();
                    limpiar();
                }
            }
            else
                if (operacion.equals("baja")) {
                    // cuadro de dialogo solicitando confirmación
                    Main.borrarAlumno();
                    limpiar();
                }

    }

    public boolean fValidarNombre(){
        try
        {
            if (tfNombre.getText().isEmpty())
                throw new Exception("El nombre es un dato obligatorio");

            Pattern patron = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)*$");
            Matcher m = patron.matcher(tfNombre.getText());
            if (!m.matches())
                throw new Exception("Nombre no valido");
            return true;
        }
        catch(Exception e)
        {
            tfNombre.setText(e.getMessage());
            tfNombre.selectAll();
            return false;
        }
    }

    public boolean fValidarApellidos(){
        try
        {
            if (tfApellidos.getText().isEmpty())
                throw new Exception("Los apellidos son un dato obligatorio");

            Pattern patron = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)+$");
            Matcher m = patron.matcher(tfApellidos.getText());
            if (!m.matches())
                throw new Exception("Apellidos no válidos");
            return true;
        }
        catch(Exception e)
        {
            lApellidosError.setText(e.getMessage());
            lApellidosError.setVisible(true);
            return false;
        }
    }

    public boolean fValidarCurso(){
        try {
            if (tfCurso.getText().isEmpty())
                throw new Exception("El curso es un dato obligatorio");

           /* Pattern patron = Pattern.compile("^[1-4][a-dA-D]$");
            Matcher m = patron.matcher(tfCurso.getText());
            if (!m.matches())
                throw new Exception("Curso no valido");^*/


            if (!Main.validarCurso(tfCurso.getText()))
                throw new Exception("El curso no existe");

            return true;

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return false;
        }
    }

    public void limpiar()
    {
        tfDni.setText("");
        tfDni.setEditable(true);
        tfNombre.setText("");
        tfNombre.setEditable(true);
        tfApellidos.setText("");
        tfApellidos.setEditable(true);
        tfCurso.setText("");
        tfCurso.setEditable(true);
        tfDni.requestFocus();
    }
}
