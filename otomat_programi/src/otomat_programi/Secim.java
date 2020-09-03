package otomat_programi;

import java.util.Scanner;

public class Secim {
	public Secim() {
		// TODO Auto-generated constructor stub
	}
	Scanner scan = new Scanner(System.in);
	ParaKontrol paraKontrol = new ParaKontrol();
	int durum;
	public void secenekler() 
	{
		do 
		{
			System.out.println("Yapmak Ýstediðiniz Þeyi Seçiniz\n(Bakiye Eklemek -> 1, Ürün Seçmek -> 2, Vazgeç -> 0)");
			durum=scan.nextInt();
			switch (durum) {
			case 0:
				paraKontrol.bakiyeSifirla();
				break;
			case 1:
				paraKontrol.paraGirisi();
				break;
			case 2:
				paraKontrol.urunAlma();
				break;

			default:
				System.out.println("Girdiðiniz Seçenek Bulunmamaktadýr!");
				break;
			}
		}while(true);
		
	}

}
