// //....traverse by stream........

// import java.util.*;
// import java.util.stream.*;
// public class StreamAPI {
//     public static void main(String[] args) {
//         List<Integer> li = Arrays.asList(12,23,34,45,56);
//         Stream<Integer> st = li.stream();

//         st.forEach(n -> System.out.println(n));
//     }
// }




//....more different operation by stream........

import java.util.*;
import java.util.stream.*;
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(12,63,4,15,56);
        Stream<Integer> st = li.stream();

        // long co = st.count();
        // System.out.println(co);

        // Stream<Integer> filterSt = st.filter(n -> n%2==0);
        // Stream<Integer> sortSt = filterSt.sorted();
        // Stream<Integer> mapSt = sortSt.map(n -> n*2);           //map is resposible for some action
        
//.....or.....(method channing)...
        
        Stream<Integer> sortSt = st
        .filter(n -> n%2==0)
        .sorted()
        .map(n -> n*2);
        sortSt.forEach(n -> System.out.println(n));

    }
}
