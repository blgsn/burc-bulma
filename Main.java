
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int month,day;
		String burc="";
		Scanner input=new Scanner(System.in);
		
		System.out.print("Doğduğunuz ay:");
		month=input.nextInt();
		
		System.out.print("Doğduğunuz gün:");
		day=input.nextInt();
		
		if(month==1) {
		
			if(day>=1 && day<=31) {
				if(day<22) {
					burc="oğlak";
				}
				else {
					burc="kova";
				}}
				
			}
		
		if(month==2) {
				if(day>=1 && day<=28) {
					if(day<20) {
						burc="kova";
					}
					else {
						burc="balık";
					}}
					
		}
		
		if(month==3) {
					if(day>=1 && day<=31) {
						if(day<21) {
							burc="balık";
						}
						else {
							burc="koç";
						}
						}
					
		}
		if(month==1 || month==2 || month==3) {

					System.out.print("Merhaba, burcunuz:"+burc);
				}
		else {

					System.out.print("Hatalı giriş yaptınız.Tekrar deneyiniz.");
		}
				
		}
}

