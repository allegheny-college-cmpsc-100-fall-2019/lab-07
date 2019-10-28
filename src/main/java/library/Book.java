package bibliotech;

/** Creates a Book object.
 *
 * @author {Your Name Here}
 */
public class Book {
  
  private String title;
  private String author;
  private String subject;
  private int pageCount;
  private double width;
  
  /** Sets book title.
   *
   * @param title The title
   */
  public void setTitle(String title) {
    this.title = title;
  }
  
  /** Retrieve title.
   *
   */
  public String getTitle() {
    return this.title;
  }
  
  /** Sets book author.
   *
   * @param author The author
   */
  public void setAuthor(String author) {
    this.author = author;
  }
  
  /** Retrieve author.
   *
   */
  public String getAuthor() {
    return this.author;
  }
  
  /** Sets the book's page count and width.
   *
   * @param count Number of pages
   */
  public void setPages(int count) { 
    this.pageCount = count;
    setWidth(count);
  }
  
  /** Retrieve page count.
   *
   */
  public int getPages() {
    return this.pageCount;
  }
  
  
  /** Sets the book's width in inches.
   *
   * @param count Number of pages.
   */
  public void setWidth(int count) {
    /*
     * TODO Implement formula to calculate a book's with in inches.
     *      Note: the identifier for holding this value is already created.
     */
  }
  
  /** Returns book's width in inches.
   *
   */
  /*
   * TODO Write getWidth method to return the value of the book's width.
   *      Note: this relies on the identifier in the method above.
   */
  
  /** Creates printable string of above information.
   *
   */
  public String toString() {
    String book = this.title 
                  + "\n" + this.author 
                  + "\n" + this.pageCount + " pages";
    return book;
  }
}