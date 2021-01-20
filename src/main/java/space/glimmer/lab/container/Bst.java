package space.glimmer.lab.container;

/**
 * @author Lehr
 * @create: 2021-01-16
 * 二叉搜索树实现,需要完成除了getType的其他接口
 */
public class Bst implements BucketContainer{


    /**
     * 写死的,不能修改
     * @return
     */
    @Override
    public String getType() {
        return "bst";
    }


    /**
     * 搜索某个元素并返回
     * 其中key是这个元素Entry的key
     * @param key
     * @return
     */
    @Override
    public Entry searchElement(String key) {
        //todo:write your code here for part-b
        return null;
    }

    /**
     * 添加一个元素
     * @param e
     */
    @Override
    public void addElement(Entry e) {
        //todo:write your code here for part-b
    }

    /**
     * 更新一个节点
     * @param e
     */
    @Override
    public void updateElement(Entry e) {
        //todo:write your code here for part-b
    }

    /**
     * 删除一个节点
     * @param key
     */
    @Override
    public void removeElement(String key) {
        //todo:write your code here for part-b
    }

    /**
     * 按照树的"先序遍历",遍历并返回所有元素
     * @return
        */
    @Override
    public Entry[] traverse() {
        //todo:write your code here for part-b
        return null;
    }
}
