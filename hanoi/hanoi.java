package hanoi;

public class hanoi {
    public static void main(String[] args){
        System.out.println(hanoi(3,"A","B","C"));
    }

    public static int hanoi(int n, String source, String target, String temp){
        if (n == 0){
            return 0;
        }
        else{
            int num1= hanoi(n - 1, source, temp, target);
            System.out.println("Move disk "+ n+ " from "+source+" to "+target);
            int num2= hanoi(n - 1, temp, target, source);
            return num1+num2+1;
        }
    }
}
