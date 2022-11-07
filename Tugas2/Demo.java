public class Demo {
    public static void main(String[] args) {
       
        Asdos fair = new Asdos ("Fairuzikum" ,22, 7); 

        Dosen raja = new Dosen("Raja OP Damanik",5); 

        Asdos angel = new Asdos ("Angel-chan",21, 1); 

        Mahasiswa firman = new Mahasiswa ("Firman", 20); 
        
        Mahasiswa nid = new Mahasiswa("nid pass this sem", 23);
        
        Dosen nivo =  new Dosen("Nivotko",3); 

        
        
        fair.tampil();
        raja.tampil();
        angel.tampil();
        firman.tampil();
        nid.tampil();
        nivo.tampil();

        int total = fair.getjamSibuk()+raja.getjamSibuk()+ angel.getjamSibuk()+
        firman.getjamSibuk()+nid.getjamSibuk()+nivo.getjamSibuk();
        
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+total);
}
}