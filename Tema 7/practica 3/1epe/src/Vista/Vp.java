package Vista;


import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vp {
    private JButton accesoOnlineButton;
    private JButton button1;
    private JPanel VpPanel;

    public Vp() {
        accesoOnlineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Validar la clabe y nif
                //if(corectoNF == true) {
                    Main.mostrarAcceso();
                //}
            }
        });
    }

    public JPanel getpPrincipal() {
        return VpPanel;
    }


}
