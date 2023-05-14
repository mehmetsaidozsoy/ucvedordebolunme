import java.util.Scanner;
public class ucvedordebolum {
    
public static void main(String[] args) {
    int k;
    int sayac=0, toplam=0;
    Scanner inp=new Scanner(System.in);
    System.out.println("Sayıyı giriniz.");
    k=inp.nextInt();
    for (int i=1;i<k;++i){
        if(i%3==0&&i%4==0){
            System.out.println(i);
            sayac++;
            toplam+=i;

        }

    }
    System.out.println("Toplam :"+toplam);
    System.out.println("Sayı Adedi :"+sayac);
    System.out.printf(" Ortalama : %d ",toplam/sayac);

}
}