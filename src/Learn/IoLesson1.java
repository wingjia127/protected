package Learn;
import java.io.*;
public class IoLesson1 {
  private static void split(File srcFile,int splitSize) throws IOException{
      if(srcFile.length()<splitSize*1024){
          throw  new IOException("文件容量不足,无法拆分！");
      }
      FileInputStream srcF = new FileInputStream(srcFile);
      int splitCut = (int)srcFile.length()/(splitSize*1024);
      int file_length = 0;
      byte[] all = new byte[(int)srcFile.length()];
      srcF.read(all);
      for (int i=0;i<=splitCut;i++){
        String newFileName = srcFile+"_"+i;
        FileOutputStream outputStream = new FileOutputStream(newFileName);
        int write_length = (int)srcFile.length()-i*splitSize*1024;
        if(write_length>i*splitSize*1024){
            write_length = splitSize*1024;
        }
        int offSite = i*splitSize*1024;
        outputStream.write(all,offSite,write_length);
        System.out.printf("%s的字节大小为：%d",newFileName,write_length);
          System.out.println("");
      }
  }
  /**
   * 合并文件
   * @param   merPath 当前文件夹路径
   * @param   size 文件大小
  * */
  private static void merge(String merPath,int size) throws IOException{
      File parentFile = new File(merPath);
      File[] filesArray = parentFile.listFiles();
      String strPath = filesArray[0].getAbsolutePath();
      String newPath = strPath.substring(0, strPath.length() - 2);
      long fileLength = 0;
      for (int i = 0; i < filesArray.length; i++) {
          fileLength += filesArray[i].length();
      }
      byte[] all = new byte[(int)fileLength];
      for (int i = 0; i < filesArray.length; i++) {
          FileInputStream fis = new FileInputStream(filesArray[i]);
          if (i < filesArray.length - 1) {
              fis.read(all, i*size*1024, size*1024);
          }
          else {
              fis.read(all, i*size*1024, all.length - i*size*1024);
          }
          fis.close();
      }
      File destFile = new File(newPath);
      FileOutputStream fos = new FileOutputStream(destFile);
      fos.write(all);
      fos.close();
      System.out.printf("文件已合并为%s%n",destFile);
  }
  public static void main(String args[]) throws IOException{
    File srcFile = new File("/Users/xuhongchu/Downloads/plupload.full.min.js");
    String merPath = "/Users/xuhongchu/Downloads/IOtest";
    split(srcFile,50);
      merge(merPath,50);
  }
}
