# javaDemo
    java 中的函数
    函数的格式：
    修饰符 返回值类型 函数名(参数类型 形式参数1， 参数类型 形式参数2){
        执行语句；
        return 返回值；
    }
    
    返回值类型：函数运行后结果的数据类型。 没有具体的返回值时用void标识。void代表的是函数没有具体的返回值类型。
    参数类型：形式参数的数据类型。
    形式参数：是一个变量，用于存储调用函数时传递给函数的实际参数。
    实际参数：传递给实际参数的具体值。
    return：用于结束函数。
    返回值：该值返回调用者。


#基本类型

    byte：Java中最小的数据类型，在内存中占8位(bit)，即1个字节，取值范围-128~127，默认值0
    
    short：短整型，在内存中占16位，即2个字节，取值范围-32768~32717，默认值0
    
    int：整型，用于存储整数，在内在中占32位，即4个字节，取值范围-2147483648~2147483647，默认值0
    
    long：长整型，在内存中占64位，即8个字节-2^63~2^63-1，默认值0L
    
    float：浮点型，在内存中占32位，即4个字节，用于存储带小数点的数字（与double的区别在于float类型有效小数点只有6~7位），默认值0
    
    double：双精度浮点型，用于存储带有小数点的数字，在内存中占64位，即8个字节，默认值0
    
    char：字符型，用于存储单个字符，占16位，即2个字节，取值范围0~65535，默认值为空
    
    boolean：布尔类型，占1个字节，用于判断真或假（仅有两个值，即true、false），默认值false


#引用类型

    String 
    ArrayList
    对象

#字符串
    char '只能是  1个字符'
    
    
#数组  直接打印是内存中的哈希地址

    int [] arrayA={1,2,3}
    String [] arrayB={"hello","java"}
    如果想打印数组 Arrays.toString(xxx)

#类
    1、成员变量定义在类中，不在方法中。
    1、成员方法不要有static关键字
    
    使用
        1、导包，  import 包名称.类名称（属于同一类中不需导包）
        2、创建    类名称 变量名称 =new 类名称()
        3、使用成员中变量或方法   变量名称.成员变量名  ||   变量名称.成员方法名()
        
    成员变量 和 局部变量    
    
    1、成员变量定义在类中 有默认值
    2、局部变量 无默认值


#private 
    其他类型数据        getXXX  setXXX
    Boolean类型数据为  isXXX   setXXX
    
    
#this

#构造方法

    专门用来创建对象的方法   
    1、new时调用  
    2、不能return返回值
      
    public class 类名a{
        public 类名a (){
            
        }
    }
    
    
    
#匿名对象
    什么时候使用？
    
      
    直接new     new Person().name='赵又廷'
    调用        new Person().showName() //我叫null
    
    
#random
    
    Random r= new Random()
   
    Random.nextInt()  ||  Random.nextInt(int range) range表示范围，range是  0-range,左闭右开 
        
# ArrayList
    ArrayList vs  array
    区别
    
    1、数组长度不可以发生改变，ArrayList 长度可以发生改变
    2、ArrayList有一个<>代表泛型 ，*泛型：指同一类型，该类型只能为引用类型，不能是基本类型
    
    
    ArrayList<String> list1=new ArrayList<>() //可直接打印
    
    添加 list1.add("赵丽颖")
    删除 list1.remove(index || item)
    获取 list1.get(index)
    长度 list1.size()
    
    泛型只能试引用类型，基本 类型要用包装类
    int   Interger
    char  Character 
    其他都是大写
    
    ArrayList<Interger> list1=new ArrayList<>() //可直接打印
    
#String  
    比较：string1.equals(string2)    
    获取：length(), //长度 
         concat(),//拼接
         charAt(idx),// 返回item 
         indexOf(str) //返回 idx
    截取
        substring(start,end)  // 从参数位置到末尾,含左不含右
    转换
        str.toCharArray()   //字符串打散成数组
        str.getBytes()  //获取bytes
        str.replace(old,new) //讲old替换成new字符
           
    切割
        str.splite(reg) // 切.时要 \\.
        
#static
    一旦变量或方法用了static 关键字  就属于所在类，不属于对象自己
    1、推荐 
        类名称.静态变量
        类名称.类方法
    2、对于本类当中的静态方法，可以省略类名称    
    
    3、静态方法不能直接访问非静态方法（原因：内存中先有静态，后有非静态）
    
    4、静态方法中不能用this关键字