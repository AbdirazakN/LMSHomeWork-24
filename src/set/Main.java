package set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз. Метод натыйжаны жаңы set катары кайтарышы керек.
        //Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
        //Мисалы: [1, 2, 3} жана {0, 1, 2]
        //Жооп: [0, 3]
        //public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек

        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);


        Set<Integer> set2 = new TreeSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);


        System.out.println(symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference(final Set<Integer> set1, final Set<Integer> set2) {
        Set<Integer> symmetricDiff = new TreeSet<Integer>(set1);
        symmetricDiff.addAll(set2);
        Set<Integer> tmpSet = new TreeSet<Integer>(set1);
        tmpSet.retainAll(set2);
        symmetricDiff.removeAll(tmpSet);
        return symmetricDiff;
    }
}