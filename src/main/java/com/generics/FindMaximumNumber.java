package com.generics;

    import java.util.ArrayList;
import java.util.Arrays;

    public class FindMaximumNumber<T extends Comparable> {
        T[] valueArr;

        public FindMaximumNumber(T... val) {
            System.out.println();
            T[] array = (T[]) new Comparable[val.length];
            int i = 0;
            for (T c : val) {
                array[i] = c;
                i++;
            }
            this.valueArr = array;
        }

        public T findMax() {
            Arrays.sort(valueArr);
            printMax( valueArr[valueArr.length - 1]);
            return valueArr[valueArr.length - 1];
        }

        private static <T> void printMax(T maximumValue){
            System.out.println("Maximum Value:"+maximumValue);
        }
    }
