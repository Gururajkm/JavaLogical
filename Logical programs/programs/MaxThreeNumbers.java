class MaxThreeNumbers {

    public static void main(String[] args) {
        System.out.println("Main Started");
        int a = 10;
        int b = 90;
        int c = 120;
        if (a >= b) {
            if (a > c) {
                System.out.println(a + " is the greatest value among the three numbers");
            } else {
                System.out.println(c + " is the greatest value among the three numbers");

            }
        } else if (b > c) {
            System.out.println(b + " is the greatest value among the three numbers");
        } else {
            System.out.println(c + " is the greatest value among the three numbers");
        }
        System.out.println("Main Ended");

    }
}
