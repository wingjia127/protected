package Learn;

public class CharLesson1 {

    static char before;
    static char after;
    static String beforeString;
    static String nextString;
    public String create(int length){
        char[] create_char = new char[length];
        int j=0;
        for (int i=0;i<1000;i++){
            char k = (char)(Math.random()*75+48);
            if(Character.isLetterOrDigit(k)){
                create_char[j++] = k;
            }else{
                continue;
            }
            if(j==create_char.length){
                break;
            }
        }
        return new String(create_char);

    }
    public static void main(String args[]){
        String [] random_str = new String[8];
        for (int i=0;i<random_str.length;i++){
            random_str[i] = new CharLesson1().create(5);
            System.out.printf("%s",random_str[i]);
        }
        System.out.println("");
        for (int i=0;i<random_str.length;i++){
            for (int j=i+1;j<random_str.length;j++){
                if(Character.isUpperCase(random_str[i].charAt(0))){
                    before = Character.toUpperCase(random_str[i].charAt(0));
                    after  = Character.toUpperCase(random_str[j].charAt(0));
                }else if (Character.isLowerCase(random_str[i].charAt(0))){
                    before = Character.toLowerCase(random_str[i].charAt(0));
                    after  = Character.toLowerCase(random_str[j].charAt(0));
                }else{
                    before = random_str[i].charAt(0);
                    after  = random_str[j].charAt(0);
                }
                beforeString = random_str[i];
                nextString = random_str[j];
                if(after<before){
                    random_str[i] = nextString;
                    random_str[j] = beforeString;
                }
            }
        }
        for (int i=0;i<random_str.length;i++){
            System.out.println(random_str[i]);
        }
        String match = new CharLesson1().create(3);
        for (int i=0;i<Integer.MAX_VALUE;i++){
            String input = new CharLesson1().create(3);
            if(match.equals(input)){
                System.out.println(input);
                break;
            }
        }
        System.out.println(match);

    }
}
