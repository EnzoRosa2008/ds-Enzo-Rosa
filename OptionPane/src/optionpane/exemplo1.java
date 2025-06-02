package optionpane;

import javax.swing.JOptionPane;

public class exemplo1 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Entre com seu nome: ");
        JOptionPane.showMessageDialog(null, "Prazer em te conhecer, " + name + "!");
    }
}
