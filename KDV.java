import java.util.Scanner;
public class Kdv {
    public static void main(String[] args)
    {
        int tutar,kdvF,kdvD;
        Scanner input = new Scanner(System.in);

        System.out.print("Fiyatı Giriniz:\n");
        tutar = input.nextInt();
        if(tutar<1000)
        {
            System.out.println("Kdvsiz Fiyat:"+ tutar);
            kdvD=tutar*18/100;
            System.out.println("Kdv Tutari:"+ kdvD);
            kdvF=tutar+kdvD;
            System.out.print("Kdvli Fiyat:"+kdvF);
        }

        else
        {
            System.out.println("Kdvsiz Fiyat:"+ tutar);
            kdvD=tutar*8/100;
            System.out.println("Kdv Tutari:"+ kdvD);
            kdvF=tutar+kdvD;
            System.out.print("Kdvli Fiyat:"+kdvF);     
        }    
            /* www.patika.dev */  
}
}