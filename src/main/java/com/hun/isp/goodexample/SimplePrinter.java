package com.hun.isp.goodexample;

public class SimplePrinter implements Printer{

    @Override
    public void print() {
        System.out.println("문서를 츨력합니다."); // Printer 인터페이스만 구현하여 해당 클래스에 맞는 함수만 구현 가능.
    }
}
