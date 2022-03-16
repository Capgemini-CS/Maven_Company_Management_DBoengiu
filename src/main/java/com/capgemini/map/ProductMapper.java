package com.capgemini.map;

import com.capgemini.entity.Employee;
import com.capgemini.entity.Product;
import com.capgemini.service.EmployeeDTO;
import com.capgemini.service.ProductDTO;

public class ProductMapper {
    public static Product fromDTO(ProductDTO productDTO){
        Product product = new Product();

        product.setProductCode(productDTO.getProductCode());
        product.setProductName(productDTO.getProductName());
        product.setProductLine(productDTO.getProductLine());
        product.setProductScale(productDTO.getProductScale());
        product.setProductVendor(productDTO.getProductVendor());
        product.setProductDescription(productDTO.getProductDescription());
        product.setQuantityInStock(productDTO.getQuantityInStock());
        product.setBuyPrice(productDTO.getBuyPrice());
        product.setMSRP(productDTO.getMSRP());

        return product;
    }

    public static ProductDTO fromProduct(Product product) {
        ProductDTO productDTO = new ProductDTO();

        productDTO.setProductCode(product.getProductCode());
        productDTO.setProductName(product.getProductName());
        productDTO.setProductLine(product.getProductLine());
        productDTO.setProductScale(product.getProductScale());
        productDTO.setProductVendor(product.getProductVendor());
        productDTO.setProductDescription(product.getProductDescription());
        productDTO.setQuantityInStock(product.getQuantityInStock());
        productDTO.setBuyPrice(product.getBuyPrice());
        productDTO.setMSRP(product.getMSRP());


        return productDTO;

    }
}
