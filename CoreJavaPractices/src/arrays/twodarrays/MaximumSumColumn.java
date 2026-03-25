package arrays.twodarrays;

public class MaximumSumColumn {

    public void maxSumCol(int arr[][]) {

        int maxCols = Integer.MIN_VALUE;
        int maxColIndex = -1;

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < cols; i++) {
            int sum = 0;

            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }

            System.out.println("Column " + (i + 1) + " Sum: " + sum);

            if (sum > maxCols) {
                maxCols = sum;
                maxColIndex = i;
            }
        }

        System.out.println("\nMaximum Column Sum = " + maxCols);
        System.out.println("Column with Maximum Sum = Column " + (maxColIndex + 1));
    }

    public static void main(String[] args) {
        MaximumSumColumn c = new MaximumSumColumn();
        int arr[][] = {{10, 20, 40, 56, 76}, {11, 23, 34, 35, 45}};
        c.maxSumCol(arr);
    }
}
