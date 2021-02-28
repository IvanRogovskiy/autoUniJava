import autouni.classes.User;
import autouni.classes.utils.CommonUtils;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        User user1 = new User("Ivan", 28);
        User user2 = new User("Ivan", 28);
        User user3 = new User("Kent", 25);
        User user4 = new User("Keks", 17);
        User user5 = new User("Alex", 56);
        User user6 = new User("Alex", 56);
        User user7 = new User("Vladimir", 31);
        User user8 = new User("Ivan", 28);

        List<User> list1 = new ArrayList<User>();
        list1.add(user1);
        list1.add(user3);
        list1.add(user6);
        list1.add(user7);

        List<User> list2 = new ArrayList<User>();
        list2.add(user2);
        list2.add(user4);
        list2.add(user5);
        list2.add(user8);

        Set<User> set1 = new HashSet<>();
        Set<User> set2 = new HashSet<>();
        set1.add(user1);
        set1.add(user3);
        set1.add(user6);
        set1.add(user1);

        set2.add(user2);
        set2.add(user4);
        set2.add(user5);
        set2.add(user8);
        set2.add(null);

        Map<Integer,User> userMap = new HashMap<>();

        userMap.put(0,user2);
        userMap.put(1,user4);
        userMap.put(2,user5);
        userMap.put(3,user8);

        CommonUtils commonUtils = new CommonUtils();
        List<User> resultList = commonUtils.getCommonElementsToList(list1,list2);
        commonUtils.iterateListAndPrint(list2);
        commonUtils.iterateSetAndPrint(set2);
        commonUtils.iterateMapAndPrint(userMap);

        System.out.println("END");
    }
}
