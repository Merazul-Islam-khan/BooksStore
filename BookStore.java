/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectgoogler;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BookStore {
    
    static String[]books={"Java","C","Python"};
   static  final double StudentsDiscount=0.4;
    static final double TeacherDiscount=0.3;
    static final double Other_man=0.0;
    static Scanner sec=new Scanner(System.in);
    
    public static void main(String args[]){
        prln(".....WellCome To Our BookStore.....");
        pln("Which Book Do You Want?/n Ans: ");
        String userChoice=sec.nextLine();
         
        
        if(books[0].toLowerCase().equals(userChoice.toLowerCase())){
            
            prln("You opted for "+books[0]+" Book.");
            Calculation(books[0]);
        }
        else if(books[1].toLowerCase().equals(userChoice.toLowerCase())){
             prln("You opted for "+books[1]+" Book.");
             Calculation(books[1]);
        }
        else if(books[0].toLowerCase().equals(userChoice.toLowerCase())){
             prln("You opted for "+books[2]+" Book.");
             Calculation(books[2]);
        }
        else{
            prln("Sorry, We don't have that book.");
        }
     
			
    }
    static void showPrice(double price){
		prln("Your total payable amount: "+price);
		prln("\n------------THANK YOU FOR SHOPPING FROM OUR BOOKSTORE--------------");
	}
    static void Calculation(String a){
        
        double price=200;
        pln("Are you a Student,Teacher or alien?\nAns:");
        
        String Ans=sec.nextLine();
        if(Ans.toLowerCase().equals("teacher")){
            price=price-(price*TeacherDiscount);
            showPrice(price);
        }
        else if(Ans.toLowerCase().equals("Student")){
            price=price-(price*StudentsDiscount);
            showPrice(price);
        }
        else if(Ans.toLowerCase().equals("Alian")){
            price=price-(price*Other_man);
            showPrice(price);
        }
    }
    
    static void prln(Object Any_Object){
        System.out.println(Any_Object);
    }
    static void pln(Object Any_Object){
        System.out.print(Any_Object);
}

 }
