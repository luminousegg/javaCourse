package book.com.company;

/**
 * Created by wangzhen on 2018/9/21.
 * 每个类都有构造方法。如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法。

 在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
 */
public class Puppy{
    int puppyAge;
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + puppyAge );
        return puppyAge;
    }

    public static void main(String []args){
      /* 创建对象 */
        Puppy myPuppy = new Puppy( "tommy" );
        //以下是访问实例变量和方法
      /* 通过方法来设定age */
        myPuppy.setAge( 2 );
      /* 调用另一个方法获取age */
        myPuppy.getAge( );
      /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.puppyAge );
    }
}

