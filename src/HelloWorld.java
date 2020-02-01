import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]){
        Scanner inputData = new Scanner(System.in);
        System.out.print("请输入身高：");
        double height = inputData.nextDouble();
        System.out.println(" ");

        System.out.print("请输出体重：");
        double weight = inputData.nextDouble();

        double BMI = weight/(height*height);
        System.out.println("您的BMI值为："+BMI);
    }
}
