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
public class TypeBScholar extends student{
    float total;
    float discounttotal;
    String name;
    
    TypeBScholar(String s)
    {
        name=s;
        
    }
    void calculatefee(int coursecount,float feecount)
    {
        total=coursecount*feecount;
        discounttotal=total*50;
        discounttotal=discounttotal/100;
        total=total-discounttotal;
     System.out.println(name+"Total fee is "+total);
    }
}
