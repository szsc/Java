public class StaticMethod {
    public static int count = 1;    // 定义静态变量count
    public static int static_method() {
        // 静态方法method2
        count += count;    // 访问静态变量count并赋值
        System.out.println("调用静态方法！");
        return count;
    }
    public static void main(String[] args) {
        StaticMethod sft = new StaticMethod();
        // 直接调用静态方法
        System.out.println("static_method()方法返回值是"+static_method());
    }
}