import java.util.Scanner;

public class SayiAsalMi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol edilecek sayiyi giriniz: ");
        Integer myNum=scan.nextInt();
        scan.close();
        Boolean isPrime=true;
        for(int i=2;i<myNum;i++){
            if(myNum%i==0 && myNum==1){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Girdiginiz sayi asaldir.");
        }else {
            System.out.println("Girdiginiz sayi asaldegildir.");
        }
    }
}
