public class Stringbuilder {
    public static void main(String[] args) {
        // strings are immutable..
        // we can not add delete a string we have to make new one
        // operation on string like modify delete etc are time consuming
       // that"s why we create stringbuilder class we perform all operation in less time..


     StringBuilder sb = new StringBuilder("aleena");
     System.out.println(sb);

     // char at
     System.out.println(sb.charAt(4));

     // set at
     sb.setCharAt(0, 'o');
     System.out.println(sb);
       
    }
}
