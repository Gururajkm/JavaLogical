public class DataTypeConversions {
    public static void main(String[] args) {
        /*
         * int a = 100;
         * System.out.println("Integer representation:" + a);
         * 
         * long b = a;
         * System.out.println("Long representation:" + b);
         * 
         * float c = b;
         * System.out.println("Float representation:" + c);
         * 
         * byte d = (byte) c;
         * System.out.println("Byte representation:" + d);
         */
        double a = 50.50;
        System.out.println("double representation:" + a);
        float f = (float) a;
        System.out.println("float representation:" + f);
        int i = (int) f;
        System.out.println("int representation:" + i);
        long l = (long) i;
        System.out.println("long representation:" + l);

    }

}
