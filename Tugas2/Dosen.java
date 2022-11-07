public class Dosen extends Elemen { // Extends polymorphisme 

    private int jumlahHariKerja;
    int jamSibuk;

    public Dosen(String nama,int jumlahHariKerja){
        super(nama);
        jamSibuk = jumlahHariKerja *8;
        
    }

    
    public int getjamSibuk(){
        return jamSibuk;
        
    }
    // Memanfaatkan method dari parent class abstract
    public void tampil(){
        System.out.println(this.nama+ " adalah seorang dosen dengan jam sibuk "+getjamSibuk());
    }

    // Memanfaatkan method dari parent class abstract
}