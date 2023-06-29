package questao01;

public class Jogador {
	private String nome;
	private int num_Fichas=100;
	private int pontos;
	private Carta carta;
	
	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum_Fichas() {
		return num_Fichas;
	}

	public void setNum_Fichas(int num_Fichas) {
		this.num_Fichas = num_Fichas;
	}

}
