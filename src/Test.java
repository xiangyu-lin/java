import javax.xml.namespace.QName;

public class Test {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setLegs(100);
        System.out.println(p1.getLegs());
        Customer1 james = new Customer1();
        james.deposit(1000);
        james.withdraw(1);
        james.withdraw(100000);
        Student s1 = new Student();
        System.out.println(s1.getName());
    }
}


class Person1 {
    private int legs = 1;
    public void setLegs(int l){
        this.legs = l;
    }

    public int getLegs() {
        return this.legs;
    }
}

class Customer1{
    protected String name = "Jane Smith";
    private int count = 20000;

    public void deposit(int count){
        this.count += count;
        System.out.println("成功存入" + count);
        System.out.println("余额：" + this.count);
    }

    public void withdraw(int count){
        this.count -= count;
        if(this.count < 0){
            System.out.println("余额不足。");
            return;
        }
        System.out.println("成功取款" + count);
        System.out.println("余额：" + this.count);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}