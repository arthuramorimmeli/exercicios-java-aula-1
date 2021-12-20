package programs;

import java.util.ArrayList;
import java.util.List;

public class List1Exercicio5 {

    private Integer listSize;
    private Integer replyNumber;
    private Integer replyQuantity;
    private List<Integer> multipleList = new ArrayList<>();

    public void runProgram() {
        initValues();
        getUserInputValues();
        this.multipleList = generateList();
        List1Exercicio1.showNumsEven(this.multipleList);
    }

    private void getUserInputValues() {
        listSize = List1Exercicio2.sendMessageAndgetIntegerValue("Qual o tamanho da lista?");
        replyNumber = List1Exercicio2.sendMessageAndgetIntegerValue("Qual numero precisa repetir?");
        replyQuantity = List1Exercicio2.sendMessageAndgetIntegerValue("Quantas vezes ele precisa repetir?");
    }

    private void initValues() {
        listSize = 0;
        replyNumber = 0;
        replyQuantity = 0;
    }

    private List<Integer> generateList() {
        ArrayList<Integer> listGenerated = new ArrayList<>();
        for (int number = 0; listSize != listGenerated.size(); number++) {
            putNumberIfNecessary(listGenerated, number);
        }
        return listGenerated;
    }

    private void putNumberIfNecessary(ArrayList<Integer> listGenerated, int i) {
        int replyNumberCounter = getQuantityRepluNumber(i);
        if (replyNumberCounter == replyQuantity) {
            listGenerated.add(i);
        }
    }

    private int getQuantityRepluNumber(int i) {
        String number = String.valueOf(i);
        int replyNumberCounter = 0;
        for (String character : number.split("")) {
            if (Integer.valueOf(character).equals(replyNumber)) {
                replyNumberCounter++;
            }
        }
        return replyNumberCounter;
    }
}
