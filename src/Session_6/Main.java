package Session_6;

public class Main {
    public static void main(String args[]){
      Asian asian = new Asian();
     // Human human = new Human();
        EUInterface eu = new EUInterface() {
            @Override
            public void sayHello() {
                System.out.println("say Hello..");
            }
        };
        eu.sayHello();
    }
}
