package space.glimmer.lab.container;

import java.util.LinkedList;

/**
 * @author Lehr
 * @create: 2021-01-16
 * 链表的实现,需要完成除了getType的其他接口
 * 你可以选择自己手写一遍实现,也可以学习使用Java 泛型容器里的LinkedList实现好了的链表直接写这里
 */
public class NodeList implements BucketContainer{

    /**
     * 写死的,不能修改,用来判断具体的数据结构
     * @return
     */
    @Override
    public String getType() {
        return "nodelist";
    }

    /**
     * 搜索某个元素并返回
     * 其中key是这个元素Entry的key
     * @param key
     * @return
     */
    @Override
    public Entry searchElement(String key) {
        //todo:write your code here for part-a
        return null;
    }

    /**
     * 添加一个元素
     * @param e
     */
    @Override
    public void addElement(Entry e) {
        //todo:write your code here for part-a
    }


    /**
     * 更新一个节点
     * @param e
     */
    @Override
    public void updateElement(Entry e) {
        //todo:write your code here for part-a
    }

    /**
     * 删除一个节点
     * @param key
     */
    @Override
    public void removeElement(String key) {
        //todo:write your code here for part-a
    }

    /**
     * 遍历并返回所有元素
     * @return
     */
    @Override
    public Entry[] traverse() {
        //todo:write your code here for part-a
        return null;
    }
}
