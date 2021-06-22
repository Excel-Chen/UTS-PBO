import UTS.kelas.kartuhasilstudi;
import UTS.kelas.mahasiswa;
import UTS.kelas.matakuliah;


import java.util.Scanner;
public class App {
    /* Nama : Excel
       Kelas : 20TI2
       NIM : 03082200002
    */
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        int pilih;

        mahasiswa mhs = new mahasiswa("Excel");
    
        matakuliah matak1 = new matakuliah("001", "F.I.P.", 2);
        matakuliah matak2 = new matakuliah("002", "P.B.O.", 3);
        matakuliah matak3 = new matakuliah("003", "B.Indo", 2);

        kartuhasilstudi khs = new kartuhasilstudi(3,mhs);
        khs.tambahNilaiStudi(matak1, 'A');
        khs.tambahNilaiStudi(matak2, 'B');
        khs.tambahNilaiStudi(matak3, 'C');

        System.out.println("Menu Program Nilai :");
        System.out.println("====================");

        System.out.println("1 : Tampilkan KHS");
        System.out.println("2 : Exit");
        System.out.println();
        System.out.print("Pilihan : ");
        pilih = masukan.nextInt();
        System.out.println("");
        
        if (pilih == 1){
            khs.tampilkanKHS();
            System.out.println();
        }
        else{
            System.exit(0);
        }

        masukan.close();

    }
}