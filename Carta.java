package questao01;
import java.util.Random;

public class Carta {
	Random rand =new Random();
	private String nome;
	private String naipe;
	private int valor;
	

	public Carta(String nome, String naipe, int valor) {
		super();
		this.nome = nome;
		this.naipe = naipe;
		this.valor = valor;
	}
	public Carta() {
		
	}
	
	public String toString() {
		return "Carta [rand=" + rand + ", nome=" + nome + ", naipe=" + naipe + ", valor=" + valor + "]";
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
