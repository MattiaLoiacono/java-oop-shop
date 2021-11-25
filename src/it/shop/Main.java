package it.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto A = new Prodotto();
		System.out.println("Codice: " + A.getCodice());
		
		
		A.setIva(12);
		A.setIva(-12);
		A.setNome("Prova");
		A.setNome("ProvaProvaProvaProvaProvaProva");
		A.setDescrizione("jasjhhfjfraaaaaaaaaaaaaagwerrrrrrr");
		A.setDescrizione("jasjrrrrr");
		A.setPrezzo(57.32);
		A.setPrezzo(-57.32);
		
		
		System.out.println("Nome: " + A.getNome() + "  " + A.getnomeEsteso());
		System.out.println("Descrizione: " + A.getDescrizione());
		System.out.printf("Prezzo: %.2f   con IVA: %.2f\n", A.getPrezzoBase(), A.getPrezzoIva());
	}

}
