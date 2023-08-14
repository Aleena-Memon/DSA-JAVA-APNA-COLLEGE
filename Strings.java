

public class Strings {
     public static void main(String[] args) {

        String firstName = " aleena ";
        String lastName ="memon";
        String sentence = "my name is aleena";
        String fullName = firstName +" "+lastName;
        System.out.println("your name is:" + fullName);

        // charAt
        for(int i=0; i<fullName.length(); i++){
        System.out.println(fullName.charAt(i));
        }

        // compare
        if(firstName.compareTo(lastName)==0){
        // compare have 3 cases to check..
        // s1>s2  -> return +ve value
        // s1==s2  -> return 0
        // s1<s2   -> return -ve value
               System.out.println("String is equal..");
        }
        else{
         System.out.println("string are not equal..");
        }

        if(firstName==lastName){
         System.out.println("string are equal");
        }else{
         System.out.println("string are not equal..");
        }

        //but in some cases equal to not work especially in non-primitive type
        // object strore different in memory... (use string builder)

        if(new String("aleena") == new String("aleena")){
       System.out.println("string are equal");
        }
        else{
         System.out.println("string are not equal..");
        }

        // sub string..
        // sub string(beg index, end index)
        String name = sentence.substring(11, sentence.length());
        // sentence.length()-1   -> ending index
         System.out.println(name);

     }
}
