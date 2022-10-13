package java1012.algorithm;

interface Compare {
    boolean doSomething(int valueA, int valueB);
}
public class MaxAndMin {
    private int[] getNum(int[][] arr, Compare compare){  //callback

        int targetValue = arr[0][0], iIdx = 0, jIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                boolean isStn = compare.doSomething( arr[i][j], targetValue );
                if (isStn) {
                    targetValue = arr[i][j];
                    iIdx = i;
                    jIdx = j;
                }
            }
        }

        return new int[]{targetValue, iIdx+1, jIdx+1};
    }

    public int[] max(int[][] arr){
        return getNum(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int[] min(int[][] arr){
        return getNum(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        MaxAndMin maxAndMin = new MaxAndMin();
        int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };
        int[] max = maxAndMin.max(arr);
        int[] min = maxAndMin.min(arr);
        System.out.printf("최댓값: %d, 좌표: ( %d, %d )", max[0], max[1], max[2]);
        System.out.printf("최솟값: %d, 좌표: ( %d, %d )", min[0], min[1], min[2]);

    }
}
