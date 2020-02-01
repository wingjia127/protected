import Test.Mortal;

public class Hero {
    String name;
    public void kill(Mortal m){
      m.die();
    }
    public static void main(String args[]){
        Hero garen = new Hero();
        garen.name = "gairen";
        ADAPHero h1 = new ADAPHero();
        ADHero h2 = new ADHero();
        APHero h3 = new APHero();
        garen.kill(h1);
        garen.kill(h2);
        garen.kill(h3);

    }
}
class ADHero implements Mortal{
 public void die(){
   System.out.println("AD,die");
 }
}
class APHero implements Mortal{
    public void die(){
        System.out.println("AP,die");
    }
}
class ADAPHero implements Mortal{
    public void die(){
        System.out.println("ADAP,die");
    }
}
