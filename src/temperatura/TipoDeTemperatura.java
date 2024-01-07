package temperatura;

public class TipoDeTemperatura {

    public static String[] opcoesDeTemperaturas = {
            "Celcius para Kelvin",
            "Celcius para Fahrenheit",
            "Fahrenheit para Celcius",
            "Fahrenheit para Kelvin",
            "Kelvin para Celcius",
            "Kelvin para Fahrenheit"
    };

    public static Double conversor(Double temperatura, String tipoDeTemperatura){
        switch (tipoDeTemperatura) {
            
            case "Celcius para Kelvin":
                return ConversorDeTemperatura.CelciusKelvin(temperatura);
            case "Celcius para Fahrenheit":
                return ConversorDeTemperatura.CelciusFarenheit(temperatura);
            case "Fahrenheit para Celcius":
                return ConversorDeTemperatura.FarenheitCelcius(temperatura);
            case "Fahrenheit para Kelvin":
                return ConversorDeTemperatura.FarenheitKelvin(temperatura);
            case "Kelvin para Celcius":
                return ConversorDeTemperatura.KelvinCelcius(temperatura);
            case "Kelvin para Fahrenheit":
                return ConversorDeTemperatura.KelvinFarenheit(temperatura);
            default:
                return null;
        }
    }
}
