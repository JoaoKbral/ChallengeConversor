package moeda;

public class ConversorDeMoeda {

    public static double conversor(double quantidade, String tipo) {
        return quantidade * TipoDeMoeda.getTipoDeMoedaParaConversao(tipo);
    }
}
