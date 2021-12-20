package programs;

import java.util.ArrayList;
import java.util.List;

public class List1Exercicio1 {

    private final List<Integer> numsEven = new ArrayList<>();

    public List1Exercicio1() {
    }

    public void runProgram() {
        this.numsEven.clear();
        Integer finalListSize = 0;
        finalListSize = List1Exercicio2.sendMessageAndgetIntegerValue("Informe quantos numeros pares você precisa: ");
        generateEvenNumbers(finalListSize);
        showNumsEven(this.numsEven);
    }

    private void generateEvenNumbers(Integer quantityNumbersUserNeed) {
        for (int i = 1; quantityNumbersUserNeed != this.numsEven.size(); i++) {
            if ((i % 2) == 0) this.numsEven.add(i);
        }
    }

    public static void showNumsEven(List<Integer> list) {
        System.out.println(list);
    }
}
