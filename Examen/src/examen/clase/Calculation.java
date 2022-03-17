package examen.clase;

public class Calculation {

	/**
	 * Metodo findMax es el metodo utilizado para encontrar el valor maximo dentro de un arrray de numeros enteros
	 * @param array array de numeros quue recibe 
	 * @return numero maximo encontrado en el array recibido
	 */
	public int findMax(int array[]){
		//variable max contendra el valor maximo encontrado
		int max = array[0];
		for (int i = 0; i< array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public int findMaxPositive(int array[]) throws NumeroNegativoException {
	
		for(int i = 0; i< array.length; i++) {
			
		}
		int max = array[0];
		return max;	
	}
	//holaaaa
	
}
