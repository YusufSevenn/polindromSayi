import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int a,birlerbasamagi,onlarbasamagi,yuzlerbasamagi,binlerbasamagi,onbinlerbasamagi;
       System.out.println("lutfen bes basamakli bir sayi giriniz");

       Scanner input = new Scanner (System.in);
       a=input.nextInt();

       onbinlerbasamagi=a/10000;
       System.out.println(onbinlerbasamagi);

       binlerbasamagi=(a-(onbinlerbasamagi*10000))/1000;
        System.out.println(binlerbasamagi);

       yuzlerbasamagi=(a-(onbinlerbasamagi*10000)-(binlerbasamagi*1000))/100;
        System.out.println(yuzlerbasamagi);

       onlarbasamagi=(a-(onbinlerbasamagi*10000)-(binlerbasamagi*1000)-(yuzlerbasamagi*100))/10;
        System.out.println(onlarbasamagi);

       birlerbasamagi=(a-(onbinlerbasamagi*10000)-(binlerbasamagi*1000)-(yuzlerbasamagi*100)-(onlarbasamagi*10))/1;
        System.out.println(birlerbasamagi);

       if(onbinlerbasamagi==birlerbasamagi&&binlerbasamagi==onlarbasamagi)
       {
           System.out.println("girdiginiz sayi polidrom sayidir.");
       }

       else
       {
           System.out.println("girdiginiz sayi polidrom sayi degildir");
       }


    }
}