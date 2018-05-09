import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        float number1, number2, result;
        System.out.println("introduceti 2 numere ");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextFloat();
        number2 = sc.nextFloat();
        System.out.println("1.Adunare\n2.Scadere\n3.Inmultire\n4.Impartire");
        int choice;
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:result=adunare(number1,number2);
                System.out.println("adunarea este= "+result);
                break;
            case 2:result=scadere(number1,number2);
                System.out.println("scaderea este= "+result);
                break;
            case 3:result=inmultire(number1,number2);
                System.out.println("inmultirea este= "+result);
                break;
            case 4:result=impartire(number1,number2);
                System.out.println("impartirea este= "+result);
                break;
        }

    }



    public static float adunare (float a,float b){
        return a + b;
    }

    public static float scadere(float a,float b) {
        return a - b;
    }

    public static float inmultire(float a,float b) {
        return a * b;
    }
    public static float impartire(float a,float b){
        if (b==0) {
            System.out.println("nu se poate impartii la 0");
            return 0;
        }
        else {
            return a/b;
        }

    }

    }










