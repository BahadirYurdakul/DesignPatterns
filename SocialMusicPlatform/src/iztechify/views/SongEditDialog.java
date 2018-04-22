package iztechify.views;

import javax.swing.*;
import java.awt.event.*;

public class SongEditDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public SongEditDialog(ActionListener okListener) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(okListener);
        buttonCancel.addActionListener(e -> dispose());

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(e -> dispose(),
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public static void main(String[] args) {
        SongEditDialog dialog = new SongEditDialog(null);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
