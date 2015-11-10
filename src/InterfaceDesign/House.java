
package InterfaceDesign;

public class House implements Debt, Asset
{
    private String name;
    private double value, debtAmount;
    
    public House(String name, double value, double debtAmount)
    {
        this.name = name;
        this.value = value;
        this.debtAmount = debtAmount;
    }
    
    @Override 
    public double getAssetValue()
    {
        return value;
    }
    
    @Override
    public double getDebtAmount()
    {
        return debtAmount;
    }
    
    @Override
    public String toString()
    {
        StringBuilder house = new StringBuilder();
        
        house.append(name);
        house.append("; " + this.getClass().getSimpleName());
        
        house.append("; Value: $");
        house.append(String.format("%,.2f", value));
        
        house.append("; Debt: $");
        house.append(String.format("%,.2f", debtAmount));
        
        return house.toString();
    }
}
