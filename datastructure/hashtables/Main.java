package datastructure.hashtables;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("quantum", 10);
        myHashTable.set("mathematical methods", 1000);
        myHashTable.set("theorical mechanics", 11);
        myHashTable.printTable();
        System.out.println(myHashTable.get("mathematical methods"));

    }
}