package space.glimmer.lab.container;

/**
 * 抽象出的代表Bucket的数据容器部分的接口
 * 具体实现可以是Bst二叉搜索树
 * 也可以是nodelist链表
 */
public interface BucketContainer {

    /**
     * 写死的,不能修改,用来判断具体的数据结构
     * @return
     */
    String getType();

    /**
     * 搜索某个元素并返回
     * 其中key是这个元素Entry的key
     * @param key
     * @return
     */
    Entry searchElement(String key);

    /**
     * 添加一个元素
     * @param e
     */
    void addElement(Entry e);

    /**
     * 更新一个节点
     * @param e
     */
    void updateElement(Entry e);

    /**
     * 删除一个节点
     * @param key
     */
    void removeElement(String key);

    /**
     * 遍历并返回所有元素
     * @return
     */
    Entry[] traverse();

}

