import java.util.Scanner;

class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String name;
		int jumunit;
		
		System.out.print("masukkan nama anda : ");
        name = input.nextLine();
        
        System.out.print("Masukkan jumlah unit yang anda inginkan :");
        jumunit = input.nextInt();

		Enkapulasi e = new Enkapulasi();
		e.setNama(name);
		e.setJumlahunit(jumunit);		
		e.pilihan();
		e.pembayaran();
		e.cetak();
	
	}
}