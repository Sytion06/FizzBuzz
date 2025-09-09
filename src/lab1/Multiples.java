package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);
    }

    private static int multiples() {
        int i = 1;
        for(int j=1;j<1000;j++){
            if ((j % 3 == 0) || (j % 5 == 0)) {
                i++;
            }
        }
        return(i);
    }
}
