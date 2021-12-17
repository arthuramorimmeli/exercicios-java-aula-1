package programs;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

    private Integer quantityNumbersUserNeed;
    private List<Integer> numsEven;

    public Exercicio1() {
    }

    public void runProgram() {
        initValues();
        this.quantityNumbersUserNeed = Exercicio2.sendMessageAndgetIntegerValue("Informe quantos numeros pares você precisa: ");
        generateEvenNumbers();
        showNumsEven(this.numsEven);
    }

    private void initValues() {
        this.numsEven = new ArrayList<>();
        this.quantityNumbersUserNeed = 0;
    }

    private void generateEvenNumbers() {
        for (int i = 1; quantityNumbersUserNeed != this.numsEven.size(); i++) {
            if ((i % 2) == 0) numsEven.add(i);
        }
    }

    public static void showNumsEven(List<Integer> list) {
        System.out.println(list);
    }
}
