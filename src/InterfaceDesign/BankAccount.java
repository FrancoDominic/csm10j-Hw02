
package InterfaceDesign;

public class BankAccount implements Asset
{
    private String name;
    private double value;
    
    public BankAccount(String name, double value)
    {
        this.name = name;
        this.value = value;
    }
    
    @Override
    public double getAssetValue()
    {
        return value;
    }
    
    @Override
    public String toString()
    {
        StringBuilder bankAccount = new StringBuilder();
        
        bankAccount.append("Bank Account Value: $");
        bankAccount.append(String.format("%,.2f,", value));
        
        return bankAccount.toString();
    }
}
