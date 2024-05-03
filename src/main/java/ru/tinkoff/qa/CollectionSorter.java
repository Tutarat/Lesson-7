package ru.tinkoff.qa;

import java.util.*;

public class CollectionSorter<T> {
    /**
     * Находит количество вхождений для каждого значения в коллекции,
     * возвращает значения и количество его вхождений в коллекцию
     *
     * @param list коллекция значений
     * @return Словарь значений и их вхождения в коллекцию
     */
    public Map<T, Integer> occurrencesInList(List<T> list) {
        Map<T, Integer> countMap = new HashMap<>();
        list.forEach(n -> {
            if (countMap.containsKey(n)) {
                countMap.put(n, countMap.get(n) + 1);
            } else {
                countMap.put(n, 1);
            }
        });
       return countMap;
    }


    /**
     * Вернуть коллекцию без дубликатов, только уникальные значения.
     *
     * @param list коллекция значений
     * @return Коллекция только с уникальными значениями.
     */
    public List<T> deleteDuplication(List<T> list) {
        List<T> countList = new ArrayList<>();
        list.forEach(n -> {
            if (!countList.contains(n)) {
                countList.add(n);
            }
        });
        return countList;
        // тут код
    }
//
//    public List<T> deleteDuplicationCircle(List<T> list) {
//        List<T> countList = new ArrayList<>();
//        for (var i = 0; i < countList.size(); i++)
//        {
//            if (!countList.contains(countList.get(i))) {
//                countList.add(countList.get(i));
//            }
//        };
//        return countList;
//        // тут код
//    }

    /**
     * Вернуть только дубликаты и их количество в коллекции.
     *
     * @param list коллекция значений
     * @return Словарь дубликатов и их количества
     */
    public Map<T, Integer> duplicationCount(List<T> list) {
        Map<T, Integer> countDub = new HashMap<>();
        list.forEach(n -> {
            if (countDub.containsKey(n)) {
                countDub.put(n, countDub.get(n) + 1);
            }
        });
        return countDub;
        // тут код
    }
}
