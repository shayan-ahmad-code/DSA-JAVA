import java.util.*;

public class TrieDataStructure{
      
        static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
             for(int i=0; i<26; i++){
                 children[i] = null;
             }
             eow = false;
        }
    }
    public static void insert(String word){
        for(int i=0; i<word.length();i++){
            int idx = word.charAt(i - 'a');
             if(root.children[idx] == null){
                  root.children[idx] = new Node();
             }
             if (i == word.length() - 1) {
                root.children[idx].eow = true;
             }
             root = root.children[idx];
        }
    }
    public static boolean search(String key){
         for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
               if(root.children[idx] == null){
                    return false;
               }
               if(i == key.length() - 1 && root.children[idx].eow == false){
                   return false;
               }
               root.root.children[idx];
    }
         return true;
}
    
    public static void main(String[] args){
        String words[] = {"the", "a", "there", "their", "their","any"};
             for(int i=0; i<words.length; i++){ // for(String word : words)
                insert(i);
                System.out.println("Inserted Words are "+words);
             } // sout("Inserted Words: ");
               // for(String word : words){
               // sout(words);  
               //}
    }  
}
