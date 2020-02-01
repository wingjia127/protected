package Learn;

public class ExceptionLesson1{
    protected  double balance;
    protected  double deficit;
    protected  boolean deficit(double money) throws OverdraftException{
         if(money<0){
             throw new OverdraftException("透支异常！",0);
         }
         if(money>0){
             throw new OverdraftException("当前可用额度为：",money);
         }
         return false;
    }
    public  ExceptionLesson1(){

    }
    public ExceptionLesson1(double init){
        balance = init;
    }
    protected  double getBalance(){
      return balance;
    }
    protected  double deposit(double money){
       balance += money;
       return balance;
    }
    protected  void withdraw(double money) throws OverdraftException{
      double drawMoney = balance-money;
          if(!deficit((drawMoney))){

          }else{
              balance -= money;
          }

    }

    public static void main(String args[]) throws OverdraftException{
        ExceptionLesson1 exceptionLesson1 = new ExceptionLesson1(9999.00);
        exceptionLesson1.deposit(100000.00);
        double balance = exceptionLesson1.getBalance();
        System.out.println(balance);
        exceptionLesson1.withdraw(42000.00);
    }
}
