/*
Input Test Cases:
kirandangol
ran

kirandangol
dragon

kirandangol
darling

kirandangol
gorkali

Author: Kiran Dangol (@dangolk)
Last Modified: 10/08/2017
*/

import java.util.*;
import java.io.*;

public class AnagramHelper {
   public static void main(String[] args){   
      Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      String text = scan.nextLine();
      
      printRemainingLetters(name, text);
      
   }
   
   public static void printRemainingLetters(String name, String text){  
      ArrayList<Character> TEXT = convertStringToCharacterArrayList(text);
      ArrayList<Character> list = new ArrayList<Character>();
      
      for(char c: name.toCharArray()){ 
         if(!TEXT.contains(c) || TEXT.isEmpty()){
             list.add(c);
         }
         else{
            TEXT.remove((Character)c);
         }
         
      }
      
      showRemainingLetters(list);
   }
   
   public static ArrayList<Character> convertStringToCharacterArrayList(String str){
      ArrayList<Character> list = new ArrayList<Character>();
      for(int i = 0; i < str.length(); i++){
         list.add((Character)str.charAt(i));
      }
      return list;
   }
   
   
   public static void showRemainingLetters(ArrayList<Character> list){    
      Collections.sort(list);  
      System.out.println("\n\nRemaining letters:");
      for(Character c: list){
         System.out.print(c + " ");
      }
      System.out.println("\n\nRemaining letters left: " + list.size());

   }
   
}