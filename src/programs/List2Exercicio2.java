package programs;

import programs.models.Empresa;

import java.time.LocalDate;

public class List2Exercicio2 {

    private Empresa empresaX;
    private Empresa empresaY;

    public void runProgram() {
        initValues();
    }

    public void initValues() {
        LocalDate currentDate = LocalDate.parse("2021-01-01");
        empresaX = new Empresa("Empresa X", 1130000.0, "m", 148.3, currentDate);
        empresaY = new Empresa("Empresa Y", 18400000.0, "m", 32.0, currentDate);
        while(empresaY.getValue() > empresaX.getValue()) {
            empresaX.calcNewYearValue().nextYear();
            empresaY.calcNewYearValue().nextYear();
            System.out.println(empresaX.toString());
            System.out.println(empresaY.toString());
        }


    }
}
