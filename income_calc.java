import java.util.Scanner;

public class income_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double h_wage = 15.50;
        final double tax = 0.14;
        final double c_a = 0.10;
        final double school_sup = 0.01;
        final double s_bond = 0.25;
        final double par_bond = 0.50;
        int t_hours = 0;

    //START

       System.out.println("WELCOME!");

    //INPUT

        System.out.print("Enter the total hours worked for all 5 weeks: ");
        if (!sc.hasNextInt()) {
            System.out.println("INVALID NUMBER!");
            return;
        } else{
            t_hours = sc.nextInt();
        }

    //PROCESS

        //GROSS, NET, TAX
            double GI = t_hours * h_wage;
            double tax_a = GI * tax;
            double N_inc = GI - tax_a;

        //EXPENSES
            double clothes = N_inc * c_a;
            double supplies = N_inc * school_sup;
            double remaining_after_expenses = N_inc - supplies - clothes;
            double sbExpense = remaining_after_expenses * s_bond;
            double pbExpense = sbExpense * par_bond;

        //REMAINING MONEY

            double remaining_money = remaining_after_expenses - sbExpense;

    //OUTPUT

        System.out.println("GROSS INCOME: " + GI);
        System.out.println("NET INCOME: " + N_inc);
        System.out.println("TAX AMOUNT: " + tax_a);
        System.out.println("CLOTHES AND ACCESSORIES:  " + clothes);
        System.out.println("SCHOOL SUPPLIES: " + supplies);
        System.out.println("SAVINGS BOND: " + sbExpense);
        System.out.println("PARENTS CONTRIBUTION TO SAVINGS BOND: " + pbExpense);
        System.out.println("REMAINING MONEY: " + remaining_money);


        System.out.println("THANK YOU!");



    }
}