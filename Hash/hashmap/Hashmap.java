package Hash.hashmap;
import java.util.*;

public class Hashmap {
    static class HashMap<k,v>{
        private class Node{
            //This Node class is used to encapsulate the key-value pairs. Each node holds a key and its associated value.
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
        //eclares an array of linked lists as a private instance variable within the HashMap class.

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; //his line initializes the buckets array. It creates an array that will store linked lists
            // (the buckets). In this case, it's initializing the array with four elements.
            // Each element will represent a bucket, and initially, **each bucket is an empty linked list.**
            for(int i = 0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(k key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
            // this returns the bucket index which in the
        }

        private int searchInAll(k key, int bi){
            LinkedList<Node> ll = buckets[bi]; //This line retrieves the linked list (bucket) from the buckets array based on the
            // provided bucket index bi. This linked list is assigned to the variable ll, so you can now search for the key within it.
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets; //This line creates a reference oldBucket that points to the current array of buckets.
            // This is done so that you can access the old data while creating a new, larger array.
            buckets = new LinkedList[N*2]; //Here, you create a new array of buckets with double the number of buckets compared to the previous size (N * 2).
            // The purpose of doubling the number of buckets is to reduce collisions and improve the efficiency of the hash map.
            for(int i=0; i<N; i++){
                buckets[i] = new LinkedList<>(); //This loop initializes each bucket in the new buckets array as an empty linked list.
            }
            for(int i = 0; i< oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
//                    put(ll.get(j).key, ll.get(j).value);  this will also give same results
                }
            }
        }

        public void put(k key, v value) {
            int bi = hashFunction(key); //This line calculates the bucket index (bi) where the key-value pair should be placed based on the
            // hash code of the key. The hashFunction method determines the appropriate bucket based on the key's hash code.
            int di = searchInAll(key, bi); //This line calls the searchInLL method to search for the key within the linked list (bucket)
            // determined by the bucket index (bi). If the key is found, di will be set to the index where it's found in the linked list; otherwise, di will be -1.

            if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{
                Node newNode = buckets[bi].get(di);
                newNode.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(k key){
            int bi = hashFunction(key);
            int di = searchInAll(key, bi);

            if(di == -1) return false;
            else return true;
        }

        public v remove(k key){
            int bi = hashFunction(key);
            int di = searchInAll(key, bi);

            if(di == -1) return null;
            else{
                Node removedNode = buckets[bi].remove(di);
                n--;
                return removedNode.value;
            }
        }

        public v get(k key) {
            int bi = hashFunction(key);
            int di = searchInAll(key, bi);
            if(di == -1) return null;
            else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<k> keySet(){
            //This method is declared to return an ArrayList containing keys of type K.
            // It will return a list of all the keys in the hash map.
            ArrayList<k> keys = new ArrayList<>();
            for(int i = 0; i< buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

    }
}
