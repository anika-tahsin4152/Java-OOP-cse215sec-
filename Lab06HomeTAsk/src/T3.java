
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
public class T3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[3][3];

        num[0][0] = 3;
        num[0][1] = 4;
        num[0][2] = 9;
        num[1][0] = 9;
        num[1][1] = 11;
        num[1][2] = 0;
        num[2][0] = 4;
        num[2][1] = 6;
        num[2][2] = 0;

        System.out.println(num[0][0] + " " + num[0][1] + "  " + num[0][2]);
        System.out.println(num[1][0] + " " + num[1][1] + " " + num[1][2]);
        System.out.println(num[2][0] + " " + num[2][1] + "  " + num[2][2]);

        int sumOfRow = 0;
        int sumOfColumn = 0;
        int sumOfDiagonal = 0;
        int sumOfAntiDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumOfRow += num[i][j];
                if (i == j) {
                    sumOfDiagonal += num[i][j];
                }
            }
            System.out.println(+(i + 1) + " : " + sumOfRow);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumOfColumn += num[i][j];

            }
            System.out.println(+(i + 1) + " : " + sumOfColumn);
        }
        int a = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = a; j >= 0; j--) {

                sumOfAntiDiagonal += num[i][j];
                a--;
            }
        }
        System.out.println("Sum of Diagonal : " + sumOfDiagonal);
        System.out.println("Sum of AntiDiagonal : " + sumOfAntiDiagonal);
    }
}
