import java.util.*;
public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Task 2: ");
        for(double x = -1; x < 1; x+=0.2){
            double formula = Math.sin(x)+Math.tan(x);
            System.out.println("y = sin x + tan x = "+formula);

        }
        int s1;
        int s2=0;
        int s3=0;
        while (true) {


            s1 = scanner.nextInt();
            if (s1 >0) s2+=s1;
            if (s1 <0) s3+=s1;
            if (s1 == 0) {
                System.out.println("Стоп1");
                break;
            }

        }
        System.out.println("Сумма додатніх =>> "+s2);
        System.out.println("Сумма від'ємних =>> "+s3);

    }
    */
        String s = scanner.nextLine();
        int big =0;

        int len = s.length();
        for (int i = 0;i<len;i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                big++;
            }
        }
        System.out.println("Количество заглавных букв =>> " +
                "" + big );
    }
}
