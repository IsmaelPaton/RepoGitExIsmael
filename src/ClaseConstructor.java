
public class ClaseConstructor {
	private int [] array;
	
	public ClaseConstructor(int[] array) {
        this.array = array;
	}
	public String arrayRecuperacion() {
		String resultado = " " ;
		
		
		
		
	if(array == null ) {
			resultado = "NO";
		}
				
	else if(array.length == 0){
		resultado = "NO";
	}else {
	
		for (int i=0 ; i<array.length; i++) {
			if(array[i]  ==5) {
				resultado = "SI";
				
			}
		
		}
			 

	}	
	return resultado;	
	}
}