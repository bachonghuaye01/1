# 1
练习
每天一问

3/3

## this
this代表当前对象本身，本质是当前对象  
普通方法中this指向调用该方法的对象  
构造方法中，this指向正要初始化的对象  
this（）调用重载的构造方法，避免相同的初始化代码。但只能在构造方法中用且必须位于第一句  
this不能用于静态方法，//因为在两个不同的区域？this在堆，staic在方法区  
> static的含义为首先加载到内存中,当程序开始运行时,会首先将被static修饰的类,方法和变量加载到内存中.因此static方法中不可直接访问非static的成员,因为此时非static的成员还没有被创建.
## static
静态变量，方法（类变量，方法）：static声明的属性或方法  
static的属性和方法同属于类。生命周期与类相同，  
static变量只有一份，一般用“类名/类变量，方法”来调用  
static方法中不可直接访问非static的成员  

## 静态初始化块
构造方法用于对象普通属性的初始化  
静态初始化块用于类的初始化，初始化一些静态的属性（静态初始化块中不能直接访问非static成员）  

## 变量的分类和作用域
局部变量属于方法  
成员变量属于对象  
静态变量属于类  

> 这里用makedown语法整理成表格形式.

  | **类型** |    **声明位置**    |   **从属**  |   **生命周期（作用域）**   |
  |:-:      |:-:                 |:-:          |:-: |
  |局部变量  |  方法或语句块内部   | 方法/语句块  | 从声明处开始，到方法或语句块结束|
  |成员变量  | 类的内部，方法的外部|    对象    | 对象创建，成员变量也跟着创建。对象消失，同样消失|
  |静态变量  | 类内部，static修饰 |     类     | 类被加载，静态变量就有效 |
  
3/4
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
例: com.qiao.mu.123 = new com.qiao.mu.123();

import java.util.*;  //这里的 .* 的作用是导入该包下所有类，会降低编译速度，但不会降低运行速度，因为实际只会运行使用的类

## 静态导入（static import）

 作用是用于导入指定类的静态属性和静态方法，让我们可以直接使用它们
 
 **例**
 
 import static java.lang.Math.*;  //导入Math类的所有静态属性
 
 import static java lang Math.PI; //导入Math类的PI属性
 
 //导入之后
 
 System.out.println(PI);   //这里原本需要输入（Math.PI）,因为上面已经导入，所以直接输入(PI)即可
> 前面这些概念性的可以提提速,给咱们后面集合框架,多线程,反射多留点时间.3月份务必拿下javaSE

3/6

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
