package tries;

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode(){
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}

public class tries_implementation {
    private TrieNode root;

    public tries_implementation(){
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word){
        TrieNode node = root;
        for(char c : word.toCharArray()) {
            int index = c - 'a';
            if(node.children[index] == null){
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    // Search for a word in the Trie
    public boolean search(String word){
        TrieNode node = getNode(word);
        return node != null && node.isEndOfWord;
    }

    // Check if any word in Tries start with the given prefix
    public boolean startsWith(String prefix){
        return getNode(prefix) != null;
    }

    //Helper method to traverse Tries and return last node of word/prefix
    private TrieNode getNode(String word){
        TrieNode node = root;
        for(char c : word.toCharArray()){
            int index = c -'a';
            if(node.children[index] == null){
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

    public static void main(String[] args) {
        tries_implementation trie = new tries_implementation();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}