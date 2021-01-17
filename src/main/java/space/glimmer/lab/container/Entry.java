package space.glimmer.lab.container;

/**
 * 代表的是BucketContainer数据结构里的每个元素的类型
 * 封装了一组Key-Value,仅此而已
 */
public class Entry{
    public String key;
    public String value;

    public Entry(String key, String value) {
        this.value = value;
        this.key = key;
    }
}