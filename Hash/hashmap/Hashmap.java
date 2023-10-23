package Hash.hashmap;
import java.util.*;

public class Hashmap {
    static class HashMap<k,v>{
        private class Node{
            k key;
            v value;
            public Node(k key, v value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n - nodes
        private int N; //N - buckets
        private LinkedList<Node> buckets[]; //N = buckets.length

//        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; //his line initializes the buckets array. It creates an array that will store linked lists
            // (the buckets). In this case, it's initializing the array with four elements.
            // Each element will represent a bucket, and initially, **each bucket is an empty linked list.**
            for(int i = 0; i<4; i++){
                this.buckets = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Maths.abs(bi) % N;
        }

        private int searchInAll(k key, v value){
            LinkedList<Node> ll = buckets[bi]; //This line retrieves the linked list (bucket) from the buckets array based on the
            // provided bucket index bi. This linked list is assigned to the variable ll, so you can now search for the key within it.
            for(int i=0; i<ll.size; i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            Linkedlist<Node> oldBucket[] = buckets; //This line creates a reference oldBucket that points to the current array of buckets.
            // This is done so that you can access the old data while creating a new, larger array.
            buckets = new Linkedlist[N*2]; //Here, you create a new array of buckets with double the number of buckets compared to the previous size (N * 2).
            // The purpose of doubling the number of buckets is to reduce collisions and improve the efficiency of the hash map.
            for(int i=0; i<N; i++){
                buckets[i] = new LinkedList<>(); //This loop initializes each bucket in the new buckets array as an empty linked list.
            }
            for(int i = 0; i< oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j<ll.size()){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }


    }
}
