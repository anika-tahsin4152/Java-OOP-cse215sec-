/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class T2 {
    public static void main(String[] args) {
        T1 obj= new T1(15,20);
        obj.add(obj);
        T1 obj1= new T1(15,20);
        obj1.add(obj1);
    }
}
