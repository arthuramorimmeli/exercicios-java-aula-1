package programs;

import java.util.Arrays;
import java.util.Collections;

public class List2Exercicio1 {

    Integer[] arrayInteger = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};


    public void runProgram() {
        System.out.println("Array Original: " + Arrays.toString(arrayInteger));
        Arrays.sort(arrayInteger);
        System.out.println("Ordenação decrescente: " + Arrays.toString(arrayInteger));
        Arrays.sort(arrayInteger, Collections.reverseOrder());
        System.out.println("Ordenação decrescente: " + Arrays.toString(arrayInteger));
    }

}
