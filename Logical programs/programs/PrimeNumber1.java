class PrimeNumber1 {
    public static void main(String[] args) {
        System.out.println("Prime number started");
        int n = 5;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not a prime nuber");
        }
        System.out.println("Prime Number Ended");

    }

}
