/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARlist;
import ARlist.Books.bookTitleComparator;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author macstudent
 */
public class ArrayListTest {
  public static void main(String[]args){
      ArrayList<String> productsName = new ArrayList<String>();
      productsName.add("Projector");
      productsName.add("Excel");
      productsName.add("Contigo");
      productsName.add("Apple");
      
      productsName.add(2,"Oracle");
      
      productsName.remove("Oracle");
      
      if(productsName.contains("Oracle")){
         productsName.remove("Oracle");
      }else{
          System.err.println("Buy Oracle First");
      }
      
  for(String raman : productsName){
  System.out.println(raman);
  }
  Collections.sort(productsName);
  System.out.println("=======");
  
  ArrayList<Books> library = new ArrayList<Books>();
  Books book1= new Books(101,"The sky is falling", 9);
  Books book2 =new Books(102,"Pride and Prejudice", 5);
  Books book3 =new Books(103,"Text", 7);
  Books book4= new Books(104,"Courage", 12);
  
  library.add(book1);
  library.add(book2);
  library.add(book3);
  library.add(book4);
  
  for(Books bk : library)
  {
    bk.Display();
    
}
  System.out.println("No of books in library : " + library.size());
  library.add(2, new Books(120,"Pearls",11));
  for(Books bk : library){
      bk.Display();
  }
  Collections.sort(library, new  bookTitleComparator());
  for(Books bk : library){
     bk.Display();
  }
}
}
