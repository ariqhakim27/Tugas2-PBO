
class Asdos extends Mahasiswa { // Extends polymorphisme 

    public int jamNgasdos;

    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama,sks);
        jamSibuk = jamSibuk + jamNgasdos;
    }
    public int getjamSibuk() {
        return jamSibuk;
    }
    public void tampil() {//Upcasting
        System.out.println(this.nama+" adalah seorang asdos dengan jam sibuk "+jamSibuk);
    }

    public String getnama() {
        return nama;
    }
    
    



}
