package Lab1;

public class Prime {
public static void main(String[] args){
    for (int num = 2; num <= 100; num++){
        if (isPrime(num)){
            System.out.println(num);
        }
    }
}
public static boolean isPrime(int n) {
    for (int i = 2; i <= n - 1; i++){
        if (n % i == 0){
            return false;
        }
    }
    return true;
}
}