package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.next();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		Department department = new Department(departmentName, payDay);
		
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();
		Address address = new Address(email, phone);
		
		System.out.print("Quantos funcionários existem no departamento: ");
		int n = sc.nextInt();
		System.out.println();
		for (int i=0; i<n; i++) {
			System.out.println("Dados do funcionário #"+(i+1)+":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(name, salary);
			department.addEmployee(employee);
			
		}
		System.out.println();
		System.out.println("-- FOLHA DE PAGAMENTO --");
		
		showReport(department, address);
		sc.close();
	}
	
	public static void showReport(Department dept, Address add) {
		System.out.println("Departamento de " + dept.getName()+ " = " + dept.payRoll());		
		System.out.println("Pagamento realizado no dia " + dept.getPayDay());
		System.out.println("Funcionários:");
		for(Employee e : dept.getEmployee()){
			System.out.println(e.getName());
		}
		
		System.out.println("Para dúvidas, favor entrar em contato com: " + add.getEmail());
	}
}
