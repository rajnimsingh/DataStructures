package com.rajni.searching;

public class AthMagicalNumber {
    public static void main(String[] args) {
        System.out.println(magicalNumber(14, 10, 12));
        System.out.println(magicalNumber(100, 100000000, 128895222));
    }
    static int magicalNumber(int a, int b, int c) {
        long lcm = (long) (b * c) / gcd(b, c);

        long l = (long) Math.min(b, c);

        long r = (long) a * l;

        long answer = 0;
        while (l <= r) {
            long mid = (l + r) / 2;

            long count = (mid / b) + (mid / c) - (mid / lcm);

            if (count == a && (mid % b == 0 || mid % c == 0)) {
                answer = mid;
                return (int) (answer % 1000000007);
            }

            if (count < a) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return (int) (answer % 1000000007);
    }

    static int gcd(int a, int b) {
        // Everything divides 0
        if (b == 0) {
            return a;
        }
        return gcd(b, a% b);
    }
}
