package queues;

 class PrintJob {
    String userName;
    String receiptId;

    public PrintJob(String userName, String receiptId){
        this.userName=userName;
        this.receiptId = receiptId;
    }
    @Override
    public String toString(){
        return "Receipt ID : "+receiptId + "| Printed by: "+ userName;
    }
}
