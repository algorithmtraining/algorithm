public class SumEvenAfterQueries_zane_0529 {

    public static void main(String[] args) {
        int[] A = {-10, 2, -4, 5, -3, 3};
        int[][] queries = {{-4, 2}, {9, 0}, {-8, 1}, {5, 4}, {1, 4}, {9, 0}};

        SumEvenAfterQueries_zane_0529 sumEvenAfterQueries = new SumEvenAfterQueries_zane_0529();
        A = sumEvenAfterQueries.sumEvenAfterQueries(A, queries);
        System.out.println(A);
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int val = 0;
        int index = 0;
        int[] answers = new int[A.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
        }
        int lastSum = 0;
        int temp = 0;

        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                lastSum = sum;
            }
            val = queries[i][0];
            index = queries[i][1];
            temp = A[index];
            A[index] += val;

            if (temp % 2 == 1 || temp % 2 == -1) {
                if (A[index] % 2 == 0) {
                    answers[i] = lastSum + A[index];
                } else {
                    answers[i] = lastSum;
                }
            } else {
                if (A[index] % 2 == 0) {
                    answers[i] = lastSum + val;
                } else {
                    answers[i] = lastSum - temp;
                }
            }
            lastSum = answers[i];
        }
        return answers;
    }


}
