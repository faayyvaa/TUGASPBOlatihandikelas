import latihan.Pegawai;
//turunan dari class pegawai, maka digunakan fungsi extends 
public class Gaji extends Pegawai{
    //var gaji tahunan
    //variable yang hanya dimiliki child class Gaji
    private double salary ; //Gaji tahunan
    //class contructor
    //membuat objek dan mengkonfigurasikan
    public Gaji(String name, String address, int number, double salary) {
        //method super digunakan untuk meng-contruct variabel pada super class
        super(name, address, number);
        //mengambil variabel yang ada pada parent class
        setSalary (salary); // mengisi nilai ke var salary
        //TODO Auto-generated constructor stub
    }
    //method turunan dari parent class/ super class
    // oputput dari method mailCheck yang ada di class gaji akan ditampilkan ketika dipanggil pada virtualdemo
    public void mailCheck(){
        System.out.println("Memeriksa kelas dalam surat");
        //output "memeriksa kelas gaji dalam surat"
        System.out.println("Surat tertuju untuk " + getName() + "dengan gaji" + salary );
    }   //output "surat tertuju untuk dengan gaji"

    public double getSalary (){
        return salary;
        //method untuk mengembalikan nilai pada var salary
    }
    //method yang digunakan untuk mengisi var salary
    // jika nilai variabel new salary besar dari 0.0
    // maka nilai variabel salary = newsalary
    public void setSalary (double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    //method ini akan digunakan untuk menghitung pembayaran gaji karyawan
    // pembayaran gaji ini akan mengembalikan nilai dalam var salary yang akan dibagi 52
    public double computerPay (){
        System.out.println("Menghitung pembayaran gaji untuk " + getName());
        return salary/52;
    }
    //method untuk mengembalikan var name
    public String getName() {
        return null;
    }

   
}