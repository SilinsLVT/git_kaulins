import java.util.Random;
import java.util.Scanner;

public class Cirks {

	static void mestKaulinu(int reizes){
		
		int skaitlis,reizes;
		Random rand = new Random();
<<<<<<< HEAD
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kaulņu?");
		reizes = scan.nextInt();
		for(int i=1;i<=reizes;i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);

		}
		scan.close();
=======
		for(int i=1; i<=reizes;i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Jums uzkrita "+skaitlis);
	}
	}
	
	public static void main(String[] args) {
		mestKaulinu(3);
>>>>>>> lukasaZars
	}

}
