package ref.ex;

public class PorductOrderMain2 {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        //상품 주문 생성 후 배열에 저장
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        //상품 주문 정보 출력
        printOrders(orders);

        //총 결제 금액 계산
        getTotalAmount(orders);

        //총 결제 금액 출력
        System.out.println("총 결제 금액 : " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(int i=0; i<orders.length; i++){
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int amount = 0;
        for(int i=0; i<orders.length; i++){
            amount += orders[i].quantity * orders[i].price;
        }
        return amount;
    }
}
