/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.mybank.mytest;

import java.util.ArrayList;
import java.util.List;


/**
 * 二分查找算法实现
 * 1. start可以等于end。所以可以取到start或者end
 * 2. 注意index的计算，不要直接(end-start)/2.需要基于start进行偏移
 * 3. 注意start不可以大于end，就会死掉
 *
 * @author yanqingqyq
 * @version $Id: BinFindSearch.java, v 0.1 2018年05月04日 22:09 yanqingqyq Exp $
 */
public class BinFindSearch {

    private static int getIndexForSpecNum(List<Integer> list, int start, int end, Integer searcher) {

        if (start > end) {
            return -1;
        }

        int index = start + (end - start) / 2;
        if (searcher == list.get(index)) {
            return index;
        }

        if (searcher > list.get(index)) {
            return getIndexForSpecNum(list, index + 1, end, searcher);
        }

        if (searcher < list.get(index)) {
            return getIndexForSpecNum(list, start, index - 1, searcher);
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(19);
        list.add(21);
        list.add(31);
        list.add(37);
        list.add(42);
        list.add(48);
        list.add(50);
        list.add(52);

        int index = getIndexForSpecNum(list, 0, list.size() - 1, 5);
        System.out.println(index);
    }
}
