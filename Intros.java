public class Intros {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(bigger(3, 4));
    }
    
    public static int bigger(int a, int b){
        // Math.max(a, b);
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }
}