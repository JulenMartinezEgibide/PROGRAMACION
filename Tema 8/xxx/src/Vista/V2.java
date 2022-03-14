package Vista;

import javax.swing.*;
import java.awt.event.*;

public class V2 extends JDialog {
    private JPanel contentPane;
    private JButton buttonAcep;
    private JButton buttonCancel;
    private JButton buttonAnt;
    private JButton buttonSig;
    private JButton salirButton;
    private JTextField tFNombre;
    private JTextField tFEdad;
    private JTextField tFProfesion;
    private JTextField tFTelef;

    public V2() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonAcep);

        buttonAcep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

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
        V2 dialog = new V2();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}

me