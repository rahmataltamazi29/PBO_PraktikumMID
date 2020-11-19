import java.util.Scanner;

class Enkapulasi{
	Scanner input = new Scanner(System.in);

	private String nama;
	private char merek,tipe;
	private int kembalian,totalharga,bayar,jumlahunit;
	private int harga = 0;	
	private boolean loop = true;

	public void setNama(String nama ){
		this.nama = nama;
	
	}
	public void setJumlahunit(int jumlahunit){                                                             
		this.jumlahunit = jumlahunit;
		
	}
		
	public String getNama(){
		return nama;
	}
	public int getJumlah(){
		return jumlahunit;
	}
	
	
		public void pilihan(){
		
		while (loop){
		System.out.print("Merek yang anda cari(G/O) : ");
        merek= input.next().charAt(0);
       
	 	if(merek == 'G'){
        	while(loop){
        		
        		
        		System.out.print("Masukkan Tipe nya (M/K/L) : ");
                tipe= input.next().charAt(0);
                
        	switch(tipe){
            case 'M' :
                harga = 95000;
                System.out.println("harga : "+harga);
                loop = false;
                break;
            case 'K' :
               harga = 125000;
                 System.out.println("harga :" +harga);
                 loop = false;
                break;
                case 'L' :
               harga = 450000;
                 System.out.println("harga :" +harga);
                 loop = false;
                break;
            default :
                System.out.println("ndak ditemukan tipe yang anda cari");
                break;
        	}
        	
        }
    }
    else if(merek =='O'){
    	
    	while(loop){
    		System.out.print("Masukkan Tipe nya(M/K/L) : ");
                tipe= input.next().charAt(0);
    	switch(tipe){
            case 'M' :
                harga = 115000;
                System.out.println("harga : "+harga);
                loop = false;
                break;
            case 'K' :
               harga = 135000;
                 System.out.println("harga :" +harga);
                 loop = false;
                break;
                case 'L' :
               harga = 550000;
                 System.out.println("harga :" +harga);
                 loop = false;
                break;
            default :
                System.out.println("ndak ditemukan tipe yang anda cari");
                break;
    	}
    		
    	
    }
   	}else{
		
		System.out.println("tidak ditemukan merek yang anda cari");
	}
	
  }
}

	public void pembayaran(){

    	totalharga = jumlahunit*harga;
    	System.out.println("Total harga adalah: "+totalharga);
    	System.out.println("");
    	System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<totalharga){
			
			if(bayar<totalharga){
				System.out.println("uang anda kurang mohon masukkan dengan nominal yang lebih besar");
				
	            System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		    
		        bayar= input.nextInt();
			
				}
				else{
			
				System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		    
		        bayar= input.nextInt();
			
				}	
}

	
}

 	public void cetak(){
	
	
	System.out.println("");
	System.out.println("=====Cetak Hasil Pembayaran=====");
	System.out.println("Nama pelanggan : " +nama);
	System.out.println("Total harga    : " +totalharga);
	System.out.println("Pembayaran     : " +bayar);
	System.out.println("Kembaliaan     : " +(bayar-totalharga));
	System.out.println("=====Cetak Hasil Pembayaran=====");
	}
	
	
}