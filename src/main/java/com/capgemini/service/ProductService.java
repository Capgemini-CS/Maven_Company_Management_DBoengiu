package com.capgemini.service;

import com.capgemini.exceptions.InvalidFormat;
import com.capgemini.entity.Product;
import com.capgemini.map.EmployeeMapper;
import com.capgemini.map.ProductMapper;
import com.capgemini.repository.ProductRepository;
import org.tinylog.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();

    public List<ProductDTO> getAllProducts() {
        return productRepository.readAllValues().
                stream().
                map(ProductMapper::fromProduct).
                collect(Collectors.toList());
    }

    public ProductDTO getProductByProductCode(String productCode) {
        checkProductCode(productCode);
        return ProductMapper.fromProduct(productRepository.readValuesByProductCode(productCode));
    }

    public List<ProductDTO> getProductByProductScaleAndLine(String productScale, String productLine) {
        checkProductScale(productScale);
        return productRepository.readValuesByProductScaleAndLine(productScale, productLine).
                stream().
                map(ProductMapper::fromProduct).
                collect(Collectors.toList());
    }

    private void checkProductScale(String productScale) {
        if (!productScale.matches("\\d:\\d{2}")) {
            Logger.error(() -> new InvalidFormat("You entered an invalid format for product scale"));
            throw new InvalidFormat("You entered an invalid format for product scale");
        }
    }

    private void checkProductCode(String productCode) {
        if (!productCode.matches("[S]\\d{2}_\\d{4}")){
            Logger.error(() -> new InvalidFormat("You entered an invalid format for product code"));
            throw new InvalidFormat("You entered an invalid format for product code");
        }
    }
}
