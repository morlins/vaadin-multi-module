package it.imolinfo.samples.backend;

import java.io.Serializable;
import java.util.Collection;

import it.imolinfo.samples.backend.data.Category;
import it.imolinfo.samples.backend.data.Product;
import it.imolinfo.samples.backend.mock.MockDataService;

/**
 * Back-end service interface for retrieving and updating product data.
 */
public abstract class DataService implements Serializable {

    public abstract Collection<Product> getAllProducts();

    public abstract Collection<Category> getAllCategories();

    public abstract void updateProduct(Product p);

    public abstract void deleteProduct(int productId);

    public abstract Product getProductById(int productId);

    public static DataService get() {
        return MockDataService.getInstance();
    }

}
