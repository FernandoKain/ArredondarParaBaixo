//Jogo High or Low - Mais alto ou mais baixo.
// Adivinhar um número entre 0 a 100.
// Para alterar a dificuldade do jogo basta alterar a multiplicação *100 na linha 13. Have Fun!!!
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = ""; 
		
		do {
		
		int theNumber = (int)(Math.random()*100+1); // Criar um NÚMERO ALEATÓRIO para o usuário tentar adivinhar.
		System.out.println(theNumber); // Imprime na tela o número criado.
		
		int guess = 0; // Cria uma variável para o palpite do usuário e atribui o valor 0.

		while (guess != theNumber) { // Enquanto o palpite for diferente no NÚMERO ALEATÓRIO criado.
			System.out.println("Palpite um número entre 1 e 100:"); // Imprima a mensagem 
			guess = scan.nextInt(); // Solicita uma entrada do usuário
			
			if (guess < theNumber) // Se a entrada do palpite do usuário for menor do que o NÚMERO ALEATÓRIO CRIADO.
				System.out.println("Você palpitou " + guess + ". E foi muito baixo. Tente de novo!");
			else if (guess > theNumber) // Caso contrário, se o palpite do usuário for maior que NÚMERO ALEATÓRIO CRIADO.
				System.out.println("Você palpitou " + guess + ". E foi muito alto. Tente de novo!");	
			else //Caso contrário imprime na tela que o jogador venceu.
				System.out.println("Correto!!! Seu palpite de " + guess + " foi correto! Você venceu!!!");	
		}
		
		System.out.println("Gostaria de jogar novamente (y/n)?"); // Imprime uma solicitação de decisão do usuário 
		playAgain = scan.next(); // Colhe a resposta do usuário.
		
		} while (playAgain.equalsIgnoreCase("y")); // Verifica se o usuário quer continuar jogando se o usuário digitar "y".
		
		System.out.println("Obrigado por jogar!!! Até mais!"); // Caso não presione "y", despede-se do usuário.
		scan.close(); // Fecha o scan para parar de consumir memória.
		// Fim do programa

	}

}
