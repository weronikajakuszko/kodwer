package com.kodwer.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> listWithoutOddNumbers = new ArrayList<Integer>();
        for (Integer numberInList : numbers){
            if ((numberInList%2)==0) {
                listWithoutOddNumbers.add(numberInList);
            }
            }
        return listWithoutOddNumbers;
    }

}
