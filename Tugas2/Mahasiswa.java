
public class Mahasiswa extends Elemen { // Extends polymorphisme 
   private int sks;
   public int jamSibuk;


   public Mahasiswa(String nama, int sks) {
        super(nama);
        jamSibuk = sks*3;
        
    }
 
    
    public int getjamSibuk(){
       return jamSibuk;
    }
    // Memanfaatkan method dari parent class (Elemen) abstract
   public void tampil(){
      System.out.println(this.nama+" adalah seorang mahasiswa dengan jam sibuk "+getjamSibuk());
    }

   
    // Memanfaatkan method dari parent class abstract

}
    