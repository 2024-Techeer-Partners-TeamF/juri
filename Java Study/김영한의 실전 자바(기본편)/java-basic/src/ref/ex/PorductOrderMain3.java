package ref.ex;

import java.util.Scanner;

public class PorductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //주문 개수 입력
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int num = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[num];

        //주문 정보 생성
        for(int i=0; i<orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명 : ");
            String productName = sc.next();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); //입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);

        }

        //상품 주문 정보 출력
        printOrders(orders);

        //총 결제 금액 계산
        getTotalAmount(orders);

        //총 결제 금액 출력
        System.out.println("총 결제 금액 : " + getTotalAmount(orders));

        sc.close();
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);

        }
        //for문
//        for(int i=0; i<orders.length; i++){
//            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
//        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int amount = 0;
        for(int i=0; i<orders.length; i++){
            amount += orders[i].quantity * orders[i].price;
        }
        return amount;
    }
}
