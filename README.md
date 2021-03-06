# 设计模式

设计模式分为三种类型，共23种

- **创建型模式**：单例模式、抽象工厂模式、建造者模式、工厂模式、原型模式。
- **结构型模式**：适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式
- **行为型模式**：模版方法模式、命令模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式、状态模式、策略模式、职责链模式(责任链模式)、访问者模式。

自己的一些理解

- 创建型，主要作用于类上面，避免了new对象，而是通过其他的方式创建出更丰富的对象
- 结构型，（对象+类），组成更大的结构
- 行为型，作用于方法，普通的创建对象的方法调用如果通过

## 常用设计模式的详解

### 观察者模式 （行为型）

[观察者代码示例](src/main/java/dp01_observer)

理解：类似于一种 `发布 + 订阅` 的方式

- 观察者订阅主题 代码中的表现一般是 :
    - 主题包含一个订阅者（观察者）的集合
    - 主题中的方法添加(或删除)观察者
- 当主题有消息的时候，主题会通知观察者，代码中的表现：
    - 主题 通知所有的观察者

**一些自己的思考**

- 被观察者通知观察者的时候有两种方式
    - 推：
    - 直接将值传入，通知观察者具体内容
    - 拉：
    - 传入被观察者自己的引用，这一步操作可以让观察者根据自己需要的内容从被观察者的对象里取出东西

JDK也有自己的观察者模式

- 被观察者
    - `java.util.Observable`
- 观察者
    - `java.util.Observer`

平常自己设计的时候可能有推有拉，但是jdk的设计是即包含推也包含拉

### 工厂模式 （创建型）

#### 简单工厂

**工厂根据类型创建不同的东西，需要被创建的东西抽象一下**
简单工厂可以理解成根据类型创建

- 工厂是一个类，而不是一个接口
- 被创建出来的内容可以设计成接口
    - 工厂 根据type来分辨 如何创建（多态的一种思路）

#### 工厂方法

**再把工厂抽象一下，一种工厂对应一种东西**
工厂也被抽象出来，工厂和工厂创建的内容都是抽象的

- 一般情况下，每个具体的工厂，创建具体的内容
- 有点类似根据 不同的类型的工厂 创建不同的内容

#### 抽象工厂

**分合的思路**

- 抽象的工厂接口，包含了需要创建的对象的各个部分
    - 重点：需要创建的对象的各个部分
    - 各个部分也可以用接口表示
    - 从工厂接口来看，就是一个接口包含多个部分
    - 对象的各个部分在设计的时候最好是平级的关系
- 现实的例子就是，台式电脑由不同的组件组合而成
    - 台式电脑是一个大的抽象
    - 抽象的分成 cpu 主板 电源 显卡
    - 每种类型的电脑接口实现类都可以生产出自己指定的 cpu 主板 电源 显卡

#### 策略模式 （行为型）

策略模式属于对象的行为模式。其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。策略模式使得算法可以在不影响到客户端的情况下发生变化。

有时候从过度设计的角度来看 策略模式可以替换if else 但是没啥必要

- 1、`Context` 持有 `策略对象的抽象 strategy`
    - `strategy` 被抽象了，可以传入不同的实现，从而实现不同的策略
    - 既然是 `持有`，如果不去调用就没有意义的
- 2、`strategy` 的抽象
    - 不同策略的接口实现
- 3、`Client端` 使用 `Context`
    - `Context` 需要 传入具体的 `策略的实现`

#### 适配器模式 （结构型）

**总体思路**

- 目标接口 Target 包含了一系列方法
- 原来的类 `Adaptee extends Target`
    - Adaptee这个类是要被适配的
- Adapter适配进行适配
    1. 直接继承 Adaptee 进行适配
    2. 包含一个 Adaptee 的引用进行适配

问题思考

- `适配器模式` 和 `代理`、`装饰模式` 有什么区别
    - 适配器侧重点是**改变**
    - 代理侧重点是改变**访问**
    - 装饰侧重点是**增强**

#### 命令模式 （行为型）

命令模式是对命令的封装。命令模式把发出命令的责任和执行命令的责任分隔开，委派给不同的对象。

自我的理解就是把一个对象的一系列的共性方法 转成 对象

- `方法` 变成 `对象`
- `对象` 实现 `统一的命令接口`

基于代码的理解

- 真正进行操作的对象（一个对象包含多个方法）
    - 称之为：`接收者`
- 命令的接口
    - 这个接口主要为了 把 上面所说的 **对象包含的多个方法** 进行 **一一拆解**
- 命令接口实现类
    - 每一个实现类都包含了真正操作的对象
    - 实现类通过真正的对象的**某个方法的调用** 复写 接口的方法
    - 这一层的接口就是一个嵌套
- 请求对象
    - 请求对象可以基于命令的接口封装多个命令，以此来调用
    - 因此在客户端使用的时候可以通过命令的方式准确控制

#### 装饰器模式 （结构型）

装饰器模式就是把原来的对象进行再次封装，添加东西

基于代码的理解

- 统一的抽象类来描述一个对象
    - 真实的类会继承这个
    - 装饰的类也会继承这个
- 真实的类自己有一定的抽象
- 装饰的类真正构造的实现要包含一个统一抽象的引用
    - 为什么包含统一抽象的引用，为了把真实的类传入进来
- 个人感觉有点像适配器

#### 外观模式 （结构型）

- 将很多细节组成的一个完成的操作封装起来
- 封装出很多操作
- 一起调用

#### 模板方法 （行为型）

- 定义一套模板
    - 模板里面有些方法是默认实现好的
    - 模板里面的抽象方法，根据继承模板的类自我实现
- 调用定义好的模板，不同的模板实现就会有不同的结果

#### 状态模式 （行为型）

> 和策略模式有点类似

- 自我理解
    - 策略模式注重在不同的策略来处理输入
    - 状态模式注重不同的状态来处理输出
    - 状态模式有循环依赖的感觉
    - 不怎么符合开闭原则
    - 将多态划分在好几个类里面
    - 有种将多态再次封装的意思