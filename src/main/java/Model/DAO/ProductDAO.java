package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.BEAN.ProductBean;

public class ProductDAO {
    private Connection connection;

    public ProductDAO(Connection connection) {
    	connection = DBConnect.getConnection();
    }

    // Get product by productId
    public ProductBean getProductById(int productId) {
        ProductBean product = null;
        String query = "SELECT * FROM products WHERE product_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, productId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                product = new ProductBean();
                product.setProductId(resultSet.getInt("product_id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPriceOriginal(resultSet.getDouble("priceOriginal"));
                product.setPriceSale(resultSet.getDouble("priceSale"));
                product.setManufacturer(resultSet.getString("manufacturer"));
                product.setImageUrl(resultSet.getString("image_url"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle this exception properly in a real application
        }
        return product;
    }

    // Get all products
    public List<ProductBean> getAllProducts() {
        List<ProductBean> products = new ArrayList<>();
        String query = "SELECT * FROM products";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductBean product = new ProductBean();
                product.setProductId(resultSet.getInt("product_id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPriceOriginal(resultSet.getDouble("priceOriginal"));
                product.setPriceSale(resultSet.getDouble("priceSale"));
                product.setManufacturer(resultSet.getString("manufacturer"));
                product.setImageUrl(resultSet.getString("image_url"));
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle this exception properly in a real application
        }
        return products;
    }

    // Add a new product
    public boolean addProduct(ProductBean product) {
        String query = "INSERT INTO products (product_id, name, description, priceOriginal, priceSale, manufacturer, image_url) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, product.getProductId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setDouble(4, product.getPriceOriginal());
            preparedStatement.setDouble(5, product.getPriceSale());
            preparedStatement.setString(6, product.getManufacturer());
            preparedStatement.setString(7, product.getImageUrl());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace(); // Handle this exception properly in a real application
        }
        return false;
    }

    // Delete a product by productId
    public boolean deleteProduct(int productId) {
        String query = "DELETE FROM products WHERE product_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, productId);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace(); // Handle this exception properly in a real application
        }
        return false;
    }

    // Search for a product by productId
    public boolean searchProductById(int productId) {
        String query = "SELECT * FROM products WHERE product_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, productId);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle this exception properly in a real application
        }
        return false;
    }
}

