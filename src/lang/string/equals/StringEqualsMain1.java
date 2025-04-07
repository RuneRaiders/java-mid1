package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");

        System.out.println("new String() == 비교: " + (string1 == string2));
        System.out.println("new String() equals 비교: " + (string1.equals(string2)));

        String string3 = "hello";
        String string4 = "hello";

        System.out.println("리터럴 == 비교: " + (string3 == string4));
        System.out.println("리터럴 equals 비교: " + (string3.equals(string4)));
    }
}
