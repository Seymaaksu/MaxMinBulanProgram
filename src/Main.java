import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int adet, max=0, min=0,i=1;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceğinizi yazınız: "); adet= inp.nextInt();
        while(adet>0){
            System.out.print(i+". Sayı: "); int number =inp.nextInt();
            if (i==1){
                min=number;
                max=number;
            }else {
                if (min>number) min=number;
                if (max<number) max=number;
            }
            adet--;
            i++;
        }
        System.out.println("Min değer: "+min);
        System.out.println("Max değer: "+max);
    }
}