class Polimorphisme{
	private String nama;
	private int jumlahunit;
	
	
	public Polimorphisme(String nama, int jumlahunit){
		this.nama = nama;
		this.jumlahunit = jumlahunit;
	}
		
	public String getNama(){
		return nama;
	}
	public int getJumlah(){
		return jumlahunit;
	}
	
	protected void pilihan(){
		
	}
	protected void pembayaran(){
		
	}
	protected void cetak(){
		
	}
	
	
	
}