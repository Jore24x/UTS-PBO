import java.util.Scanner;



class keliling {
    Scanner sc = new Scanner(System.in);
private double  jari2 , phi=3.14 , kel;
    public void operasi(){
    System.out.print("jari-jari: ");
    jari2 = sc.nextDouble();
    kel= 2*phi*jari2;
    System.out.println("Keliling: "+ kel);


    }
}
class luas{
    Scanner sc = new Scanner(System.in);
    private double  jari2 , phi=3.14 , luas;

    public void operasi(){
        System.out.print("jari-jari: ");
        jari2 = sc.nextDouble();
        luas = phi*jari2*jari2;
        System.out.println("Luas: "+ luas);

    }

}

class menu{
    private String menu1 , menu2;
    Scanner sc = new Scanner(System.in);
    keliling kel = new keliling();
    luas l = new luas();

    public void menu1(){
        System.out.println("pilih menu yang anda inginkan(keliling/luas): ");
        menu1 = sc.nextLine().toLowerCase();
        if (menu1.equals("keliling")){
            kel.operasi();
            menu2();

        }
        else if (menu1.equals("luas")){
            l.operasi();
            menu2();
        }
        else {
            System.out.println("yang anda input salah");
            menu1();
        }
    }
    public void menu2(){
        System.out.println("mau lagi apa nggak(y/n): ");
        menu2 = sc.nextLine().toLowerCase();
        if (menu2.equals("y")){
            menu1();

        }
        else if (menu2.equals("n")) {
            System.out.println("Terima kasih");

        }
        else {
            System.out.println("salah input!");
        }
    }
}
public class SOAL_4 {
    public static void main(String[] args) {
        menu m = new menu();

        m.menu1();

    }



}
