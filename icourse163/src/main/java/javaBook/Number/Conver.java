package book.Number;

/**
 * Created by wangzhen on 2017/5/16.
 * 类型隐形转换和显性转换
 */
public class Conver {
    public static void main(String[]args){
        byte mybyte = 127;
        int myint = 150;
        float myfloat = 452.12f;
        char mychart = 10;
        double mydouble = 45.23234;
        //隐形转换
        System.out.println("byte型与float型数据进行运算结果为："+(mybyte+myfloat));
        System.out.println("byte型与int型数据进行运算结果为："+(mybyte+myint));
        //显性转换
        int a=(int)mydouble;
        System.out.println(a);
        //单行注释

        /*
        多行注释
         */
    }
}
