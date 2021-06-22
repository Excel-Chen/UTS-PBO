package UTS.kelas;
import java.util.ArrayList;

public class kartuhasilstudi {
    /* Nama : Excel
       Kelas : 20TI2
       NIM : 03082200002
    */

    int semester ;
    mahasiswa Mahasiswa;
    matakuliah MataKuliah;
    ArrayList<nilaistudi> ListNilaiStudi = new ArrayList<nilaistudi>();

    public kartuhasilstudi(int semester,mahasiswa mhs){
        this.semester = semester;
        this.Mahasiswa = mhs;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public mahasiswa getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(mahasiswa Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public ArrayList<nilaistudi> getNilaiStudi() {
        return this.ListNilaiStudi;
    }

    public void setNilaiStudi(ArrayList<nilaistudi> NilaiStudi) {
        this.ListNilaiStudi = NilaiStudi;
    }

    public void tambahNilaiStudi(matakuliah matak,char nilai){
        nilaistudi ns = new nilaistudi(matak, nilai);
        ListNilaiStudi.add(ns);
    }
   
    public int totalSKS(){
        int total = 0;
        for (nilaistudi nilai : ListNilaiStudi){
            total += nilai.getSKS();
        }
        return total;
    }

    public double ipk(){
        double totalsatu = 0.0, totaldua = 0.0;
        for(nilaistudi i : ListNilaiStudi){
            totalsatu += i.getNilaiAngka() * i.getMataKuliah().getSKS();
            totaldua += i.getSKS();
        }
        return totalsatu/totaldua;
    }

    public void tampilkanKHS(){
        int count = 1;
        System.out.println("Nama Mahasiswa  = " + Mahasiswa.namamhs);
        System.out.println("Semester        = " + semester);
        System.out.println("IPK             = " + ipk());
        System.out.println("Total SKS       = " + totalSKS());
        System.out.println();
        System.out.println("Nilai : ");
        ystem.out.println("==============================================================================");
        System.out.println("No.\t" +  "Kode MataKuliah\t\t" + "Nama MataKuliah\t\t" + "Sks\t\t" + "Nilai");
        System.out.println("==============================================================================");
        for(nilaistudi hasil : ListNilaiStudi){
            System.out.print(count);
            System.out.println(hasil.toString());
            count++;
        }
        System.out.println("==============================================================================");
    }
}
