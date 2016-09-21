package two;

public class Main {
/**
 * print the “X” pattern
 * @param args
 */
	public static void main(String[] args) {
		int x_size = 5;
		int start_star = 0, end_star = x_size - 1;
		int middle_star = x_size/2 + 1;
		for(int row = 0; row < x_size; row++){	
			if(row >= middle_star){
				--start_star;
				++end_star;
			}
			for(int column = 0; column < x_size; column++){
				if(column == start_star || column == end_star)
					System.out.print("*");
				else
					System.out.print("_");
				
			}
			if(row < middle_star-1){
				++start_star;
				--end_star;
			}
			System.out.println("");
		}

	}

}
