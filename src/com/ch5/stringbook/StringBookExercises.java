package com.ch5.stringbook;

public class StringBookExercises {

   public static void main(String[] args) {
//        System.out.println(scroll(("Hello World")));
//        System.out.println(convertName("Shah,Dhvan"));
//        System.out.println(negative("101010"));
//        System.out.println(convertDate2("5/23/2020"));
//        System.out.println(startsWith("architecture", "arch"));
//        System.out.println(endsWith("astronomy", "onomy"));
        
       System.out.println(removeTag("<b>Hello World</b>", "b"));
   }

   public static String scroll(String str){
       return str.substring(1) + str.substring(0, 1);
   }

   public static String convertName(String str){
       str = str.trim();
       String s = str.substring(str.indexOf(",")+1) + " " +str.substring(0, str.indexOf(","));
       return s.trim();
   }

   public static String negative(String str){
       return str.replace('1', 'O').replace('0', 'I').replace('O', '0').replace('I', '1');
   }

   public static String convertDate(String str){
       return str.substring(str.indexOf('/')+1, str.indexOf('/')+3) + "-" + str.substring(0 ,2)  + "-" +  str.substring(str.lastIndexOf('/')+1, str.lastIndexOf('/')+5);
   }

   public static String convertDate2(String str){
       return str.substring(str.indexOf('/')+1, str.lastIndexOf('/')) + "-" + str.substring(0, str.indexOf('/')) + "-" + str.substring(str.lastIndexOf("/")+1);
   }

   public static boolean startsWith(String str, String prefix){
       return str.substring(0, prefix.length()).equals(prefix);
   }

   public static boolean endsWith(String str, String suffix){
       return str.substring(str.length()-suffix.length()).equals(suffix);
   }

   public static String removeTag(String str, String tag){
      String newStr = str.substring(0, str.indexOf('/')) + str.substring(str.indexOf('/')+1);
      if(tag.equals(newStr.substring(newStr.indexOf('<')+1, newStr.indexOf('>'))) && tag.equals(newStr.substring(newStr.lastIndexOf('<')+1, newStr.lastIndexOf('>'))) && str.indexOf('/') > str.lastIndexOf('<')) {
          return str.substring(0, str.indexOf('<')) + str.substring(str.indexOf('>') + 1, str.lastIndexOf('<'));
      }
      return str;
   }
}

