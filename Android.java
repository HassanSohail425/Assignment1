/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android;

import java.util.ArrayList;

/**
 *
 * @author hassa
 */
public class Android {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // ArrayList<projectmanagers> list1=new ArrayList<projectmanagers>();
   // ArrayList<softwaredeveloper> list2=new ArrayList<softwaredeveloper>();
    //ArrayList<interns> list3=new ArrayList<interns>();
    
    
    
    ArrayList<String> list1=new ArrayList<String>();  //array list for storing benefits
    list1.add("project manager receive managerbenefits ");
    list1.add("software devlopr receive dev benfits");
    list1.add("intrns recive basic benfits");
    
    ArrayList<employee> list2=new ArrayList<employee>();  //array list for storing employees
    projectmanagers obj1=new projectmanagers("Hassan is a project manager");
   softwaredeveloper obj2=new softwaredeveloper("Hassan is a software developer");
   interns obj3=new interns("Hassan is a intern");
    
    for(int i=0;i<list1.size();i++)
    {
       // employee temp=list2.get(i);
       // temp=calculatepay(list1.get(i));
        obj1.calculatepay(list1.get(i));
        //obj2.calculatepay(list1.get(i));
        //obj3.calculatepay(list1.get(i));
        
    }
     
       
    }
    
}
