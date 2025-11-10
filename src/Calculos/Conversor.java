package Calculos;

public class Conversor {
    public static void conversorDeDolar(double dolar, double moneda, String codigoMoneda){
        double res = dolar*moneda;
        System.out.println("El valor de "+dolar+" USD en "+codigoMoneda+" es de "+res);
    }

    public static void conversorADolar(double moneda, double dolar, String codigoMoneda){
        double res = moneda/dolar;
        System.out.println("El valor de "+moneda+" "+codigoMoneda+" en USD es de"+res);
    }

    public static void menu(){
        System.out.println("""
                ****************************************
                Sea bienvenido/a al Conversor de Moneda
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                
                Elija una opción válida:
                ****************************************
                """);
    }
}
