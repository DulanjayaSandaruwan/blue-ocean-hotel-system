package controller;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @Since : 06/07/2021
 **/
public class IncomeReoprts {
    private String monthlyIncome;
    private String annualyIncome;

    public IncomeReoprts() {
    }

    public IncomeReoprts(String monthlyIncome, String annualyIncome) {
        this.monthlyIncome = monthlyIncome;
        this.annualyIncome = annualyIncome;
    }

    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(String monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getAnnualyIncome() {
        return annualyIncome;
    }

    public void setAnnualyIncome(String annualyIncome) {
        this.annualyIncome = annualyIncome;
    }

    @Override
    public String toString() {
        return "IncomeReoprts{" +
                "monthlyIncome='" + monthlyIncome + '\'' +
                ", annualyIncome='" + annualyIncome + '\'' +
                '}';
    }
}
