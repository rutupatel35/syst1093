/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author mit30
 */
public class displayData {
     public static void main(String args[]) {
        students[] s = new students[2];
        Scanner scan= new Scanner(System.in);
        int i;
        for(i=0; i<s.length; i++)
        {
            s[i] = new students();
            System.out.println("ENTER ID");
           s[i].setId(scan.nextInt());
           System.out.println("enter the name");
           s[i].setName(scan.next());
        }
        for (students item : s)
        {
        System.out.println("id " + item.getId()+"name:"+item.getName());
        
    }
        
    }
    
    
}
