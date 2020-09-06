public class StringOperations {
public static void main(String args[]){
  
 /*PLUSKA FEEDBACK*/
  /*How could you generalize this for any word?*/
  /*chalenge 2
Gideon Coprivnicar
AP Computer Science
8/30/20*/
//chalenge 1 Scramble words of any size
String word ="Garfield";
int len = word.length();
String a = word.substring(0,4);
String b = word.substring(4,len);
String pp = (b + a);
System.out.print(pp.toLowerCase());
/*chalenge 2 print ascii art with illegal characters*/
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println("     __");
System.out.println("(___()]\'`;\)");
System.out.println("/,    /`");
System.out.println("\\\"--\\\\");

}}
