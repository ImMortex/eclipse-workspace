
public class P1L1A03A {
	public static void main(String[] args) {
		
	// Bitte nich formatieren!	
		

		char[][] myLabyrinth0 = {

				{ 'M', 'M', 'M', 'M', 'M' },

				{ 'M', 'F', 'M', 'F', 'A' },

				{ 'M', 'F', 'F', 'F', 'M' },

				{ 'E', 'F', 'M', 'F', 'F' },

				{ 'M', 'M', 'M', 'M', 'M' }

		};

		char[][] myLabyrinth1 = {

				{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },

				{ 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M' },

				{ 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M' },

				{ 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M' },

				{ 'M', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'M' },

				{ 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'M' },

				{ 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M' },

				{ 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M' },

				{ 'M', 'E', 'M', 'A', 'M', 'M', 'M', 'M', 'M' }

		};

		char[][] myLabyrinth2 = {

				{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },

				{ 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'M' },

				{ 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M' },

				{ 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'F', 'F', 'M' },

				{ 'M', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M' },

				{ 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M' },

				{ 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M' },

				{ 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M' },

				{ 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M' },

				{ 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M' },

				{ 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'M' },
				
				{ 'M', 'E', 'M', 'M', 'M', 'M', 'M', 'A', 'M', 'M', 'M' }

		};

		char[][] myLabyrinth3 = {

				{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },

				{ 'E', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M' },

				{ 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M' },

				{ 'M', 'F', 'F', 'M', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M' },

				{ 'M', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M' },

				{ 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'M' },

				{ 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M' },

				{ 'M', 'F', 'M', 'M', 'M', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'M' },

				{ 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M' },

				{ 'M', 'F', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M' },

				{ 'M', 'F', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'M' },

				{ 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'F', 'F', 'M' },

				{ 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'F', 'M', 'F', 'M' },
				
				{ 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'A', 'M' }

		};
				
		
		//ich nenne es "Labyrinth ohne Wiederkehr" Gr��e:[51][51]
		char[][] myLabyrinth4 = {

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
		

	}
}