package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Empregado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		System.out.print("Quantos empregados: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {

			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Salario: ");
			double sal = sc.nextDouble();
			Empregado empreg = new Empregado(id, name, sal);
			System.out.println();
			list.add(empreg);
		}
		
		System.out.println("Digite o id para acrescimo: ");
		Integer id = sc.nextInt();
		
		Empregado result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(result == null) {
			System.out.println("Nao existe");
		}
		else {
			System.out.print("Digite a porcentagem de acrescimo: ");
			double percent = sc.nextDouble();
			
			result.addsalario(percent);
		}
		
		int i = 1;
		for (Empregado x : list) {
			System.out.println("\nEmpregado #" + i);
			System.out.println(x);
			i++;
		}

		 
		sc.close();
	}

}
