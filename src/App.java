import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String num1 = sc.nextLine();
        System.out.print("Enter second number: ");
        String num2 = sc.nextLine();

        addTwoStringNumbers(num1, num2);
    }

    public static void addTwoStringNumbers(String num1, String num2) {
        int num1Length = num1.length();
        int num2Length = num2.length();
        String answer = "";
        int carry = 0;

        if(num1Length > num2Length) num2 = "0".repeat(num1Length - num2Length) + num2;
        else if(num2Length > num1Length) num1 = "0".repeat(num2Length - num1Length) + num1;
        
        String[] arr1 = num1.split("");
        String[] arr2 = num2.split("");

        for(int i = arr1.length-1; i >= 0; i--) {
            int addedNum = Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[i]) + carry;
            carry = 0;

            if(addedNum >= 10) {
                carry = 1;
                answer = (addedNum - 10) + answer;
                continue;
            }

            answer = addedNum + answer;
        }

        System.out.println("\n===================================\n");
        System.out.println("Sum of two numbers: " + (carry == 0 ? "" : carry) + answer);
        System.out.println("\n===================================\n");
    }
}