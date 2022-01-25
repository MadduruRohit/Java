package com.strings;

import java.util.Locale;

public class eight_to_fourteen {

    public static void main(String args[]) {

        // equalsIgnoreCase()
        String str = "Rohit Madduru";
        String str1 = "RoHiT MaDduRU";
        String str2 = "Rohit";
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str1.equalsIgnoreCase(str2));

        // starts with(), ends with()
        String str3 = "Madduru";
        System.out.println(str.startsWith(str2));
        System.out.println(str1.endsWith(str2));
        System.out.println(str.endsWith(str3));

        // compare to()
        System.out.println(str.compareTo(str1));
        System.out.println(str1.compareTo(str2));

        // trim()
        String st = "hello world ";
        System.out.println(st + "welcome");
        System.out.println(st.trim() + "welcome");

        // replace()
        String stt = "Hello Welcome to this Magical World";
        System.out.println(stt);
        String rstt = stt.replace('e', 'k');
        String rstt1 = stt.replace("this", "");
        System.out.println(rstt);
        System.out.println(rstt1);

        // split()
        String sp = "Hello Welcome to this Magical World";
        String sp1[] = sp.split("\\s");
        for (String a : sp1)
            System.out.println(a);

        //  Converting Numbers to Strings with valueOf()
        // Method 1 :
        int a = 174;
        String aa = String.valueOf(a);
        System.out.println(aa);

        // Converting integer Objects to Strings
        // Method 2 :
        int b = 15;
        String bb = Integer.toString(b);
        System.out.println(bb);

        // Method 3 :
        int c = 298;
        String cc = String.format("%d", c);
        System.out.println(cc);

        // Converting to uppercase and lowercase
        String u = "welcome";
        String l = "WELCOME";
        String lower = l.toLowerCase();
        String upper = u.toUpperCase();
        System.out.println(u);
        System.out.println(upper);
        System.out.println(l);
        System.out.println(lower);
    }
}
