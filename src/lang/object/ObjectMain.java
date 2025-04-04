package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // toString() 은 Object 클래스의 메서드
        String str = child.toString();
        System.out.println(str);
    }
}
