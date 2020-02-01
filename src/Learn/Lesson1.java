package Learn;

import charactor.Hero;

import java.util.ArrayList;

public class Lesson1 extends Hero {
    public static ArrayList heros = new ArrayList();
    public static void main(String args[]){
      for (int i=0;i<5;i++){
          heros.add(new Hero("hero "+i));
      }
        Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
      for (Hero h:hs){
         if(h.name.equals("hero 1")){
             System.out.println("find");
         }
      }
      //System.out.println(heros);
    }
}
