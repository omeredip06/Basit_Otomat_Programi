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
			System.out.println("Yapmak �stedi�iniz �eyi Se�iniz\n(Bakiye Eklemek -> 1, �r�n Se�mek -> 2, Vazge� -> 0)");
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
				System.out.println("Girdi�iniz Se�enek Bulunmamaktad�r!");
				break;
			}
		}while(true);
		
	}

}
