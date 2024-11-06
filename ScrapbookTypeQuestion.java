
package scrapbooktypequestion;

import java.util.Scanner;


public class ScrapbookTypeQuestion {


    public static void main(String[] args) {
      
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("WHAT IS YOUR NAME? ");
        String name = scanner.nextLine();
        
        System.out.print("HOW OLD ARE YOU? ");
        String age = scanner.nextLine();
        
        System.out.print("WHAT IS YOUR FAVORITE HOBBY? ");
        String  hobby = scanner.nextLine();
        
        System.out.print("WHERE'S YOUR FAVORITE PLACE TO BE? ");
        String place = scanner.nextLine();
        
        System.out.print("WHAT'S YOUR FAVORITE NUMBER? ");
        String number = scanner.nextLine();
        
        System.out.print("WHAT'S A SKILL YOU WANT TO LEARN? ");
        String skill = scanner.nextLine();
        
        System.out.print("WHAT'S YOUR FAVORITE COLOR? ");
        String color = scanner.nextLine();
        
        System.out.print("WHERE DO YOU LIVE? ");
        String address = scanner.nextLine();
        
        System.out.print("WHO'S YOUR CRUSH? ");
        String crush = scanner.nextLine();
        
        System.out.print("WHO'S YOUR FAVORITE TEACHER? ");
        String teacher = scanner.nextLine();
    }
}
