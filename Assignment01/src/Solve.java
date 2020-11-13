/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Solve {

    public static void main(String[] args) {

        int n = 4;
        float cgpa;
        float sum = 0;
        float arr1[] = new float[n];
        float arr2[] = new float[n];

        arr1[0] = 93;  
        arr1[1] = 85;
        arr1[2] = 95;
        arr1[3] = 90;

        for (int i = 0; i < n; i++)// loop for grades
        {
            arr2[i] = (arr1[i] / 10); // count grades
            sum = sum + arr2[i]; // sum of grades

        }
        cgpa = sum / n; // count cgpa
        System.out.println(cgpa + "  "); //print cgpa 
        float result;

    }
}
