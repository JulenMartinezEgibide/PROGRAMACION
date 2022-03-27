package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal{
    private JPanel pPrincipal;
    private JPanel pMenuBarra;
    private JPanel pImagen;
    private JMenu mAcontecimientos;
    private JMenuItem mInsertar;
    private JButton bInsertar;
    private JButton button1;

    public VentanaPrincipal() {
        bInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mostrarInsertar();
            }
        });

        mInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Main.mostrarInsertar();
                bInsertar.doClick();
            }
        });
    }

    public JPanel getpPrincipal() {
        return pPrincipal;
    }



}
