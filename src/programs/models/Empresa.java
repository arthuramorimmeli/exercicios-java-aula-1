package programs.models;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Empresa {

    private String name;
    private Double value;
    private String unity;
    private LocalDate currentDate;
    private Double annualGrowth;

    public Empresa(String name, Double value, String unity, Double annualGrowth, LocalDate currentDate) {
        this.name = name;
        this.value = value;
        this.unity = unity;
        this.currentDate = currentDate;
        this.annualGrowth = annualGrowth;
    }

    public String getName() {
        return name;
    }

    public String getValueFormated() {
        DecimalFormat formato = new DecimalFormat("#.##");
        return formato.format(this.value);
    }

    public Double getValue() {
        return value;
    }

    public String getUnity() {
        return unity;
    }

    public Double getAnnualGrowth() {
        return annualGrowth;
    }

    private void setValue(Double value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return currentDate;
    }

    public void nextYear() {
        setDate(this.currentDate.plusYears(1));
    }

    public void setDate(LocalDate date) {
        this.currentDate = date;
    }

    public Empresa calcNewYearValue() {
        this.setValue(this.value + (this.value * (this.getAnnualGrowth()/100)));
        return this;
    }

    @Override
    public String toString() {
        return  getName() + " - " + getDate() + " - " + getValueFormated() + this.getUnity() +
                ", annualGrowth=" + getAnnualGrowth() +
                '}';
    }
}
