package autouni.classes.utils;

import autouni.classes.User;

import java.util.*;
import java.util.stream.Collectors;

public class CommonUtils {

    public List<User> getCommonElementsToList(List<User> list1, List<User> list2) {
       List<User> resultList = new ArrayList<>(list1);
       resultList.retainAll(list2);
       return resultList;
    }

    public Set<User> getCommonElementsToSet(Set<User> set1, Set<User> set2) {
        Set<User> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    public void iterateListAndPrint(List<User> userList) {
        List<User> listWithoutDuplicates = userList
                .stream()
                .distinct()
                .collect(Collectors.toList());

        listWithoutDuplicates.forEach(user -> {
            System.out.println(listWithoutDuplicates.indexOf(user) + ":" + user.toString());
        });
    }

    public void iterateSetAndPrint(Set<User> userSet) {
        userSet.forEach(user -> {
            if (user == null) {
                System.out.println("null");
            } else
            System.out.println(user.toString());
        });
    }

    public void iterateMapAndPrint(Map<Integer,User> userMap) {
        for (Map.Entry<Integer,User> entry : userMap.entrySet()) {
            System.out.println(entry);
        }

        for (Integer key : userMap.keySet()) {
            System.out.println(key);
        }

        for (User value : userMap.values()) {
            System.out.println(value);
        }

    }

}
