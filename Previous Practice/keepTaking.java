import java.util.Scanner;

public class keepTaking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        String str;
        
        while(true) {
            str = sc.next();
            if(str.equals("x")) {
                break;
            }

            try {
                int n = Integer.parseInt(str);
                sum += n;
            } catch (NumberFormatException e) {
                System.out.println("Wrong Input.");
            }
        }
        

        System.out.println("Sum = " + sum);
    }
}
