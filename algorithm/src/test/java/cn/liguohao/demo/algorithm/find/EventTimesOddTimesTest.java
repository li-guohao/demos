package cn.liguohao.demo.algorithm.find;

import org.junit.jupiter.api.Test;

class EventTimesOddTimesTest {

    @Test
    void question1() {
        EventTimesOddTimes eventTimesOddTimes = new EventTimesOddTimes();
        int[] arr = {4, 35, 4, 2, 8, 8, 2, 3, 3};
        System.out.println(eventTimesOddTimes.question1(arr));
    }

    @Test
    void question2() {
        EventTimesOddTimes eventTimesOddTimes = new EventTimesOddTimes();
        int[] arr = {4, 35, 4, 2, 8, 27, 8, 2, 3, 3};
        for (int num : eventTimesOddTimes.question2(arr)) {
            System.out.println(num);
        }
    }
}