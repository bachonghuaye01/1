# 1
练习
每天一问

[Java视频链接](https://www.bilibili.com/video/BV1qL411u7eE/?vd_source=1ab487dfeeaaca5ba8f4e0a6343d7b8e)

> 给问题附加超链接的格式[文字描述](超链接地址)

[this](https://github.com/bachonghuaye01/1/edit/main/README.md#L80)

> 可以使用这种超链接来跳转到其他文件中,例如下面的例子,在知识点总结的时候,可以把对应的代码超链接附加上.
> ![image](https://user-images.githubusercontent.com/50293047/226360688-3d94a2aa-17df-4828-b1a5-c3d188c6c67f.png)


[static](#2)

[包机制（package,import）](#3)

导入类import

+ 面向对象的三大特征
  - 继承
  - 封装
  - 多态
  
方法重写（override）

final 关键字

组合

Object类

==和equals方法

super

属性/方法的查找顺序

对象的转型（casting）

抽象方法

抽象类

+ 接口
   - 接口中定义静态方法和默认方法（JDK8）
   - 接口的多继承
字符串 String 类详解
String 类常用的方法
+ 内部类
  - 非静态内部类
  - 静态内部类
  - 匿名内部类
 Lamda表达式
+ 数组
  - 数组的定义
 + 数组的初始化
   - 1. 静态初始化
    - 2. 动态初始化
     - 3. 默认初始化
  + 数组的常见操作
	- 数组的遍历
	- 数组的拷贝
java.util.Arrays 类
多维数组
数组存储表格数据
Comparable 接口
二分法查找
+ 异常机制
	+ 异常分类
		- Error
		- Exception
		- RuntimeException 运行时异常
		- CheckedException 已检查异常
			





3/3

<h2 id="1"></h2>

## this
+ this代表当前对象本身，本质是当前对象  
  - 普通方法中this指向调用该方法的对象  
  - 构造方法中，this指向正要初始化的对象  
+ this（）调用重载的构造方法，避免相同的初始化代码。但只能在构造方法中用且必须位于第一句  
+ this不能用于静态方法，//因为在两个不同的区域？this在堆，staic在方法区  
> static的含义为首先加载到内存中,当程序开始运行时,会首先将被static修饰的类,方法和变量加载到内存中.因此static方法中不可直接访问非static的成员,因为此时非static的成员还没有被创建.

<h3 id="2"></h3>

## static
静态变量，方法（类变量，方法）：static声明的属性或方法  

static的属性和方法同属于类。生命周期与类相同，  

static变量只有一份，一般用“类名/类变量，方法”来调用 

static方法中不可直接访问非static的成员  

## 静态初始化块
构造方法用于对象普通属性的初始化  
静态初始化块用于类的初始化，初始化一些静态的属性（静态初始化块中不能直接访问非static成员）  

## 变量的分类和作用域
+ 局部变量属于方法  
+ 成员变量属于对象  
+ 静态变量属于类  

> 这里用makedown语法整理成表格形式.

  | **类型** |    **声明位置**    |   **从属**  |   **生命周期（作用域）**   |
  |:-:      |:-:                 |:-:          |:-: |
  |局部变量  |  方法或语句块内部   | 方法/语句块  | 从声明处开始，到方法或语句块结束|
  |成员变量  | 类的内部，方法的外部|    对象    | 对象创建，成员变量也跟着创建。对象消失，同样消失|
  |静态变量  | 类内部，static修饰 |     类     | 类被加载，静态变量就有效 |
  
3/4
<h4 id="3"></h4>

## 包机制（package,import）
包（package）相当于文件夹，用于管理类，用于解决类的重名问题  

package的使用有两个要点
1. 通常是类的第一句非注释性语句
2. 包名:域名倒着写即可，便于内部管理类

例：com.qiao | com.qiao.mu //这两个包虽然看似有包含关系，但其实是两个独立的包

| **Java中的常用包** | **说明** |
|       :-:         |   :-:    |
|java.lang          | 包含一些Java语言的核心类 |
|java.awt           | 包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面 |
|java.net           |包含执行域网络相关的操作的类 | 
|java.io            |包含能提供多种输入/输出功能的类 | 
|java.util          |包含一些实用工具类|

3/5
## 导入类import

如果要使用其他报的类，需使用import，从而在本类中直接通过类名来调用，否则就需要书写类的完整包名和类名。

**注意点**

Java会默认导入java.lang 包下所有的类，因此这些类可以直接使用
如果导入两个同名的类，只能用包名+类名来显示调用相关类  //偶尔会遇到重复的情况，遇到了就把包名写全来区分

**例:**
```
com.qiao.mu.123 = new com.qiao.mu.123();

import java.util.*;  //这里的 .* 的作用是导入该包下所有类，会降低编译速度，但不会降低运行速度，因为实际只会运行使用的类
```
## 静态导入（static import）

 作用是用于导入指定类的静态属性和静态方法，让我们可以直接使用它们
 
 **例**
 ```
 import static java.lang.Math.*;  //导入Math类的所有静态属性
 
 import static java lang Math.PI; //导入Math类的PI属性
 ```
 //导入之后
 
 System.out.println(PI);   //这里原本需要输入（Math.PI）,因为上面已经导入，所以直接输入(PI)即可
> 前面这些概念性的可以提提速,给咱们后面集合框架,多线程,反射多留点时间.3月份务必拿下javaSE

3/6

# 面向对象的三大特征

**继承**   **封装**   **多态**

## 面向对象的三大特征_继承

**继承（extends）**
继承有两个主要作用

1. 代码复用，更容易实现类的扩展
2. 方便建模

继承的使用要点
1. 父类也称作超类，基类。    子类也称作；派生类等
2. java中只有单继承，没有像C++那样的多继承，因为多继承会引起混乱，使得继承链过于复杂，难以维护
3. java中没有多继承，但接口有多继承
> 接口和类的关系一般称为实现(implement)
4. 子类继承父类，可以得到父类的全部属性和方法（除了父类的构造方法），但不意味可以直接访问（比如，父类私有的属性方法）
5. 如果定义一个类时，没有调用 extends,则他的父类是： java.lang.Object。
> Java中,所有类都直接或间接的继承于Object类.

**运算符（instanceof）**

instanceof是二元运算符，左边是对象，右边是类；

当对象是右边类或子类所创建对象时，返回true;否则，返回false

## 方法重写（override）

子类重写父类的方法，可以用自身行为替换父类行为（其实是覆盖掉了，优先读取子类，但父类也还在）。重写是实现多态的必要条件。

方法重写需要符合的3个要点

1. 方法名，形参列表相同
2. 返回值类型和声明异常类型，子类小于等于父类（子可以返回子，但子不能返回父）。
3. 访问权限，子类大于等于父类

## final 关键字

final 关键字的作用：

**修饰变量**：被他修饰的变量不可改变（变成常量了）。一旦赋了初值，就不能被重新赋值（只能赋值一次）。

**修饰方法**：该方法不可被子类重写，但可以被重载

**修饰类**：修饰的类不能被继承，比如：Math，String等

//相当于最终形态，不可再改变

## 组合

组合后可以复用对方的属性和方法，除了继承外组合也可以实现代码的复用，组合的核心是将父类对象作为子类的属性

组合可以组合多段代码

3/7

## Object类

所有类都是Object类的子类，也具备Object类的所有特性
> 这句话后半句没看懂

**Object类的基本特性**

1. Object类是所有类的父类，所有的Java对象都拥有Object类的属性和方法
2. 如果在类的声明中未使用extends,则默认继承Object类

## ==和equals方法
> 这里很重要,尤其在对比字符串内容时,一定记住要用equals方法.

“==”代表比较双方是否相同。如果是基本类型则表示值相等，如果是引用类型则表示地址相等及时同一个对象

equals() 提供定义“对象内容相等” 的逻辑。比如，学籍系统中认为学号相同的人就是一个人

equals()默认是比较两个对象的hashcode（约等于地址）。但可以根据需求重写equals方法。

3/8

## super

1. super“可以看做”是直接父类对象的引用。可通过suoer来访问父类中被子类覆盖度方法或属性。

2. 使用super调用普通方法，语句没有位置限制，可以再子类中随便调用。

3. 在一个类中，若是构造方法的第一行没有调用super（...）或者this（...）:那么Java默认都会调用super（），含义是调用父类的无参数构造方法

//如果把这个区域比喻成家族的话，Object是爷爷，类1是父亲，类2是孙子。孙子（类2）可以通过super访问父亲（类1），但不能直接访问爷爷（Object），但可以通过父亲（类1）进行访问。

**属性/方法的查找顺序**

例：查找变量h

1. 查找当前类中有没有 h变量

2. 依次上溯每个父类，查看每个父类中是否有h，直到Object

3. 如果没找到则出现编译错误，如果在任意步骤中找到h变量，则过程中止

**构造方法调用顺序**

构造方法第一句总是：super(...)来调用父类对应的构造方法。所以，流程就是先向上追溯到Object，然后再依次向下执行类的初始化块和构造方法，直到当前子类为止

**注：**静态初始化块调用顺序，与构造方法调用顺序一样

## 面向对象的三大特征_封装

**封装（encapsulation）**

封装的理念：

高内聚（将复杂的东西隐藏起来不需调用者知道），低耦合（让使用者更简单的调用）

**封装的优点**

提高代码的安全性

提高代码的复用性

“高内聚”：封装细节，便于修改内部代码，提高可维护性。
“低耦合”：简化外部调用，便于调用者使用，便于扩展和协作。

**封装的实现——使用访问控制符**

Java是使用“访问控制符”来控制那些细节需要封装，那些细节需要暴露的

**访问权限修饰符**
|**修饰符**                                          |**同一个类**|**同一个包中**|**子类**|**所有类**|
|:-:                                                |:-:         |:-:          |:-:    |:-:       |
|**private**//类内友好                               | ※         |             |       |          |
|**default**//包内友好 （什么都不写时默认为default）   | ※         | ※          |       |          |
|**protected**//父子友好，包内友好                    | ※         | ※          | ※    |          |
|**public** //全局友好                               | ※         | ※          | ※    | ※       |

**注：关于protected的两个细节**

1. 若父类与子类在同一个包中，子类可访问父类的protected成员，也可访问父类对象的protected成员。

2. 若子类和父类不在同一个包中，子类可访问父类的protected成员，不能访问父类对象的protected成员。

**开发中封装的简单规则：**

+ 属性一般使用private（私有）访问权限
    - 属性私有后，提供相应的get/set方法来访问相关属性，这些方法通常是public修饰的，以提供对属性的赋值与读取操作//boolean变量的get方法是is开头
+ 方法：一些只用于本类的辅助性方法可以用privat修饰，希望其他类调用的方法用public修饰。
> 今天总结的不错,加油.

3/9

**多态（polymorphism）**

多态：同一个方法调用，不同对象行为完全不同

**多态的要点：**

1. 多态是方法的多态，不是属性的多态（多态与属性无关）

2. 多态的存在有三个必要条件：继承，方法重写，父类引用指向子类对象。

3. 父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了。

（比如总类是吃饭，子类1：吃饭用筷子，子类2：吃饭用叉子，子类3：吃饭用手抓，他们都是吃饭，但行为完全不同）

> 这是Java很重要的一个特性,一定学透,有不理解的地方及时问,进度提一提,今天内容有点少了.

3/10

## 对象的转型（casting）

1. 父类引用指向子类对象，我们称这个过程为**向上转型**，属于自动类型转换。

2. 向上转型后的父类引用变量只能调用它编译类型的方法，不能调用它运行时类型的方法。这时，需要进行类型的强制转换，也就是**向下转型**。

//因为是强制转换所以编译不会报错，但运行可能会报错，这时可以使用
  
```
   if（编译类型 instanceof 运行类型）{

    强制转换;

    方法;

}
```

**例：**假如有个Animal类

```
  Animal animal = new Dog(); //编译类型Animal，运行类型Dog。      //向上转型（自动）
  
  animal.shout();
  
  Dog a = (Dog)animal;  //向下转型（强制）
  
  a.eatMeat();
  
  if(animal instanceof Cat){    //判断，是猫的话就吃鱼
  
    Cat b = (Cat)animal;
    
    b.eatFish();
    
    }
    
}
  
```
来进行判断。//转型后还是原本的对象

> 这里详细点写,最好可以写一个实际的例子.

3/11
（晚上回来再搞）
> 学习一下makedown语法标记代码段的方式,把之前的代码段都用这种方式标记上,进度要加快点,3月已经过去三分之一了.

# 抽象类和接口

**抽象方法和抽象类**

**抽象方法**

1. 使用abstract修饰的方法，没有方法体，只有声明。

2. 定义的是一种“规范”，就是告诉子类必须要给抽象方法提供具体的实现。

**抽象类**

包含抽象方法的类就是抽象类。

通过抽象类，我们可以做到严格限制子类的设计，使子类之间更加通用。

//比如创建一个人的类，你必须会呼吸，要吃饭，得喝水才能活。不满足这些，不吃不喝不呼吸也能活，就不是人类所以无法通过编译。

**抽象类的要点**

1. 有抽象方法的类只能定义成抽象类。
2. 抽象类不能实例化，即不能用 new 来实例化抽象类。
3. 抽象类可以包含属性，方法，构造方法。但是构造方法不能用来 new 实例，只能用来被子类调用。
4. 抽象类只能用来被继承。
5. 抽象方法必须被子类实现。 

## 接口（interface）

接口就是一组规范（相当于程序里的法律），所有实现类都要遵守。//接口里只能有抽象

**接口的作用**

更加规范的对子类进行约束，做到了：规范和具体实现的分离。

接口是两个模块之间通信的标准和规范。设计模块之间的接口就相当于系统的大纲，以后做系统时往往使用的就是“面向接口”的思想来设计系统。

接口和实现类不是父子关系，是实现规则的关系。

> 假设有三个类,人,狗,猫,他们三个类都实现了生物接口,生物接口中声明了一个呼吸方法,那这三个类都必须重写(或者说实现)呼吸方法,具体的实现方式由类内自己管理,但必须要保证这个方法大家都有实现.(也可以把人,狗,猫声明为抽象类,不过很明显不是我们讨论的范围.)
![image](https://user-images.githubusercontent.com/50293047/224560051-f213093d-4a39-4637-b8cc-6b30f43f18c5.png)
![image](https://user-images.githubusercontent.com/50293047/224560188-bf6d7319-62a3-4256-8529-d5f78c53a9ad.png)


**如何定义和使用接口**

**声明格式：**

```
    [访问修饰符] interface 接口名   [extends  父接口 1，父接口2...]  {
    
                常量定义;
                方法定义;
                }

```
**声明格式：**

+ 访问修饰符：只能是public或默认。
+ 接口名：和类名采用相同命名机制。
+ extends：接口可以多继承。
+ 常量：接口中的属性只能是常量，总是：public static final 修饰。不写也是用他们修饰，自动加。
+ 方法：接口中的方法只能是：public abstract。省略的话，它也是public abstract，自动加。

**要点**

+ 子类通过 implements来实现接口中的规范。
+ 接口不能创建实例，但可用于声明引用变量类型。
+ 一个类实现了接口，必须实现接口中所有的方法，并且这些方法只能是public的。
+ JDK1.8（不含8）之前，接口中只能包含静态常量，抽象方法。不能有普通属性，构造方法，普通方法。
+ JDK1.8（含8）后，接口中包含普通的静态方法，默认方法。

```
//飞行接口
public interface Volant{
  int flyTime = 1minute;   //常量这里 int 前面是有public static final的，不写也会自动加，不过被隐藏了
  void fly();           //方法这里也一样，void前有public abstract，不写也自动加
}
//善良接口
interface Honest{
  void helpOther();
  }
  
  class Bird implements Volant（）{
    public void fly(){                  //实现接口Volant里的方法
        System.out.println("想飞就飞");
    }
  
  class Angel implements Volant,Honest（）{
    public void fly(){                  
        System.out.println("天使能飞");
    }
    public void helpOther(){                  //同时满足两个接口
        System.out.println("天使帮助人");
    }
  }
```
> 保持住这个进度,加油.

3/12

**接口中定义静态方法和默认方法（JDK8）**

JAVA8之前，接口里的方法要求全部是抽象方法。

JAVA（含8）之后，以后允许在接口里定义默认方法和静态方法。

**1.默认方法**

Java 8及以上新版本，允许给接口添加一个非抽象的方法实现，只需要使用 default 关键字即可，这个特征又叫做默认方法（或扩展方法）。

默认方法和抽象方法的区别是抽象方法必须要被实现，默认方法不是，作为替代方式，接口可以提供默认方法的实现，所有这个接口的实现类都可以得到默认方法。

默认是普通方法，从属于对象，可以调用静态方法。但静态方法不能反过来调用默认方法。

//重写一个新方法可以直接替代默认方法，也可以直接调用默认方法，使用时一定要在方法前加 default。

**JDK8 新特性-静态方法**

JAVA 8以后，我们也可以在接口中直接定义静态方法的实现。这个静态方法直接从属于接口（接口也是类的一种），可以通过接口名调用。

如果子类中定义了相同名字的静态方法，那就是完全不同的方法了（一个从属接口，一个从属子类），直接从属于子类可以通过子类名直接调用。

**接口的多继承**

接口支持多继承，和类的继承类似，子接口 extends 父接口，会获得父接口的一些。

**例**
```
interface A{
      void testA();
}
interface B{
      void testB();
}
interface C extends A,B {   //相当于同时有了testA和testB
      void testC();
}
//这时候如果想要实现C的话，也要同时满足A和B。上个例子的天使也是多接口
```

## 字符串 String 类详解

String：就是把一堆字符穿起来，统一使用（相当于烤肉的签子）

+ String 类又称作不可变字符序列。
+ String 位于 java.lang 包中，Java 程序默认导入 java.lang 包下的所有类。
+ Java 字符串就是 **Unicode 字符序列**，例如字符串“Java”就是由4个 Unicode 字符“J”，“a”，“v”，“a”组成的。
+ Java 没有内置的字符串类型，而是在标准 Java 类库中提供了一个预定义的类 String，每个用双引号括起来的字符串都是 String 类。

另外
```
String s1 = null;
String s2 = "";     //虽然s2也是空字符串，但是跟s1的null不同，他是创建了一个字符串s2但内容是空
```
**String 类和常量池**

常量池分为三种：全局字符串常量池，class 文件常量池，运行时常量池（Runtime Constant Pool）。

每个 class 加载以后都有一个运行时常量池

```
String a = "乔木";                  //a 直接引用常量池中的"乔木"
String b = "乔木";                  //b 也直接引用常量池中的"乔木"，所以他们俩指的是同一个对象
String c = new String("乔木");      //c 因为自己又 new 了个 String，所以在堆里会有个新对象，只不过里面的数组还是"乔木"

System.out.println(a == b);         //true    因为 a 等于 b，是同一个对象，所以是 true
System.out.println(a == c);         //false   因为 c 创建了个新对象，不是同一个对象，所以这里是 false 
System.out.println(a.equals(c));    //true    equals 比较的是里面的字符是不是相等，这里两个都是"乔木"，所以这里也是 trus
```

比较字符串时通常都会使用 eauals，因为我们一般都是比较字符

> 对makedown语法逐渐熟悉起来后,可以把之前页面不清晰的地方重新改一下,自己复习起来也更容易.加油!

3/13

# String 类常用的方法

**String 类常用方法列表**

|**方法**                                             |**解释说明**                                        |
|:-:                                                  |:-:                                                |
|char charAt(int index)                               |返回字符串中第 index 个字符                         |
|boolean equals(String other)                         |如果字符串与 other相等，则返回 true;否则，返回 false；|
|int indexOf(String str)                              |返回从头开始查找第一个子字符串 str 在字符串中的索引位置。如果未找到字符串，则返回-1 |
|lastlndexOf()                                        |返回从末尾开始查找第一个字符串 str 在字符串中的索引位置。如果未找到字符串 str，则返回-1|
|int length()                                         |返回字符串的长度|
|String replace(char oldChar,char newChar)            |返回一个新串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 而生成的。|
|boolean startsWith(String prefix)                    |如果字符串以 prefix 开始，则返回 true|
|boolean endsWith(String prefix)                      |如果字符串以 prefix 结尾，则返回 true|
|String substring(int beginlndex)                     |返回一个新字符串，该串包含从原始字符串 beginlndex 到串尾|
|String substring(int beginlndex,int endlndex)        |返回一个新字符串，该串包含从原始字符串 beginlndex 到串尾或 endlndex-1 的所有字符|
|String toLowerCase()                                 |返回一个新字符串，该串将原始字符串中的所有大写字母改成小写字母|
|String toUpperCase()                                 |返回一个新字符串，该串将原始字符串中的所有小写字母改成大写字母|
|String trim()                                        |返回一个新字符串，该串删除了原始字符串头部和尾部的空格|

# 内部类

把一个类放在另一个类的内部定义，称为内部类（inner class）。
![QQ图片20230313212430](https://user-images.githubusercontent.com/110222247/224701172-54bd46d1-0f23-4586-b6d1-ffb6ee693472.png)

**内部类的两个要点**
+ 内部类提供了更好的封装，只能让外部类直接访问，不允许同一个包中的其他类**直接访问**
+ 内部类可以直接访问外部类的私有属性，内部类被当成其外部类的成员。但外部类不能访问内部类的内部属性

**注意**
内部类只是一个编译时的概念，编译成功后会成为两个完全不同的类。比如一个名为 A 的外部类和其内部定义的名为Aa 的内部类。在编译完成后会出现 A.class 和 A$Aa.class 两个类的字节码文件。所以内部类是相对独立的一种存在，其成员变量/方法名都可以和外部类相同

```
public class Outer{                             //外部类
  private int age = 10;
  public void show(){
      System.out,println("Outer.show");
      System.out.println(age);
  }
  public class Inner{                           //内部类
      private int age = 20;
      public void show(){
          System.out,println("Inner.show"); 
          System.out.println(age);
           System.out.println(Outer.this.age);  //访问外部类 Outer 的属性
           Outer.this.show();                   
      }
  }
  
}
```

## 非静态内部类

**非静态内部类（外部类里使用非静态内部类和其他类没啥区别）
1. 非静态内部类对象必须寄存在一个外部类对象里。因此，如果有一个非静态内部类对象，那么一定存在对应的外部类对象。非静态内部类对象单独属于外部类的某个对象。
2. 非静态内部类可以直接访问外部类的成员，但是外部类不能直接访问非静态内部类成员。
3. 非静态内部类不能有静态方法，静态属性，静态初始化块
4. + **成员变量**访问要点；
   - 内部类属性：this.变量名
   - 外部类属性： 外部类名.this.变量名

调用内部类
```
  public static void main(String[] args){
      Outer.Inner i = new Outer().new Inner();    //这里直接输入 Inner 会报错，因为内部类不能独立存在，所以要在Inner前输入外部类，即Outer.
      
      inner.show();
  }
```

## 静态内部类

**定义方式**
```
  static class ClassName{
    //类体
  }
```

**使用要点：**
  1. 静态内部类可以访问外部类的静态成员，不能访问外部类的普通成员（可以直接当做静态属性）
  2. 静态内部类看做外部类的一个静态成员

```
class Outer2{
    private  int a = 10;
    private static int b = 20;      //相当于外部类的一个静态成员
    
    static class Inner2{
        public void test(){
 //         System.out.println(a);  //静态内部类不能访问外部类的普通属性
            System.out.println(b);  //静态内部类可以访问外部类的静态属性
        }
    }
}

public class TestStaticInnerClass{
    public static void main(String[] args){
    
        Outer2.Inner2 inner =new Outer2.Inner2();   //通过 new 外部类名.内部类名（来创建内部类对象）
        inner.test();
    }
}
```

> 关于内部类,Android高级进阶阶段会有一个内存泄露的知识点,不过这些都是后话,内部类这里做到会用会写就可以.

3/14

**匿名内部类**

适合只需要用一次的类

```
    new 父类构造器（实参类表/实现接口（）{
        //匿名内部类实体
    }
```
**例**

```
public class TestAnonymousInnerClass{
  public void test1(A a){
      a.run();
  }
}  
  public static void main(String[] args){
       TestAnonymousInnerClass t = new  TestAnonymousInnerClass();
       t.test1(new A(){               //new 的不是接口，是一个没有名字的A的实现类，因为没有名字所以只能用一次
          public void run(){
              System.out.println("一个匿名内部类")
          }
       });
        t.test1(new A(){               //又是一个独立的，新的内部类
          public void run(){
              System.out.println("第二个匿名内部类")
          }
       });
  }
  
  class Aimpl 
interface   A{
    void run();
}
```

**局部内部类**

定义在方法内部的，作用域也只限于本方法，称为局部内部类。（不怎么用）


# 数组

数组也是对象

数组是**相同类型**数据的**有序集合**，其中每一个数据称作一个元素，每个元素可以通过一个索引（下标 index）来访问他们

**数组的四个基本特点**

1. 长度是确定的。（数组一旦被创建，它的大小就是不可改变的）

2. 其元素的类型必须是相同类型，不允许出现混合类型。

3. 数组类型可以是任何数据类型，包括基本类型和引用类型。

4. 数组变量属于引用类型，数组也是对象，数组中的元素相当于对象的属性。

> 匿名内部类这里可以顺带了解一下lambda表达式,今天的内容也有点少了,每天多看一点.

3/15

## Lamda表达式

Lamda表达式（闭包）允许把函数作为一个方法的参数，可以使代码更加简洁紧凑

**Lamda声明格式**
```
(参数) -> 表达式           
或
(参数) ->{ 说明; }
```

**lambda表达式的特征**

+ **可选类型声明**：不需要声明参数类型，编译器可以统一识别参数值。
 
+ **可选的参数圆括号**：一个参数无需定义圆括号，但多个参数需要定义圆括号。
 
+ **可选的大括号**：如果主体包含了一个语句，就不需要使用大括号。
 
+ **可选的返回关键字**：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定表达式返回了一个数值。


**例**

```
public class Java8LambdaTester {
    public static void main(String args[]){
        Java8LambdaTester test1 = new Java8LambdaTester();

        text addition = (int a, int b) -> a + b;                        // 类型声明

        text subtraction = (a, b) -> a - b;                             // 不用类型声明

        text multiplication = (int a, int b) -> { return a * b; };      // 大括号中的返回语句

        text division = (int a, int b) -> a / b;                        // 没有大括号及返回语句

        System.out.println("10 + 5 = " + test1.operate(10, 5, addition));
        System.out.println("10 - 5 = " + test1.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + test1.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + test1.operate(10, 5, division));

    }
    
    interface text {                                                   //接口
        int operation(int a, int b);
    }

    private int operate(int a, int b, text t){
        return t.operation(a, b);
    }
}
```

## 数组的定义

**创建数组和初始化**

**数组的声明方式**
```
type[]  arr_name;       //方式一
type    arr_name;       //方式二
```

**注意事项**

+ 声明时并没有实例化任何对象，只有在实例化数组对象时，JVM才分配空间，这时才与长度有关。

+ 声明一个数组的时候并没有数组真正被创建。

+ 构建一个数组，必须指定长度


**创建基本类型一维数组**
```
public class Test {
    public static void main(String args[]){
        int[] s = null;                     //声明数组
        s = new int[10];                    //给数组分配空间（这里是10）。这时数组才被真正创建
        //这里的空间没有名字，但可以使用下标来访问
        //动态初始化
        for(int i = 0;i < 10;i++){
            s[i] = 2*i+1;               //给数组元素赋值（输入）； 数组是对象，数组中的元素就是对象的属性
        }   
        
         for(int i = 0;i < 10;i++){    //输出
            System.out.println(s[i]);   
        }   
        
    }
}
```

**创建引用类型一维数组**
```
class Man{
    private int age;
    private int id;
    public Man(int id,int age){
        super();
        this.age = age;
        this.id  = id;        
    }
}

public class AppMain {
    public static void main(String args[]){
        Man[] mans;                         //声明引用类型数组。类型是Man，说明之后只能往里放Man对象
        mans = new man[10];                 //给引用数组分配空间；
        
        Man m1 = new man(1.18);
        Man m2 = new Man(2.20);
        
        mans[0] = m1;                       //给引用类型数组元素赋值；m1的地址赋给了mans[0];
        mans[1] = m2;
    }
 }
 ```
 
 ## 数组的初始化
 
 数组的初始化方式总共有三种：静态初始化，动态初始化，默认初始化
 
 **1. 静态初始化**
 
 除了用 new 关键字来产生数组以外，还可以直接定义数组的同时就为数组元素分配空间并赋值。
 
 **例**
 ```
 int[] a = {1,2,3};                              //静态初始化基本类型数组
 Man[] mans = {new Man(1,1),(new Man(2,2))};     //静态初始化引用类型数组
 
 ```
**实例**
```
public class Test {
    public static void main(String args[]){
    int[] a = {10.20.30.40};
    
    Man mans[] = {new Man(1,10),                //可以在“，”后面换行，方便观看
                  new Man(2,20),
                  new Man(3,30)};
                  
    System.out.println(a[1]);
    System.out.println(mans[2].getAge());
    
    }
 }
 ```
 
 **2. 动态初始化**
 
 **数组定义**与**为数组元素分配空间并赋值**的操作分开进行
 
 **例**
 
 ```
 int[] a1 = new int[2];             //动态初始化数组，先分配空间；
 a1[0] = 1;           //给数组元素赋值
 a1[1] = 2;
 
 ```
 上文基本类型数组的例子就是动态初始化，挨个赋值
 
 **3. 默认初始化**
 
 数组是对象，它的元素相当于对象的属性，每个元素也都被按照属性的同样方式被默认初始化
 
 **例**
 
 ```
int a2p[] = new int[2];         //默认值：0,0
boolean[] = new boolean[2];     //默认值：false，false
String[] s = new String[2];     //默认值：null，null

```
> Lambda表达式一定做到看懂会写,程序中会经常用到,数组这里简单了解一下就可以.

3/16

## 数组的常见操作

**遍历，拷贝**

1. 遍历指的是"通过循环遍历数组的所有元素"
2. 拷贝指的是将某个数组的内容拷贝到另一个数组中

**数组的遍历**

数组元素下标的合法区间：[0,length-1]。可以通过下标来遍历数组中的元素，遍历时可以读取元素的值或者修改元素的值

[0,length-1]
```
int[] a = new int[10];    //这里是10，所有下标是 0 到 9 ，从 0 开始数
```

循环和初始化遍历时，其实就是使用 for 循环。

**for-each 循环**

for-each **专门用于读取数组或集合中所有的元素**，即数组进行遍历。

```
public class Test {
    public static void main(String args[]){
        String[] sz = {"aa","bb","cc","dd"};  //创立数组 sz  
        
        for(String A : sz){                   //这里的 A 为正在被遍历的元素
        
            System.out.println( A );
        }
    }
}    
```

**注意点**

+ for-each 增强 for 循环在遍历数组过程中不能修改数值中某元素的值

+ for-each 仅适用于遍历；不涉及有关索引（下标）的操作      //想用复杂操作还是得老老实实用敲 for 循环

## 数组的拷贝

```
System.arraycopy(object src,  //源数组
                 int srcpos,  //源数组中的起始位置                 
                 object dest, //目标数组                 
                 int destpos, //目标数据中的起始位置
                 int length)  //要复制的数组元素的数量
```

**例**

```
public class Test {
    public static void main(String args[]){
        String[ ] s = {"1号"，"2号"，"3号"，"4号"，"5号"};
        String[ ] sBak = new String[6];
        
        System.arraycopy(s,0,sBak,0,s.length);
            //arraycopy 为拷贝，从 s 拷贝到 sBak ，拷贝到目标位置 0 ，拷贝数量 s.length     
            
        for(int i = 0; i < sBak.length; i++){
            System.out.print(sBak[i]+ "\t");          //执行结果会有一个 null，因为有6个位置，而里面只放了5个
        }
    }
}    
```


## java.util.Arrays 类

Arrays 类包含了：排序，查找，填充，打印内容，等 常见的数组操作

**例，使用Arrays 类实现排序，二分查找法**
```
import java.util.Arrays;
public class Test {
    public static void main(String args[]){
        int[] a = {1,2,325,65,136,12,75,315};
        
        System.out.println(a);                    //打印数组引用的值
        Arrays.sort(a);               //sort 为排序,另外，使用二分法查找必须先对数组进行排序
        System.out.println(Arrays.toString(a));   //打印数组元素的值
        //到这里直接输出即为排序
         System.out.println("该元素的索引："+Arrays.binarySearch(a,12));   //如果有则返回排序后新的索引位置，若未找到则返回负数
                                          //意为：在 a 中查找有没有 12 这个值
    }
 }
```

**例，使用Arrays 类对数组进行填充**
```
import java.util.Arrays;
public class Test {
    public static void main(String args[]){
        int[] a = {1,2,325,65,136,12,75,315};
        System.out.println(Arrays.toString(a));
        
        Arrays.fill(a,2,7,100);         //将2到7索引的元素替换为100；注意，不包含7
        System.out.println(Arrays.toString(a));     //这里输出的结果为 [1,2,325,65,136,12,75,315]
                                                                     [1,2,100,100,100,100,75,315]
     }
 }
```
> 可以简单了解一下排序和查找一共有几种实现方式,各自的区别是什么,不需要会写,了解思路即可.
> 可以尝试对目前的笔记做一个目录,用超链接的形式点击跳转到相关词条.

3/17
（今天的会比较晚）

## 多维数组

**多维数组可以看成以数组为元素的数组**
一维为线，二维为面，3维为立方体

**语法**
```
public class Test {
    public static void main(String args[]){
        //声明和初始化按从低到高的顺序进行
        int[ ][ ] a = new int [数字][ ];    //注int[ ][ ] a = new int [ ][数字];的形态非法
        a[0] = new int [数字];
        a[1] = new int [数字];
        
        a[][] = 输入值；
        
        //静态初始化语法
        int[ ][ ] b = {
                        {1,2,3},
                        {2,3,4,5}
        };
        
        System.out.println(b[第几排][第几个])；
    }
}
```

## 数组存储表格数据

|**ID**|**姓名**|**年龄**|**职能**|
|   ---|     ---|    ---|     ---|
|1001  | 小A    |  18   |  学生   |

上图转为一维数组
```
Object[] a1 = {1001,"小A","18","学生"};  //数字不是对象，但java有个自动装箱，自动给装成对象
//转2维
Object[][] emps = Object[1][];
emps[0] = a1;

System.out.println(Arrays.toString(emps[0]));
```
3/18

## Comparable 接口

定义比较策略，用来帮助排序

多个对象作比较，就要有“比较规则”，然后实现排序。java中排序算法的底层也依赖 Comparable 接口

Comparable 接口中只有一个方法：

```
    public int compareTo(Object obj) obj 为要比较的对象
```

方法中，将当前对象和 obj 这个对象进行比较，如果大于返回 1，等于返回 0，小于返回 -1

**compareTo 方法的代码比较固定：例**
```
public int compareTo(Object o){
        Man man = (Man) o;
        if(this.age < man.age){
            return -1;
        }
        if(this.age > man.age){
            return 1;
        }
        return 0;
}
```
## 二分法查找

二分法检索(binary search)又称折半检索

使用二分法前要做排序

**原理**：首先找到中间数，然后拿中间数与需要查找的数作比较，如果比中间数大，就排除比中间数小的，比中间数小就能排除比中间数大的。

之后在找中间数，再比较，不断循环。因为每次都比之前少查找一半数据，所以效率很高。

# 异常机制

+ 异常机制
  - 异常机制的本质
  - 异常的概念
  - 异常的分类
  
+ 异常的处理
  - try-catch-finally
  - throw 声明异常
  - 自定义异常
  
+ 百度处理异常
  - 处理异常的步骤
  - 百度：超级搜索

+ debug 调试模式
  - 可视化调试
  
  
  ## 异常机制
  
  异常机制的本质就是：当程序出现异常，使程序安全的退出，处理完后继续执行的机制
  
  ## 异常(Exception) 的概念
  
  异常就是指程序运行过程中出现的非正常现象
  
  在 Java 的异常处理机制中，引进了很多用来描述和处理异常的类，称为异常类。异常类定义中包含了该类异常的信息和对异常进行处理的方法
  
    (发生小问题，解决还能继续跑就叫异常。发生大问题，无法解决，叫做错误？)
    
 > 这里不分大小问题,只要是异常就是问题,如果你捕获异常,并作出正确的处理方式,那程序就还能继续跑下去,如果发生错误时,你没有事先告诉程序发生错误应该如何处理,那就会停止.
    
 3/19（超链接周一一起搞）
 
 ## 异常分类
 
 Java对异常进行了分类，所有异常的根类为 java.lang.Throwable,Throwable 下面又派生了两个子类：Error 和 Exception
 
 ![QQ图片20230320010224](https://user-images.githubusercontent.com/110222247/226188494-89d102c2-db2d-4dc5-b364-49e37d0a0285.png)

**Error**

Error 是程序无法处理的错误，表示运行应用程序中较严重的问题。（JVM处于不可恢复的崩溃，不用处理了，直接重启）

大多数错误与代码编写者执行的操作无关，而表示代码运行时 JVM（Java虚拟机）出现的问题。

**Exception**

Exception 是程序本身能处理的异常。

Exception 类是所有异常类的父类，其子类对应了各种各样的异常事件，通常分为两类

1. RuntimeException 运行时异常  //编译器不管，运行时才会出现异常
2. CheckedException 已检查异常  //在编译时就会报错

![QQ图片20230320010904](https://user-images.githubusercontent.com/110222247/226188954-67e20114-7418-4da5-a70e-25477632b6a0.png)


**RuntimeException 运行时异常**

编译器不处理 RuntimeException，需要自行增加逻辑处理来避免这种异常

**例**
```
//String str = null;
//System.out.println(ste.charAt(0));
//str为空，但是调用了它的方法，调用不到所有会报异常

String str = null;
if(str ! = null){           //通过增加条件判断来避免
    System.out.println(ste.charAt(0));
}
```

**CheckedException 已检查异常**

编译器已检查的异常，在编译时就必须处理，否则无法通过编译

CheckedException 异常处理方式也有两种；

1. 使用"try/catch" 捕获异常 用"finally"结尾

![QQ图片20230320013014](https://user-images.githubusercontent.com/110222247/226190167-584dbf54-a912-45ad-9821-a5169ceb73cc.png)

**注意**：异常处理的代码执行结束后，不会回到try语句去执行尚未执行的代码

**try**

指定了一段代码，这段代码就是异常捕获并处理的范围。

**catch**

每个 try 语句可以伴随一个或多个 catch语句

如果异常类之间有继承关系，**先捕获子类异常再捕获父类异常**

**finally**

不管是否发生异常都必须执行

通常在 finally 中关闭已打开的资源

2. 使用"throws"    声明异常

CheckedException 产生时，不一定立刻处理它，可以把异常 throws，**由调用者处理**

一个方法抛出多个已检查异常，就必须在方法的首部列出所有的异常
```
public static void main(String args[]) throws 异常名 {

    finally{                      //无论抛不抛出，有没有异常，都是得关闭的，不然会一直持续占用资源
      System.out.println(" ");
    }
}
```
(调用者不想解决也可以继续往外抛，直到抛到 JRE (运行环境)里)

3/20

**try-with-resource 自动关闭 Closable 接口的资源

try-with-resource 可以自动关闭实现了 Closable 接口的类

```
try(FileReader = new FileReader(文件地址;)		//try()里面打开的资源会自动关掉
    FileReader = new FileReader(文件地址;)
){

}catch (Exceptiion e){
     e.printStackTrace();
}
```

## 自定义异常

在 JDK 提供的任何异常类都无法充分描述清楚想要表达的问题时，可以自己创建异常类，即自定义异常类

自定义异常类只需从 Exception 类或者它的子类派生一个子类

自定义异常类如果继承 Exception 类，则为 CheckedException 异常，必须进行处理；如果不想处理，可以让自定义异常类继承运行时异常 RuntimeException 类。

一般而言，自定义异常类应该包含 2 个构造器：一个默认构造器，一个带有详细信息的构造器

**常见异常写法**
```
puvlic class IllegalAgeException extends Exception{
	public IllegalAgeException(){
	}
	
	public IllegalAgeException(String message){
		super(message);
	}
}
```

**注**自己解决不了怎么办

1. 细心查看异常信息，确定异常种类和相关 Java 代码行号

2. 确定上下文的一些关键词信息（疑难问题，需要）
   
   拷贝异常信息到百度，查看相关帖子，寻找思路
   
3. 问人

**超级搜索**

关键词描述先细后粗

1. 寻找问题本身的关键词（名词）

2. 寻找问题上下文的关键词（名词）

3. 尽量细致的描述问题，如果没找到，通过慢慢减少关键词来扩大搜索范围

3/21

## IDEA 调试 debug

**断点 breakpoint**

调试的核心是断点。程序执行到断点时，暂时挂起，相当于看视频按暂停

在行号旁边左键一下就可以设置断点，再点一下取消

**进入调试视图**

设置断点后，右键单击该行，选择 Debug

![QQ图片20230321232354](https://user-images.githubusercontent.com/110222247/226638485-b305e57c-4656-4fca-842a-6f94843072be.png)





---
![QQ图片20230321232545](https://user-images.githubusercontent.com/110222247/226638532-11477160-80cd-4775-ae5b-ddd7386959ca.png)

![QQ图片20230321232644](https://user-images.githubusercontent.com/110222247/226638585-c2c073b5-4224-4721-9e76-9cad88740f74.png)

![QQ图片20230321232750](https://user-images.githubusercontent.com/110222247/226638617-70987ff6-f23c-4b21-99fc-b81913c066d1.png)





## 常用类

![QQ图片20230321233747](https://user-images.githubusercontent.com/110222247/226640634-4c698221-1d7b-4dec-b9cf-e62e60d35b27.png)




**基本数据类型的包装类**


![基本数据类型对应的包装类](https://user-images.githubusercontent.com/110222247/226642003-5c75d8cd-78f1-46d7-9a74-c3f124d2a5af.png)


**Number** 类是抽象类，因此他的抽象方法，所有子类都需要提供实现

**测试包装类的使用**

```
//把数字转成对象，就是包装类
public static void main(String[] args){
	integer i = new Integer(50);		//从 java9 开始被废弃
	integer j = integer.valueOf(10);	//**官方推荐**
}


//把包装类对象转成基本数据类型
	int a = j.intValue();
	double b = j.doubleValue();
```

## 包装类的用途

**对于包装类来说，用途主要包含两种**

1. 作为和基本数据类型对应的类型存在，方便涉及到对象的操作，如 Object[],集合等操作
2. 包含每种基本数据类型的相关属性，如最大值，最小值等，以及相关的操作方法(在基本数据类型，包装类对象，字符串之间提供相互之间的转化)

> 了解一下自动装箱和自动拆箱.

3/22
