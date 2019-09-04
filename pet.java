/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android6;

/**
 *
 * @author hassa
 */
public class pet implements animal{
    public void sleep()
    {
        System.out.println("Pet animal sleeps");
        
    }
    public void walk()
    {
        System.out.println("Pet animal walks");
        
    }
    void playwithit()
    {
        System.out.println("Pet animal plays");
    }
   public void eatfood()
   {
    System.out.println("Pets feeded");
   }
   
   void playdead()
   {
       System.out.println("Pet animal plays trick");
   }

   void chaseball()
   {
}


}