package chainofrespon;

public class AtmDispenseChain
{
    public DispenseChain chain1;

    public AtmDispenseChain()
    {
        chain1 = new Dollar50Dispenser();
        Dollar20Dispenser chain2 = new Dollar20Dispenser();
        Dollar10Dispenser chain3 = new Dollar10Dispenser();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }
}
