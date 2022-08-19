import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int sayi = girdi.nextInt();
        int n1=0,n2=1,n3;
        for (int i = 2;i<=sayi;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
