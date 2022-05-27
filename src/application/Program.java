package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campe�o: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		Champion c1 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campe�o: ");
		sc.nextLine();
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		
		Champion c2 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos voc� deseja executar? ");
		int times = sc.nextInt();
		
		System.out.println();
		int cont = 1;
		while(cont <= times && c1.getLife() != 0 && c2.getLife() != 0) {
			System.out.println("Resultado do turno " + cont + ":");
			c1.takeDamage(c2);
			c2.takeDamage(c1);
			System.out.println(c1.status());
			System.out.println(c2.status());
			System.out.println();
			cont++;
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}

}
