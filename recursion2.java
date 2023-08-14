import javax.swing.plaf.synth.SynthStyleFactory;

public class recursion2 {
                   // intermediate questions..
               // TOWER OF HANOI...

    //    public static void towerOfHanoi(int n, String src , String helper, String dest ){
    //    if(n==1){
    //     System.out.println("transfer 1 disk " + n+ "from"+ src + "to" + dest);
    //     return;
    //    }
    //     towerOfHanoi(n-1, src, dest,helper);
    //     System.out.println("transfer 1 disk " + n+ "from"+ src + "to" + dest);
    //     towerOfHanoi(n-1,helper,src,dest);
    //    }
    //    public static void main(String[] args) {
    //     int n=2;
    //   towerOfHanoi(n, "S", "H", "D");
    //    }
                 

    // reverse string
  //  public static  void printRes(String str, int idxx){
  //   if(idxx==0){
  //     System.out.print(str.charAt(idxx));
  //     return;
  //   }
  //   System.out.print(str.charAt(idxx));
  //   printRes(str, idxx-1);
  //  }
  //  public static void main(String args[]){
  //   String str= "abcd";
  // printRes(str, str.length()-1);
  // }  
  

  // find first and last occurance of element..

  public static int first = -1;
  public static int last =-1;

  public static void findOccurance(String str, int idx , char element){
    if(idx== str.length()-1){
      System.out.println(first);
      System.out.println(last);
      return;
    }


    char currChar = str.charAt(idx);
    if(currChar == element){
      if(first == -1){
        first= idx;
      }else {
      last = idx;
      }
      findOccurance(str, idx+1, element);
    }
  }
  public static void main(String[] args){
    String str = "aleena";
    findOccurance(str, 0, 'a');
  }

}
