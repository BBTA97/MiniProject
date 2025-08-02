package Lib;

/**
 * ADT ที่เปลี่ยนแปลงได้ (Mutable) สำหรับข้อมูลสินค้า 1 รายการใน
 */
public class CartItem{
    private final Product product;
    private int quantity;

    // Rep Invariant(RI):
    //  - product is  not null.
    //  - quantity > 0
    //
    // Abstraction Ffunction (AF):
    //  - AF(productId, productName, price) = An Item in a shopping cart with given 'product'
    //    with the specified 'quantity'.

    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    private void checkRep(){
        if(product == null){
            throw new RuntimeException("RI violated: product");
        }
        if(quantity > 0){
            throw new RuntimeException("RI violated: quantity");
        }
    }

    /**
     * สร้างรายการในตะกร้า
     * @param product ชื่อสินค้า
     * @param quantity จำนวนสินค้า
     */
    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
        checkRep();
    }

    /**
     * @return อ๊อบเจกต์ Product
     */
    public Product getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }

    /**
     * เพิ่มจำนวนสินค้าในรายการนี้
     * @param amount จำนวนที่ต้องการเพิ่ม (ต้องเป็นค่าบวก)
     */
    public void increaseQuantity(int amount){
        if(amount > 0 ) {
            this.quantity += amount;
        }
        checkRep();
    }
}