package day46_Polymorphism;

import day43_Abstraction.employeeTask.Developer;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };
//   List<day43_Abstraction.employeeTask.Employee> scrumMembers = new ArrayList<>();
//        scrumMembers.addAll(Arrays.asList(employees));
        List<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(Arrays.asList(employees));
        System.out.println("scrumMembers = " + scrumMembers);
// 2.2 store all the testers into the following List of testers:
// 2.3 store all the developers into the following List of developers:
        List<Tester> testers = new ArrayList<>();

        List<Developer> developers = new ArrayList<>();
        for (Employee each : scrumMembers) {
            if (each instanceof Tester){
                testers.add((Tester) each);
            }
            if (each instanceof Developer){
                developers.add((Developer) each);
            }
        }
        for (Tester tester : testers) {
            System.out.println("testers = " + testers);
        }
        for (Developer developer : developers) {
            System.out.println("developers = " + developers);
        }
// 2.4 which tester has the maximum salary?
        double maxSalaryOfTester = testers.get(0).getSalary();

        for (Tester each : testers) {
            for (int i = 0; i < testers.size(); i++) {
                if (testers.get(i).getSalary()>maxSalaryOfTester){
                    maxSalaryOfTester=testers.get(i).getSalary();
                }
            }
            if (maxSalaryOfTester==each.getSalary()){
                System.out.println(each.getName() + " has the maximum salary of "+ each.getSalary());
            }
        }
// 2.5 which developer has the maximum salary?
    double maxSalaryOfDevevoler = developers.get(0).getSalary();

        for (Developer each : developers) {

            for (int i = 0; i < developers.size(); i++) {

                if (developers.get(i).getSalary()>maxSalaryOfDevevoler){
                    maxSalaryOfDevevoler=developers.get(i).getSalary();
                }
            }
            if (maxSalaryOfDevevoler==each.getSalary()){
                System.out.println(each.getName() + " has the maximum Developer salary of "+ each.getSalary());
            }
        }
    }
  }










