package hello.core.singleton;

public class StatefulService {

    private int price; // 상태를 유지하는 필드

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; // 여기가 문제!
    }

    /** stateless 로 변경하는 방법 : 아래 order 메소드로 변경한다. */
//    public int order(String name, int price) {
//        System.out.println("name = " + name + " price = " + price);
//        return price;
//    }
    /** stateless 로 변경하는 방법 : 아래 메소드는 필요없으니 지운다. */
    public int getPrice() {
        return price;
    }
}
