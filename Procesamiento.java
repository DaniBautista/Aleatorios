public class Procesamiento {
	public static int posmenorVector1(String vector[], int li, int ls) {
		if (vector.length <= 0) {
			return 0;
		}
		String minimo = vector[li];
		int pos = li;
		for (int i = li; i <= ls; i++) {
			if (minimo.compareTo(vector[i].toString()) > 0) {
				minimo = vector[i];
				pos = i;
			}
		}
		return pos;
	}

	/**
	 * Asigna en el método compareTo.
	 * Imprime String[] vectorOrdenado.
	 * @param vector
	 * @throws Procesamiento.ImprimirVector(vector);
	 */
	public static String[] ordenarSeleccionMenor(String vector[]) {
		int ls = vector.length - 1;
		int limiteInferior = 0;
		int limiteSuperior = -1;
		for (limiteInferior = 0; limiteInferior < vector.length - 1; limiteInferior++) {
			limiteSuperior = Procesamiento.posmenorVector1(vector, limiteInferior, ls);
			if (limiteSuperior != limiteInferior) {
				Procesamiento.intercambio(vector, limiteInferior, limiteSuperior);
			}
		}
		Procesamiento.ImprimirVector(vector);
		return vector;
	}

	public static void ImprimirVector(String[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("[" + (i + 1) + "] " + vector[i]);
		}
		System.out.println();
	}

	private static void intercambio(String[] vector, int posicion1, int posicion2) {
		// si mayores que vector length -1
		if (posicion1 > vector.length - 1) {
			return;
		}
		if (posicion2 > vector.length - 1) {
			return;
		}
		// si son menores que 0
		if (posicion1 < 0) {
			return;
		}
		if (posicion2 < 0) {
			return;
		}
		String auxiliar = "";
		auxiliar = vector[posicion1];
		vector[posicion1] = vector[posicion2];
		vector[posicion2] = auxiliar;
	}

	/**
	 * Obtiene el valor mínimo del vector / arreglo.
	 * @param vector
	 * @return minimo
	 */
	public static int menorVector1(int vector[]) {
		if (vector.length <= 0) {
			return 0;
		}
		int minimo = vector[0];

		for (int i = 0; i < vector.length; i++) {
			if (minimo > vector[i]) {
				minimo = vector[i];
			}
		}
		return minimo;
	}

	/**
	 * Busca el numero {@code ingresar} en el vector {@code int[] numeros}, lo cuenta y el resultado lo guarda en {@code contador}
	 * @param ingresar
	 * @param numeros
	 * @param indice
	 * @param contador
	 * @return contador
	 */
	public static int buscarNumero(int ingresar, int[] numeros, int indice, int contador) {
		/// Condición de paro.
		if (indice < numeros.length) {
			/// Comparacion para contar
			if (ingresar == numeros[indice]) {
				contador++;// Conteo incrementa uno.
			}
			indice++;// Indice incrementa uno siempre y cuando indice < tamanio del vector.
			return buscarNumero(ingresar, numeros, indice, contador);
		}
		return contador;// Cuantas veces encontro 'ingresar' en 'numeros' utilizando 'indice'.
	}

	/**
     * Busca una palabra y regresa la posicion en la que se encuentra en un vector de tipo String
     */
	public static int buscarPalabra(String palabraBuscar, String[] contenidoOrdenado, int indice) 
	{
		if (indice < contenidoOrdenado.length) 
		{
			if (palabraBuscar.compareTo(contenidoOrdenado[indice]) == 0) 
			{
				return indice + 1;
			} 
			else 
			{
				indice++;
				return buscarPalabra(palabraBuscar, contenidoOrdenado, indice);
			}
		}
		return 0;
	}

}