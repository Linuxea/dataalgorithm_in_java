package hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashTest {

    @Test
    public void test(){
        MyHash<String, String> myHash = new MyHash<>();
        myHash.add("name","linuxea");
        System.out.println(myHash.getHash("name"));
        System.out.println(myHash.getHash("name"));
        System.out.println(myHash.getHash("name"));
        System.out.println(myHash.get("name"));

    }



}