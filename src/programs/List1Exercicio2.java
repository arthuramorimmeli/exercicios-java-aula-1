package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1Exercicio2 {

    private Integer finalListSize;
    private Integer multipleOf;
    private List<Integer> multipleList = new ArrayList<>();

    public void runProgram() {
        this.initValues();
        this.getUserInputValues();
        this.multipleList = generateMultipleList(this.multipleOf, finalListSize);
        List1Exercicio1.showNumsEven(this.multipleList);
    }

    private void initValues() {
        this.finalListSize = 0;
        this.multipleOf = 0;
        this.multipleList.clear();
    }

    private void getUserInputValues() {
        this.finalListSize = sendMessageAndgetIntegerValue("Quantos numeros você precisa?");
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
