package com.java8.part1.lambda.chapter2;

import com.java8.part1.lambda.chapter1.vo.Apple;

/**
 * @author Mr.zxb
 * @date 2019-01-31 15:43
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
