class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Factorization  Started");
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(n + " factorization is " + fact);
        System.out.println("Factorization Ended");
    }

}
