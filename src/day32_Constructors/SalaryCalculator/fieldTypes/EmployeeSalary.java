package day32_Constructors.SalaryCalculator.fieldTypes;



public class EmployeeSalary {

    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    public double taxAmount;
    public double bonusAmount;
    public  double netSalaryWithoutRaise;

    public double totalSalary;


    public EmployeeSalary(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {

        if (this.salary >= 1000) {
            taxAmount = this.salary * 0.03;
        } else {
            taxAmount = 0.0;
        }
        return taxAmount;
    }


    public double bonus(){

        if (workHours>40){
            bonusAmount=30*(workHours-40);
        }
        return bonusAmount;
    }

    public double getNetSalaryWithoutRaise(){
        netSalaryWithoutRaise= salary + bonusAmount - taxAmount;
        return netSalaryWithoutRaise;
    }
    public double raiseSalary(){

        int yeardifference=2021-hireYear;
        if (yeardifference<10){
            totalSalary= netSalaryWithoutRaise*1.05;
        }else if (yeardifference>=10 && yeardifference<20){
            totalSalary= netSalaryWithoutRaise*1.10;
        } else {
            totalSalary= netSalaryWithoutRaise*1.15;
        }
        return totalSalary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", taxAmount=" + tax() +
                ", bonusAmount=" + bonus() +
                ", netSalarywithoutRaise=" + getNetSalaryWithoutRaise() +
                ", totalSalary=" + raiseSalary() +
                '}';
    }

    public static void main(String[] args) {
        EmployeeSalary employee1 = new EmployeeSalary("Okan",10_000,45,1998);
        EmployeeSalary employee2 = new EmployeeSalary("Huseyin",100_000,35,2002);
        EmployeeSalary employee3 = new EmployeeSalary("Serdar",10_000,40,2010);
        EmployeeSalary employee4 = new EmployeeSalary("Bilal",10_000,40,1994);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }
}