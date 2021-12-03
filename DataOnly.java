class DataOnly {
    static int i;
    static double d = 1.12;
    static boolean b;

    public static void main(String[] args) {
        int i = 999;
        b = false;
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(storage("test"));

        StaticTest s1 = new StaticTest();
        StaticTest s2 = new StaticTest();
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);

        System.out.println(s1.i == s2.i);

        String str1 = "test";
        String str2 = new String("test");
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(args[0]);
        System.out.println(args[1]);
    }

    static int storage(String s) {
        return s.length() * 2;
    }
}