package oop.inter;

// 인터페이스들끼리 상속이 가능합니다. (다중 상속도 가능)
public interface AdvancedController extends GameController {
    void specialAction();
    void customizeButton(String config);
}
