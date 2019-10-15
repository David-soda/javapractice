package practice;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input your name:");
        String name=sc.nextLine();
        System.out.println("input your age:");
        int age=sc.nextInt();
        System.out.println("input your salary:");
        float salary=sc.nextFloat();
        System.out.println("your information:");
        System.out.println("name:"+name+"\n"+"age:"+age+"\n"+"salary:"+salary);


        }
    }
