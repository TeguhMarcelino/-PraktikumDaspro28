import java.util.Scanner;
public class StudiKasus228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa;
        String jenisKegiatan;
        int Jumlahdokumen;
        int Dokumenkurang;
        int peringkatJuara;
        int statusPendanaan;
        String Dokumen = "";
        String DanaPenghargaan;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen : ");
        Jumlahdokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        peringkatJuara = sc.nextInt();

        statusPendanaan = 0;
        DanaPenghargaan = "";
        if (jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (Jumlahdokumen >= 4) {
                if ( peringkatJuara <= 3 && peringkatJuara > 0) {
                    DanaPenghargaan = "Dana Penghargaan diberikan";
                } else {
                    DanaPenghargaan = "Dana Penghargaan tidak diberikan";
                }
            } else {
                Dokumen = "Dokumen tidak lengkap (kurang " + (4 - Jumlahdokumen) + " dokumen)";
                DanaPenghargaan = "Dana Penghargaan tidak diberikan";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            if (statusPendanaan == 1) {
                if ( peringkatJuara <= 3 && peringkatJuara > 0) {
                    DanaPenghargaan = "Dana Penghargaan diberikan";
                } else {
                    DanaPenghargaan = "Dana Penghargaan tidak diberikan";
                }
            } else {
                Dokumen = "Dokumen tidak lengkap (kurang " + (4 - Jumlahdokumen) +" dokumen)";
                DanaPenghargaan = "Dana Penghargaan tidak diberikan";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("lainnya") || jenisKegiatan.equalsIgnoreCase("Lainnya")) {
            DanaPenghargaan = "Dana Penghargaan tidak diberikan";
        }
        else {
            System.out.println("Jenis kegiatan tidak valid.");
        }
        System.out.println("Status : " + Dokumen + ", " + DanaPenghargaan + ".");
    }
}
