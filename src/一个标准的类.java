/**
 * 一个标注你的类（java Bean），由四个部分组成
 * 1、所有的成员变量都要有private关键字修饰，
 * 2、为每个成员变量编写一对getter/setter方法
 * 3、编写一个无参数构造方法
 * 4、编写一个全参数构造方法
 */
public class 一个标准的类 {
  private String name;
  private int age;

  //无参数
  public 一个标准的类() {
  }
  //全参数
  public 一个标准的类(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
