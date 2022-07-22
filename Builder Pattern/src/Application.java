public class Application {
    public static void main(String[] args) {


        BillPayment.Pay payment=new BillPayment.Pay();
        BillPayment pay = payment.cebBill(1500).waterBill(1000).pay();
        System.out.println(pay);
    }
}
