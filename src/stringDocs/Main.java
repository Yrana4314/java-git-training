package stringDocs;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        String str = "Hello World!!";
        //calculate the length of the string
        int len = str.length();
        System.out.println();
        String result = "Hello";
        int findIndex = result.indexOf('o');
        System.out.println(findIndex);
        System.out.println();
        System.out.println(len);// print 13, including whitespaces
        char[] data = {'H','e','l','l','o'};
        String str2 = new String(data);
        //System.out.println(str);
        System.out.println(str2);
        //chatAt() print character at given index of the string
        System.out.println(str.charAt(2)); // print l
        System.out.println(str.charAt(4)); //print o

        //To insert sthg in the middle of string/sentences \
        String greet = "Hello!";
        String name = "Yogesh";
        String hello = String.format("Hello! %s, How are you doing?!",name);
        System.out.println(hello);
        //MAke a sentance with some delimeter
        String year = "2022";
        String month = "11";
        String day = "12";
        String fullDate = String.join("/",year,month,day);
        String fullDate2 = String.join("-",year,month,day);
        System.out.println(fullDate);
        System.out.println(fullDate2);
        System.out.println();
        //Check if two string are same
        String upper = "Hello";
        String lower = "World";
        System.out.println(upper.equals(lower));    //print false
        String st = "hello";
        String str3 = "hello";
        System.out.println(st.equals(str3)); //print true
         //contains( char s)
        String test = " Hello, It is party time";
        System.out.println(test.contains("Hello")); //print true becoz it has "hello" in the string test
        System.out.println();
        //to repeat/print string given n times
        int n = 5;
        String s = "Java";
        String repeated = s.repeat(n);
        System.out.println(repeated);
        System.out.println();
        //CompareTo()
        String pal = "Hello";
        String pall = "Hey";
        int diff = pal.compareTo(pall);
        System.out.println(diff);   //print -13 that is diff between ASCII value of 'y'-ASCII value of 'l'
        //trim()
        String res = "  Hello  there    ";
        System.out.println(res.trim()); // remove whitespaces before hello and after there
        System.out.println();
        //To split string from some delimiter(could be ';','/','-'
        String address = "000657,11385,QN;000674,11221,BK";//;000656,11210,MN";
        String []add = address.split(";"); //Creates an array and store the string elements into it
        System.out.println(Arrays.toString(add));   // print [000657,11385,QN, 000674,11221,BK]
        System.out.println();
        //to replace word/single string from a strings/sentences
        String original = "Hi everybody!";
        System.out.println("original: "+original);
        String replaced = original.replace("Hi","Hello!");
        System.out.println("replaced: "+replaced);

    }
}
