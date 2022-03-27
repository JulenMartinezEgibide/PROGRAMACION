package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class V2 extends JDialog {
    private JPanel panelV2;
    private JButton buttonAcep;
    private JButton buttonCancel;
    private JButton buttonAnt;
    private JButton buttonSig;
    private JButton salirButton;
    private JTextField tFNombre;
    private JTextField tFEdad;
    private JTextField tFProfesion;
    private JTextField tFTelef;
    private JPanel pBAcep;

    private int option;
    public V2(int op) {
        option=op;
        if (option != 3) {
            mostrarBotones2(true);
        }
        else
        {

            mostrarBotones2(false);

        }


        buttonAcep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (option == 1) {
                        // alta de persona
                        if (validarDatos())
                            Main.getDatos(tFNombre.getText(), tFEdad.getText(), tFProfesion.getText(), tFTelef.getText());
                    }
                    else
                        Main.volverMenu();

                }
                catch(Exception ex)
                {
                    if (option == 1)
                        JOptionPane.showMessageDialog(null, "Problemas al introducir datos \n" + ex.getMessage());
                    else
                        JOptionPane.showMessageDialog(null, "Problemas al mirar los datos \n" + ex.getMessage());
                }
            }
        });
        tFNombre.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (option == 2)
                {
                    try {
                        validarNombre();
                        Main.getNombre(tFNombre.getText());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });
        buttonAnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Main.getAnterior();
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buttonSig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Main.getSiguiente();
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.volverMenu();
            }
        });
    }
    public boolean validarDatos()
    {
        try
        {
            validarNombre(); // saco esta validación para reutilizarla en el caso de consulta

            if (tFEdad.getText().isEmpty())
                throw new Exception(" La edad es obligatorio");
            if (tFProfesion.getText().isEmpty())
                throw new Exception(" La profesión es obligatorio");
            if (tFTelef.getText().isEmpty())
                throw new Exception(" El teléfono es obligatorio");

            Pattern patron = Pattern.compile("^[0-9]{1,3}$");
            Matcher mat = patron.matcher(tFEdad.getText());
            if (!mat.matches())
                throw new Exception(" La edad no esta bien puesto");

            patron = Pattern.compile("^[A-Z][a-z ]*$");
            mat = patron.matcher(tFProfesion.getText());
            if (!mat.matches())
                throw new Exception(" La profesión no esta bien puesto");

            patron = Pattern.compile("^[6789][0-9]{8}$");
            mat = patron.matcher(tFTelef.getText());
            if (!mat.matches())
                throw new Exception(" El teléfono no esta bien puesto");

            return true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas en la validacion \n"+ e.getMessage());
            return false;
        }
    }

    public void validarNombre() throws Exception{
        if (tFNombre.getText().isEmpty())
            throw new Exception(" El nombre es un dato obligatorio");
        Pattern patron = Pattern.compile("^[A-Z][a-z ]{2,}([A-Z][a-z ]{2,})*$");
        Matcher mat = patron.matcher(tFNombre.getText());
        if (!mat.matches())
            throw new Exception(" El nombre no tiene un formato adecuado");
    }
    public JPanel getPanelV2(){
        return panelV2;
    }

    public void setDatosPersona(Integer e,String p,String t)
    {
        tFEdad.setText(e.toString());
        tFProfesion.setText(p);
        tFTelef.setText(t);
        // Deshabilitar para que no modifique??
        buttonAcep.requestFocus();

    }

    public void setDatosPersona(String n,Integer e,String p,String t)
    {
        tFNombre.setText(n);
        tFEdad.setText(e.toString());
        tFProfesion.setText(p);
        tFTelef.setText(t);
        // Deshabilitar para que no modifique??
        buttonSig.requestFocus();
    }

    public void mostrarBotones2(boolean b)
    {
        pBAcep.setVisible(b);
    }
}

