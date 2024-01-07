import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import exceptions.ClosingException;
import moeda.ConversorDeMoeda;
import moeda.TipoDeMoeda;
import temperatura.TipoDeTemperatura;

public class App {
        public static void main(String[] args) throws Exception {
                String[] opcoes = { "Conversor de moeda", "Conversor de temperatura" };
                
                DecimalFormat formato = new DecimalFormat("#.##");
                
                Boolean flag = false;

                while (!flag) {

                        Double valor = 0d; // recebe para quantidade da moeda selecionada ou então o valor da
                                           // temperatura

                        try {
                                Object tipoConversao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                                                JOptionPane.PLAIN_MESSAGE,
                                                null, opcoes, opcoes);
                                if (tipoConversao == null) {
                                        throw new ClosingException();
                                }

                                if (tipoConversao.toString() == opcoes[0]) {
                                        Object tipoMoeda = JOptionPane
                                                        .showInputDialog(null, "Escolha uma opção", "Menu conversão",
                                                                        JOptionPane.PLAIN_MESSAGE, null,
                                                                        TipoDeMoeda.opcoesDeMoedas, null);
                                        JOptionPane.showMessageDialog(null,
                                                        "Como a arredondamento para 2 casas decimais\n o resultado poderá variar",
                                                        "Observação", 1);
                                        valor = Double.parseDouble(
                                                        JOptionPane.showInputDialog(null, "Insira um valor"));

                                        JOptionPane.showMessageDialog(null, "O valor da conversão de "
                                                        + tipoMoeda.toString().toLowerCase() + " é de $ "
                                                        + String.valueOf(formato.format(
                                                                        ConversorDeMoeda.conversor(valor,
                                                                                        tipoMoeda.toString()))));

                                }
                                // Conversão de temperatura
                                if (tipoConversao.toString() == opcoes[1]) {
                                       Object tipoTemperatura = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu conversão",
                                                        JOptionPane.PLAIN_MESSAGE,
                                                        null,
                                                        TipoDeTemperatura.opcoesDeTemperaturas, null);
                                        
                                        JOptionPane.showMessageDialog(null,
                                                        "Como a arredondamento para 2 casas decimais\n o resultado poderá variar",
                                                        "Observação", 1);
                                        valor = Double.parseDouble(
                                                        JOptionPane.showInputDialog(null, "Insira um valor"));

                                        JOptionPane.showMessageDialog(null, "O valor da conversão de "
                                                        + tipoTemperatura.toString().toLowerCase() + " é de "
                                                        + String.valueOf(formato.format(
                                                                        TipoDeTemperatura.conversor(valor,
                                                                                        tipoTemperatura.toString()))));
                                }
                                
                        } catch (ClosingException e) {

                                JOptionPane.showMessageDialog(null, "Fim do programa");
                                flag = true;
                        } catch (NullPointerException e) {

                        }
                }
        }
}
