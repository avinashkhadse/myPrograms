import java.util.*;
import java.io.*;

class Function { 
  String AlphabetSoup(String str) {
 
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
   
    str = new String(chars);
      
    return str;
   
  }
 
  public static void main (String[] args) { 
    // keep this function call here    
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.AlphabetSoup(s.nextLine()));
  }  
 
}