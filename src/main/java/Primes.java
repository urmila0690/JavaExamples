public class Primes {


    public static void main(String[] args){
        Primes prime = new Primes();
        int num1 = 29;
        int[] num2 = {13,47,2,3,5,6,7,10,11,23,25};

        System.out.println( prime.isPrime(num1) );
        prime.printPrimes(25);
        prime.printPrimes(num2);
        prime.printPrimes(25,50);
    }

    /**
     * returns true if the integer is prime, false otherwise
     * @param num any positive integer
     * @return  true of prime, false otherwise
     */
    public boolean isPrime(int num){
        for(int i=2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    /**
     * print primes in the integerarray passed to the console
     * @param intArray an array of integers
     */
    public void printPrimes(int[] intArray){
        for (int n : intArray) {
            if(isPrime(n)){
                System.out.println(n);
            }
        }
    }

    /**
     * print primes from 1 until the given number to the console
     * @param num any positive integer greater than 1
     */
    public void printPrimes(int num){
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    /**
     * print primes between the given start and end integer, assumption [start < num]
     * @param start start integer to find primes from
     * @param num end integer to find primes until
     */
    public void printPrimes(int start, int num){
        for(int i=start; i<=num; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
