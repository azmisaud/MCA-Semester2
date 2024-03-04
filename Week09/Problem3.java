package Week9;

interface interface1{
    void display1();
}
interface interface2{
    void display2();
}
class Demo implements interface1,interface2{
    @Override
    public void display1() {
        System.out.println("Method from interface 1");
    }

    @Override
    public void display2() {
        System.out.println("Method from interface 2");
    }
}
public class Problem3 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display1();
        d.display2();
    }
}
