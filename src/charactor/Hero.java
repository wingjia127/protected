package charactor;

public class Hero {
        public String name;
        float hp;
        float Armor;
        int moveSpeed;

//        private Hero(){
//
//        }
//        private static Hero hero = new Hero();
//        public static Hero getInstance(){
//          return  hero;
//        }
    public  Hero(){

    }
    public Hero(String heroName){
        name = heroName;
    }
    public Hero(String heroName,float heroHp){
            name = heroName;
            hp = heroHp;
        }
        public Hero(String heroName,float heroHp,float heroArmor,int heroMoveSpeed){
            this(heroName,heroHp);
            Armor = heroArmor;
            moveSpeed = heroMoveSpeed;
        }
    }
