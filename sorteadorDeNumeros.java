import java.util.Random;
import java.util.Scanner;
class sorteadorDeNumeros {
    public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Quantos numeros quer sortear? ");
			int qt_num = teclado.nextInt();
			Random random = new Random();

			int [] numeros = new int[qt_num];

			for(int i = 0; i < numeros.length; i++){
				int sorteados = random.nextInt(60);
				numeros[i] = sorteados;
			}
					
			for (int numero : numeros) {
			    System.out.println("Numero sorteado: "+numero);
			}
		}
		catch (Exception e) {
			System.out.println();
		}		
    }
}