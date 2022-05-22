import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Employee emp = getEmployeeDetails();
        int pf = getPFPercentage();
        emp.calculateNetSalary(pf);

        System.out.println("ID : "+emp.getEmployeeId());
        System.out.println("Name : "+emp.getEmployeeName());
        System.out.println("Salary : "+emp.getSalary());
        System.out.println("Net Salary : "+emp.getNetSalary());
    }

    public static Employee getEmployeeDetails(){

        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");;
        emp.setEmployeeId(sc.nextInt());

        System.out.print("Enter Name: ");
        emp.setEmployeeName(sc.nextLine());
        emp.setEmployeeName(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextInt());

        return emp;
    }

    public static int getPFPercentage(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PF Percentage: ");
        int pf = sc.nextInt();

        return pf;
    }
}
