package questao01;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Jogo {
	Random rand =new Random();
	ArrayList <Jogador> jogadores=new ArrayList<Jogador>();
	
	Scanner scan=new Scanner(System.in);
	private Baralho baralho=new Baralho();
	private Jogador jogador=new Jogador();
	private Jogador banca=new Jogador();
	private Carta carta=new Carta();
	private int numRodadas=0;
	private int totalCartas=104;
	
	public int getTotalCartas() {
		return totalCartas;
	}

	public void setTotalCartas(int totalCartas) {
		this.totalCartas = totalCartas;
	}

	public int getNumRodadas() {
		return numRodadas;
	}

	public void setNumRodadas(int numRodadas) {
		this.numRodadas = numRodadas;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}
	public void listarJogadas(int num_Baralho) {
		
		receberValorAposta(num_Baralho);
		
		System.out.println("Disputa:"+(numRodadas+1));
		
		baralho.iniciarBaralho();
		
		
		//carta=baralho.receberCarta();
		//System.out.println(baralho.receberCarta(rand));
		
	}

	/**
	 * @param num_Baralho
	 */
	public void receberValorAposta(int num_Baralho) {
		//onde acontece a tela principal do jogo
		int sairJogo=0;
		do {
			String inicioPartida;
			System.out.println("\nNumero de cartas no montante:"+getTotalCartas());	
			System.out.println("Numero de fichas:"+jogador.getNum_Fichas());
			
			System.out.println("Digite sua aposta(minimo de 2 ou 'X' para sair do jogo");
			inicioPartida=scan.nextLine();
			if(inicioPartida.equalsIgnoreCase("x")) {
				System.out.println("Saindo do jogo... ");
				sairJogo=1;
			}
			int valorAposta= Integer.parseInt(inicioPartida);
			if(valorAposta<2) {
				while(valorAposta<2) {
					System.out.println("Sua aposta deve ter um valor minimo de 2$, digite novamente");
					valorAposta=scan.nextInt();
				}
			}
			else {
				jogador.setNum_Fichas(jogador.getNum_Fichas()-valorAposta);
				sairJogo=1;
			}
			
		}while(sairJogo!=1);
		
		}
}

