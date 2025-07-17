import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String a=sc.nextLine();
String z=a;
String r=""; 
for(int i=z.length()-1;i>=0;i--){
r +=z.charAt(i);
}
if(r.equals(a)){
System.out.println("Palindrome" +r);}
else{
System.out.println("Not Palindrome" +r);}
}
}