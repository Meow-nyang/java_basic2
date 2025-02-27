package oop.inherit;

/*
	# 부모 클래스, 상위 클래스 (Parent, super class)

	- 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
	- 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
	 멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
*/

public class Player {

    // 필드
    String nickName;
    int level;
    int hp;

    Player() {
        System.out.println("Player의 기본 생성자 호출!");
        this.level = 1;
        this.hp = 50;
    }

    Player(String nickName) {
        this();
        System.out.println("Player의 2번 생성자 호출!");
        this.nickName = nickName;
    }

    Player(String nickName, int hp) {
        this(nickName);
        System.out.println("Player의 3번 생성자 호출!");
        this.hp = hp;
    }

    // 일반 메서드
    void attack(Player target) {
        if (target == this) {
            System.out.println("타겟이 잘못되었습니다.");
            return;
        }

        System.out.printf("%s이(가) %s을(를) 공격합니다!\n"
                , this.nickName, target.nickName);

        // 맞는 Player의 체력을 10 감소시키자.
        target.hp -= 10;

        // 때리는 Player의 체력은 3 감소시키자.
        this.hp -= 3;

        System.out.printf("%s님의 남은 체력: %d\n", this.nickName, this.hp);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);
    }

    // 현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n======= Character's Info ========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }

}
