package optionpane;
import javax.swing.JOptionPane;


public class exemplo3 {
    public static void main(String [] args) {
        
        int escolha = JOptionPane.showConfirmDialog(null, "Você quer salvar as alterações?",
                "confirmação",
            JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (escolha == JOptionPane.YES_OPTION) {
            
            JOptionPane.showMessageDialog(null, "Mudanças feitas");
        } else if (escolha == JOptionPane.NO_OPTION) {
            
            JOptionPane.showMessageDialog(null, "Mudanças não feitas");
        } else {
            JOptionPane.showMessageDialog(null, "Cancelado");
        }
    }
}
