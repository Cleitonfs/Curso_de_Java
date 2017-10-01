package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafa");
//		System.out.println("Geting...");
//		System.out.println(aprovados.get(1));	
		
//		aprovados.add("Add...");
//		System.out.println(aprovados.add("Maria"));
//		System.out.println("Size... " + aprovados.size());
		
		for(String name: aprovados) {
			System.out.println(name);
		}	
	}
}
