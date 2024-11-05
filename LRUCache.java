/*
LeetCode Problem Number: 146
Link : https://leetcode.com/problems/lru-cache/description/
LRU Cache

Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.

Solution Approach:
Two Approaches:
Both are basically same

First Approach: It uses HashMap and a doubly LinkedList. Doubly LinkedList is for keeping track of order of insertion. this LinkedList ensures that head points to
the Least Recently Used node.  //This Solution is commented out

Second Approach: It is easier because we use here Java's built in LinkedHashMap


 */

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
/*    int capacity;
    Map<Integer, ListNode2> dic;
    ListNode2 head;
    ListNode2 tail;

    public LRUCache(int capacity) {
        this.capacity =  capacity;
        dic = new HashMap<>();
        head = new ListNode2(-1, -1);
        tail = new ListNode2(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!dic.containsKey(key))
            return -1;

        ListNode2 node = dic.get(key) ;
        remove(node);
        add(node);

        return node.val;
        
    }
    
    public void put(int key, int value) {
        if(dic.containsKey(key)){
            ListNode2 oldNode = dic.get(key);
            remove(oldNode);
        }
        ListNode2 node = new ListNode2(key, value);
        dic.put(key, node);
        add(node);

        if(dic.size()> capacity){
            ListNode2 nodeToDelete = head.next;
            remove(nodeToDelete);
            dic.remove(nodeToDelete.key);
        }

    }

    public void remove(ListNode2 node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void add(ListNode2 node){
        ListNode2 previousEnd = tail.prev;
        previousEnd.next = node;
        node.prev = previousEnd;
        node.next = tail;
        tail.prev = node;

    }  */

    LinkedHashMap<Integer, Integer> lhm;
    int capacity;

    LRUCache(int capacity){
        lhm = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true);
        this.capacity = capacity;

    }

    public int get(int key) {
        if(!lhm.containsKey(key))
            return -1;

        Integer value = lhm.get(key) ;
        lhm.remove(key);
        lhm.put(key, value);

        return value;

    }

    public void put(int key, int value){

        if(lhm.size()< this.capacity) {
            lhm.put(key, value);
        }else{
            //    if(!lhm.isEmpty())
            {
                if(lhm.containsKey(key)){
                    lhm.remove(key);
                    lhm.put(key, value);
                }

                else{
                    Map.Entry<Integer, Integer> temp = lhm.entrySet().iterator().next();   //lhm.firstEntry();

                    lhm.remove(temp.getKey());
                    lhm.put(key, value);
                }

            }
        }


    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

class ListNode2 {
    int key;
    int val;
    ListNode2 next;
    ListNode2 prev;

    public ListNode2(int key, int val) {
        this.key = key;
        this.val = val;
    }
}