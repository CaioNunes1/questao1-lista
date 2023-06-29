package questao01;
import java.util.Scanner;

public class TesteBlack_Jack {
	public static void main(String[] args) {
		boolean cont_jogo=true;
		int comeca_jogo2=0;
		Scanner scan=new  Scanner(System.in);
		Jogo jogo=new Jogo();
		
		System.out.println("Bem vindo ao  Blackjack da Rural!!\n"
				+ "Legenda dos naipes: P – PAUS / C – COPAS / E – ESPADAS / O - OUROS");
		System.out.println("\nQuantos decks de baralho você deseja usar para a partida");
		int num_Baralho=scan.nextInt();
		do {
			if(num_Baralho<2 || num_Baralho>10) {
				System.out.println("Digite outro valor de decks(minimo 2,máximo 10)!!");
				num_Baralho=scan.nextInt();
				
			}
			else {
				comeca_jogo2=1;
			}
		}while(comeca_jogo2!=1);
		
		
		System.out.println("Iniciando partida...");
		for(int i=0;i<61;i++) System.out.printf("%s","-");
		
		if(comeca_jogo2==1) {
			do {
				if(jogo!=null) {
					jogo.listarJogadas(num_Baralho);
				}
				
			}while(cont_jogo!=false);	
		}
		
	}
}
