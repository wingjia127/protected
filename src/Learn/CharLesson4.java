package Learn;

public class CharLesson4 implements IStringBuffer{
    private  int capacity = 32;
    private static int CharSequence=0;
    char [] dynamicChar;
    private String dynamicString = new String();
    int size;
    public CharLesson4(){
       dynamicChar = new char[capacity];
    }
    public CharLesson4(int charSequence){
       if(charSequence<capacity)
           return;
        this.dynamicChar = new char[charSequence];
    }
    public CharLesson4(char chr){
        dynamicChar[0] = chr;
        CharSequence = dynamicChar.length;
    }
    public CharLesson4(String str){
        this();
        if(str.length()>CharSequence)
            capacity=dynamicChar.length*2;
            dynamicChar = new char[capacity];
        if(capacity>=str.length())
            System.arraycopy(str.toCharArray(),0,dynamicChar,0,str.length());
        CharSequence = str.length();
    }
    private boolean OutOfRanfe(int pos)throws IndexIsOutofRangeException{
       if(pos>capacity){
           throw  new IndexIsOutofRangeException("超出范围");
       }
       if(pos<0){
           throw  new IndexIsOutofRangeException("字符下标为负数");
       }
       return false;
    }
    public  void append(String str){
      try {
          insert(this.dynamicChar.length-1,str);
      }catch (IndexIsOutofRangeException e){
          System.out.println("异常的具体原因:"+e.getMessage());
      }

    }
    public void append(char chr){

        insert(this.dynamicChar.length-1,chr);
    }
    //指定位置插入字符
    public void insert(int pos,char b){
      if(pos<0){

      }else if((pos-1)>CharSequence){

      }




    }
    //指定位置插入字符串
    public void insert(int pos,String b) throws IndexIsOutofRangeException{
        if(!OutOfRanfe(pos)){

        }
        while (CharSequence+b.length()>capacity){
            capacity = (int) ((CharSequence+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(dynamicChar, 0, newValue, 0, CharSequence);
            dynamicChar = newValue;
        }
        char[] cs = b.toCharArray();
        //先把已经存在的数据往后移
        System.arraycopy(dynamicChar, pos, dynamicChar,pos+ cs.length, CharSequence-pos);
        //把要插入的数据插入到指定位置
        System.arraycopy(cs, 0, dynamicChar, pos, cs.length);
    }
    //从开始位置删除剩下的
    public void delete(int start){

    }
    //从开始位置删除结束位置-1
    public void delete(int start,int end){

    }
    //反转
    public void reverse(){
        for (int i = 0; i < CharSequence / 2; i++) {
            char temp = dynamicChar[i];
            dynamicChar[i] = dynamicChar[CharSequence - i - 1];
            dynamicChar[CharSequence - i - 1] = temp;
        }
    }
    public String toString() {
        char[] realValue = new char[CharSequence];
        System.arraycopy(dynamicChar, 0, realValue, 0, CharSequence);
        return new String(realValue);
    }
    //返回长度
    public int length(){
     return dynamicChar.length;
    }
    public static void main(String args[]) throws IndexIsOutofRangeException{
        CharLesson4 str = new CharLesson4("uid");
        str.reverse();
        System.out.println(str);
        //str.append("jdkfasfafasfasfavszdasdasdasdsadaxzczczcx");
        //try {
            str.insert(2,"opd");
        //} catch (IndexIsOutofRangeException e) {
          //  e.printStackTrace();
        //}
        System.out.println(str);
    }
}
class IndexIsOutofRangeException extends Exception{
    public IndexIsOutofRangeException(){

    }
    public IndexIsOutofRangeException(String msg){
      super(msg);
    }
}
