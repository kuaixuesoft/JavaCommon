/**
 * @author zhongqiu
 * 参考资料：http://blog.csdn.net/fyang2007/article/details/51517662
 * （1）集合中的List：arrayList，linkedList,vector的区别和使用场景。linkedlist双向循环链表，vector同步实现原理syn锁
 * ArrayList。【ArrayList implements List】【List extends Collection】【Collection extends Iterable】
 * LinkedList。【LinkedList implements List,Deque】【Deque extends Queue】【Queue extends Collection】
 * Vector。【Vector implements List】【elements方法内创建匿名类，返回Enumeration对象用来遍历集合】
 * Collections。【提供了很多对list的操作：排序，混排，替换，复制，最大最小值，移动list中元素位置】
 * （2）集合中的Stack：push，pop，peek，search。【Stack extends Vector】
 * （3）集合中的Array：数组的创建，数组作为参数，作为返回值
 * （4）集合中的Arrays类，对数组的各种操作。binarySearch，sort，fill，equals，asList，tostring，hashcode，copyof
 * （5）集合中的Set：hashset,LinkedHashSet，treeset，二叉树排序，自定义排序
 * （6）集合中的Map：hashmap,treemap,遍历。
 * 统计字符串中每个字符出现的次数。统计字符串中的大写，小写，数字，其他字符个数。统计字符串中子字符串出现的次数
 * 内部实现：数组+链表；hash算法 ；初始容量(桶)和加载因子；rehash操作(扩充容量2倍)；链地址法解决冲突；红黑树，put和delete
 * HashMap。【HashMap implements Map】
 * TreeMap。【TreeMap implements NavigableMap】【NavigableMap extends SortedMap】【SortedMap extends Map】
 * Hashtable。【Hashtable extends Dictionary implements Map】【synchronized内置锁保证线程安全】
 */
package zhongqiu.common.base.collections;