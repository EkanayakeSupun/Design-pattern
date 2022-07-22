public class BillPayment {
    private  double waterBill,cebBill,phoneBill;

    public BillPayment(Pay pay){
        this.waterBill=pay.waterBill;
        this.cebBill=pay.cebBill;
        this.phoneBill=pay.phoneBill;
    }


    static class Pay{
        private  double waterBill,cebBill,phoneBill;

        public BillPayment pay(){
            return new BillPayment(this);
        }

        public Pay waterBill(double waterBill){
            this.waterBill=waterBill;
            return this;
        }

        public Pay cebBill(double cebBill){
            this.cebBill=cebBill;
            return this;
        }

        public Pay phoneBill(double phoneBill){
            this.phoneBill=phoneBill;
            return this;
        }
    }

    @Override
    public String toString() {
        return "BillPayment{" +
                "waterBill paid=" + waterBill +
                ", cebBill paid=" + cebBill +
                ", phoneBill paid=" + phoneBill +
                '}';
    }
}
