package Vista;
import com.company.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEntrada {
    private JButton aceptarButton;
    private JButton salirButton;
    private JTextField tFDni;
    private JTextField tFApellido;
    private JTextField tFNombre;

    public JTextField gettFDni() {
        return tFDni;
    }

    public JTextField gettFApellido() {
        return tFApellido;
    }

    public JTextField gettFNombre() {
        return tFNombre;
    }

    public VentanaEntrada() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                validarDatos(gettFApellido().getText(),gettFDni().getText(),gettFNombre().getText());
                Main.tenerDatos(tFDni.getText(),tFApellido.getText(),tFNombre.getText());

            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaSalida();
            }
        });

    }
    public static void validarDatos(String gettFApellido, String gettFDni, String gettFNombre){

    }

}
