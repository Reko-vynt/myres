/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.main;

import static math.ulti.MathUtilty.getFactorial;
import static math.ulti.MathUtilty.PI;

/**
 *
 * @author VY
 */
public class Main {
    public static void main(String[] args) {
        //khu vuc ta test thu ham
        // dung mat de so sanh 
        long expected=120;
        long actual=getFactorial(5);
        System.out.println("Expected:"+expected+": Actual:"+actual);
        //tinh 6!
        System.out.println("6!="+getFactorial(6));
        
        //tinh 1 if tinh 0!
        System.out.println("0!:="+getFactorial(0));
        
        //thong bao loi
        System.out.println("-5!=:"+getFactorial(-5));
        //in thu pi coi giong ben math.pi
        System.out.println("Pi:"+PI);
    }
}
