package chainofrespon;

public class Dollar20Dispenser implements DispenseChain
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
        if(currency.getAmount() >= 20)
        {
            int num = currency.getAmount()/20;
            int remainder = currency.getAmount()%20;
            System.out.println("Dispending " +
                num + "$20 note.");
            if(remainder !=0)
                chain.dispense(new Currency(remainder));
		}
        else
        {
            chain.dispense(currency);
		}
    }
}
