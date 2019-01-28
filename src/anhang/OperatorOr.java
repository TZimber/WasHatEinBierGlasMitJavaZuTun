package anhang;

public class OperatorOr {
    public static void main(String[] args) {
        int x = 743;
        int y = 324;
        int e = x | y;
        System.out.println("x     = " + Tools.prependZeros(Integer.toBinaryString(x), 12));
        System.out.println("y     = " + Tools.prependZeros(Integer.toBinaryString(y), 12));
        System.out.println("x | y = " + Tools.prependZeros(Integer.toBinaryString(e), 12));
        System.out.println("e = " + e);
    }
}
