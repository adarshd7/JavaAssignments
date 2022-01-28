package Assignment.Assignment7.Question3;

public class Child extends Parent implements Interface4{
    void method_1(Interface1 i1){
        i1.method1();
        i1.method2();
    }
    void method_2(Interface2 i2){
        i2.method3();
        i2.method4();
    }
    void method_3(Interface3 i3){
        i3.method5();
        i3.method6();
    }
    void method_4(Interface4 i4){
        i4.method7();
    }
}
