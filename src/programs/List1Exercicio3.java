package programs;

public class List1Exercicio3 {

    public void runProgram() {
        Integer numForCheck = List1Exercicio2.sendMessageAndgetIntegerValue("Digite o numero para verificar se é primo: ");
        isPrimeNumber(numForCheck);
    }

    private void isPrimeNumber(Integer number) {
        if (checkIfPrimeNumber(number)) {
            System.out.println("Numero primo");
        } else {
            System.out.println("O número não é primo.");
        }
    }

    public static boolean checkIfPrimeNumber(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if((number%i) == 0) {
                return false;
            }
        }
        return true;
    }
}
