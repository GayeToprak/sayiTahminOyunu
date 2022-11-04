import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner inp = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while(right < 5) {
            System.out.println(" lütfen tahmininizi giriniz: ");
            selected = inp.nextInt();


            if(selected < 0  || selected > 99){
                System.out.println(" lütfen 0 ile 100 arasında bir değer giriniz: ");

                if(!isWrong){
                    right++;
                    System.out.println("  çok fazla hatalı giriş yaptınız . kalan hakkınız : " + (5 - right) );
                }else{
                    isWrong = true;
                    System.out.println(" bir dahaki hatalı girrişinizde hakkınızdan düşülecektir. " );
                }
                continue;
        }

            if(selected == number){
                System.out.println(" tebrikler! doğru tahmin. tahmin ettiğin sayı: " + number);
                isWin = true;
                break;
            }else {
                wrong[right] = selected;
                System.out.println(" üzgünüm! hatalı bir sayı girdiniz. ");


                if (selected > number) {
                    System.out.println( selected  +  "  sayısı gizli sayıdan büyüktür. ");
                } else {
                    System.out.println( selected  +  "  sayısı gizli sayıdan küçüktür. ");
                }
                wrong[right++] = selected;
                System.out.println(" kalan hakkınız : " + (5 - right));
            }
        }
       if(!isWin){
           System.out.println(" kaybettiniz ! " );
           System.out.println(" tahminleriniz : " + Arrays.toString(wrong));
       }
    }
}
