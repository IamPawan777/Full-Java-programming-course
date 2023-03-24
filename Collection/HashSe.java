//....not maintain the order of element into memory.............

import java.util.*;
public class HashSe {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(77);
        hs.add(66);
        hs.add(55);
        hs.add(44);
        hs.add(33);
        hs.add(22);
        hs.add(22);
        hs.add("pawan");
        System.out.println(hs);

    }
}
