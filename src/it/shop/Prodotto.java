package it.shop;
import java.util.Random;

public class Prodotto {
	
	private int codice, iva;
	private String nome, descrizione;
	private double prezzo;
	
	public Prodotto() {
		this.codice=generaCodice();
	}
	
	
	//geneatore id casuale
	private int generaCodice() {
		Random r = new Random();
		return r.nextInt(100);
	}
	
	
	//getter
	public int getCodice() {
		return codice;
	}
	
	public int getIva() {
		return iva;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public double getPrezzoBase() {
		return prezzo;
	}
	
	public double getPrezzoIva() {
		return prezzo + (prezzo * iva / 100);
	}
	
	public String getnomeEsteso() {
		return (codice + "-" + nome);
	}
	
	//setter
	public void setIva(int iva) {
		if ( iva >= 0 ) {
			this.iva = iva;
		}else {
			System.out.println("Inserire come iva un numero positivo");
		}
	}
	
	public void setNome(String nome) {
		if (nome.length() > 18) {
			System.out.println("Inserire un nome con massimo 18 caratteri");
		} else {
			this.nome=nome;
		}
	}
	
	public void setDescrizione(String descrizione) {
		if (descrizione.length() < 30 || descrizione.length() > 200) {
			System.out.println("Inserire descrizione compresa tra i 30 e i 200 caratteri");
		}else {
			this.descrizione=descrizione;
		}
	}
	
	public void setPrezzo(double prezzo) {
		if (prezzo < 0.0) {
			System.out.println("Prezzo non valido");
		}else if (prezzo == 0.0){
			System.out.println("GRATIS");
		}else {
			this.prezzo = prezzo;
		}
	}
	
	
}

