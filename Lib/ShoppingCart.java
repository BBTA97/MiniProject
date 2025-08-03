package Lib;
/**
 * ADT ที่เปลี่ยนแปลงได้ โดยผู้ใช้จะสั่งสินค้าเพิ่มลดสินค้า หรือจำนานได้ในตะกร้านี้
 */
public class ShoppingCart {
    //RI: 
    //AF:
    public ShoppingCart(PricingService pricingService, ProductCatalog productCatalog){}
    
    public void addItem(String productId, int quantity){

        checkRep();
    }
    public void removeItem(String productId){

        checkRep();
    }
    public void getTotalPrice(){}
    public void checkRep(){}

}
