package cn.liguohao.demo.algorithm.find;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void exist() {
        int[] arr = {2, 3, 1, 4, 2, 56, 34, 234, 123};
        Arrays.sort(arr);
        Assertions.assertThat(BinarySearch.exist(arr, 1)).isTrue();
        Assertions.assertThat(BinarySearch.exist(arr, 546)).isFalse();
        Assertions.assertThat(BinarySearch.exist(arr, 56)).isTrue();
    }

    @Test
    void question2() {
        int[] arr = {1, 3, 5, 14, 22, 56, 64, 234, 1223};
        Assertions.assertThat(BinarySearch.question2(arr, 22)).isEqualTo(22);
        Assertions.assertThat(BinarySearch.question2(arr, 57)).isEqualTo(64);
        Assertions.assertThat(BinarySearch.question2(arr, 4)).isEqualTo(5);
    }

    @Test
    void question3() {
    }
}