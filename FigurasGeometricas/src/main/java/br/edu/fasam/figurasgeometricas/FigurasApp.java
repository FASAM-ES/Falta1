
package br.edu.fasam.figurasgeometricas;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class FigurasApp {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        Scanner entrada = new Scanner(System.in);
        Circulo c = new Circulo();
         System.out.println("Informe a operação desejada"+
                "\n3-Classe Círculo");
        int menu = entrada.nextInt();

        switch (menu) {
            case 1:
                c.construtor();
                c.imprimir();
                break;
            default:
                System.out.println("Opção incorreta");
            break;
    }
}
}

