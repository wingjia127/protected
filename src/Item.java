import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Item {
    String name;
    int price;
    double blood;
    int speed;
    int move;
    public static void main(String args[]){
     Item p1=new Item();
     p1.name = "测试";
     p1.price=6300;
     p1.blood = 375.0;
     p1.speed=350;
     p1.showHp();
     p1.moveSpeed();
     p1.lengenTory();
    }
    private  static  Item item;
    public String toString(){
      return  name;
    }
    public boolean equals(Object c){
      if(c instanceof Item){
          Item d = (Item) c;
          return this.speed==d.speed;
      }
      return  false;
    }
    public void finalize(){
      System.out.println("已回收了！");
    }
    private Item(){

    }
    public static Item getInstance(){
        if(null==item){
            item = new Item();
        }
        return  item;

    }

     void lengenTory(){
        System.out.println(name+"超神了！");
     }
     void showHp(){
        System.out.println(name+"这个人的初始血量为："+blood);
     }
     void  moveSpeed(){
         move+= speed;
         System.out.println(name+"这个人移动了："+move);
     }
}
