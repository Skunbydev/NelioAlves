package outrosTopicos;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teste = "ola imundos xexeiros do meu coração";
		String teste2 = "a b, c, d, e";
		
		String s01 = teste.toUpperCase();
		String s02 = teste.trim();
		String s03 = teste.substring(3);
		String s04 = teste.substring(3, 12);
		String s05 = teste2.replace("a", "tete").replace("b", "é linda");
		
		String frutas = "nanana, e mamao, lalanja";
		String[] vect = frutas.split(" ");
		
		System.out.println(vect[1]);
		
		System.out.println("Esse eh a teste normal: " + teste);
		System.out.println("Essa eh a upper, amigos: " + s01);
		System.out.println("Essa eh a trim, colega:"+ s02);
		System.out.println("Essa eh a substring, amiguinho: " + s03);
		System.out.println("Essa eh a substring, amiguinho: " + s04);
		System.out.println("Essa eh o replace, amiguinho: " + s05);
		
	}

}
