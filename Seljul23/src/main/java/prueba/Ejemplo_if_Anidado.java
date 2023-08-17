package prueba;

public class Ejemplo_if_Anidado {

	public static void main(String[] args) {
		int temperatura = 15;
		
		if(temperatura > 15) {
			if(temperatura > 25) {
				System.out.println("A la Playa!!!");
			}else {
				System.out.println("A la Montaña!!!");
			}
		}else {
			System.out.println("A Descansar!!!");
		}
	}
}
