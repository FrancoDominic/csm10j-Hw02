
package InterfaceDesign;

public class Car implements Debt, Asset
{
    private String name;
    private double value, debtAmount;
    
    public Car(String name, double value, double debtAmount)
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
        StringBuilder car = new StringBuilder();
        
        car.append(name);
        car.append("; " + this.getClass().getSimpleName());
        
        car.append("; Value: $");
        car.append(String.format("%,.2f", value));
        
        car.append("; Debt: $");
        car.append(String.format("%,.2f", debtAmount));
        
        return car.toString();
    }
}
