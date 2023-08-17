package ejemplo_clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		vehiculo minivan = new vehiculo();
		
		int rango;
		
		//Asignar valores a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//calcular el rango con tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de "+ rango + " kilometros");
		
		vehiculo carro = new vehiculo();
		carro.pasajeros = 4;
		System.out.println("Número de pasajeros en carro es: "+ carro.pasajeros);

	}

}
