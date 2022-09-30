public class StringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        String mesaj1 = "               Bugun hava cok guzel.                    ";
        char[] karakterler = new char[5];
        System.out.println(mesaj);

//        System.out.println("Karakter sayisi: " + mesaj.length());
//        System.out.println("5. eleman: " + mesaj.charAt(4));
//        System.out.println(mesaj.concat(" Yasasin!"));
//        System.out.println(mesaj.startsWith("B"));
//        System.out.println(mesaj.endsWith(","));
//        mesaj.getChars(0, 5, karakterler, 0);
//        for (char item : karakterler) {
//            System.out.print(item + " ");
//        }
//        System.out.println("");
//        System.out.println(mesaj.indexOf("av"));
//        System.out.println(mesaj.lastIndexOf("a"));
        System.out.println(mesaj.replace(" ", "_"));
        System.out.println(mesaj.substring(2, 5));
        System.out.println("**********");
        for (String i : mesaj.substring(0, mesaj.length() - 1).split(" ")) {
            System.out.println(i);
        }
        System.out.println("**********");

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println("*************************************");
        System.out.println(mesaj1);
        System.out.println(mesaj1.trim());

    }
}
