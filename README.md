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

  | **类型** | **声明位置** | **从属** | **生命周期（作用域）** | 
  ---
  <p>| :-局部变量-: | :方法或语句块内部: | :方法/语句块: | :从声明处开始，到方法或语句块结束:|  
</p>
  <p>| :成员变量: | :类的内部，方法的外部:  | :对象: |:对象创建，成员变量也跟着创建。对象消失，同样消失:|
</p>                                                        
  <p>| :静态变量: | :类内部，static修饰: | :类: | :类被加载，静态变量就有效: |
</p>
//哪里出了问题，怎么做不出来表
//先这样吧，来不及了回来再看视频
