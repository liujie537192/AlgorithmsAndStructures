# 数据结构与算法

## 1.数据结构
### 1.1 线性表
定义: 零个或多个元素的有限序列。也就是说，元素之间是有顺序的。
#### 1.1.1 线性表的顺序存储结构

概念

----

- 用一段地址连续的存储单元依次存储线性表的数据元素<br>
- 就是在内存中找了块地儿， 通过占位的形式， 把一定内存空间给占了， 然后把相同数据类型的数据元素依次存放在这块空地中。

----

特点

----

可以随时计算出线性表中任意位置的地址，不管第一个还是最后一个，都是相同的时间。那么我们对每个线性表位置的存入和取出数据，对计算机来讲都是相同的时间，也就是一个常数。因此用时间复杂度的概念来说，存取性能为O(1)。通常把具有这一特点的存储结构称为随机存储结构。

----

优缺点

----
优点:<br>
1.无须为表示表中元素之间的逻辑关系而增加额外的存储空间<br>
2.可以快速的存取表中任意位置的元素<br>
<br>
缺点:<br>
1.插入和删除操作需要移动大量的元素<br>
2.当线性表长度变化较大时，难以确定存储空间的容量
3.造成存储空间的“碎片”
<br>

总结:<br>
存取数据时，不管在哪个位置，时间复杂度都是O(1)，而插入或者删除时，时间复杂度都是O(n)，比较适合元素个数变化不大，而更多是存取数据的应用

----

#### 1.1.2 线性表的链式存储结构

概念

----

- 用一组任意存储单元来存储线性表的数据元素，这组存储单元可以是连续的，也可以是不连续的，这些数据元素可以存在于内存未被占用的任意位置。
- 在链式结构中， 除了要存数据元素信息外， 还要存储它的后继元素的存
储地址。


----

##### 1.1.2.1 单链表

----

单链表获取第i个元素的算法思路:<br>
1.声明一个指针p指向链表第一个结点， 初始化j从1开始；<br>
2.当j<i时， 就遍历链表， 让p的指针向后移动， 不断指向下一结点，j累
加1；<br>
3.若到链表末尾p为空， 则说明第i个结点不存在；<br>
4.否则查找成功， 返回结点p的数据。<br>

上述算法的时间复杂度为O(n)<br>
<br><br>
单链表的插入和删除:<br>
如果在我们不知道第i个结点的指针位置， 单链表数据结构在插入和删除操作上， 与线性表的顺序存储结构是没有太大优势的。 但如果， 我们希望从第i个位置， 插入10个结点， 对于顺序存储结构意味着， 每一次插入都需要移动n-i个结点， 每次都是O(n)。 而单链表， 我们只需要在第一次时， 找到第i个位置的指针， 此时为O(n)， 接下来只是简单地通过赋值移动指针而已， 时间复杂度都是O(1)。 显然， 对于插入或删除数据越频繁的操作， 单链表的效率优势就越是明显

<br>
单链表结构与顺序存储结构对比:<br>

存储分配方式|时间性能|空间性能
-----|-----|-----
1.顺序存储结构用一段连续的存储单元依次存储线性表的元素<br>2.单链表采用链式存储结构，用一组任意的存储单元存放线性表的元素|查找<br>&nbsp;&nbsp;顺序存储结构O(1)<br>&nbsp;&nbsp;单链表O(n)<br>插入和删除<br>&nbsp;&nbsp;顺序存储结构需要平均移动一半的元素，时间为O(n)<br>&nbsp;&nbsp;单链表在找出某位置的指针后，插入和删除时间仅为O(1)|&nbsp;&nbsp;顺序存储结构需要预分配存储空间，分大了浪费，分小了溢出<br>&nbsp;&nbsp;单链表不需要预分配存储空间，元素个数也不受限制

