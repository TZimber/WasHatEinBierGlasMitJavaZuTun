package anhang;

public class OperatorShiftRight {
    public static void main(String[] args) {
        int x = 72;
        int n = 3;
        int e = x >> n;
        System.out.println("x      = " + Tools.prependZeros(Integer.toBinaryString(x), 12));
        System.out.println("x >> n = " + Tools.prependZeros(Integer.toBinaryString(e), 12));
        System.out.println("x * 2^n = 72 / 2^3 = " + e);
        x = -72;
        n = 3;
        e = x >> n;
        System.out.println("x      = " + Tools.prependZeros(Integer.toBinaryString(x), 12));
        System.out.println("x >> n = " + Tools.prependZeros(Integer.toBinaryString(e), 12));
        System.out.println("x * 2^n = 72 / 2^3 = " + e);
    }
}
