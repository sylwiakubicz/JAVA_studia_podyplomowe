package inner.ilocal;

import java.util.Arrays;

public class LocalInnnerDemo {
    public static void main(String[] args) {
        Outer.localClassInstaniate(args);
    }
}

class Outer {
     public static void localClassInstaniate(String[] args) {
         class LocalClass {
             public String toString() {
                 return "Argumenty metody: " + Arrays.toString(args);
             }
         }

         LocalClass localClass = new LocalClass();
         System.out.println(localClass);
     }

}
