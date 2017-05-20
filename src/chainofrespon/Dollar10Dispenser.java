package chainofrespon;

public class Dollar10Dispenser implements DispenseChain
{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain)
    {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency currency)
    {
        if(currency.getAmount() >= 10)
        {
            int num = currency.getAmount()/10;
            int remainder = currency.getAmount()%10;
            System.out.println("Dispending " +
                num + "$10 note.");
            if(remainder !=0)
                chain.dispense(new Currency(remainder));
		}
        else
        {
            chain.dispense(currency);
		}
    }
}
