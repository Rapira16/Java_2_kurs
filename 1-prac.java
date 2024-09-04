import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //yuan_to_rubles_easy();
        yuan_to_rubles_hard();
    }

    public static void yuan_to_rubles_hard(){
        Scanner console = new Scanner(System.in);
        final double ROUBLES_PER_YUAN = 11.91; // курс
        System.out.print("Введите сумму в юанях: ");
        int yuan = console.nextInt();
        int digit = yuan % 10;
        if (digit == 1) System.out.print(yuan + " китайский юань");
        else if (digit > 1 && digit < 5) System.out.print(yuan + " китайских юаня");
        else System.out.print(yuan + " китайских юаней");
        double roubles;
        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.printf(" в рублях: " + roubles);
    }

    public static void yuan_to_rubles_easy(){
        Scanner console = new Scanner(System.in);
        final double ROUBLES_PER_YUAN = 11.91; // курс
        System.out.printf("Введите сумму в юанях: ");
        int yuan = console.nextInt();
        double roubles;
        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.printf("Сумма в рублях: " + roubles);
    }

}
