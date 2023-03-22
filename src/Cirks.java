import java.util.Random;
import java.util.Scanner;

public class Cirks {
public int reizes;
	static void mestKaulinu(int reizes){
		int skaitlis;
		Random rand = new Random();
		for(int i=1;i<=reizes;i++){
			skaitlis = rand.nextInt(6)+1;
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
        if(skaitlis==6){
        	reizes++;
    		System.out.println("Uzkrita skaitlis 6 vari mest +1 reizi");	
        }
		}
	}

		
	
	public static void main(String[] args) {
		int reizes;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("Cik reizes mest kauliòu");
		reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();

	}
}
