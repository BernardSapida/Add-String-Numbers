public class App {
    public static void main(String[] args) throws Exception {
        // Here's my algorithm to add two string numbers
        System.out.println("\n===================================\n");
        addTwoStringNumbers("9999", "1");
        System.out.println("\n===================================\n");
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

        System.out.println("Sum of two numbers: " + (carry == 0 ? "" : carry) + answer);
    }
}