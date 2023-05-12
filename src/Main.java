public class Main {
    public static void main(String[] args) {
        System.out.println(Main.gd(20));
        System.out.println(Main.gd(702));
        System.out.println(Main.gd(0));

    }

    public static String gd(int code) {
        String cod = "";
        int[] num = {702, 1082, 1083, 1114, 1184, 1266, 12403, 20, 21,
                23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396};

        for (int i = 0; i < num.length; i++) {
             switch (code) {
                case 702, 1082, 1083, 1114, 1184, 1266, 12403 -> cod = "DATE";
                case  20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396 -> cod = "NUMERIC";
                default -> cod = "String";
            };
        }
        return cod;
    }
}

