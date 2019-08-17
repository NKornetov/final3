import java.util.Scanner;
import java.text.DecimalFormat;

public class final_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите курс:");
        double kurs = in.nextDouble();

        System.out.println("Введите количество рублей: ");
        double amount = in.nextDouble();

        double dollars=amount/kurs;
        
        DecimalFormat df=new DecimalFormat("0.00");
        String okrugl = df.format(dollars);

        System.out.println("По этому курсе у вас долларов: " + okrugl);

    }
}
