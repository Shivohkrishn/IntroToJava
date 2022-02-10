class Test {
    int a = 10;
    int b = 20;
   }

class Child extends Test {
    int a = 100;
    int b = 200;
    void add(int a, int b){
        System.out.println("This is local: "+(a+b));
        System.out.println("This is Super: " +(super.a+super.b));
    }
    public static void main(String[] args) {

        Child child = new Child();
        child.add(2000,1000);


    }
}