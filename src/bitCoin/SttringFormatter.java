package bitCoin;

public class SttringFormatter {

    public static String leftAdjust(String s, int width) {

        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else
            return spaces(width - stringLength).insert(0, s).toString();
    }

    public static String rightAdjust(String s, int width) {

        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else
            return spaces(width - stringLength).append(s).toString();
    }


    private static StringBuffer spaces(int numSpace) {
        if (numSpace <= 0)
            return new StringBuffer();
        else {
            StringBuffer spaces = new StringBuffer();
            for (int i = 0; i < numSpace; i++)
                spaces.append(' ');
            return spaces;
        }
    }

    public static String center(String s, int width) {

        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else {
            final int numSpace = width - stringLength;
            final int leftSpace = numSpace / 2;
            int rightSpace = numSpace - leftSpace;
            return spaces(leftSpace).append(s).append(spaces(rightSpace)).toString();
        }
    }
}


