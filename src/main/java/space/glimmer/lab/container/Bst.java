package space.glimmer.lab.container;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.Stack;

/**
 * @author Lehr
 * @create: 2021-01-16
 * 二叉搜索树实现,需要完成除了getType的其他接口
 */
public class Bst implements BucketContainer{

    class Node {
        Entry entry;
        //0为左，1为右，左树小一点
        Node[] next = new Node[2];
        boolean isDelete;
        public Node(Entry entry) {
            this.entry = entry;
            isDelete = false;
            next[0] = null;
            next[1] = null;
        }
    }
    Node head = null;

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
        Node tempNode = head;

        if(key==null){
            while(tempNode!=null){
                if(tempNode.entry.key==null){
                    if(tempNode.isDelete) return null;
                    return tempNode.entry;
                }
                tempNode = tempNode.next[0];
            }
        }

        while(tempNode!=null){
            if(tempNode.entry.key.equals(key)){
                if(tempNode.isDelete) return null;
                return tempNode.entry;
            }
            if(key.compareTo(tempNode.entry.key)<0)
                tempNode = tempNode.next[0];
            else tempNode = tempNode.next[1];
        }

        return null;
    }

    /**
     * 添加一个元素
     * @param e
     */
    @Override
    public void addElement(Entry e) {
        //todo:write your code here for part-b
        if(head==null){
            head = new Node(e);
            return;
        }
        Node tempNode = head;
        //Node nextNode = null;
        int  relation = 0;
        if(e.key==null){
            while (tempNode.next[0]!=null)
                tempNode = tempNode.next[0];
            tempNode.next[0] = new Node(e);
            return;
        }

        while (tempNode!=null){
            if(e.key.compareTo(tempNode.entry.key)<0) {
                if(tempNode.next[0]==null){
                    tempNode.next[0] = new Node(e);
                    return;
                }
                tempNode=tempNode.next[0];
            }
            else{
                if(tempNode.next[1]==null){
                    tempNode.next[1] = new Node(e);
                    return;
                }
                tempNode=tempNode.next[1];
            }
        }
        return;
    }

    /**
     * 更新一个节点
     * @param e
     */
    @Override
    public void updateElement(Entry e) {
        //todo:write your code here for part-b
        if(head==null) return;
        Node tempNode = head;

        if(e.key==null){
            while (tempNode!=null){
                if(tempNode.entry.key==null){
                    tempNode.entry.value = e.value;
                    return;
                }

                tempNode = tempNode.next[0];
            }
        }

        while (tempNode!=null){
            if(tempNode.entry.key.equals(e.key)){
                tempNode.entry.value = e.value;
                return;
            }

            if(e.key.compareTo(tempNode.entry.key)<0)
                tempNode = tempNode.next[0];
            else tempNode = tempNode.next[1];
        }

    }

    /**
     * 删除一个节点
     * @param key
     */
    @Override
    public void removeElement(String key) {
        //todo:write your code here for part-b
        if(head==null) return;
        Node tempNode = head;
        if(key==null){
            while (tempNode!=null){
                if(tempNode.entry.key==null){
                    tempNode.isDelete = true;
                    return ;
                }
                tempNode = tempNode.next[0];
            }
        }
        while(tempNode!=null){
            if(tempNode.entry.key.equals(key)){
                tempNode.isDelete = true;
                return;
            }
            if(key.compareTo(tempNode.entry.key)<0)
                tempNode = tempNode.next[0];
            else
                tempNode = tempNode.next[1];
        }
    }

    /**
     * 按照树的"先序遍历",遍历并返回所有元素
     * @return
        */
    @Override
    public Entry[] traverse() {
        //todo:write your code here for part-b
        if(head == null) return null;
        Entry[] entries = new Entry[32];
        int cnt=0;
        Stack<Node> stack = new Stack<Node>();
        Node tempNode = head;
        while (tempNode!=null||!stack.empty()){
            if(tempNode!=null){
                entries[cnt++] = tempNode.entry;
                stack.push(tempNode);
                tempNode = tempNode.next[0];
            }
            else{
                tempNode = stack.firstElement();
                stack.pop();
                tempNode = tempNode.next[1];
            }
        }
        return entries;
    }
}
