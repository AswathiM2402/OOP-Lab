 public class stringMan  
{  
public static void main(String[] args)  
{  
    String s1="hai";
    String s2="hello";
    String s3=new String("SNGCE");
    System.out.println("The first string is: "+s1);
    System.out.println("The second string is: "+s2);
    System.out.println("The third string is: "+s3);
    System.out.println("Length of "+s1+" is: "+s1.length());
    System.out.println("After concatenating the first and second: "+s1+""+s2);
    System.out.println("After concatenating the first and third: "+s1.concat(s3));
    System.out.println("Comparing first and second string: "+s1.compareTo(s2));
    System.out.println("A substring of "+s1+" is: "+s1.substring(0,1));
    System.out.println("After using equals method on first and second string: "+s1.equals(s2));
    System.out.println("First string after replacing a with o is: "+s1.replace('a','o'));
    System.out.println("First string in uppercase: "+s1.toUpperCase());
    System.out.println("Third string in lower case: "+s3.toLowerCase());



}  
}  