package cscd211Lab6;

import java.io.*;
import cscd211Utils.*;
import java.util.Scanner;
import cscd211Methods.CSCD211Lab6Methods;



public class CSCD211Lab6
{
   /**
    * Standard provided main
    * @param args representing the arguments passed in
    * @throws Exception To handle the FileNotFoundException or to shut the compiler up
    */
   public static void main(String [] args)throws Exception
   {
      int choice;
      File inf = null;
      Scanner kb = new Scanner(System.in), fin = null;

      do
      {
         choice = CSCD211Lab6Methods.menu(kb);

         switch(choice)
         {

            case 1:  String str = CSCD211Lab6Methods.readString(kb);
                     String newStr = CSCD211Lab6Methods.reverseString(str);
                     System.out.println("The String:\n" + str + "\n");
                     System.out.println("In reverse is:\n" + newStr + "\n");
                     break;


            case 2:  inf = FileUtils.openInputFile(kb);
                     fin = new Scanner(inf);
                     CSCD211Lab6Methods.reverseFile(fin);
                     fin.close();
                     System.out.println();
                     break;

            case 3:  inf = FileUtils.openInputFile(kb);
                     fin = new Scanner(inf);
                     CSCD211Lab6Methods.doBoth(fin);
                     fin.close();
                     System.out.println();
                     break;

            default: System.out.println("EXITING");

         }// end switch

      }while(choice != 4);
      
      kb.close();

   }// end main
}// end class