package Algorithms;

/**
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ret = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {

                // As the index is not ZERO based, we should add one to the result.
                ret[0] = map.get(target - numbers[i]) + 1;
                ret[1] = i + 1;
                return ret;
            }
            map.put(numbers[i], i);
        }

        return ret;
    }
}
    }
