package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    private Integer inputN;
    private List<Integer> numsEven;

    public Exercicio1() {
    }

        public void startProgram() {
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
            System.out.println("How many even number you need?");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }

        private void generateEvenNumbers() {
            for (int i = 1; i <= this.inputN;  i++) {
                if ((i%2) == 0) numsEven.add(i);
            }
        }

        public void showNumsEven(List<Integer> list) {
            System.out.println(list);
        }
}
