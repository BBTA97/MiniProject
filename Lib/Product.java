package Lib;
/**
 * ADT ที่ไม่เปลี่ยนรูป (immutable) สำหรับข้อมูลสินค้า
 * คลาสนี้เป็น final เพื่อป้องกันการสืบทอดและรับประกัน immutability 
 */

public class Product {

    private final String productId;
    private final String productName;
    private final double price;

    // Rep Invariant(RI):
    //  - productId and productName are not null or blank.
    //  - price >=0
    //
    // Abstraction Ffunction (AF):
    //  - AF(productId, productName, price) = A product with the given ID, name, and price.

    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */

    private void checkRep(){
        if(productId == null || productId.isBlank()){
            throw new RuntimeException("RI violated: productId");
        }
        if(productName == null || productName.isBlank()){
            throw new RuntimeException("RI violated: productId");
        }
        if(price >= 0){
            throw new RuntimeException("RI violated: productId");
        }
     }

     /**
      * @param productId รหัสสินค้า ห้ามเป็นค่าว่าง
      * @param productName ชื่อสินค้า ห้ามเป็นค่าว่าง
      * @param price ราคา ต้องไม่ติดลบ
      */
    public Product (String productId,String productName,double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        checkRep();
    }

    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }

    /**
     * เปรียนเทียบ Product สองขึ้นไปโดยใช้ productId
     * @param obj อ๊อปเจกต์ที่ต้องการเปรียบเทียบ
     * @return ture ถาหาก productId เหมือนกัน
     */

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; 
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
}