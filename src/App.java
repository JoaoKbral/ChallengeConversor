import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       String[] opcoes = {"Conversor de moeda","Conversor de temperatura"};
        JOptionPane.showInputDialog(null,"Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes);
        
    }
}
