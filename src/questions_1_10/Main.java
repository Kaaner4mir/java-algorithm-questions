package questions_1_10;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		// 1. İki sayının toplamını veren programı yazınız.
		
		/*
		System.out.print("Birinci sayıyı girin: ");
		int number1=scn.nextInt();
		
		System.out.print("İkinci sayıyı girin: ");
		int number2=scn.nextInt();
		
		int result=number1+number2;
		
		System.out.printf("%d + %d = %d",number1,number2,result);		
		*/
		
		// 2. Kullanıcının girdiği iki sayının karelerinin toplamını veren programı yazınız
		
		/*
		System.out.print("Birinci sayıyı girin: ");
		int number1=scn.nextInt();
		
		System.out.print("İkinci sayıyı girin: ");
		int number2=scn.nextInt();
		
		int result=(number1*number1) + (number2*number2);
		
		System.out.printf("%d'2 + %d'2 = %d",number1,number2,result);
		*/
		
		// 3. 1'den 100'e kadar olan sayıların küplerini yazdıran programı yazınız
		
		/*
		for(int i=1; i<=100; i++) {
			System.out.println(i + "^3 = "+(i*i*i));
		}
		*/
		
		// 4. Doğum tarihleri girilen kişini yaşını hesaplayan programı yazınız
		
		/*
		System.out.print("Doğum yılını girin: ");
		int year=scn.nextInt();
		
		System.out.print("Doğum ayını numerik olarak girin: ");
		int month=scn.nextInt();
		
		System.out.print("Doğum gününü girin: ");
		int day=scn.nextInt();
		
		LocalDate birthdate=LocalDate.of(year, month, day);
		LocalDate today=LocalDate.now();
		
		Period age=Period.between(birthdate, today);
		
		System.out.println("Yaşınız: "+age.getYears());
		*/
		
		// 5. Girilen sayının faktöriyelini bulan programı yazınız
		
		/*
		int result=1;
		
		System.out.print("Faktöriyelini öğrenmek istediğiniz sayıyı girin: ");
		int number=scn.nextInt();
		
		if(number<0)
			System.out.println("Lütfen pozitif bir sayı giriniz: ");
		else {
			for(int i=number ; i>0; i--) {
				result*=i;
			}
		}
		
		System.out.printf("%d! = %d",number,result);
		*/
		
		// 6. Çarpma işlemini toplama kullanarak bulan programı yazınız
		
		/*
		int result=0;
		
		System.out.print("Birinci sayıyı girin: ");
		int number1=scn.nextInt();
		
		System.out.print("İkinci sayıyı girin: ");
		int number2=scn.nextInt();
		
		for(int i=0; i<number2; i++ ) {
			result+=number1;
		}
		
		System.out.println(number1 +"*"+number2 +"="+result);
		*/
		
		// 7. Bölme işlemini çıkarma kullanarak bulan programı yazınız
		
		/*
		System.out.print("Bölünen sayıyı girin: ");
		int divided = scn.nextInt();

		System.out.print("Bölen sayıyı girin: ");
		int divisor = scn.nextInt();

		if (divisor == 0) {
		    System.out.println("Sıfıra bölme yapılamaz.");
		} else {
		    int division = 0;
		    int remainder = divided;

		    while (remainder >= divisor) {
		        remainder -= divisor;
		        division++;
		    }

		    System.out.println("Bölüm: " + division);
		    System.out.println("Kalan: " + remainder);
		}
		*/

		// 8. Girilen sayının istenilen moda göre işlemini yaptıran programı yazınız
		
		/*
		System.out.print("Bölünen sayıyı girin: ");
		int divided=scn.nextInt();
		
		System.out.print("Modu girin:");
		int modulus=scn.nextInt();
		
		int result=divided % modulus;
		
		System.out.println(divided+"%"+modulus+"="+result);
		*/
		
		// 9. Girilen sayının kaç basamaklı olduğunun bulan programı yazınız
		
		/*
		System.out.print("Sayıyı girin: ");
		int number=scn.nextInt();
		
		int counter=0;
		
		
		while(number>0) {
			number/=10;
			counter++;
			
		}
		System.out.println("Girilen sayının basamak sayısı: "+counter);
		*/
		
		scn.close();
	}

}
