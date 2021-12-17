import programs.*;

import java.util.Scanner;

public class Main {

    private static Exercicio1 exercicio1;
    private static Exercicio2 exercicio2;
    private static Exercicio3 exercicio3;
    private static Exercicio4 exercicio4;
    private static Exercicio5 exercicio5;

    public static void main(String[] args) {
        exercicio1 = new Exercicio1();
        exercicio2 = new Exercicio2();
        exercicio3 = new Exercicio3();
        exercicio4 = new Exercicio4();
        exercicio5 = new Exercicio5();
        runProgram();
    }

    private static void runProgram() {
        Integer optionProgramRun = inputOptonProgramRun();
        selectProgramToRun(optionProgramRun);
    }

    private static Integer inputOptonProgramRun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select program to run: \n" +
                "1. Run Program 1\n" +
                "2. Run Program 2\n" +
                "3. Run Program 3\n" +
                "4. Run Program 4\n" +
                "5. Run Program 5\n" +
                "0. Exit");
        return sc.nextInt();
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
            case 3: {
                exercicio3.runProgram();
                break;
            }
            case 4: {
                exercicio4.runProgram();
                break;
            }
            case 5: {
                exercicio5.runProgram();
                break;
            }
            case 0: {
                System.exit(1);
                break;
            }
            default: {
                System.out.println("invalid program.");
                break;
            }
        }

        runProgram();
    }

    public static Exercicio3 getExercicio3() {
        return exercicio3;
    }
}
