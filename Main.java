/*Write a function that returns the sum of two integers.*/

import java.util.Scanner;
public class Main{
public static void main(String [] args){
int a,b,sum;
Scanner s= new Scanner(System.in);
a=s.nextInt();s.nextLine();
b=s.nextInt();
int c= sum(a,b);
System.out.println("The sum of the 2 numbers are :"+ c);
}
public static int sum(int a,int b){
int sum=a+b;
return sum;
}}