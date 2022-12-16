package leetcode.arrays;

public class ArrayPartitionSolution {

    public static void main(String[] args) {
        int []arr = new int[]{1,4,3,2};
        System.out.println(arrayPairSum(arr));
    }


        public static final int MIN_N = -10000;
        public static final int MAX_N = 10000;

        private static final int counts[] = new int[MAX_N-MIN_N+1];
        public static int arrayPairSum(int[] nums) {

            int minN = nums[0];
            int maxN = minN;

            for (final int n: nums) {
                ++ArrayPartitionSolution.counts[n - MIN_N];
                if (minN > n) {
                    minN = n;
                } else if (maxN < n) {
                    maxN = n;
                }
            }

            int offset = 0;

            int total = 0;

            for (int n = minN; n <= maxN; ++n) {
                int i = n - MIN_N;
                final int freq = ArrayPartitionSolution.counts[i];

                if (freq > 0) {
                    if (freq - offset > 0) {
                        total += ((freq + 1 - offset) >> 1) * n;
                    }
                    ArrayPartitionSolution.counts[i] = 0;
                    offset ^= freq & 1;
                }
            }

            return total;
        }
    }
