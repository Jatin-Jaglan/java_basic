import java.util.*;

public class learnString {
    public static void main(String[] args) {
        String str = " jatin jaglan ";


        // String Builder
        StringBuilder sb = new StringBuilder(str);  
        

        // reverse a String 
        sb.reverse().toString();
        System.out.println(sb);


        // convert the string to array 
        char[] arr = str.toCharArray();
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // convert the array to string 
        String str2= new String(arr);
        System.out.println(str2);

        // to remove starting and ending white spaces 
        System.out.println(str.trim());
        str.trim();


        //to remove all the white spaces 
        System.out.println(str.replaceAll("\\s+",""));
        str.replaceAll("\\s+","");


        // to remove the char 
        str.replaceAll("j","");


        // to replace the removed place 
        str.replaceAll("j","x");


        // to convert the int to string
        int a = 12344;
        String str3 = Integer.toString(a);


        // convert the string to int 
        int b = Integer.parseInt(str3);
        System.out.println(b);

       // split the sting 
       String[] splitstr = str.split(" ");
      for (int i=0 ; i<splitstr.length ; i++){
        System.out.println(splitstr[i]);
      }


      // append in String 
      sb.append(" ok");
      System.out.println(sb);

      
    }
}

