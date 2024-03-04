package Week3;

public class Problem5 {
    public static void main(String[] args) {
        int m=1;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%3d", m);
                m++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Here's the modified version.");
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(((i+j+1)%2) + " ");
            }
            System.out.println();
        }
    }
}
