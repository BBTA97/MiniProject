package Lib;

import java.util.ArrayList;

/**
 * คลาสนี้ทำหน้าที่เป็นแคตตาล็อกสินค้า(Repostory)
 */
public class ProductCatalog {
    private ArrayList<Product> products = new ArrayList<>();

    // RI: products list is not null, contains no null element, and no duplicate products.
    // AF: AR(products) = A catalog of all avalible products.

    private void checkRep(){
        if(products == null){
            throw new RuntimeException("");
        }
        //
        for(int i= 0; i < products.size(); i++){
            for(int j = i+1; j < products.size(); j++){
                if(products.get(i).equals(products.get(i))){
                    throw new RuntimeException("");
                }
            }
        }
    }
    public ProductCatalog(){
        checkRep();
    }

    /**
     * เพิ่มสินค้าใหม่เข้าสู้แคตตาล็อก
     * @param product สินค้าที่ต้องการเพิ่ม
     */
    public void addProduct(Product product){
        if(product != null && !products.contains(product)){
            products.add(product);
        }
        checkRep();
    }

    /**
     * ค้นหาสินค้าจากรหัสสินค้า
     * @param productId รหัสสินค้าที่ต้องการค้นหา
     * @return อ็อบเจกต์ Product หากพบ, หรือ null หากไม่พบ
     */
    public Product findById(String productId){
        for (Product p : products){
            if(p.getProductId().equals(productId)){
                return p;
            }
        }
        return null;
    }
}
