import java.util.Arrays;

public class array {
  public static void main(String[] args) {
//    int [] arrayA=new int[] {1,2,3};
    int [] arrayA={1,2,3};
//    String[] arrayB =new String[] {"hello","java"};
    String [] arrayB ={"hello","java"};
//    直接打印数组是内存中哈希值
    System.out.println(arrayA+"\n"+arrayB);

    for(int i=0;i<arrayA.length;i++){
      System.out.println(arrayA[i]);
    }
    //打印数组
    System.out.println(Arrays.toString(arrayA));
  }
}
