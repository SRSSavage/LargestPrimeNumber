package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrimeNumber(21));
    }

    public static int getLargestPrimeNumber(int number){
        if(number < 2)
            return -1;

        if(number == 2)
            return 2;
        else if (number % 5 == 0){
            return 5;
        } else {
            for (int i = number - 1; i > 1; i--){
                int highPrime = number % i;
                if (highPrime == 0 && (i % 2 != 0 || i == 2)){
                    return i;
                }
            }
        }
        return number;

    }
}
