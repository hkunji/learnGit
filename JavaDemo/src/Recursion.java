public class Recursion {
    public static void main(String []arg) {
        int sum = recursion(10,100);
        System.out.println(sum);
    }
    public static int recursion(int num1 ,int num2){
        if(num1 == num2) {
            return num1;
        } else {
            return num1 + recursion(num1 +1, num2);
        }
    }
}
