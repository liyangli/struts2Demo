package com.ylisoftware.utils;

import java.util.Comparator;

/**
 * 名称对比对象
 * author:liyangli
 * date: 2017/11/24 上午5:35.
 */
public class NameComparator implements Comparator<String> {

    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
