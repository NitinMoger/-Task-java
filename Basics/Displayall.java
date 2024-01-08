public class Displayall {
        static String display(String[] names) {
            if (names.length == 0)
            {
                return "no one likes this";
            }
            else if (names.length == 1)
            {
                return names[0] + " likes this";
            }
            else if (names.length == 2)
            {
                return names[0] + " and " + names[1] + " like this";
            }
            else if (names.length == 3)
            {
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            }
            else
            {
                int othersCount = names.length - 2;
                return names[0] + ", " + names[1] + " and " + othersCount + " others like this";
            }
        }
    
        public static void main(String[] args)
        {
            System.out.println(display(new String[]{}));
            System.out.println(display(new String[]{"Peter"}));
            System.out.println(display(new String[]{"Jacob", "Alex"}));
            System.out.println(display(new String[]{"Max", "John", "Mark"}));
            System.out.println(display(new String[]{"Alex", "Jacob", "Mark", "Max"}));
        }
    }
}
