package SalaryCalculator;

public class SalaryCalculator {


    public int  weeklyHour;
    public double hourlyRate, stateTaxRate, federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate) {
        this.weeklyHour = weeklyHour;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;


    }

        public double salary(){
        return weeklyHour * hourlyRate * 52;
        }
          public double federalTax(){

        return salary()*federalTaxRate;
       }
            public double stateTax(){

        return  salary()*stateTaxRate;
       }
          public double salaryAfterTax(){
            return salary() - federalTax() - stateTax();

       }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHour=" + weeklyHour +
                ", salary= $" + salary() +
                ", state tax= $" + stateTax() +
                ", federal tax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +
                '}';
    }
}

/*
1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */