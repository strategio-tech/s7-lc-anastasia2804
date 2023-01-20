package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * This method takes user's input of initial loan amount and calculates
     * the remaining amount that user still owes in 3 months
     *
     * @param  amount initial loan amount
     * @return remaining loan amount after 3 months
     */


    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int remainingAmount = (int) (amount*0.9*0.9*0.9);
        return remainingAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
