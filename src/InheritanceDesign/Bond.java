
package InheritanceDesign;

public class Bond extends Security
{
    public Bond(String name, int quantity, double price)
    {
        super(name, quantity, price);
    }
    
    @Override
    public double getAssetValue()
    {
        return (price * quantity);
    }
    
    @Override
    public String toString()
    {
        StringBuilder bond = new StringBuilder();
        
        bond.append(name);
        bond.append("; " + this.getClass().getSimpleName());
        
        bond.append("; Shares Owned: ");
        bond.append(quantity);
        
        bond.append("; Price: $");
        bond.append(String.format("%,.2f", price));
        
        bond.append("; Value: $");
        bond.append(String.format("%,.2f", getAssetValue()));
        
        return bond.toString();
    }
}
