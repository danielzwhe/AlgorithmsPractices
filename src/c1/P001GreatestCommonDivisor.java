package c1;

/**
 * @author: Daniel
 * @email: mail2him@qq.com
 * @version: 1
 * @date: 2021/5/23
 */
public class P001GreatestCommonDivisor {

    public static void main(String[] args) {
        test(0, 3);
        test(3, 4);
        test(5, 2);
        test(4, 2);
        test(2, 4);
        test(4, 8);
        test(8, 4);
    }

    private static void test(int p, int q) {
        System.out.printf("%d 和 %d 的最大公约数为：%d\n", p, q, greatestCommonDivisor(p, q));
    }

    /**
     * 计算两个非负整数p和q的最大公约数：若q是0，则最大公约数为p。否则，将p除以q得到余数r, p和q的最大公约数即为q和r的最大公约数。
     *
     * @param p
     * @param q
     */
    private static int greatestCommonDivisor(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return greatestCommonDivisor(q, r);
    }
}
