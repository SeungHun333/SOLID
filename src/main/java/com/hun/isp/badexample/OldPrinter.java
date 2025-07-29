package com.hun.isp.badexample;

public class OldPrinter implements Machine{  // Machine 인터페이스의 일부 기능만 사용하지만, 모든 메서드를 구현해야 하기 때문에 ISP 위반
    @Override
    public void print() {
        System.out.println("문서를 정상적으로 출력할 수 있습니다.");
    }

    @Override
    public void scan() {
        // 오래된 프린터 이기 때문에 스캔 기능이 없음
    }

    @Override
    public void fax() {
        // 오래된 프린터 이기 때문에 팩스 기능이 없음
    }
}
