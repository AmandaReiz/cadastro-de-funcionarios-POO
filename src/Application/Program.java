package Application;
import entities.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
            try (Scanner sc = new Scanner (System.in)) {
                util account;
                 List<util> employeesList = new ArrayList<>();
                
                System.out.println("Enter many employees will be registered: ");
                int employees = sc.nextInt();
                sc.nextLine();
				
				for (int i = 0; i < employees; i++) {
					System.out.println("Employee #" + (i + 1) + " data:");
					System.out.print("ID: ");
					int id = sc.nextInt();
					sc.nextLine(); 
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Salary: ");
					double salary = sc.nextDouble();
					sc.nextLine(); 
					account = new util(id, name, salary);
					 employeesList.add(account);
           			 System.out.println();
					System.out.println();
					}

					System.out.println("Enter the employee ID that will have salary increase: ");
					int id = sc.nextInt();
					sc.nextLine();

					for (int i = 0; i < employeesList.size(); i++) {
						if (employeesList.get(i).getId() == id) {
							System.out.print("Enter the percentage: ");
							double percentage = sc.nextDouble();
							employeesList.get(i).increaseSalary(percentage);
							System.out.println("Updated data: " + employeesList.get(i));
							System.out.println();
						}

						else {
							System.out.println("This ID does not exist!");
							System.out.println();
						}
					}
					 System.out.println("List of employees: ");
        			for (int i = 0; i < employeesList.size(); i++) {
            		System.out.println("Employee #" + (i + 1) + ":");
            		System.out.println(employeesList.get(i));
           		 	System.out.println();
				}
			}
		}
	}

