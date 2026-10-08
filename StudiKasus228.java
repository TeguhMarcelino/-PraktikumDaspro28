import java.util.Scanner;
public class StudiKasus228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa;
        String jenisKegiatan;
        int Jumlahdokumen;
        int peringkatJuara;
        int statusPendanaan;
        String DanaPendanaan;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen : ");
        Jumlahdokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        peringkatJuara = sc.nextInt();

        statusPendanaan = 0;
        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("Belmawa")) {
            if (Jumlahdokumen >= 3 && peringkatJuara <= 3) {
                statusPendanaan = 1;
            } else {
                statusPendanaan = 0;
            }
        } else if (jenisKegiatan.equalsIgnoreCase("bakorma") || jenisKegiatan.equalsIgnoreCase("Bakorma")) {
            if (Jumlahdokumen >= 2 && peringkatJuara <= 3) {
                statusPendanaan = 1;
            } else {
                statusPendanaan = 0;
            }
        } else if (jenisKegiatan.equalsIgnoreCase("mandiri") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            if (Jumlahdokumen >= 1 && peringkatJuara <= 3) {
                statusPendanaan = 1;
            } else {
                statusPendanaan = 0;
            }
        } else {
            System.out.println("Jenis kegiatan tidak valid.");
        }

    }
}
