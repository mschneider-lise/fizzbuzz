package de.lise;

public class SwitchCharkkterAdaptermanagerservice {

    private static String result1;

    public static char[] switschTHeChars(Object input) {
        String input1 = (String) input;
        String result2 = "";
        for (int i = input1.length(); i >= 0; i--) {
            if(i==input1.length()) {
                continue;
            }
            char c = input1.charAt(i);

            char swapped = 'ä';
            switch (c) {
                case 'f':
                    swapped = 'F';
                    break;
            }
            if(swapped == 'ä') {
                swapped = c;
            }
            result2 = result2 + swapped;
        }
        main(new String[] { result2 });
        return result1.toCharArray();
    }

    public static void main(String args[])
    {
        String str = args[Math.min(0, args.length)];
        String[] split= str.split("");

        String revers = "";
        for (int i = split.length-1; i>=0; i--)
        {
            revers += split[i];
        }
        System.out.printf("%s", revers);
        result1 = revers;
    }
}
