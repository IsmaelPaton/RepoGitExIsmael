
public class PrincipalApp {

	public static void main(String[] args) {
		
		int [] array =  {5,9,7,6,36,87,21};
	    String resultado;
	    
	    ClaseConstructor recuperacion = new ClaseConstructor(array);
	
	resultado = recuperacion.arrayRecuperacion();
	for (int i=0; i<array.length; i++) {
		int numero;
		numero = array[i]  ;
		System.out.println(numero);
	}
		
		System.out.println("¿hemos encontrado el 5?" +resultado);
	}
	
}
	