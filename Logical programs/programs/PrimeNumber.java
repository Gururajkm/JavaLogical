public class PrimeNumber {
    public static void main(String[] args) {
        int[] p = { 2, 3, 5, 4, 6, 7 };
        int count = 0;
        for (int i = 2; i < p.length; i++) {
            for (int j = 1; j < i; j++) {
                if (p[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("primenumber" + p[i]);
            }
        }
    }
}
