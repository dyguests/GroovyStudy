package com.fanhl.test.t2015.t11.t20151102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fanhl on 15/11/2.
 */
public class ConverterJavaDemo {
    public static void main(String[] args) {
        String[] fArray = {"你", "吃了", "早饭没了!"};
        List<String> fList = Arrays.asList(fArray);
        List<Integer> tList = ArraysUtil.collect(fList, String::length);
        System.out.println(tList);
    }
}

/**
 * Created by fanhl on 15/11/2.
 */
class ArraysUtil {
    public static <S, T> List<T> collect(List<S> sourceArray, Converter<S, T> converter) {
        List<T> targetArray = new ArrayList<>(sourceArray.size());
        for (S s : sourceArray) targetArray.add(converter.convert(s));
        return targetArray;
    }

    public interface Converter<F, T> {
        T convert(F f);
    }
}

