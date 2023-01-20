package cn.liguohao.demo.algorithm.find;

 /**
 * <p>位运算</p>
 * <p>给定一个整型数组，要求时间复杂度小于O(N)，额外空间复杂度O(1)(只用几个有限变量)</p>
 * <ol>
 *     <li>当只有一种数出现了奇数次，其它的所有数都出现了偶数次，怎么找到出现了奇数次的数。</li>
 *     <li>当已知有两种数出现了奇数次，其它所有数都出现了偶数次，怎么找到这两种数</li>
 * </ol>
 */
public class EventTimesOddTimes {
    public int question1(int[] arr) {
        int eor = 0;
        for (int num : arr) {
            eor = eor ^ num;
        }
        if(eor == 0) {
            throw new IllegalArgumentException("arr illegal");
        }
        return eor;
    }

    public int[] question2(int[] arr) {
        int eor = 0;
        for (int num : arr) {
            eor = eor ^ num;
        }
        // eor == a ^ b

        if (eor == 0) {
            // a == b
            throw new IllegalArgumentException("var 'a' and var 'b' must not eq");
        }

        // eor != 0
        // eor的二进制必然有一个位置上是1，取出最右边的1
        int onlyOne = 0;
        int rightOne = eor & (~eor + 1);
        for (int cur: arr) {
            if ((cur & rightOne) == 0) {
                onlyOne ^= cur;
            }
        }
        // onlyOne == (a || b)

        int[] result = new int[2];
        result[0] = onlyOne;
        result[1] = (eor ^ onlyOne);
        return result;
    }


}
