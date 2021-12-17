package programs;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {

    private Integer maxNumberPrime;
    private final List<Integer> multipleList = new ArrayList<>();

    public void runProgram() {
        initValues();
        getUserInputValues();
        generatePrimeNumberList();
        Exercicio1.showNumsEven(multipleList);
    }

    private void initValues() {
        this.maxNumberPrime = 0;
        this.multipleList.clear();
    }

    private void getUserInputValues() {
       this.maxNumberPrime = Exercicio2.sendMessageAndgetIntegerValue("Qual é o valor maximo?");
    }

    private void generatePrimeNumberList() {
        for (int i = 0; maxNumberPrime != multipleList.size(); i++) {
            if (Exercicio3.checkIfPrimeNumber(i)) {
                multipleList.add(i);
            }
        }
    }
}
