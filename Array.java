package company;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the numbers");
        for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);

    }

}
