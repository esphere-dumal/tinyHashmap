package space.glimmer.lab.container;

import javax.xml.soap.Node;
import java.util.LinkedList;

/**
 * @author Lehr
 * @create: 2021-01-16
 * 链表的实现,需要完成除了getType的其他接口
 * 你可以选择自己手写一遍实现,也可以学习使用Java 泛型容器里的LinkedList实现好了的链表直接写这里
 */
public class NodeList implements BucketContainer{

    //链表节点
    class Node{
        Entry entry;
        Node next;
        public Node(Entry entry) {
            this.entry = entry;
            this.next = null;
        }
    }
    //链表的哨兵节点
    Node head = new Node(null);

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

        Node tempNode = head;

        if(tempNode.next!=null){
            tempNode=tempNode.next;
            while (tempNode!=null){
                //找到了相应的key
                if(key==null&&tempNode.entry.key==null)
                    return tempNode.entry;

                else if(key.equals(tempNode.entry.key))
                    return tempNode.entry;
                tempNode=tempNode.next;
            }
        }

        //没有相应的key
        return null;
    }

    /**
     * 添加一个元素
     * @param e
     */
    @Override
    public void addElement(Entry e) {
        //todo:write your code here for part-a
        //相当于添加一个元素到链表尾部
        Node tempNode = head;

        while(tempNode.next!=null)
            tempNode = tempNode.next;

        tempNode.next = new Node(e);
    }


    /**
     * 更新一个节点
     * @param e
     */
    @Override
    public void updateElement(Entry e) {
        //todo:write your code here for part-a
        //相当于先查找一个元素，然后更新
        Node tempNode = head;

        if(tempNode.next!=null){
            tempNode = tempNode.next;
            while(tempNode!=null){
                if(tempNode.entry.key==null&&e.key==null)
                    tempNode.entry.value = e.value;
                else if(tempNode.entry.key.equals(e.key))
                    tempNode.entry.value = e.value;
                tempNode = tempNode.next;
            }
        }

    }

    /**
     * 删除一个节点
     * @param key
     */
    @Override
    public void removeElement(String key) {
        //todo:write your code here for part-a
        Node tempNode = head;

       while(tempNode.next!=null){
           if(tempNode.next.entry.key==null&&key==null){
               tempNode.next = tempNode.next.next;
               return;
           }
           if(tempNode.next.entry.key.equals(key)) {
               tempNode.next = tempNode.next.next;
               return;
           }

           tempNode = tempNode.next;
       }
    }

    /**
     * 遍历并返回所有元素
     * @return
     */
    @Override
    public Entry[] traverse() {
        //todo:write your code here for part-a
        //此处临时数组考虑到part-c扩容最大至32
        Entry[] res = new Entry[32];
        int cnt=0;
        Node tempNode = head;
        if(tempNode.next!=null){
            tempNode=tempNode.next;
            while(tempNode!=null){
                res[cnt++] = tempNode.entry;
                tempNode = tempNode.next;
            }
        }
        return res;
        //return null;
    }
}
