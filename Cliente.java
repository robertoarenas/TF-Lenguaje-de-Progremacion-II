package TF_Java;

import java.util.Scanner;


public class Cliente {
    Scanner sc = new Scanner(System.in);

    //Variables
    String name;
    String dni;
    String pass;




    //Constructor
    public Cliente(String name,String dni, String pass) {
        this.name = name;
        this.dni = dni;
        this.pass = pass;

    }


}
