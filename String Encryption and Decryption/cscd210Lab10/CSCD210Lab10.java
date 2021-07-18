package cscd210Lab10;

import java.io.*;
import cscd210Utils.*;
import cscd210Methods.*;
import java.util.Scanner;

/**
 * A simple encryption/decryption program.  You should be able to take a unencrypted file and encrypt it. Then take the encrypted file and decrypt it to
 * get back the original unencrypted file
 */
public class CSCD210Lab10
{
	/**
	 * The main method first prompts the user for an un-encrypted filename, and the name of an output file.  Main then encrypts that file writing the
	 * results of the encryption to the output file.<br>
	 * <br> After the file is encrypted then the menu is displayed. The user has the choice to encrypt or decrypt files.<br>
	 * <br>
	 * Note: the file to be encrypted is made up of 3 lines <br>
	 * The string to be encrypted <br>
	 * The encryption direction <br>
	 * The number of elements to shift<br>
	 *   
	 * @param args The command line arguments which don't exist right now
	 * @throws Exception To shut the compiler up
	 */
   public static void main(String [] args)throws Exception
   {
      File inf = null;
      Scanner fin = null;
      PrintStream fout = null;
      int choice, total;
      String outFilename = null;
      Scanner kb = new Scanner(System.in);
          
      /*
       * Open the input file and the output file.  Read the total number of records in the file. <br>
       * Read the name of the output file. <br>
       * Encrypt the file writing the results to the output file <br>
       * 
       * An encrypted file contains the direction the number and the encrypted string all on the same line <br> for example encrypting STU by shifting left 
       * left by 1 space would be written as right1TUV
       */
      inf = FileUtils.openInputFile(kb);
      fin = new Scanner(inf);
      total = FileUtils.countRecords(fin, 3);
      fin.close();
      
      fin = new Scanner(inf);
      outFilename = CSCD210Lab10Methods.readFilename(kb);
      fout = new PrintStream(outFilename);      
      CSCD210Lab10Methods.encrypt(fin, fout, total);
      fin.close();
      fout.close();
     
      do
      {
         choice = CSCD210Lab10Methods.menu(kb);
         
         switch(choice)
         {
            case 1:  inf = FileUtils.openInputFile(kb);
                     fin = new Scanner(inf);
                     total = FileUtils.countRecords(fin, 3);
                     fin.close();
      
                     fin = new Scanner(inf);
                     outFilename = CSCD210Lab10Methods.readFilename(kb);
                     fout = new PrintStream(outFilename);      
                     CSCD210Lab10Methods.encrypt(fin, fout, total);
                     fin.close();
                     fout.close();      
                     break;
                     
            case 2:  inf = FileUtils.openInputFile(kb);
                     fin = new Scanner(inf);
                     outFilename = CSCD210Lab10Methods.readFilename(kb);
                     fout = new PrintStream(outFilename);
                     CSCD210Lab10Methods.decrypt(fin, fout);
                     fin.close();
                     fout.close();  
                     break;

            /*
             * The difference between case 2 and case 3 is case 3 writes the results of the decryption to the screen
             */
            case 3:  inf = FileUtils.openInputFile(kb);
                     fin = new Scanner(inf);
                     CSCD210Lab10Methods.decrypt(fin, System.out);
                     fin.close();
                     break;
                   
            case 4:  System.out.println("Thanks for playing");
         
         }// end switch
      
      }while(choice != 4);
         
   }// end main
}// end class


