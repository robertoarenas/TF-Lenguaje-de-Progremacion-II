package TF_Java;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //creamos arraylist
        ArrayList<Cliente> clientes = new ArrayList<>();

        // crear objetos clases de usuarios definidos
        Cliente cliente1 = new Cliente("Roberto Arenas","70141355","123456");
        Cliente cliente2 = new Cliente("Jorge Diaz","45321685","254684");
        Cliente cliente3 = new Cliente("Manuel Ortiz","25468656","563147");
        Cliente cliente4 = new Cliente("Matias Salazar","75264598","856453");
        Cliente cliente5 = new Cliente("Sebastian Perez","94568132","531452");

        //add elementos al arraylist
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);

        //Ingresamos los datos
        System.out.println("New Peru Bannk");
        System.out.println("DNI:");
        String dni = sc.nextLine();


        int intentos = 0;
        do{
            for (Cliente c : clientes) {
            if (dni.equals(c.dni)) {
                String pass=c.pass;
                String pass1=pass.replaceAll(".","*");

                System.out.println("PASSWORD: ");
                pass= sc.nextLine();
                System.out.println(pass1);



                if (pass.equals(c.pass)){
                    System.out.println("Bienvenido " + c.name);
                    intentos = 3;
                    Operacion objMenuOperacion;
                    objMenuOperacion = new Operacion();
                    objMenuOperacion.tipoOperacion();

                }else{
                    System.out.println("-------------------");
                    System.out.println("CONTRASEÑA INCORRECTA");
                    System.out.println("-------------------");
                    intentos += 1;
                    if (intentos == 3) {
                        System.out.println("Ha excedido el numero de intentos, pruebe mas tarde");
                    }
                }
            }
            }

        }while (intentos<3);

    }

}



