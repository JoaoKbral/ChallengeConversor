package moeda;

public class TipoDeMoeda {
    /*
     * o inverso tem que funcionar
     * Converter De Dólar a Reais
     * Converter De Euro a Reais
     * Converter De Libras Esterlinas a Reais
     * Converter De Peso argentino a Reais
     * Converter De Peso Chileno a Reais
     */
    public static String[] opcoesDeMoedas = {
            "Dólar para Reais",
            "Euro para Reais",
            "Libras Esterlinas para Reais",
            "Peso argentino para Reais",
            "Peso Chileno para Reais",
            "Reais para Dólar",
            "Reais para Euro",
            "Reais para Libras Esterlinas",
            "Reais para Peso argentino",
            "Reais para Peso Chileno"
    };

    public static Double getTipoDeMoedaParaConversao(String tipoMoeda) {

        switch (tipoMoeda) {
            case "De Reais a Dólar":
                return RepositorioMoeda.getRealDolar();
            case "De Reais a Euro":
                return RepositorioMoeda.getRealEuro();
            case "De Reais a Libras Esterlinas":
                return RepositorioMoeda.getRealLibraEsterlina();
            case "De Reais a Peso argentino":
                return RepositorioMoeda.getRealPesoArgentino();
            case "De Reais a Peso Chileno":
                return RepositorioMoeda.getRealPesoChileno();
            case "De Dólar a Reais":
                return 1 / RepositorioMoeda.getRealDolar();
            case "De Euro a Reais":
                return 1 / RepositorioMoeda.getRealEuro();
            case "De Libras Esterlinas a Reais":
                return 1 / RepositorioMoeda.getRealLibraEsterlina();
            case "De Peso argentino a Reais":
                return 1 / RepositorioMoeda.getRealPesoArgentino();
            case "De Peso Chileno a Reais":
                return 1 / RepositorioMoeda.getRealPesoChileno();
            default:
                return null;
        }

    }
}
