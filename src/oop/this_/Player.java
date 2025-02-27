package oop.this_;

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


    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}
