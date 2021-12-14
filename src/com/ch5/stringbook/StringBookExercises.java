package com.ch5.stringbook;

public class StringBookExercises {

   public static void main(String[] args) {
        System.out.println("scroll");
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));
        
        System.out.println("\nconvertName");
        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));
        
        System.out.println("\nnegative");
        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));
        
        System.out.println("\ndateString");
        System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
        
        System.out.println("\ndateString2");
        System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + dateString2("4/2/2014"));
        
        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
        
        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
        
        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday", "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
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

   public static String dateString(String str){
       return str.substring(str.indexOf('/')+1, str.indexOf('/')+3) + "-" + str.substring(0 ,2)  + "-" +  str.substring(str.lastIndexOf('/')+1, str.lastIndexOf('/')+5);
   }

   public static String dateString2(String str){
       return str.substring(str.indexOf('/')+1, str.lastIndexOf('/')) + "-" + str.substring(0, str.indexOf('/')) + "-" + str.substring(str.lastIndexOf("/")+1);
   }

   public static boolean startsWith(String str, String prefix){
       return str.length() >= prefix.length() && str.substring(0, prefix.length()).equals(prefix);
   }

   public static boolean endsWith(String str, String suffix){
       return str.length() >= suffix.length() && str.substring(str.length()-suffix.length()).equals(suffix);
   }

   public static String removeTag(String str, String tag){
        try {
            String newStr = str.substring(0, str.indexOf('/')) + str.substring(str.indexOf('/')+1);
            if(tag.equals(newStr.substring(newStr.indexOf('<')+1, newStr.indexOf('>'))) && tag.equals(newStr.substring(newStr.lastIndexOf('<')+1, newStr.lastIndexOf('>'))) && str.indexOf('/') > str.lastIndexOf('<')) {
                return str.substring(0, str.indexOf('<')) + str.substring(str.indexOf('>') + 1, str.lastIndexOf('<')) + str.substring(str.lastIndexOf('>')+1);          
            }            
        } catch (StringIndexOutOfBoundsException s){}

        return str;
   }
}
/* Output:
scroll
ello WorldH
appyh
h

convertName
Lori Renee Reubenstein
Joe Biden
Bozo the Clown

negative
1101000110
00000000

dateString
04/20/2014 becomes 20-04-2014

dateString2
04/20/2014 becomes 20-04-2014
4/20/2014 becomes 20-4-2014
04/2/2014 becomes 2-04-2014
4/2/2014 becomes 2-4-2014

startsWith
true
true
false
false
true

endsWith
true
true
false
false
true

removeTag
Hello World
<b>Hello World</b>
Hello World</b>
<b>Hello World
</img>Hello World<img>
Happy Birthday Hello World
Hello World Happy Birthday
Happy Hello World Birthday
*/

