import java.util.Scanner;

class Main{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		String name;
		int jumunit;
		
		
		
		System.out.print("masukkan nama anda : ");
        name = input.nextLine();
        
        System.out.print("Masukkan jumlah unit yang anda inginkan :");
        jumunit = input.nextInt();
		
		Proses p = new Proses(name,jumunit);
		Polimorphisme l = new Proses(name,jumunit);
		
		p.pilihan();
		p. pembayaran();
		p.cetak();
		
	}
}