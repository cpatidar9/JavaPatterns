package com.facade;

import java.sql.Connection;

public class ProductFacade {

    DatabaseConnection databaseConnection = new DatabaseConnection();
    ProductUtil productUtil;

    public boolean isItemBelowROL(int productId) {
        Connection connection = databaseConnection.createConnection();
        productUtil = new ProductUtil(connection);

        int qty = productUtil.getQuantity(productId);
        int rol = productUtil.getReorderLevel(productId);

        return qty > rol;
    }
}
