package chainofrespon;

public class Dollar50Dispenser implements DispenseChain
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
        if(currency.getAmount() >= 50)
        {
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount()%50;
            System.out.println("Dispending " +
                num + "$50 note.");
            if(remainder !=0)
                chain.dispense(new Currency(remainder));
		}
        else
        {
            chain.dispense(currency);
		}
    }
}
