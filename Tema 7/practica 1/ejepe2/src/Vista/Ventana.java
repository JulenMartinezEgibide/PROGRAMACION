package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana {
    private JPanel panel1;
    private JTextField tFDni;
    private JTextField tFNombre;
    private JTextField tFApellidos;
    private JTextField tFCurso;
    private JButton aceptarButton;

    public JTextField gettFDni() {
        return tFDni;
    }

    public JTextField gettFNombre() {
        return tFNombre;
    }

    public JTextField gettFApellidos() {
        return tFApellidos;
    }

    public JTextField gettFCurso() {
        return tFCurso;
    }

public Ventana(){


        aceptarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        validarDatos(gettFDni().getText(),gettFNombre().getText(),gettFApellidos().getText(),gettFCurso().getText());
        Main.tenerDatos(tFDni.getText(),tFApellidos.getText(),tFNombre.getText(),tFCurso.getText());

    }
});

    }
    public static void validarDatos(String gettFDni, String gettFNombre,String gettFApellidos, String gettFCurso){

    }
}
