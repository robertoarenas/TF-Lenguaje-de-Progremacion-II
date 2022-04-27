package TF_Java;

import java.util.Scanner;

public class Operacion {
    Scanner sc = new Scanner(System.in);
    int retiro,deposito,saldo,saldoNuevo;
    String respuesta;

    public void tipoOperacion() {

        int seleccion = 0;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Elija la operacion que desea realizar:");
        System.out.println("[1] Deposito");
        System.out.println("[2] Retiro");
        System.out.println("[3] Consulta de Saldo");
        System.out.println("[4] Salir");
        seleccion = sc.nextInt();

        while (seleccion >= 1 && seleccion <= 4) {
            if (seleccion == 1) {
                Deposito();
                break;
            } else if (seleccion == 2) {
                Retiro();
                break;
            } else if (seleccion == 3) {
                consultaSaldo();
                break;
            } else if (seleccion == 4) {
                Salir();
                break;
            } else {
                System.out.println("-----------------------------------------");
                System.out.println("Opcion no disponible, intentelo de nuevo");
                System.out.println("-----------------------------------------");
            }


        }
    }



    public void Deposito(){
        System.out.println("Monto de deposito: ");
        deposito=sc.nextInt();
        saldoNuevo = saldo+deposito;
        System.out.println("-------------------------------------------");
        System.out.println("Usted deposito: s/"+deposito);
        System.out.println("La operacion se ha realizado correctamente");
        System.out.println("-------------------------------------------");
        System.out.println("Desea realizar otra operacion?, responda Si o No");
        sc.nextLine();
        respuesta=sc.nextLine();
            if(respuesta.equals("Si")){
              tipoOperacion();
            }else if (respuesta.equals("No")){
                System.out.println("Gracias por visitar el cajero");
             }else{
             System.out.println("Respuesta no valida");
            }
    }

    public void Retiro(){
        System.out.println("Monto de retiro: ");
        retiro=sc.nextInt();
        if (retiro<=saldoNuevo){
            saldoNuevo =saldoNuevo- retiro;
            System.out.println("-------------------------------------------");
            System.out.println("Usted Retiro: s/"+retiro);
            System.out.println("La operacion se ha realizado correctamente");
            System.out.println("--------------------------------------------");
            System.out.println("Desea realizar otra operacion?, responda Si o No");
            sc.nextLine();
            respuesta=sc.nextLine();
            if(respuesta.equals("Si")){
                tipoOperacion();
            }else if (respuesta.equals("No")){
                System.out.println("Gracias por visitar el cajero");
            }else{
                System.out.println("Respuesta no valida");
            }
        }
        else {
            System.out.println("-------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("-------------------");
            System.out.println("Intente otro monto");
            System.out.println("-------------------");
            Retiro();

        }
    }

    public void consultaSaldo(){
        System.out.println("Su saldo es s/" + saldoNuevo);
        System.out.println("Desea realizar otra operacion?, responda Si o No");
        sc.nextLine();
        respuesta=sc.nextLine();
        if(respuesta.equals("Si")){
            tipoOperacion();
        }else if (respuesta.equals("No")){
            System.out.println("Gracias por visitar el cajero");
        }else{
            System.out.println("Respuesta no valida");
        }
    }

    public void Salir(){
        System.out.println("------------------------");
        System.out.println("!Gracias¡,vuelva pronto");
        System.out.println("------------------------");
    }
}
