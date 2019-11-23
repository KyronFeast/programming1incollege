/*
public class Test {
  public static void main(String[] args) {
    T t1 = new T(); 
    T t2 = new T(); 
    System.out.println("t1's i = " + 
      t1.i + " and j = " + t1.j);
    System.out.println("t2's i = " + 
      t2.i + " and j = " + t2.j);
  }  
}

class T {
  static int i = 0;
  int j = 0;

  T() {
    i++;
    j = 1;
  }
}*/
/*public class ShowErrors {
     public static void main(String[] args) {
       ShowErrors t = new ShowErrors();
       t.x();
     }
   }*/
  /* public class ShowErrors {
     public static void main(String[] args) {
      ShowErrors t = new ShowErrors(5);
    }
  }*/
 /*public class ShowErrors {
     public void method1() {
       Circle c;
       System.out.println("What is radius "
         + c.getRadius());
       c = new Circle();
     }
   }*/
     public class ShowErrors {
     public static void main(String[] args) {
       C c = new C(5.0);
       System.out.println(c.value);
     }
   }
 
   class C {
     int value = 2;
   }