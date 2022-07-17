package com;
/*
本模块名称为Companany.java，它是平行于com.what包的一个模块文件，也就是说，本模块位于com.what包之外
 */
import com.what.Module;

public class Company {
    public int Total;
    public String Depart;
    public void getDepart(){
        System.out.println("管理部 财务部 技术部 宣传部");
    }
}
class normalClass{
    String desc="公司描述";
    public static void main(String[] args) {   //main方法可以放在非Public类内
        Module module=new Module();
        module.output();
    }
}
class Test{
    int a=1;

    public static void main(String[] args) {
        Company obj=new Company();
        obj.getDepart();
    }
}

