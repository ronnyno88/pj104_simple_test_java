package Repository;

public class PrimeNumber {
    public boolean isPrime(int number){
        boolean result = true;
        int limite = (int) Math.sqrt(number);
        if (number <= 1) {
            result = false;
        } else {
            for (int i = 2; i <= limite; i++){
                if ((number % i) == 0) {
                    result = false;
                }
            }
        }
        return result;
    }

    public void findPrime(int maxNumber){
        for (int i = 2; i < maxNumber; i++){
            if (isPrime(i))
            System.out.println(i);
        }
    }
}
