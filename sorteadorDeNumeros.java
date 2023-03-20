import java.util.Scanner;
import java.util.Random;
class sorteadorDeNumeros {
    public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos numeros quer sortear? ");
		int qt_num = teclado.nextInt();
		Random random = new Random();

		int [] numeros = new int[qt_num];

		for(int i = 0; i < numeros.length; i++){
			int sorteados = random.nextInt(1,60);
			numeros[i] = sorteados;
		}
        		
        for (int numero : numeros) {
            System.out.println("Numero sorteado: "+numero);
		}		
    }
}