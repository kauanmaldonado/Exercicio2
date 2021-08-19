package teste1;

import java.util.Scanner;
public class presentesgft {

    Scanner input = new Scanner(System.in); {

        System.out.println("Digite o seu idioma: ");
        String tempo = input.next();

        switch (tempo) {

            case "1 ANO":
                System.out.println("Vale Presente");
                break;
            case "2 ANOS":
                System.out.println("Smart Watch");
                break;
            case "5 ANOS":
                System.out.println("Fone Bluetooth ");
                break;
            case "10 ANOS":
                System.out.println("Vale Jantar");
                break;
            case "15 ANOS":
                System.out.println("Vale Jantar Top");
                break;

            default:
                System.out.println("Esse ano não vai ter presente");

        }
    }
}
