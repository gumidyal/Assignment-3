package csc207.gumidyal.layout;
//import java.io.PrintWriter;
import java.lang.StringBuilder;

public class Grid implements TextBlock{
  private int width;
  private int height;
  private char ch;

  public Grid(int width, int height, char ch) {
    this.width = width;
    this.height = height;
    this.ch = ch;
  }
 
  public int width() {
    return this.width;
  }
  
  public int height() {
    return this.height;
  }
  
  public String row(int i) {
    StringBuilder build = new StringBuilder();
     for (int j = 0; j < this.width; j++) {
        build.append(this.ch);
      }
    
    return build.toString();    
  }
  

} // class
