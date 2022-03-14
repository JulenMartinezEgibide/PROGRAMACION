package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vp {
    private JPanel panelVp;
    private JTextField tFOpcion;

    public Vp() {
        tFOpcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try
                {
                    validarOpcion();
                    // Enviar al main la opción elegida para que sepa que hacer. Si algo está mal hemos ido a un catch
                    Main.getOpcion(Integer.parseInt(tFOpcion.getText()));
                    tFOpcion.setText("");
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(null, "La opción es un numero");
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
    public void validarOpcion() throws Exception
    {
        int o = Integer.parseInt(tFOpcion.getText());
        if (o < 1 || o > 4)
            throw new Exception ("Opción invalida");
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrinci");
        frame.setContentPane(new Vp().panelVp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getpVp() {
        return panelVp;
    }
}

