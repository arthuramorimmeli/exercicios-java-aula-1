package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa1 {

    public void rodarPrograma1() {
        int inputUsuario = 0;
        List<Integer> listaNumerosPares = new ArrayList<>();

        System.out.println(inputUsuario);
        System.out.println(listaNumerosPares);
        System.out.println("How many even number you need?");

        Scanner scanner = new Scanner(System.in);
        inputUsuario = scanner.nextInt();
        System.out.println(inputUsuario);

        for (int i = 1; inputUsuario != listaNumerosPares.size(); i++) {
            if ( (i%2) == 0) {
                listaNumerosPares.add(i);
            }
        }

        System.out.println("Lista de numeros pares: " + listaNumerosPares);

    }

}
