package UTS.kelas;

public class mahasiswa {
    /* Nama : Excel
       Kelas : 20TI2
       NIM : 03082200002
    */
    String namamhs;
    
    public mahasiswa() {
    }

    public mahasiswa(String nama) {
        this.namamhs=nama;
    }

    public String getNama() {
        return this.namamhs;
    }

    public void setNama(String nama) {
        this.namamhs = nama;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t\t";
    }

    
}