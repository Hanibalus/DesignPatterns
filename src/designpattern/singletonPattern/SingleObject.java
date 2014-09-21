/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
      System.out.println("Hello World!");
   }    
}
