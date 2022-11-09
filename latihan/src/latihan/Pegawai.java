package latihan;

public class Pegawai{
    //Deklarasi variable class pegawai
    //variabel ini akan di gunakan untuk Child /Sub Class
    private String name;
    private String address;
    private int number;

    //Class Contructor
    //Membuat objek dan
    public Pegawai (String name, String address, int number) 
        //mengisi nilai variabel
    {
        this.name = name;
        this.address = address;
        this.number = number;
        //Output "menyusun Pegawai"
        System.out.println("Menyusun Pegawai"); //DOWNCASTING menjadi referensi subclass gaji
    }
    //deklarasi method class pegawai
    //method ini akan digunakan / diakses pada child / sub class
    public void mailCheck() {
       System.out.println("Memeriksa Surat Untuk " + this.name + " " + this.address); 
    }
    //mengembalikan nilai hasil sebagai string
    public String toString (){
        return name + " " + address + " " + number;
    }
    //method untuk mengembalikan nilai var name
    public String getName (){
        return name;
    }
    //method untuk mengembalikan nilai var address
    public String getAddress (){
        return address;
    }
    public void setAddress (String newAddress){
        address = newAddress;
    }
    //methodd untuk mengembalikan nilai var number
    public int getNumber (){
        return number;
    }
}
