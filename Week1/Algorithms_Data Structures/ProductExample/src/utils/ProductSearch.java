package utils;

import models.Product;

public class ProductSearch {


    // linear search algorithm
    public static Product linearSearchProductById(Product[] products, Integer productId){
        if(products == null || products.length==0){
            return null;
        }
        for(Product p:products){
            if(p.getProductId()==productId){
                return p;
            }
        }
        return null;
    }



    //binary search, NOTE:- will work only if the product array is sorted

    public static Product binarySearchById(Product[] products, Integer productId){
        int low = 0, high=products.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(products[mid].getProductId()==productId){
                return products[mid];
            }
            else if(products[mid].getProductId()<productId){
                low=mid+1;
            } 
            else{
                high = mid-1;
            }
        }
        return null;

    }
}
