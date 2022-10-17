import java.util.Scanner;
class perhitungan{
    private double berat , tinggi  , totalberat  ;

    public void berat(){
    Scanner sc = new Scanner(System.in);

    System.out.println("berat badan: ");
    berat = sc.nextDouble();
    System.out.println("tinggi badan: ");
    tinggi = sc.nextDouble();


    }

public void perhitungan(){
        tinggi = (float)tinggi/100;
   totalberat = (float)berat / (tinggi * tinggi);
   System.out.println("total berat " + totalberat);
   if (totalberat >= 22.9){
       System.out.println("berat anda overweight");
   }
   else if (totalberat <= 18.5) {
       System.out.println("berat anda underweight");

   }
   else {
       System.out.println("berat anda ideal");
   }

}

}

public class SOAL_2 {

    public static void main(String[] args) {
        perhitungan prh = new perhitungan();
        prh.berat();
        prh.perhitungan();

    }
}
