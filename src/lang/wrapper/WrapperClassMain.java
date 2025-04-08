package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);       // 'Integer(int)' is deprecated since version 9 and marked for removal -> 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10);   // -128 ~ 127 까지는 자바가 미리 만들어놓은 것을 반환, 불변
        Long longObj = Long.valueOf(10);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));            // false
        System.out.println("equals: " + (newInteger.equals(integerObj)));   // true
    }
}
