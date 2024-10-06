package class1.ex;

import java.util.Scanner;

public class ProductOrderScanner {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        Scanner sc = new Scanner(System.in);

        int totalAmount = 0;
        for(int i=0; i<orders.length; i++) {
            ProductOrder order = new ProductOrder();
            order.productName = sc.next();
            order.price = sc.nextInt();
            order.quantity = sc.nextInt();
            orders[i] = order;
            totalAmount += order.quantity * order.price;

        }
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
        System.out.println("총 결제 금액 : " + totalAmount );

    sc.close();
    }
}
