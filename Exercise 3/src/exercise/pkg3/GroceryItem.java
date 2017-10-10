/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg3;

/**
 *
 * @author RyanMunguia
 */
public class GroceryItem 
{
    private String name;
    private Double sellingPrice;
    private String expirationDate;
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setPrice(double p)
    {
        sellingPrice = p;
    }
    
    public Double getPrice()
    {
        return sellingPrice;
    }
    
    public void setExpirationDate(String d)
    {
        expirationDate = d;
    }
    
    public String getExpirationDate()
    {
        return expirationDate;
    }
    
    public GroceryItem()
    {
        name = "";
        sellingPrice = null;
        expirationDate = "";
    }
    
   public GroceryItem(String n)
   {
       name = n;
       sellingPrice = null;
       expirationDate = "";
   }
    
   public GroceryItem(String n, double p)
   {
       name = n;
       sellingPrice = p;
       expirationDate = "";
   }
   
   public GroceryItem(String n, double p, String d)
   {
       name = n;
       sellingPrice = p;
       expirationDate = d;
   }
   
   public boolean isExpensive(double expensive)
   {
       return (sellingPrice >= expensive);
   }
   
   public boolean isExpensive()
   {
       return (sellingPrice >= 5.0);
   }
   
   public boolean hasExpiration()
   {
       return (expirationDate != "");
   }
   
        
    
}
