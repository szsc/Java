public class ParallelMethod {
    private int a=1;
    int b=2;
    void new_func(){
        System.out.println("类内调用平行方法new_func()！");
    }
    void func(){
        System.out.println("先调用了func()方法！");
        new_func();//调用平行方法
    }
}
//src源代码目录下且在包外不能有两个重复类名，已经存在Test类，这里不能再建Test类
class Test1{
    public static void main(String[] args) {
        ParallelMethod obj = new ParallelMethod();
        obj.func();
        //类外(类体代码框架之外)不能访问类内的私有成员！
        System.out.println(obj.b);
    }
}
