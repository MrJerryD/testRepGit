import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 5 numbers");

        int max = 0;
        for(int i = 1; i <= 5; i++){
            int user = input.nextInt();
            if(user > max){
                max = user;
            }
        }
        System.out.println(max);
    }
}
