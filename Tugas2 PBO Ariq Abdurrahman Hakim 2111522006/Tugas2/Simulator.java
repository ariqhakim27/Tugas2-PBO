//Ariq Abdurrahman Hakim 2111522006
public class Simulator {

    //casting
    public static void main(String[] args) {

       //Upcasting
        Elemen a = new Asdos ("Fairuzikum" ,24, 1); 

       //polymorphism 
        Dosen b = new Dosen("Raja OP Damanik",5); 

       //downcasting
        Elemen c = new Asdos ("Angel-chan",21, 1); 
        Asdos h = (Asdos) c;

       //polymorphism
        Mahasiswa d = new Mahasiswa ("Firman", 20); 

       //downcasting
        Elemen e = new Mahasiswa ("Nid to pass this sem", 23);
        Mahasiswa g = (Mahasiswa) e;

       //downcasting
        Elemen f = new Dosen("Nivotko",3); 
        Dosen i = (Dosen) f;
        int total = a.jamSibuk+b.getjamSibuk()+c.getjamSibuk()+d.jamSibuk+((Mahasiswa) e).getJamSibuk()+((Dosen) f).getjamSibuk();
        
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+total);
        a.send();
        b.send();
        h.send();
        d.send();
        g.send();
        i.send();

 

     
        
    
}
}