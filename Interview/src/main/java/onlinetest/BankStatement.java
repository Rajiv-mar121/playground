package onlinetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankStatement {

    // Input [100,100,100,-10] [ "2020-01-01","2020-01-01","2020-01-31"]
    /*Example test:   ([1, -1, 0, -105, 1], ['2020-12-31', '2020-04-04', '2020-04-04', '2020-04-14', '2020-07-12'])
    WRONG ANSWER (got -159 expected -164)*/
    public static void main(String a[]) throws ParseException {
        int amount[] = {1, -1, 0, -105, 1};
        String[] date = {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"};
        new BankStatement().solution(amount, date);
    }


    public int solution(int[] A, String[] D) {
        // write your code in Java SE 8
        int totalBankTransaction = 0;
        int totalCardTransaction = 0;
        int feeApplied = 0;
        int finalBalance = 0;
        for (int i = 0; i < A.length; i++) {
            totalBankTransaction += A[i];
        }
        System.out.println("Total amount: " + totalBankTransaction);

        // Calculate card check bank fee

        List<Integer> position = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                totalCardTransaction += A[i];
                position.add(i);
            }
        }
        System.out.println("Total totalCardTransaction: " + Math.abs(totalCardTransaction));
        // if totalCardTransaction <= 100 for single month waive charges
        // check transaction date
        List<Integer> negativeMonth = new ArrayList<>();
        if (Math.abs(totalCardTransaction) >= 100) {
            // now identify month of card transaction
            int month[] = new int[position.size()];
            for (int datePos : position) {
                Date transDate = null;
                try {
                    transDate = new SimpleDateFormat("yyyy-MM-dd").parse(D[datePos]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                negativeMonth.add(transDate.getMonth());
                System.out.println(transDate);
            }
            // if same month
            feeApplied = 5 * 11;
            if (negativeMonth.size() < 3) {
                feeApplied = 5 * 12;
            }

        } else {
            feeApplied = 5 * 12;
        }
        finalBalance = totalBankTransaction - feeApplied;
        System.out.println("Final Balance: " + finalBalance);
        return finalBalance;

    }
}
