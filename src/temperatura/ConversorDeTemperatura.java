package temperatura;

public class ConversorDeTemperatura {
    
    public static Double CelciusKelvin(Double temperatura){
        return temperatura + 273;
    }
    public static Double KelvinCelcius(Double temperatura){
        return temperatura - 273;
    }
    public static Double CelciusFarenheit(Double temperatura){
        return (temperatura*9)/5+32;
    }
    public static Double FarenheitCelcius(Double temperatura){
        return ((temperatura - 32)*5)/9;
    }
    public static Double KelvinFarenheit(Double temperatura){
        return CelciusFarenheit(KelvinCelcius(temperatura));
    }
    public static Double FarenheitKelvin(Double temperatura){
        return KelvinCelcius(FarenheitCelcius(temperatura));
    }

}
