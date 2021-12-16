import programs.Exercicio1;
import programs.Programa1;

import java.util.Scanner;

public class main {

    private static Exercicio1 exercicio1;

    public static void main(String[] args) {



        Programa1 programa1 = new Programa1();

        programa1.rodarPrograma1();















//
//        exercicio1 = new Exercicio1();
//        Scanner sc = new Scanner(System.in);
//        Integer optionProgramRun = inputOptonProgramRun(sc);
//        selectProgramToRun(optionProgramRun);
    }

    private static Integer inputOptonProgramRun(Scanner sc) {
        System.out.println("Select program to run: \n 1. Run Program 1");
        Integer optionProgramRun = sc.nextInt();
        return optionProgramRun;
    }

    private static void selectProgramToRun(Integer optionProgramRun) {
        switch (optionProgramRun) {
            case 1: {
                runProgram1();
                break;
            }
            default: {
                System.out.println("invalid program.\n Sistem finished.");
            }
        }
    }

    private static void runProgram1() {
        exercicio1.startProgram();
    }
}
