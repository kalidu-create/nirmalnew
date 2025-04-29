public class Customer{
    
    String cusCode;
    String cusName;
    double cusDiscount;

    Customer(){ }

    public void setName(String name){ this.cusName = name;}
    public String getName(){ return cusName;}

    public void setCode(String code){ this.cusCode = code;}
    public String getCode(){ return cusCode;}

    public void setDiscount(double discount){ this.cusDiscount = discount;}
    public double getDiscount(){ return cusDiscount;}
    
}