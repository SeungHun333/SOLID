package com.hun.isp.goodexample;

public class MultiFunctionPrinter implements Printer, Scanner, Fax{

    public void print() {
        System.out.println("문서를 출력합니다.");
    }

    public void scan() {
        System.out.println("문서를 스캔합니다.");
    }

    public void fax() {
        System.out.println("문서를 팩스로 보냅니다.");
    }

    // 모든 기능을 사용할 수 있는 프린터는 사용할 수 있는 interface를 채택하여 함수를 구현할 수 있음.
}
