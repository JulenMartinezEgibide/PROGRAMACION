package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V2 {
    private JTextArea taDatos;
    private JButton bSalir;
    private JPanel panel;
    private JLabel lTitulo;

    public JPanel getPanel() {
        return panel;
    }
/*
    public static void main(String[] args) {
        JFrame frame = new JFrame("V2");
        frame.setContentPane(new V2().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }*/

    public V2(String datos) {
        taDatos.setText(datos);

        bSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // En la clase Main?
            }
        });
    }
}
