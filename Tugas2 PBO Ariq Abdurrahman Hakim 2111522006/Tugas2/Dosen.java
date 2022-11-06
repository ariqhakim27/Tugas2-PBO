//Ariq Abdurrahman Hakim 2111522006
public class Dosen extends Elemen {

    private int jumlahHariKerja;
    private int jamsibuk;
    
    // Memanfaatkan method dari parent class abstract
    @Override
    public void send(){
        System.out.println(this.nama+ " adalah seorang dosen dengan jam sibuk "+getjamSibuk());
    }


    public int getjamSibuk(){
        return jamsibuk;
        
    }
    public Dosen(String nama,int jumlahHariKerja){
        super(nama);
        jamsibuk = jumlahHariKerja *8;
        
    }

    


    

}
