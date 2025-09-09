package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int i = 0;
        for(int j=1;j<n;j++){
            if ((j % a == 0) || (j % b == 0)) {
                i++;
            }
        }
        return(i);
    }
}
