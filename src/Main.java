import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner sc = new Scanner(System.in);
        int input= sc.nextInt();
        int input1= sc.nextInt();
        int input2 = sc.nextInt();
        
        switch (input){
            case 1:
                System.out.println(input1+input2);
                break;
            case 2:
                System.out.println(input1-input2);
                break;



        }
    }
}