import java.util.Scanner;
class perhitungan2{


    private int i , jumlah=0 , bilangan;
    public void bilangan(){
        Scanner sc = new Scanner(System.in);

        for (i=1;i<=10;i++){
            System.out.print("masukkan nilai: ");
            bilangan= sc.nextInt();
            jumlah += bilangan;

        }
    }
    public void hasil(){

        System.out.println("hasil dari penjumlahan bilangan-bilangan: " + jumlah);



    }

}


public class SOAL_3 {

    public static void main(String[] args) {
        perhitungan2 prh = new perhitungan2();

        prh.bilangan();
        prh.hasil();
    }

}
