public class P1L1A03D {
	public static void main(String[] args) {

		// Eingabe Labyrinth
		char[][] spielfeld = {

				{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },   

				{ 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M' }, 
				
				{ 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M' }, 
				
				{ 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'F', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'M' }, 
				
				{ 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M' }, 
				
				{ 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'M' }, 
				
				{ 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'M', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M' }, 
				
				{ 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M' }, 
				
				{ 'E', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M' }, 
				
				{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M' }, 
				
				{ 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M' }, 
				
				{ 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M' }, 
				
				{ 'A', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M' }, 
								
				{ 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M' }, 
				
				{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' }, 
				

		

		};

		spielfeld = erzeugeAufgefuelltesSpielfeld(spielfeld);

		for (int spalte = 0; spalte <= spielfeld.length - 1; spalte++) {

			for (int zeile = 0; zeile <= spielfeld[0].length - 1; zeile++) {

				/*
				 * //für bessere Lesbarkeit:
				 * 
				 * if (spielfeld[spalte][zeile] == 'F') { System.out.print("_ "); } else
				 * 
				 * {System.out.print(spielfeld[spalte][zeile] + " ");}
				 */

				System.out.print(spielfeld[spalte][zeile] + " ");
			}
			System.out.print("\n");

		}

	}

	public static char[][] erzeugeAufgefuelltesSpielfeld(char[][] spielfeld) {

		/*
		 * Diese Funktion füllt im Array Labyrinth (bzw. Spielfeld) alle Sackgassen auf,
		 * sodass nur der richtige Pfad durch eine Schlange von 'F's vom Eingang E bis
		 * Ausgang A sichtbar wird und gibt das überschriebene Array Labyrinth zurück
		 */

		Boolean aenderung = true;

		while (aenderung) {

			aenderung = false; // Abbruch, wenn es im vorherigen Durchlauf keine Sackgasse mehr aufzufüllen gab

			for (int spalte = 0; spalte <= spielfeld.length - 1; spalte++) {

				for (int zeile = 0; zeile <= spielfeld[0].length - 1; zeile++) {

					if (// es gibt 5 Fälle, um eine Sackgasse, bzw. einen Teil davon zu finden

					fall1(spielfeld, spalte, zeile)

							^ fall2(spielfeld, spalte, zeile)

							^ fall3(spielfeld, spalte, zeile)

							^ fall4(spielfeld, spalte, zeile)

							^ fall5(spielfeld, spalte, zeile)

					) {

						aenderung = true;
						spielfeld[spalte][zeile] = 'S';
					}

				}

			}
		}
		return spielfeld;

	}

	public static boolean fall5(char[][] spielfeld, int spalte, int zeile) {

		// Diese Funktion prüft, ob ein Feld von allen vier Seiten eingeschlossen ist
		// (dies kann beim sequentiellen Auffüllen der Sackgassen passieren)

		// B..blockiert (out of Map ODER Mauer ODER aufgefüllte Sackgasse)

		// _ B _
		// B F B
		// _ B _

		return (spielfeld[spalte][zeile] == 'F')

				&&

				// rechts
				((zeile + 1 > spielfeld[0].length - 1) || ((zeile + 1 <= spielfeld[0].length - 1)
						&& ((spielfeld[spalte][zeile + 1] == 'S') || (spielfeld[spalte][zeile + 1] == 'M'))))
				&&
				// links
				((zeile - 1 < 0) || ((zeile - 1 >= 0)
						&& ((spielfeld[spalte][zeile - 1] == 'S') || (spielfeld[spalte][zeile - 1] == 'M'))))

				&&
				// unten
				((spalte + 1 > spielfeld.length - 1) || ((spalte + 1 <= spielfeld.length - 1)
						&& ((spielfeld[spalte + 1][zeile] == 'S') || (spielfeld[spalte + 1][zeile] == 'M'))))

				&&
				// oben
				((spalte - 1 < 0) || ((spalte - 1 >= 0)
						&& ((spielfeld[spalte - 1][zeile] == 'S') || (spielfeld[spalte - 1][zeile] == 'M'))));
	}

	public static boolean fall4(char[][] spielfeld, int spalte, int zeile) {

		// Diese Funktion prüft, ob ein Feld nur einen Zugang für den skizzierten Fall
		// hat:

		// B..blockiert (out of Map ODER Mauer ODER aufgefüllte Sackgasse)

		// _ B _
		// B F F
		// _ B _

		return (spielfeld[spalte][zeile] == 'F')

				&&
				// links
				((zeile - 1 < 0) || ((zeile - 1 >= 0)
						&& ((spielfeld[spalte][zeile - 1] == 'S') || (spielfeld[spalte][zeile - 1] == 'M'))))

				&&
				// unten
				((spalte + 1 > spielfeld.length - 1) || ((spalte + 1 <= spielfeld.length - 1)
						&& ((spielfeld[spalte + 1][zeile] == 'S') || (spielfeld[spalte + 1][zeile] == 'M'))))

				&&
				// oben
				((spalte - 1 < 0) || ((spalte - 1 >= 0)
						&& ((spielfeld[spalte - 1][zeile] == 'S') || (spielfeld[spalte - 1][zeile] == 'M'))));
	}

	public static boolean fall3(char[][] spielfeld, int spalte, int zeile) {

		// B..blockiert (out of Map ODER Mauer ODER aufgefüllte Sackgasse)

		// _ B _
		// F F B
		// _ B _

		return (spielfeld[spalte][zeile] == 'F')

				&&
				// rechts
				((zeile + 1 > spielfeld[0].length - 1) || ((zeile + 1 <= spielfeld[0].length - 1)
						&& ((spielfeld[spalte][zeile + 1] == 'S') || (spielfeld[spalte][zeile + 1] == 'M'))))

				&&
				// unten
				((spalte + 1 > spielfeld.length - 1) || ((spalte + 1 <= spielfeld.length - 1)
						&& ((spielfeld[spalte + 1][zeile] == 'S') || (spielfeld[spalte + 1][zeile] == 'M'))))

				&&
				// oben
				((spalte - 1 < 0) || ((spalte - 1 >= 0)
						&& ((spielfeld[spalte - 1][zeile] == 'S') || (spielfeld[spalte - 1][zeile] == 'M'))));
	}

	public static boolean fall2(char[][] spielfeld, int spalte, int zeile) {

		// B..blockiert (out of Map ODER Mauer ODER aufgefüllte Sackgasse)

		// _ B _
		// B F B
		// _ F _

		return (spielfeld[spalte][zeile] == 'F')

				&&
				// rechts
				((zeile + 1 > spielfeld[0].length - 1) || ((zeile + 1 <= spielfeld[0].length - 1)
						&& ((spielfeld[spalte][zeile + 1] == 'S') || (spielfeld[spalte][zeile + 1] == 'M'))))

				&&
				// links
				((zeile - 1 < 0) || ((zeile - 1 >= 0)
						&& ((spielfeld[spalte][zeile - 1] == 'S') || (spielfeld[spalte][zeile - 1] == 'M'))))

				&&
				// oben
				((spalte - 1 < 0) || ((spalte - 1 >= 0)
						&& ((spielfeld[spalte - 1][zeile] == 'S') || (spielfeld[spalte - 1][zeile] == 'M'))));
	}

	public static boolean fall1(char[][] spielfeld, int spalte, int zeile) {

		// B..blockiert (out of Map ODER Mauer ODER aufgefüllte Sackgasse)

		// _ F _
		// B F B
		// _ B _

		return (spielfeld[spalte][zeile] == 'F')

				&&
				// rechts
				((zeile + 1 > spielfeld[0].length - 1) || ((zeile + 1 <= spielfeld[0].length - 1)
						&& ((spielfeld[spalte][zeile + 1] == 'S') || (spielfeld[spalte][zeile + 1] == 'M'))))

				&&
				// links
				((zeile - 1 < 0) || ((zeile - 1 >= 0)
						&& ((spielfeld[spalte][zeile - 1] == 'S') || (spielfeld[spalte][zeile - 1] == 'M'))))

				&&
				// unten
				((spalte + 1 > spielfeld.length - 1) || ((spalte + 1 <= spielfeld.length - 1)
						&& ((spielfeld[spalte + 1][zeile] == 'S') || (spielfeld[spalte + 1][zeile] == 'M'))));
	}

}
