package arrays.twodarrays;

public class MaximumSumRows {

    public void rowSum(int arr[][]) {
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum: " + sum);

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("\nMaximum Row Sum = " + maxSum);
        System.out.println("Row with Maximum Sum = Row " + (maxRow + 1));
    }

    public static void main(String[] args) {
        MaximumSumRows m = new MaximumSumRows();
        int arr[][] = {{10, 20, 40, 56, 76}, {11, 23, 34, 35, 45}};
        m.rowSum(arr);
    }
}
