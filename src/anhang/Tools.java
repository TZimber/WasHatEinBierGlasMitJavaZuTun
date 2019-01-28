package anhang;

public class Tools {
    public static String prependZeros(String str, int length) {
        StringBuilder retStr = new StringBuilder(length);
        if (str.length() > length) {
            retStr.append(str.substring(str.length() - length));
        } else {
            for (int i = 0; i < (length - str.length()); i++) {
                retStr.append('0');
            }
            retStr.append(str);
        }
        return retStr.toString();
    }
}
