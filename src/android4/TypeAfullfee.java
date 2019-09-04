/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android4;

/**
 *
 * @author hassa
 */
public class TypeAfullfee extends student {
    float total;
    String name;
    
    TypeAfullfee(String s)
    {
        name=s;
    }
     public void calculatefee(int coursecount,float feecount)
    {
         total=coursecount * feecount;
         System.out.println(name+"Total fee is "+total);
    }
}
