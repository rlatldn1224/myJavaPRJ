package Exam;

abstract class Fish{
    abstract void swim();
}

class GoldFish extends Fish{//GoldFish클래스는 Fish클래스를 상속받고, 골드피쉬는 피쉬의 하위타입이다.추상메서드인 스윔을 반드시 구현해야 함.
    @Override// 오버라이드는 부모클래스의 메서드를 재정의 한다는 의미이고, 자식클래스가 추상메서드인 스윔의 구현 내용을 제공함.
    void swim() {
        System.out.println("헤엄치고 있습니다.");// 스윔메서드가 호출될때 출력되는 메시지.
    }
}


public class Exam04 {// 프로그램을 실행하기 위한 메인 클래스이고, 클래스의 이름은 파일의 이름과 같아야 함.
    public static void main(String[] args) {//프로그램의 시작이 되는 블록

        Fish fish= new GoldFish();//골드피쉬 객체를 메모리에 생성하고, fish 는 Fish 클래스를 참조할 수 있다.
        fish.swim();//실제 객체가 GoldFish이므로, GoldFish의  swim() 메서드가 호출됨.
    }
}
