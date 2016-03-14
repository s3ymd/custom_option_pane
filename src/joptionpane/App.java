package joptionpane;

import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {

    JOptionPane pane = new JOptionPane("custom dialog", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
        new Object[] {}, null);
    JButton okButton = new JButton("click / type esc key");

    pane.add(okButton);
    okButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println("clicked");
        System.exit(0);
      }
    });
    okButton.addKeyListener(new KeyAdapter() {
      @Override
      public void keyTyped(java.awt.event.KeyEvent e) {
        System.out.println("key typed");
        System.exit(0);
      };
    });
    JDialog dialog = new JDialog();
    dialog.setContentPane(pane);
    dialog.pack();
    dialog.setLocationByPlatform(true);
    dialog.setVisible(true);
  }
}
