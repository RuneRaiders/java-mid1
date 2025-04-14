package nested.local;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar){

        int localVar = 1;   // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수봐다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? -> 동기화 문제 발생
        //localVar = 10; // Variable 'localVar' is accessed from within inner class, needs to be final or effectively final
        //paramVar = 20; // Variable 'paramVar' is accessed from within inner class, needs to be final or effectively final
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print(); // process()의 스택 프레임이 사라진 후에 실행
    }
}
