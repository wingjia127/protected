package Learn;

public class CharLesson3 extends CharLesson1{
    static String repeatStr[] = new String[100];
    static StringBuffer repeat_str = new StringBuffer();
    public static void main(String args[]){
        /*100个随机字符串中查找统计重复字符*/
      for (int i=0;i<repeatStr.length;i++){
         repeatStr[i] = new CharLesson1().create(2);
      }
      int row=0;
      while (row<5){
          int col=0;
           while (col<20){
                   System.out.print(repeatStr[20*row+col]+" ");
             col++;
           }
           System.out.println(" ");
           row++;
      }
      int count=0;
      for (int i=0;i<repeatStr.length;i++){
          for (int j=i+1;j<repeatStr.length;j++){
              if(repeatStr[i].equals(repeatStr[j])){
                count++;
                if(repeat_str.indexOf(repeatStr[i])!=0){
                    repeat_str.append(repeatStr[i]+" ");
                }

              }else{
                  continue;
              }
          }
      }
      System.out.println("重复字符共计："+count+"种");
        System.out.println(repeat_str.toString());
        /**
         * 字符串String 与字符串数组StringBuffer的性能比较
         * */
        String str=new String();
        StringBuffer stringBuffer=new StringBuffer();
        long startTime;
        long endTime;
        long spendTime;
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            if(str.isEmpty()){
                str = new CharLesson1().create(10);
            }else{
                str = str+new CharLesson1().create(10);
            }
        }
        endTime = System.currentTimeMillis();
        spendTime = endTime-startTime;
        System.out.println("String 耗时"+spendTime+"毫秒");

        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
           stringBuffer.append(new CharLesson1().create(10));
        }
        endTime = System.currentTimeMillis();
        spendTime = endTime-startTime;
        System.out.println("stringBuffer 耗时"+spendTime+"毫秒");
    }

}
