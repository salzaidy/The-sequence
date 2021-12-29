import java.util.Scanner;

class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        
        int s = scanner.nextInt();
        int count = 0;

        for(int i=1; i <= s; i++) {
            for (int j=1; j<=i; j++){
                count++;
                System.out.print(i + " ");
                if (count == s){
                    break;
                }
            }
            if (count == s){
                break;
            }
        }

        scanner.close();
    }
}
