package latihan;
// membuat calss virtualdemo untuk mengecek class yang telah dibuat
public class VirtualDemo {
    public static void main(String[] args) throws Exception {
        Gaji s = new Gaji("Wahyu","KUBAR",3,5000.00); // membuat objek gaji (POLIMORPHIZM)
        Pegawai e = new Gaji("Ini nama", "samarinda",2,2500.00);// Membuat objek gaji kedua (POLIMORPHIZM)

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        // output mailCheck dari class gaji
        s.mailCheck();
        System.out.println(" Meganggil mailCheck Berdasarkan Referensi Pegawai--");
        //output mailCheck dari class pegawai
        e.mailCheck();
        
    }
}
//polimorphizme terdapat pada objek gaji , terdiri dari 2 objek
// objek gaji pertama menggunakan referensi gaji
// objek gaji kedua menggunakan referensi pegawai e