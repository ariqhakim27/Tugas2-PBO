//Ariq Abdurrahman Hakim 2111522006
public class Mahasiswa extends Elemen {
   private int sks;
   int jamSibuk;

   // Memanfaatkan method dari parent class abstract
    @Override
   public void send(){
      System.out.println(this.nama+" adalah seorang mahasiswa dengan jam sibuk "+getJamSibuk());
    }


     public int getJamSibuk(){
        return jamSibuk;
     }
   
   public Mahasiswa(String nama, int sks) {
        super(nama);
        jamSibuk = sks*3;
        
    }
 

    
}
