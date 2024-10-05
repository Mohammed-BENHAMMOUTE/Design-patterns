public class BankTransferPayement implements PayementStrategy{
    private String accountNumber;
    private String bankCode;
    private String branchCode;

    public BankTransferPayement(String accountNumber, String bankCode, String branchCode){
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
        this.branchCode = branchCode;
    };

    @Override
    public boolean Pay(float amount) {
        System.out.println("For brevity, we are not validating the bank transfer details");
        System.out.println("Payment of " + amount + " made with bank transfer");
        return true;
    }
}