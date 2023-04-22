/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aleksandar.crud;



/**
 *
 * @author aleksandar
 */
public class CRUD {


    public static void main(String[] args) {
        int opt = 5;
        do{
           printMenu();
           opt = Insertions.readInt();
           switch(opt){
               case 1:{
                   Read.main(args);
               };break;
               case 2:{
                   Create.main(args);
               };break;
               case 3:{
                   Update.main(args);
               };break;
               case 4:{
                   Delete.main(args);
               };break;
               case 5:{
                   System.out.println("Quiting");
               };break;
               default:System.out.println("Not a option select again.");break;
           }
        }while(opt != 5);
    }
    public static void printMenu(){
        System.out.println("===Choose one option===");
        System.out.println("1:Read the database");
        System.out.println("2:Insert into the database");
        System.out.println("3;Updete record in the database");
        System.out.println("4:Delete record from the database");
        System.out.println("5:Quit");
    }
    
}
