
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hridi
 */
public class T4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int size = 12;
        int arr[] = new int[size];
        Scanner num = new Scanner(System.in);
        
        for (int i = 0; i < size; i++) {
            arr[i] = num.nextInt();
        }
        for (int i = 3; i < size; i++) {
            if (arr[i] == arr[i - 1]) {
                if (arr[i - 1] == arr[i - 2]) {
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }
}
// it's not working and i cann't find out vaia .