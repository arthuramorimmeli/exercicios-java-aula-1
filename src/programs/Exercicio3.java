package programs;

public class Exercicio3 {

    public void runProgram() {
        Integer numForCheck = Exercicio2.sendMessageAndgetIntegerValue("Digite o numero para verificar se é primo: ");
        isPrimeNumber(numForCheck);
    }

    private void isPrimeNumber(Integer number) {
        if (this.checkIfPrimeNumber(number)) {
            System.out.println("Numero primo");
        } else {
            System.out.println("O número não é primo.");
        }
    }

    private boolean checkIfPrimeNumber(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if((number%i) == 0) {
                return false;
            }
        }
        return true;
    }
}
