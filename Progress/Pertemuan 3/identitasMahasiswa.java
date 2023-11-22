public class identitasMahasiswa {
    public static void main(String[] args){

        // Variabel Biodata
        String namaDepan    = "Firzandi";
        String namaBelakang = "Styana";
        String nim          = "21537144016";
        int angkatan        = 2021;
        String programStudi = "S1-Teknologi Informasi";
        String jurusan      = "JPTEI";
        String fakultas     = "Fakultas Teknik";
        double ipkHarapan   = 3.4d;

        System.out.println("-------Identitas Mahasiswa UNY-------");
        System.out.println("");
        System.out.println("1. Nama Lengkap     : " + namaDepan + " " + namaBelakang);
        System.out.println("2. Nama Panggilan   : " + namaDepan);
        System.out.println("3. NIM              : " + nim);
        System.out.println("4. Tahun Angkatan   : " + angkatan);
        System.out.println("5. Program Studi    : " + programStudi);
        System.out.println("6. Jurusan          : " + jurusan);
        System.out.println("7. Fakultas         : " + fakultas);
        System.out.println("8. IPK Harapan      : >" + ipkHarapan);
        System.out.println("");

        // bagian deskripsi
        System.out.println("Deskripsi :");
        System.out.println("Halo, Teman-teman");
        System.out.println("Perkenalkan saya " + namaDepan + namaBelakang + ", ");
        System.out.println("Kalian bisa memanggilku " + namaDepan + ". ");
        System.out.println("NIM saya " + nim + ". \n");
        System.out.println("Saya dari angkatan " + angkatan);
        System.out.println(" dari Program Studi " + programStudi + " " + fakultas + ". \n");
        System.out.println("IPK harapan saya pada semester 1 adalah >" + ipkHarapan + ". ");
        System.out.println("");
    }
}
