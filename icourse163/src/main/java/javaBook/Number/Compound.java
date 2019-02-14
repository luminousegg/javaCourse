package book.Number;

/**
 * Created by wangzhen on 2017/5/16.
 * 复合语句说明
 *
 */
public class Compound {
    public static void main(String[]args){
        int x = 20;
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b=y>z;
                System.out.println(b);
            }
        }
        String word = "hello JAVA";
        System.out.println(word);
    }
}
//11到20行是一个复合语句，16到19也是一个复合语句