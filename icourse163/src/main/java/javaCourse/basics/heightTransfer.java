package course.basics;

/**
 * Created by wangzhen on 2018/11/18.
 */
import java.util.Scanner;
public class heightTransfer {
    public static void main(String[] orgs){
        System.out.println("您好");
        Scanner in = new Scanner(System.in);//等待用户输入数据
//        System.out.println("echo:" + in.nextLine());//打印用户输入的数据
//        System.out.println("2+3="+(2+3));
        int price;
        int amount;
        System.out.print("请输入一个整数:");
        price = in.nextInt();
        System.out.print("请输入另一个整数:");
        amount = in.nextInt();
        System.out.print("两个数之和");
        System.out.println(amount+"-"+price+"="+(amount-price));

//计算身高 英尺转换为厘米
        int foot = 0;
        double inch ;
        System.out.print("请输入英尺数:");
        foot = in.nextInt();
        System.out.print("请输入英寸:");
        inch = in.nextDouble();
        System.out.print("您的身高是:");
        System.out.println((int)((foot+inch/12)*0.3048*100));


    }
}
