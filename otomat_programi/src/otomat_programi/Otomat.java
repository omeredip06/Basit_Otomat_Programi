package otomat_programi;

public class Otomat {

	public static void main(String[] args)
	{
		Urunler urun=new Urunler();
		Secim secim=new Secim();
		System.out.println("Kola: "+urun.kola+" Fanta: "+urun.fanta+" Gazoz: "+urun.gazoz);
		secim.secenekler();
	}

}
