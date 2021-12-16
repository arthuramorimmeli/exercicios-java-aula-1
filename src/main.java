import programs.Exercicio1;
import programs.Exercicio2;

import java.util.Scanner;

public class main {

    private static Exercicio1 exercicio1;
    private static Exercicio2 exercicio2;

    public static void main(String[] args) {
        exercicio1 = new Exercicio1();
        exercicio2 = new Exercicio2();
        Scanner sc = new Scanner(System.in);
        Integer optionProgramRun = inputOptonProgramRun(sc);
        selectProgramToRun(optionProgramRun);
    }

    private static Integer inputOptonProgramRun(Scanner sc) {
        System.out.println("Select program to run: \n" +
                "1. Run Program 1\n" +
                "2. Run Program 2\n");
        Integer optionProgramRun = sc.nextInt();
        return optionProgramRun;
    }

    private static void selectProgramToRun(Integer optionProgramRun) {
        switch (optionProgramRun) {
            case 1: {
                exercicio1.runProgram();
                break;
            }
            case 2: {
                exercicio2.runProgram();
                break;
            }
            default: {
                System.out.println("invalid program.\n Sistem finished.");
            }
        }
    }
}
