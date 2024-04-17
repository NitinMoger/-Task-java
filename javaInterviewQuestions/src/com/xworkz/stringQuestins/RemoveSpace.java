package com.xworkz.stringQuestins;

public class RemoveSpace {

    public static void main(String[] args) {
                String str = "This is a sample string with spaces";

                String stringWithoutSpaces = removeSpaces(str);
                System.out.println("Original string: " + str);
                System.out.println("String without spaces: " + stringWithoutSpaces);
            }
            public static String removeSpaces(String str) {
                char[] chars = str.toCharArray();
                StringBuilder sb = new StringBuilder();

                for (char c : chars) {
                    if (c != ' ') {
                        sb.append(c);
                    }
                }

                return sb.toString();
    }
}
