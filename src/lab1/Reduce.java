package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int a){
        int i = 0;
        if(a==0){
            return(i);
        }
        else if(a%2==0){
            return(i+1+reduce(a/2));
        }
        else{
            return(i+1+reduce(a-1));
        }
    }
}
