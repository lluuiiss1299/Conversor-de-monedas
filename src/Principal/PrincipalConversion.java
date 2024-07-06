package Principal;

import Conversor.MetodosConversor;

import java.util.Scanner;

public class PrincipalConversion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MetodosConversor driver = new MetodosConversor();
        int opcion;
        float monto = 0;
        String monedaBase = "";
        String monedaObjetivo = "";
        int flag = 1;
        while (true){
            System.out.println("Ingrese la opción que desea converir");
            System.out.println("""
                    1.-Dolar(USD) => Peso Mexicano(MXN) \n
                    2.-Peso Mexicano(MXN) => Dolar(USD) \n
                    3.-Dolar(USD) => Real Brasileño(BRL) \n
                    4.-Real Brasileño(BRL) => Dolar(USD) \n
                    5.-Dolar(USD) => Peso Colombiano(COP) \n
                    6.-Peso Colombiano(COP) => Dolar(USD) \n
                    7.-Dolar(USD) => Peso Argentino(ARS) \n
                    8.-Peso Argentino(ARS) => Dolar(USD) \n
                    9.-Dolar(USD) => Peso Chileno(CMF) \n
                    10.-Peso Chileno(CMF) => Dolar(USD) \n
                    """);
            opcion = teclado.nextInt();
            flag = 1;
            switch (opcion){
                case 1:
                    monedaBase = "USD";
                    monedaObjetivo = "MXN";
                    break;
                case 2:
                    monedaBase = "MXN";
                    monedaObjetivo = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    monedaObjetivo = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL";
                    monedaObjetivo = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaObjetivo = "COP";
                    break;
                case 6:
                    monedaBase = "COP";
                    monedaObjetivo = "USD";
                    break;
                case 7:
                    monedaBase = "USD";
                    monedaObjetivo = "ARS";
                    break;
                case 8:
                    monedaBase = "ARS";
                    monedaObjetivo = "USD";
                    break;
                case 9:
                    monedaBase = "USD";
                    monedaObjetivo = "CMF";
                    break;
                case 10:
                    monedaBase = "CMF";
                    monedaObjetivo = "USD";
                    break;
                default:
                    System.out.println("Opcion invalida");
                    flag = 0;
            }
            if(flag == 1){
                System.out.println("Ingresa el monto de la conversión");
                monto = teclado.nextInt();
                driver.agregarConversion(monedaBase,monedaObjetivo,monto);
            }
            System.out.println("Desea realizar otra conversion? 1=si 0=no");
            if(teclado.nextInt() == 0){
                System.out.println("Este es el historial de todas las conversiones hechas:");
                driver.mostrarListaConversiones();
                break;
            }
        }
    }
}
