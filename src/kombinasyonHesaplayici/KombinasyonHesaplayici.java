package kombinasyonHesaplayici;

import java.util.Scanner;

public class KombinasyonHesaplayici {
	// faktoriyel hesaplamak icin yardimci metod
	
	static int faktoriyel (int n) {
		if (n == 0 || n == 1) {
			return 1;

} else {
	return n * faktoriyel(n - 1);

}
}
	// kombinasyon hesaplamak icin metod
	static int kombinasyon (int n, int r) {
		return faktoriyel (n)/ (faktoriyel(r) * faktoriyel(n - r));
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		// kullanicidan n ve r degerlerini al
		System.out.print("n degerini girin: ");
		int n = scanner.nextInt();
		System.out.print("r degerini girin: ");
		int r = scanner.nextInt();
		
		// r, n'den buyuk olmamali
		if (r>n) {
			System.out.println("r, n'den buyuk olamaz.");
		} else {
			// kombinasyonu hesapla
			
			int sonuc = kombinasyon(n, r);
			
			
			// sonucu ekrana yazdir
			System.out.println("C(" + n + "," + r + ") = " + sonuc);
			
		}
		
		
		scanner.close();
		
		
}
}