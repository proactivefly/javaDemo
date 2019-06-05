
public class 数据类型 {
  public static void main(String[] args) {
//    自动类型转换
//    规则 从小到大才能转


//    int  ->  long
    long longnum=100;
    System.out.print(longnum);

//    long ->int  xxxx
//    int intNum=100L;  //Error:(13, 16) java: 不兼容的类型: 从long转换到int可能会有损失
      int intNum=(int)100L;
      System.out.println("\n"+intNum);
  }
}