<br>
结论:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;若线性表需要频繁查找， 很少进行插入和删除操作时， 宜采用顺序
存储结构。 若需要频繁插入和删除时， 宜采用单链表结构。 比如说
游戏开发中， 对于用户注册的个人信息， 除了注册时插入数据外，
绝大多数情况都是读取， 所以应该考虑用顺序存储结构。 而游戏中
的玩家的武器或者装备列表， 随着玩家的游戏过程中， 可能会随时
增加或删除， 此时再用顺序存储就不太合适了， 单链表结构就可以
大展拳脚。 当然， 这只是简单的类比， 现实中的软件开发， 要考虑
的问题会复杂得多。<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当线性表中的元素个数变化较大或者根本不知道有多大时， 最好用
单链表结构， 这样可以不需要考虑存储空间的大小问题。 而如果事
先知道线性表的大致长度， 比如一年12个月， 一周就是星期一至星
125期日共七天， 这种用顺序存储结构效率会高很多。

----

### 1.2 栈

定义:

----

限定仅在表尾进行插入和删除操作的线性表。又称为后进先出（Last In First Out） 的线性表， 简称LIFO结构。

栈的插入操作， 叫作进栈， 也称压栈、 入栈。<br>
栈的删除操作， 叫作出栈， 也有的叫作弹栈。

栈本身是一个线性表，线性表的顺序存储和链式存储同样适用于栈。

具体实现参见：<br>
<a href="https://github.com/PPJLiuJie/AlgorithmsAndStructures/blob/dev/src/com/java/lj/structure/stack/SeqStack.java" target="_blank">SeqStack.java</a><br>
<a href="https://github.com/PPJLiuJie/AlgorithmsAndStructures/blob/dev/src/com/java/lj/structure/stack/LinkedStack.java" target="_blank">LinkedStack.java</a>

----

#### 1.2.1 递归

定义：

----

我们把一个直接调用自己或通过一系列的调用语句间接地调用自己的函数，称做递归函数。

迭代和递归的区别是： 
<br>　　迭代使用的是循环结构，递归使用的是选择结构。递归能使程序的结构更清晰、更简洁、更容易让人理解，从而减少读懂代码的时间。但是大量的递归调用会建立函数的副本，会耗费大量的时间和内存。迭代则不需要反复调用函数和占用额外的内存。因此我们应该视不同情况选择不同的代码实现方式。

----

### 1.3 队列

定义:

----

只允许在一端进行插入操作， 而在另一端进行删除操作的线性表。队列是一种先进先出（First In First Out） 的线性表， 简称FIFO。

插入数据只能在队尾进行， 删除数据只能在队头进行。

队列本身是一个线性表，线性表的顺序存储和链式存储同样适用于栈。

具体实现参见：<br>
<a href="https://github.com/PPJLiuJie/AlgorithmsAndStructures/blob/dev/src/com/java/lj/structure/queue/SeqQueue.java" target="_blank">SeqQueue.java</a>　　用循环队列解决了“移动元素造成时间损耗”和“空间浪费”的问题<br>
<a href="https://github.com/PPJLiuJie/AlgorithmsAndStructures/blob/dev/src/com/java/lj/structure/queue/LinkedQueue.java" target="_blank">LinkedQueue.java</a>

----

### 1.4 栈和队列的总结

----

栈（stack） 是限定仅在表尾进行插入和删除操作的线性表。<br>
队列（queue） 是只允许在一端进行插入操作， 而在另一端进行删除操
作的线性表。

它们均可以用线性表的顺序存储结构来实现， 但都存在着顺序存储的一
些弊端。 因此它们各自有各自的技巧来解决这个问题。

对于栈来说， 如果是两个相同数据类型的栈， 则可以用数组的两端作栈
底的方法来让两个栈共享数据， 这就可以最大化地利用数组的空间。

对于队列来说， 为了避免数组插入和删除时需要移动数据， 于是就引入
了循环队列， 使得队头和队尾可以在数组中循环变化。 解决了移动数据
的时间损耗， 使得本来插入和删除是O(n)的时间复杂度变成了O(1)。

----


# 参考文献
《大话数据结构》<br>
《Java数据结构与算法》

# 参考博客
<a href="http://blog.csdn.net/javazejian/article/details/52953190" target="_blank">java数据结构与算法</a>
