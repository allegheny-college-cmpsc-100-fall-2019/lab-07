package bibliotech;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/*
 * TODO Import the two required libraries for Scanner and Arraylist.
 *      Note: both belong to the java.util.*
 */

/** Creates and organizes a library.
 *
 * @author {Your Name Here}
 */
public class DisplayLibrary {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    File bookFile = null;
    Scanner input = null;
    try {
      bookFile = // TODO Create new File object with a parameter of "inputs/book.list"
      input = new Scanner(/* TODO Point scanner at bookFile */);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    /*
     * TODO - Implement necessary identifers for:
     *        - Scanner for lines within file
     *        - ArrayList containing reference type Book
     *        - Identifier to track which item ("column" or "field") the line scanner is on
     */
    while (/* TODO Use the correct scanner iterator method */) {
    /*
     * TODO - Within this loop, initialize the scanner to read the parts of the line
     *        (Remember to use the tab delimiter!)
     *      - Create an empty Book object to hold one book's data at a time. 
     */
      while (/* TODO Use the correct scanner iterator method on new scanner */) {
        /* 
         * TODO - Nest another while loop to read the line scanner's output.
         *      - Use the identifier tracking the "column" or "field" in conjunction
         *        with the Book class' methods to populate the book
         *        Note: this will require a conditional statement
         *        - This includes: title, author, page count
         *                                            ^
         *          Don't forget that this is a String type and needs to be an integer!
         */
      }
    /* 
     * TODO - Before the "parent" while loop ends, add the Book object created to the ArrayList
     *      - Reset the "column" or "field" counter
     */
    }
    /* 
     * TODO - Initialize number (counter) to track number of iterations completed while looping over ArrayList
     *      - Initialize number to track the amount of shelf space taken up with each iteration
     *      - Print the size of the ArrayList to the screen (see example output for full line)
     */
    while (/* TODO create condition to loop over ArrayList until reaching the lists's size */) {
      /*
       * TODO - Create Book object to recieve the "get" method's result
       *      - Add shelf space used by the book
       *      - Print the Book object to the screen
       *      - Increase the counter
       */
    }
    // TODO Store shelf space in feet
    DecimalFormat fmt = new DecimalFormat("#.##");
    System.out.print("Shelf width required: " + fmt.format(/* TODO Replace this with your shelf space identifier */) + " feet.");
  }
}