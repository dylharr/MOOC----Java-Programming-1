public class Debt {
    
    private double balance;
    private double interestRate;
    
    public Debt(double intitialBalance, double initialInterestRate) {
        this.balance = intitialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance() {
        System.out.print(this.balance);
    }
    
    public void waitOneYear() {
        this.balance  = (this.balance)*(this.interestRate);
    }
}
