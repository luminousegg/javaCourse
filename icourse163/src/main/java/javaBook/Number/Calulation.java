package book.Number;

/**
 * Created by wangzhen on 2017/5/16.
 * 逻辑计算，返回TRUE  FALSE
 */
public class Calulation {
    public static void main(String[]args){
        int a = 2;
        int b = 5;
        boolean reslut = ((a>b)&&(a!=b));
        boolean reslut2 = ((a>b)||(a!=b));
        //三元运算符，表达式30>40运算结果返回真，那么Boolean类型的b变量取值为TRUE
        boolean c=30>40?true:false;
        System.out.println(reslut);
        System.out.println(reslut2);
        System.out.println(c);

    }
}
