package newPkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList liste = new LinkedList();
		int secim =12;
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi,index;
		while(secim!=0) {
			System.out.println("1 basa ekle ");
			System.out.println("2 sona ekle ");
			System.out.println("3 araya ekle ");
			System.out.println("4 bastan sil ");
			System.out.println("5 sondan sil");
			System.out.println("6 aradan sil ");
			System.out.println("7 listeyi yazdır");
			System.out.println("0 çıkış ");
			System.out.println("Seçiminiz: ");
			secim=scanner.nextInt();
			if(secim==1) {
				System.out.print("Sayı: ");sayi=scanner.nextInt();System.out.println();
				liste.basaEkle(sayi);
			}else if(secim==2) {
				System.out.print("Sayı: ");sayi=scanner.nextInt();System.out.println();
				liste.sonaEkle(sayi);
			}else if(secim==3) {
				System.out.print("İndex: ");index=scanner.nextInt();System.out.println();

				System.out.print("Sayı: ");sayi=scanner.nextInt();System.out.println();
				liste.arayaEkle(index, sayi);

			}else if(secim==4) {
				liste.bastanSil();
			}else if(secim==5) {
				liste.sondanSil();
			}else if(secim==6) {
				System.out.print("İndex: ");index=scanner.nextInt();System.out.println();

				liste.aradanSil(index);
			}else if(secim==7) {
				liste.yazdir();
			}else if(secim==0) {
				System.out.println("Programdan çıkılıyor iyi günler");
			}else {
				System.out.println("Hatalı seçim lütfen tekrar giriniz");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*sayi.yazdir();
		sayi.sonaEkle(100);
		sayi.basaEkle(0);
		sayi.basaEkle(12);
		sayi.basaEkle(23);
		sayi.sonaEkle(33);
		sayi.basaEkle(39);
		sayi.yazdir();
		sayi.arayaEkle(0, 5);
		sayi.yazdir();
		sayi.arayaEkle(2, 150);
		sayi.yazdir();
		sayi.arayaEkle(7, 260);
		sayi.yazdir();
		sayi.arayaEkle(9, 1000);
		sayi.yazdir();
		sayi.bastanSil();
		sayi.yazdir();

		sayi.bastanSil();
		sayi.bastanSil();
		sayi.bastanSil();
		sayi.yazdir();
		sayi.sondanSil();
		sayi.yazdir();
		sayi.aradanSil(0);
		sayi.yazdir();
		sayi.aradanSil(1);
		sayi.yazdir();
		sayi.aradanSil(2);
		sayi.yazdir();*/

	}

}
