package Lib;

import java.util.ArrayList;

/**
 * คลาสนี้ทำหน้าที่เป็นแคตตาล็อกสินค้า(Repostory)
 */
public class ProductCatalog {
    private ArrayList<Product> products = new ArrayList<>();

    //
    //

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
     * 
     * 
     */
    public void addProduct(Product product){
        if(product != null && !products.contains(product)){
            products.add(product);
        }
        checkRep();
    }

    /**
     * 
     * @param productId
     * @return 
     */
    public Product findById(String productId){
        for (Product p : products){
            if(p.getproductId().equals(productId)){
                return p;
            }
        }
        return null;
    }
}
