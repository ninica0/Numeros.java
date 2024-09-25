import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		int res;
	
		System.out.print("Digite um número negativo ou positivo: ");
		n = sc.nextInt();
		
		if (n<0) {
			res = n * -1;
		
		}else {
			res= n * 1;
		}
		System.out.println("O resultado é: " + res);
		


	}

}