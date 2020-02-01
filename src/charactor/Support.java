package charactor;
public class Support extends Hero implements Healer {
    int hp=120;
    public static void main(String args[]){
     Support support = new Support();
      Hero h1 = new Hero("h1",(float) 375.333,(float)23.22,200);
      Hero h2 = new Hero("h1",(float) 375.333,(float)23.22,200);
      Hero h3 = new Hero("h1",(float) 375.333,(float)23.22,200);
      Object Heros[] = {h1,h2,h3};
      //heals(Object);
      support.heals(h1,h2,h3);
    }
    void heals(Hero... heros){
      for (int i=0;i<heros.length;i++){
          heal(heros[i].name,hp);
      }
    }
     public void heal(String hero,int hp){
       System.out.println("为"+hero+"恢复了"+hp+"的血量");
    }
}
