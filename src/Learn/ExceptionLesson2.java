package Learn;

public class ExceptionLesson2 extends ExceptionLesson1 {
    protected double overdraftProtection=100000.00;
    protected  double protect;
    public ExceptionLesson2(double balance){
     super(balance);
    }
    public ExceptionLesson2(double balance,double protect){
     super(balance);
     this.protect = protect;
    }
    protected  void withdraw(double money) throws OverdraftException{
        double drawMoney = overdraftProtection-money;
         new ExceptionLesson1().deficit(drawMoney);
    }
    public static void main(String args[]) throws OverdraftException{
       new ExceptionLesson2(2222.00).withdraw(10000.00);
    }

}
