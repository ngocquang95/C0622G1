package ss7_abstract_interface._abstract.model;

public class Cat extends Animal  implements EatAble{
    //    @Override
    public void test() {
        System.out.println("Cat test()");
    }

    @Override
    public void run() {
        System.out.println("Mèo chạy 4 chân");
    }

    @Override
    public void eat() {

    }

//    @Override
//    public void test2() {
//        System.out.println("Cat test()");
//    }
}
