import java.util.Scanner;


class Proses extends Polimorphisme{
		Scanner input = new Scanner(System.in);
		private char merek,tipe;
		private int totalharga,bayar;
		private int harga = 0;
		boolean loop = true;
	



	public Proses(String nama, int jumlahunit){
		

		super(nama,jumlahunit);
}
	
	
	protected void pilihan(){
		
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

protected void pembayaran(){

    	totalharga = getJumlah()*harga;
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

 	protected void cetak(){
	
	
	System.out.println("");
	System.out.println("=====Cetak Hasil Pembayaran=====");
	System.out.println("Nama pelanggan : " +getNama());
	System.out.println("Total harga    : " +totalharga);
	System.out.println("Pembayaran     : " +bayar);
	System.out.println("Kembaliaan     : " +(bayar-totalharga));
	System.out.println("=====Cetak Hasil Pembayaran=====");
	}
}
	