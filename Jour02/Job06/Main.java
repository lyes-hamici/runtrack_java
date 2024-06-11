package Jour02.Job06;

public class Main {
    public static void main(String[] args) {
        int result;
        result = 0;
        for(int i=0; i<101; ++i){
            if(i%2 == 0){
                result += i;
            };
    
        }
        System.out.println(result);
    }
}
