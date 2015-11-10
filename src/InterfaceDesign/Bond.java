
package InterfaceDesign;

public class Bond implements Asset
{
    private String name;
    private int quantity;
    private double price;
    
    public Bond(String name, int quantity, double price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
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
