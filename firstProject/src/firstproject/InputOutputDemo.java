package firstproject;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String args[]){
        int a[];
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = Integer.parseInt(sc.nextLine());
        a = new int[n];
        for (i=0;i<n;i++){
            System.out.print("ENter the " + (i+1) + "/" + n + " element: ");
            //a[i] = Integer.parseInt(sc.nextLine());
            a[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.print("Enter value: ");
        for(i=0;i<n;i++){
            System.out.format("%5d",a[i]);
        }
        int S=0;
        for(int x:a) S+=x;
        System.out.print("\nSum of value: " + S);
    }
}
