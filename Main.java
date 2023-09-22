import Repository.OrderThis;
import Repository.PrimeNumber;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Olá Mundo!");
        //PrimeNumber pn = new PrimeNumber();
        //pn.findPrime(100);
        int[] listMain = {56, 84, 48, 26, 78, 12, 69, 14, 35, 67, 25};
        OrderThis order = new OrderThis();
        order.orderList(listMain);
    }
}
