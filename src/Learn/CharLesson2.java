package Learn;

public class CharLesson2 {
    private static String str1 = "let there be light";
    private static String subSentences[] = str1.split(" ");
    static StringBuffer str1_up = new StringBuffer();

    static String str2 = "peter piper picked a peck of pickled peppers";
    static String subSentences2[] = str2.split(" ");

    static String str3 = "lengendary";
    static char []subSentences3 = str3.toCharArray();
    static StringBuffer str3_up = new StringBuffer();

    static String str4="Nature has given us that two ears, two eyes, " +
            "and but one tongue, to the end that we should hear " +
            "and see more than we speak";
    /*替换目标字符串,同时首字母大写*/
    protected static String replace_str(String old_str,String target_str){
      int target_index = old_str.lastIndexOf(target_str);
      String new_str = old_str.substring(0,target_index)+old_str.substring(target_index,target_index+1
      ).toUpperCase()+old_str.substring(target_index+1);
      return  new_str;
    }

    public static void main(String args[]){
        /*字符串首字母改大写联系*/
        for (int i=0;i<subSentences.length;i++){
                char a= Character.toUpperCase(subSentences[i].charAt(0));
                String str_up = a+subSentences[i].substring(1) ;
                //System.out.println(str1_up);
                str1_up.append(str_up+" ");
        }
        System.out.println(str1_up);
        /*统计字符个数*/
        int count = 0;
        for(String str_count:subSentences2){
           if(str_count.charAt(0)=='p'){
               count++;
           }
        }
        System.out.println(count);
        /*间隔字符大写*/
        for (int i=0;i<subSentences3.length;i++){
            if(i%2==0){
                char upChar = Character.toUpperCase(subSentences3[i]);
                str3_up.append(upChar);
            }else{
                str3_up.append(subSentences3[i]);
            }
        }
        System.out.println(str3_up);
        /*最后一个字符大写*/
        int str3_len = str3.length()-1;
        //char upChar = Character.toUpperCase(subSentences3[str3_len]);
        for (int i=0;i<subSentences3.length;i++){
            if(i==str3_len){
                char upChar = Character.toUpperCase(subSentences3[i]);
                str3_up.append(upChar);
            }else{
                str3_up.append(subSentences3[i]);
            }
        }
        System.out.println(str3_up);
        /*字符串中最后一截字符的首字母大写*/
         String replace_str = replace_str(str4,"two");
         System.out.println(replace_str);
    }
}
