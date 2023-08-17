package prueba;

public class Ejemplo_Arreglo_unidimencional {

	public static void main(String[] args) {
		// int intArray[];
		 //int [] intArray2;
		 
		 //Declarar un array de Strings
		 String[] arr;
		 //Asignar memoria para 5 Strings
		 arr = new String[5];
		 
		 //Inicializar el primer elemento del array
		 arr[0]= "cero";
		 arr[1]= "uno";
		 arr[2]= "dos";
		 arr[3]= "tres";
		 arr[4]= "cuatro";
		 
		 System.out.println("Elemento en el indice 1: " + arr[1]+ "\n");
		 
		 //Acceder a todos los elementos del arreglo
		 
		 for(int i = 0; i< arr.length; i++) {
			 System.out.println("Elemento en el indice: " + i +" :" + arr[i]);
		 }

	}

}
