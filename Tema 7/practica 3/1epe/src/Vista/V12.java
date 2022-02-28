package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class V12 extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField tFClave;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton entrarButton;
    private JButton buttonOK;
    private JButton buttonCancel;


    public V12() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        generarNumeros();

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        textField1.addFocusListener(new FocusAdapter() {
        });


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button1.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button2.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button3.getText());
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button4.getText());
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button4.getText());
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button5.getText());
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button6.getText());
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button7.getText());
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button8.getText());
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button9.getText());
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ponerDato(button10.getText());
            }
        });

        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main.mostrarMovimiento();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        V12 dialog = new V12();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public void generarNumeros() {
        ArrayList<Integer> numerosAleatorios = new ArrayList();
        int posicion = 0;
        do {
            int numeroAlea = (int) (Math.random() * 10);
            if (!numerosAleatorios.contains(numeroAlea)) {
                numerosAleatorios.add(numeroAlea);
                posicion++;
            }
        } while (posicion != 10);

        JButton[] aBotones = {button1, button2, button3, button4, button5, button6, button7, button8, button9, button10};
        for (int x = 0; x < numerosAleatorios.size(); x++) {
            aBotones[x].setText(numerosAleatorios.get(x).toString());
        }
    }

    public void ponerDato(String dato) {
        String clave;
        clave = tFClave.getText() + dato;
        tFClave.setText(clave);
    }

}
