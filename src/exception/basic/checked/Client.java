package exception.basic.checked;

public class Client {
    // throws : 발생시킨 예외를 메서드 밖으로 던짐
    public void call() throws MyCheckedException {
        // 문제 상황
        throw new MyCheckedException("ex"); // throw : 예외를 발생시킴
    }
}
