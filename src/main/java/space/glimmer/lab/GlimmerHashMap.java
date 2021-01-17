package space.glimmer.lab;

import space.glimmer.lab.container.Bucket;

/**
 * @author Lehr
 * @create: 2021-01-16
 * 一个非常简单版本的HashMap的实现
 * 分为了a,b,c,d四个部分,每个部分完成后去进行对应的测试即可
 */
public class GlimmerHashMap {

    /**
     * buckets数组的长度
     * 初始默认是4
     * 到part-c部分的扩容,每次扩充到原来的两倍,比如4->8->16->32
     * 不需要考虑收缩的情况
     */
    private int bucketLen = 4;

    /**
     * 拉链法实现哈希表的这个数组,里面的每个桶Bucket里通过数据结构存放内容
     */
    private Bucket[] buckets;

    /**
     * 阈值,意思是,在下次扩容之前,这个hashmap里最多能装多少元素
     * 默认是16,每次扩容变成之前的两倍
     * 比如:
     * 当我们有15个元素的时候,不用扩容
     * 当我们有16个元素的时候,刚刚满了,不用扩容
     * 当我们想要加入第17个元素的时候,则需要扩容到32,完成看扩容后,加入这个元素
     */
    private int threshold = 16;




    /**
     * 通过传入的key,返回对应的bucket
     * 测试用例需要使用到的检查方法,请实现这里
     * @param key
     * @return
     */
    public Bucket getBucket(String key) {
        //todo:write your code here for part-a
        return buckets[hashIt(key)];
    }


    /**
     * 获取到目前hashmap里有多少个元素的接口
     * @return
     */
    public int size() {
        //todo:write your code here for part-a
        return 0;
    }

    /**
     * 通过key获取一个元素,如果没有则返回 ""
     *
     * @param key
     * @return
     */
    public String get(String key) {
        //todo:write your code here for part-a
        return null;
    }

    /**
     * 添加一组键值对,如果key已经存在了,则覆盖
     * 返回值是old value
     * 如果之前不存在则返回null
     * 完成part-a后,后面另外两部分需要在原有的代码上继续修改才能成功
     * @param key
     * @param value
     * @return
     */
    public String put(String key, String value) {
        //todo:write your code here for part-a
        //todo:write your code here for part-b
        //todo:write your code here for part-c
        return null;
    }

    /**
     * 通过key删除对应的value,并把这个value返回,如果为空则返回null
     * 完成part-a后,后面另外的部分需要在原有的代码上继续修改才能成功
     * @param key
     * @return
     */
    public String remove(String key) {
        //todo:write your code here for part-a
        //todo:write your code here for part-b
        return null;
    }

    /**
     * 哈希表扩容方法的实现
     * 扩容规则:
     * 时机:当阈值满了且又有新元素要添加时
     * 规则:buckets数组变为原来长度的两倍,阈值变为原来的两倍,重新哈希所有元素
     */
    private void resize() {
        //todo:write your code here for part-c
    }


    /**
     * 构造方法,初始化一下每个Bucket
     */
    public GlimmerHashMap() {
        buckets = new Bucket[bucketLen];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }
    }

    /**
     * 通过哈希来获取某个key被映射后的数组下标位置
     * 实际上这里是个很糟糕的实现,这样只是为了好配合设计测试用例
     * @param key
     * @return
     */
    public int hashIt(String key) {
        return key==null?0:Math.abs(key.hashCode()) % bucketLen;

    }

    /**
     * 获取阈值的getter
     * @return
     */
    public int getThreshold() {
        return threshold;
    }
}
