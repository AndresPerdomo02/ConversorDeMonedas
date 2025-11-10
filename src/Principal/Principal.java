package Principal;

import Calculos.Conversor;
import Calculos.OperacionConversor;
import Modelos.ConsultaMonedas;
import Modelos.Moneda;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main() throws IOException, InterruptedException {

        Scanner lectura =new Scanner(System.in);
        ConsultaMonedas consulta = new ConsultaMonedas();
        Moneda moneda = consulta.buscaMoneda();

        while (true) {
            Conversor.menu();
            int code = lectura.nextInt();

            switch (code) {
                case 1 -> OperacionConversor.convertir(lectura, moneda, "ARS", true);
                case 2 -> OperacionConversor.convertir(lectura, moneda, "ARS", false);
                case 3 -> OperacionConversor.convertir(lectura, moneda, "BRL", true);
                case 4 -> OperacionConversor.convertir(lectura, moneda, "BRL", false);
                case 5 -> OperacionConversor.convertir(lectura, moneda, "COP", true);
                case 6 -> OperacionConversor.convertir(lectura, moneda, "COP", false);
                case 7 -> {
                    System.out.println("Gracias por usar el conversor");
                    return;
                }
                default -> System.out.println("Opción no válida, intenta nuevamente.");
            }
        }


    }
}

