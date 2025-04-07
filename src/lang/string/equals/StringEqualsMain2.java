package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(string1, string2));

        String string3 = "hello";
        String string4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(string3, string4));
    }

    private static boolean isSame(String x, String y){
        //return x == y;        // 동일성 비교
        return x.equals(y);     // 동등성 비교!
    }
}
