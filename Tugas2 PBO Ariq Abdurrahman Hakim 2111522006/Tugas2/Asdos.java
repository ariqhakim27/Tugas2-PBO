//Ariq Abdurrahman Hakim 2111522006
public class Asdos extends Mahasiswa{

    private int jamNgasdos;
    
    // Memanfaatkan method dari parent class abstract
    @Override
    public void send(){
        System.out.println(this.nama+ " adalah seorang asdos dengan jam sibuk "+getjamSibuk());
    }
   
    public Asdos(String nama, int sks, int jamNgasdos){
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;
        
    }

    public int getjamSibuk(){
        return jamSibuk;
        
    }
    




    
}
