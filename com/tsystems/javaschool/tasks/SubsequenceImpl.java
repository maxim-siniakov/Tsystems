package com.tsystems.javaschool.tasks;

import java.util.*;

/**
 * Created by max on 16.08.16.
 */
public class SubsequenceImpl implements Subsequence {
    @Override
    public boolean find(List x, List y) {
        List<Object> list2 = y;
        Iterator iterator = x.listIterator();
        int count = 0;
        int i = 0;
        while (iterator.hasNext() || count == x.size()) {
            Object stuff = iterator.next();
            int position = i;
            for ( i = position; i < list2.size() - 1; i++) {
                if (stuff.equals(list2.get(i))) {
                    count++;
                    break;
                }
            }
        }
        count += 1;
        if ( count == x.size()) return true;
        else return false;
    }
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        Subsequence subsequence = new SubsequenceImpl();
//        boolean b = subsequence.find(Arrays.asList("A", "C", "GP", "B", "D") , Arrays.asList("BCD" , "A" , "CBA" , "B" , "KLMN" , "OP" , "C" , "SATA" , "NA" , "D"));
        boolean b = subsequence.find(Arrays.asList("A", "C", "45", "B", "D") ,
                Arrays.asList("TUY", "A" , "C" , "45" , "45" , "WP" , "FU" , "TH" , "IS" , "D", "B"));
        System.out.println(b);
        }
    }

//right
//"A", "C", "GP", "B", "D"
//        "A" , "B" , "UIO" , "C" , "DNO" , "ZXC" , "GP" , "GG" , "WP" , "B" , "TH" , "IS" , "ALL" , "D"


//wrong
//"A", "C", "GP", "B", "D"
//        "A" , "B" , "UIO" , "C" , "DNO" , "ZXC" , "GP" , "GG" , "WP" , "FU" , "CK" , "TH" , "IS" , "ALL" , "D"


//wrong
//"A", "C", "GP", "B", "D"
//        "D" , "B" , "UIO" , "DNO" , "ZXC" , "GP" , "GG" , "WP" , "FU" , "C" , "TH" , "IS" , "A"


//right
//"A", "C", "G45", "B", "D"
//        "A" , "C" , "UIO" , "DNO" , "ZXC" , "GP" , "G45" , "WP" , "FU" , "B" , "TH" , "IS" , "D"


//right
//"A", "C", "G45", "B", "D"
//        "A" , "C" , "DNO", "C", "ZXC" , "GP" , "G45" , "WP" , "FU" , "B" , "TH" , "IS" , "D"


//right
//"A", "C", "45", "B", "D"
//        "TUY", "A" , "C" , "C" , "DNO" , "ZXC" , "45" , "G45" , "WP" , "FU" , "B" , "TH" , "IS" , "D"


//right
//"A", "C", "45", "B", "D"
//        "TUY", "A" , "C" , "C" , "DNO" , "ZXC" , "45" , "45" , "WP" , "FU" , "B" , "TH" , "IS" , "D"


//right
//"A", "C", "45", "B", "D"
//        "45", "A" , "C" , "C" , "DNO" , "ZXC" , "45" , "45" , "WP" , "FU" , "B" , "TH" , "IS" , "D"


//wrong
//"A", "C", "45", "B", "D"
//        "TUY", "C" , "A" , "ZXC" , "45" , "45" , "WP" , "FU" , "B" , "TH" , "IS" , "D"


//wrong
//"A", "C", "45", "B", "D"
//        "TUY", "A" , "C" , "45" , "45" , "WP" , "FU" , "TH" , "IS" , "D", "B"