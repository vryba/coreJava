package InheritanceDemo;

public class ChildClass2 extends BaseClass{

        public static void main(String[] args) {
    	
    	BaseClass obj1 =new ChildClass2();
    	
    	obj1.add();
    	obj1.subs();
    	
        }
        public void mul() {
    	System.out.println("I and in Child class and * is 2500");
        }
        public void div() {
    	System.out.println("I and in Child class and div is 50");
        }
    }
