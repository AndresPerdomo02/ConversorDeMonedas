package Calculos;

import Modelos.Moneda;

import java.util.Scanner;

public class OperacionConversor {
    public static void convertir(Scanner lectura, Moneda moneda, String codigoMoneda, boolean deDolar){
        System.out.println("Ingresa el valor que deseas convertir: ");
        double valor = lectura.nextDouble();
        Double tasa = moneda.conversion_rates().get(codigoMoneda);

        if(tasa == null){
            System.out.println("No se encontró la tasa para la moneda: "+codigoMoneda);
        }

        if (deDolar){
            Conversor.conversorDeDolar(valor,tasa, codigoMoneda);
        } else {
            Conversor.conversorADolar(valor,tasa, codigoMoneda);
        }
    }
}
