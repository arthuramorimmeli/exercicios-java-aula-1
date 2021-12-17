package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    private Integer quantityNumbers;
    private Integer multipleOf;
    private List<Integer> multipleList;

    public void runProgram() {
        this.initValues();
        this.getUserInputValues();
        this.multipleList = this.generateMultipleList(this.multipleOf, quantityNumbers);
        Exercicio1.showNumsEven(this.multipleList);
    }

    private void initValues() {
        this.quantityNumbers = 0;
        this.multipleOf = 0;
        this.multipleList = new ArrayList<>();
    }

    private void getUserInputValues() {
        this.quantityNumbers = sendMessageAndgetIntegerValue("Quantos numeros você precisa?");
        this.multipleOf = sendMessageAndgetIntegerValue("Eles devem ser multiplos de: ");
    }

    private List<Integer> generateMultipleList(Integer multiple, Integer sizeList) {
        ArrayList<Integer> multipleList = new ArrayList<>();
        for (int i = 0;  sizeList != multipleList.size();  i++) {
            if ((i%multiple) == 0) multipleList.add(i);
        }
        return multipleList;
    }

    public static Integer sendMessageAndgetIntegerValue(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
