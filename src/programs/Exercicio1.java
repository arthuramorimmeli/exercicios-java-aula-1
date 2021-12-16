package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    private Integer inputN;
    private List<Integer> numsEven;

    public Exercicio1() {
    }

    public void runProgram() {
        initValues();
        this.inputN = inputValue();
        generateEvenNumbers();
        showNumsEven(this.numsEven);
    }

        private void initValues() {
            this.numsEven = new ArrayList<>();
            this.inputN = 0;
        }

        private Integer inputValue() {
            System.out.println("Quantos numeros pares você precisa");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }

        private void generateEvenNumbers() {
            for (int i = 1; inputN <= this.numsEven.size();  i++) {
                if ((i%2) == 0) numsEven.add(i);
            }
        }

        public static void showNumsEven(List<Integer> list) {
            System.out.println(list);
        }
}
