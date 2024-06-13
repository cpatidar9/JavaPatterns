package com.facade;

import java.sql.Connection;

public class ProductUtil {

    Connection conn = null;

    public ProductUtil(Connection connection) {
        super();
        this.conn = connection;
    }

    public int getQuantity(int productId) {
        // fetch value from Db
        return 123;
    }

    public int getReorderLevel(int productId) {
        // fetch value from Db
        return 200;
    }
}
