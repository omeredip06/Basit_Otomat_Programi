package otomat_programi;

import java.util.Scanner;

public class ParaKontrol 
{
	public ParaKontrol()
	{
		// TODO Auto-generated constructor stub
		
	}
	Scanner scan=new Scanner(System.in);
	double bakiye=0,girilenPara;
	Urunler urun=new Urunler();
	
	public void bakiyeSifirla()
	{
		bakiye=0;
		System.out.println("Bakiyeniz iade edildi!");
		System.out.println("Bakiyeniz: "+bakiye+"TL");
	}
	
	public void paraGirisi()
	{
		System.out.print("Bakiye giriþi yapýnýz(0,50 TL - 1 TL - 5 TL - 10 TL):");
		girilenPara=scan.nextDouble();
		if(paraGirisKontrol(girilenPara)==1)
		{
			bakiye+=girilenPara;
			System.out.println("Bakiyeniz: "+bakiye+"TL");
		}
		else
		{
			System.out.println("Lütfen Ýstenilen Deðerde Paralar Girin!");
			paraGirisi();
		}
	}
	
	public int paraGirisKontrol(double para) 
	{
		if(para==0.50 || para==1 || para==5 || para==10) 
		{
			return 1;
		}
		else
		{
		return 0;	
		}
	}
	
	public void urunAlma()
	{
		if(bakiye==0) {
			System.out.println("Lütfen Önce Bakiye Ekleyiniz!");
		}
		else {
			System.out.println("Kola: "+urun.kola+" Fanta: "+urun.fanta+" Gazoz: "+urun.gazoz);
			System.out.println("Ýstediðiniz Ürünü Seçiniz");
			System.out.println("Kola -> 1, Fanta -> 2, Gazoz -> 3, Vazgeç -> 4");
			int secim=scan.nextInt();
			switch (secim)
			{
			case 1:
				if(bakiyeDurumu(urun.kola)==1) 
				{
					System.out.println("Kola Verildi.");
					bakiye-=urun.kola;
				}
				else
				{
					System.out.println("Bakiye Yetersiz!");
				}
				System.out.println("Bakiyeniz: "+bakiye+"TL");
				break;
			case 2:
				if(bakiyeDurumu(urun.fanta)==1) 
				{
					System.out.println("Fanta Verildi.");
					bakiye-=urun.fanta;
				}
				else
				{
					System.out.println("Bakiye Yetersiz!");
				}
				System.out.println("Bakiyeniz: "+bakiye+"TL");
				break;
			case 3:
				if(bakiyeDurumu(urun.gazoz)==1) 
				{
					System.out.println("Gazoz Verildi.");
					bakiye-=urun.gazoz;
				}
				else
				{
					System.out.println("Bakiye Yetersiz!");
				}
				System.out.println("Bakiyeniz: "+bakiye+"TL");
				break;
			case 4:
				System.out.println("Ýþlem Ýptal Edildi.");
				System.out.println("Bakiyeniz: "+bakiye+"TL");
				break;
			default:
				System.out.println("Girdiðiniz Seçenek Bulunmamaktadýr!");
				break;
			}		
		}
	}
	
	public int bakiyeDurumu(int urunDeger)
	{
		if(urunDeger < bakiye)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
}
