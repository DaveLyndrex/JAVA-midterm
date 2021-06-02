/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millanda_Midterm3;

/**
 *
 * @author 2ndyrGroupA
 */
public class Main {
   public static void main(String[] args) {
        MyDate currentDate = new MyDate(2021, 03, 26);
        System.out.println("Current date: " + currentDate);
        System.out.println("\n");
        MyDate date1 = new MyDate(2001, 04, 8);
        System.out.println("This is my birthdate: " + date1);
        System.out.println("This day is the Day of Valor: " + date1.nextDay());
        System.out.println("The next next day is " + date1.nextDay());
        System.out.println("The next month is " + date1.nextMonth());
        System.out.println("The next year is " + date1.nextYear());
        System.out.println("\n");
        MyDate date2 = new MyDate(2000, 11, 05);
        System.out.println("This is Justine Ambrad's birthdate: " + date2);
        System.out.println("This day is the birthdate of his mother-in-law:  " + date2.previousDay());
        System.out.println("The other day is " + date2.previousDay());
        System.out.println("The previous month is " + date2.previousMonth());
        System.out.println("The previous year is " + date2.previousYear());
        System.out.println("\n");
        
        MyDate date3 = new MyDate(2021, 3, 29);
        System.out.println("The previous year is " + date3.previousYear());
    }
}
