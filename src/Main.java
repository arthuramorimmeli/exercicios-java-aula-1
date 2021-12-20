import programs.*;

import java.util.Scanner;

public class Main {

    private static List1Exercicio1 exercicio1;
    private static List1Exercicio2 exercicio2;
    private static List1Exercicio3 exercicio3;
    private static List1Exercicio4 exercicio4;
    private static List1Exercicio5 exercicio5;
    private static List2Exercicio1 list2Exercicio1;
    private static List2Exercicio2 list2Exercicio2;
    private static List2Exercicio3 list2Exercicio3;

    public static void main(String[] args) {
        initClass();
        runProgram();
    }

    private static void initClass() {
        exercicio1 = new List1Exercicio1();
        exercicio2 = new List1Exercicio2();
        exercicio3 = new List1Exercicio3();
        exercicio4 = new List1Exercicio4();
        exercicio5 = new List1Exercicio5();
        list2Exercicio1 = new List2Exercicio1();
        list2Exercicio2 = new List2Exercicio2();
        list2Exercicio3 = new List2Exercicio3();
    }

    private static void runProgram() {
        Integer optionProgramRun = inputOptonProgramRun();
        selectProgramToRun(optionProgramRun);
    }

    private static Integer inputOptonProgramRun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select program to run: \n" +
                "1. List 1 Program 1\n" +
                "2. List 1 Program 2\n" +
                "3. List 1 Program 3\n" +
                "4. List 1 Program 4\n" +
                "5. List 1 Program 5\n" +
                "6. List 2 Program 1\n" +
                "7. List 2 Program 2\n" +
                "8. List 2 Program 3\n" +
                "\n0. Exit");
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
            case 6: {
                list2Exercicio1.runProgram();
                break;
            }
            case 7: {
                list2Exercicio2.runProgram();
                break;
            }
            case 8: {
                list2Exercicio3.runProgram();
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

    public static List1Exercicio3 getExercicio3() {
        return exercicio3;
    }
}
