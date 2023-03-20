import java.util.Random;
import java.util.Scanner;

public class Cirks {

	static void mestKaulinu(int reizes){
		int skaitlis;
		Random rand = new Random();
		for(int i=1;i<=reizes;i++){
			skaitlis = rand.nextInt(6)+1;
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);

		}
	}

		
	
	public static void main(String[] args) {
		int reizes;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("Cik reizes mest kaulņu?");
		reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();
	

	}
}
