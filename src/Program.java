

/* I commented and uncommented the imports depending on which one I wanted to test
since the imports become ambiguous if used simultaneously */

//import InheritanceDesign.*;
import InterfaceDesign.*;

public class Program 
{
  
    public static void main(String[] args) 
    {

//        System.out.println("Test: Inheritance Design");
//        Wealth wealthObject = new Wealth();
//        
//        BankAccount bankAccountObj = new BankAccount("Wells Fargo", 150000.50);
//        wealthObject.addAsset(bankAccountObj);
//        
//        Car carObj = new Car("Tesla", 100000, 50000);
//        wealthObject.addAsset(carObj);
// 
//        House houseObj = new House("My House", 400000, 200000);
//        wealthObject.addAsset(houseObj);
//        
//        Stock stockObj = new Stock("APPL", 1000, 117.5);
//        wealthObject.addAsset(stockObj);
//        
//        Bond bondObj = new Bond("TGT42", 10, 5000);
//        wealthObject.addAsset(bondObj);
//        
//        System.out.println(wealthObject);
//        System.out.println(wealthObject.getAssetSummary()); 
//        System.out.println(bankAccountObj);
//        System.out.println(carObj);
//        System.out.println(houseObj);
//        System.out.println(stockObj);
//        System.out.println(bondObj);
        
        System.out.println("Test: Interface Design");
        Wealth wealthObject = new Wealth();
        
        BankAccount bankAccountObj = new BankAccount("Wells Fargo", 150000.50);
        wealthObject.addAsset(bankAccountObj);
        
        Car carObj = new Car("Tesla", 100000, 50000);
        wealthObject.addAsset(carObj);
        wealthObject.addDebt(carObj);
 
        House houseObj = new House("My House", 400000, 200000);
        wealthObject.addAsset(houseObj);
        wealthObject.addDebt(houseObj);
        
        Stock stockObj = new Stock("APPL", 1000, 117.5);
        wealthObject.addAsset(stockObj);
        
        Bond bondObj = new Bond("TGT42", 10, 5000);
        wealthObject.addAsset(bondObj);
        
        System.out.println(wealthObject);
        System.out.println(wealthObject.getAssetSummary()); 
        System.out.println(bankAccountObj);
        System.out.println(carObj);
        System.out.println(houseObj);
        System.out.println(stockObj);
        System.out.println(bondObj);
        
        
    }
    
}

