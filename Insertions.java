/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleksandar.crud;

import java.util.Scanner;

/**
 *
 * @author aleksandar
 */
public class Insertions {
    
    public static int readInt(){
        int result = 0;
        while(result == 0){
        try{
            Scanner opt = new Scanner(System.in);
            result = opt.nextInt();
        }catch(Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        }
        return result;
    }
    public static String readString(){
        String str = "";
        try{
            Scanner opt = new Scanner(System.in);
            str = opt.nextLine();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return str;
    }
    public static double readDouble(){
        double result = 0;
        while(result == 0){
        try{
            Scanner opt = new Scanner(System.in);
            result = opt.nextDouble();
        }catch(Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        }
        return result;
    }
}
