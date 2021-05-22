# [Java-HashMap](https://github.com/happyflyer/Java-HashMap)

- [Map 从入门到性能分析](https://www.imooc.com/learn/1242)

## 1. 目标

- 学习 HashMap 的构造方法、合适的遍历、复制转換等
- 学习 HashMap 必须要知道的底层原理
- TreeMap、LinkedHashMap 比 HashMap 更好吗？
- 看图说话，对比各 Map 实现类的速度

## 2. 内容

- HashMap
  - HashMap 有几种构造方法？怎么用？
- HashMap 底层原理
  - 存取的过程
  - 怎样进行初始化
  - 扩容
- LinkedHashMap、TreeMap 的用法
- 性能分析

## 3. Map 接口

![Map接口](https://cdn.jsdelivr.net/gh/happyflyer/picture-bed@main/2021/Map接口.2g4x4dcmsqtc.jpg)

- `V put(K key, V value);`
- `V get(Object key);`
- `int size();`
- `V remove(Object key);`
- `boolean containsKey(Object key);`

```java
static class Entry<K, V> implements Map.Entry<K, V> {
    final K key;
    V value;
    Entry<K, V> next;
    final int hash;
}
```

## 4. get 操作性能对比

实验结果：**entrySet()** 优于 **Iterator** 优于 **values()** 优于 **keySet()**

### 4.1. keySet()

```java
for (String key : userMap.keySet()) {
    value = userMap.get(key);
}
```

### 4.2. values()

```java
for (Integer v : userMap.values()) {
    value = v;
}
```

### 4.3. entrySet()

```java
for (Map.Entry<String, Integer> entry : userMap.entrySet()) {
    value = entry.getValue();
}
```

### 4.4. Iterator

```java
Iterator<Map.Entry<String, Integer>> it = userMap.entrySet().iterator();
while (it.hasNext()) {
    Entry<String, Integer> entry = it.next();
    value = entry.getValue();
}
```

## 5. HashMap 底层原理

- 了解 HashMap 底层原理是每个 Java 工程师的必修课
- 可以更好的进行 HashMap 的优化设计
- 与行业内同事沟通交流的话题

### 5.1. 一个例子

```java
Map<Integer, String> intMap = new HashMap<>();
intMap.put(120, "a");
intMap.put(37, "b");
intMap.put(61, "c");
intMap.put(40, "d");
intMap.put(92, "e");
intMap.put(78, "f");
```

```java
{37=b, 120=a, 40=d, 92=e, 61=c, 78=f}
```

![HashMap底层原理](https://cdn.jsdelivr.net/gh/happyflyer/picture-bed@main/2021/HashMap底层原理.1i6e2orv6gjk.jpg)

### 5.2. 两个关键方法

```java
Map<String, Integer> strMap = new HashMap<>();
strMap.put("yuwen", 90);
strMap.put("yinyue", 78);
strMap.put("tiyu", 88);
strMap.put("shuxue", 60);
strMap.put("meishu", 98);
```

```java
{yuwen=90, shuxue=60, tiyu=88, yinyue=78, meishu=98}
```

#### 5.2.1. hash

```java
static final int hash(Object key);
```

用 `hashCode()` 方法**将 key 转换成 hash 码**后并进行优化得到**优化后的 hash 码**。

例如：将 `yuwen` 这个字符串优化后的 hash 码是 `115347492`。

#### 5.2.2. indexFor

```java
static final int indexFor(int h, int length);
```

对优化后的 hash 码，进行**取址**，确定在 HashMap 的位置。

例如：`115347492` 在长度是 16 的 HashMap 中，取址的坐标是 `4`。

### 5.3. 三个构造方法

```java
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
```

```java
static final float DEFAULT_LOAD_FACTOR = 0.75f;
```

- `public HashMap()`
- `public HashMap(int initialCapacity)`
- `public HashMap(int initialCapacity, float loadFactor)`

![HashMap扩容](https://cdn.jsdelivr.net/gh/happyflyer/picture-bed@main/2021/HashMap扩容.15t8gthux8io.jpg)

- `new HashMap(5)`，初始化的长度就是 $5$ 吗？

初始化长度为传入长度的最小的 $2$ 的 $n$ 次方，初始化长度为 $8$。

- `new HashMap(10000, 0.75)`，要录入的数据有 $10000$ 条，会产生扩容吗？

初始化长度为 $2^{14} = 16384$，扩容长度为 $16384 \times 0.75 = 12288$，不会扩容。

```java
/**
 * 1、创建 10 个 HashMap，每个 HashMap 含有 10w 条记录
 * 2、传递不通的构造方法的参数，比较速度
 * 3、实验参数：构造方法传参 (16, 0.75f) 和 (16384, 0.75f)
 */
```

`initialCapacity` 的设置要合适，适应业务需求，尽量避免扩容。

### 5.4. 常用方法

- 判断是否为空、删除结点、清空 HashMap 对象
- 判断是否有某个 key、判断是否有某个 value
- HashMap 替换某个 key 的 value

```java
/**
 * 用到的技术点：
 * 1、isEmpty
 * 2、remove, clear
 * 3、containsKey, containValue
 * 4、replace
 * 5、put, putIfAbsent
 * 6、forEach((key, value) -> System.out.println(key + ": " + value))
 * 7、getOrDefault(Object key, V defaultValue)
 */
```

- `boolean isEmpty();`
- `V remove(Object key);`
- `void clear();`
- `boolean containsKey(Object key);`
- `boolean containsValue(Object value);`
- `default V replace(K key, V value)`
- `default boolean replace(K key, V oldValue, V newValue)`
- `V put(K key, V value);`
- `default V putIfAbsent(K key, V value)`
- `default void forEach(BiConsumer<? super K, ? super V> action)`
- `default V getOrDefault(Object key, V defaultValue)`

## 6. LinkedHashMap

### 6.1. 对比实验

```java
/**
 * 1、分别给 HashMap 和 LinkedHashMap 录入 100w 条记录，并循环遍历，观察耗时
 * 2、都采用不带参的空构造方法
 */
```

- `put` 操作：**HashMap** 优于 **LinkedHashMap**
- `get` 操作：**LinkedHashMap** 优于 **HashMap**

### 6.2. 两种输出顺序

- 录入顺序
- 使用顺序

```java
public LinkedHashMap(int initialCapacity,
                     float loadFactor,
                     boolean accessOrder)
```

```java
new LinkedHashMap<>(16, 0.75f, true)
```

### 6.3. 利用 LinkedHashMap 实现 LRU

- [LRU 缓存算法](https://www.jianshu.com/p/b1ab4a170c3c)

```java
public class LruMap<K, V> extends LinkedHashMap<K, V> {
    private int maxSize;
    public LruMap(int maxSize) {
        super(16, 0.75f, true);
        this.maxSize = maxSize;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.maxSize;
    }
}
```

## 7. TreeMap

- 对 TreeMap 实现增、删、遍历、排序等操作
- 存取耗时对比
  - `put` 操作：**HashMap** 优于 **LinkedHashMap** 优于 **TreeMap**
  - `get` 操作：**LinkedHashMap** 优于 **TreeMap** 优于 **HashMap**
