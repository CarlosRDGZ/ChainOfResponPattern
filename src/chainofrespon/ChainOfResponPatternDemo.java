package chainofrespon;

import java.util.Scanner;

public class ChainOfResponPatternDemo
{

    public static void main(String[] args)
    {
        AtmDispenseChain atmDispenser = new AtmDispenseChain();
        while (true)
        {
            int amount = 0;

            System.out.println("Enter amount to dispense");

            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0)
            {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.chain1.dispense(new Currency(amount));
            System.out.println();
		}
	}
}
