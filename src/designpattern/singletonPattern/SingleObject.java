
package designpattern.singletonPattern;

/**
 *
 * @author Eugen.Popa
 */
public class SingleObject {
//create an object of SingleObject

   private static final SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public static void showMessage(){
      System.out.println("Zuzu");
   }
   
   public static void testMessage(){
      System.out.println("Cucu");
   }    
}
