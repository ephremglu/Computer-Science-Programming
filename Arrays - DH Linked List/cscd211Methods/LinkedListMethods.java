package cscd211Methods;

import java.util.Scanner;

/**
 * Some basic methods we will need to use in conjunction with the LinkedList class
 * NOTE all parameters will be final and all preconditions will be enforced
 */
public class LinkedListMethods
{
   /**
    * menu method for testing your linked list
    * <br>  1) Print the List
    * <br>  2) Append the specified element to the end of this list.
    * <br>  3) addAll(index, array)
    * <br>  4) Read an index and get the data at that index
    * <br>  5) getLast
    * <br>  6) remove
    * <br>  7) removeIndex
    * <br>  8) removeLast
    * <br>  9) toArray
    * <br> 10) removeAllOccurrences
    * <br> 11) clear the list
    * <br> 12) Quit
    * <br> You must ensure the value entered is within range
    *
    * @param kb Representing the Scanner Object
    * @return int The choice
    *
    * @throws IllegalArgumentException if kb is null
    */
   public static int menu(final Scanner kb)
   {
	   if(kb == null)
		   throw new IllegalArgumentException("Bad Param menu");
	   int choice;
	   do
	   {
		   System.out.println("Please choose from the following");
		   System.out.println("1) Print the List"); 
		   System.out.println("2) Append the specified element to the end of this list");
		   System.out.println("3) addAll(index, array) ");
		   System.out.println("4) Read an index and get the data at that index");
		   System.out.println("5) getLast"); 
		   System.out.println("6) remove"); 
		   System.out.println("7) removeIndex"); 
		   System.out.println("8) removeLast"); 
		   System.out.println("9) toArray");
		   System.out.println("10) removeAllOccurrences");  
		   System.out.println("11) clear the list");  
		   System.out.println("12) Quit"); 
		   System.out.print("Choice --> ");
		   choice = Integer.parseInt(kb.nextLine());
	   }while(choice < 1 || choice > 12);
	   return choice;
   }// end menu
   
      
   /**
    * readIndex reads a value greater than -1
    *
    * @param kb The Scanner object
    * @return int The index
    *
    * @throws IllegalArgumentException if kb is null
    */
   public static int readIndex(final Scanner kb)
   {
	   if(kb == null)
		   throw new IllegalArgumentException("Bad Param menu");
	   System.out.println("Please enter an index number: ");
	   int index = Integer.parseInt(kb.nextLine());
	   while(index < 0)
	   {
		   System.out.println("Please enter a number greater than -1: ");
		   index = Integer.parseInt(kb.nextLine());
	   }
	   return index;
   }// end readIndex
   
   /** 
    * Fill the array fills the passed in array with Integers by prompting
    * the user to enter an int and then building an Integer
    *
    * @param kb Representing the Scanner
    * @param array Representing an array of Integers
    *
    * @throws IllegalArgumentException if total less than 1 or kb is null
    */
   public static void fillArray(final Scanner kb, final Integer [] array)
   {
	  if(array.length < 1 || kb == null)
		   throw new IllegalArgumentException("array is less than 1 or kb is null");
      for(int x = 0; x < array.length; x++)
      {
    	  array[x] = createInteger(kb);
      }
   }// end fillArray
   
   
   /**
    * This method prompts the user for an int and builds and returns an Integer with
    * that value
    * @param kb Representing the Scanner to the keyboard
    * @return Integer Representing the desired entered value by the user
    * 
    * @throws IllegalArgumentException if kb is null
    */
   public static Integer createInteger(final Scanner kb)
   {
	   if(kb == null)
		   throw new IllegalArgumentException("Bad Param menu");
	   System.out.println("Please enter an int: ");
 	   int input = Integer.parseInt(kb.nextLine());
 	   Integer x = new Integer(input);
 	   return x;
   }// end createInteger
   
   
   /** 
    * Fill the array creates an array of Integers and fills the array with
    * values entered by the user.
    *
    * @param kb Representing the Scanner
    * @param total Representing the total size of the array to make
    * 
    * @return Integer[] The array of Integers
    *
    * @throws IllegalArgumentException if total less than 1 or kb is null
    */   
   public static Integer[] fillArray(final Scanner kb, final int total)
   {
	   if(total < 1 || kb == null)
		   throw new IllegalArgumentException("total is less than 1 or kb is null");
	  Integer[] newArray = new Integer[total];
	  for(int x = 0; x < newArray.length; x++)
	  {
		  System.out.println("Please enter an int: ");
	 	  Integer input = Integer.parseInt(kb.nextLine());
	 	  newArray[x] = input;
	  }
	  return newArray;
   }// end fillArray
   
}// end class