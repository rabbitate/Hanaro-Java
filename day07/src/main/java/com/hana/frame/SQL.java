package com.hana.frame;

public class SQL {
    // Cust
    public static String insertCust = "INSERT INTO db_cust VALUES (?,?,?)";
    public static String updateCust = "UPDATE db_cust SET PWD = ?, NAME = ? WHERE ID = ?";
    public static String selectAllCust = "SELECT * FROM db_cust";

    public static String selectCust = "SELECT * FROM db_cust WHERE ID = ?";
    public static String deleteCust = "DELETE FROM db_cust WHERE ID = ?";

    // Item
    public static String insertItem = "INSERT INTO db_item VALUES (0,?,?,NOW(),NOW())";
    public static String updateItem = "UPDATE db_item SET NAME = ?, PRICE = ?, UPDATEDATE = NOW() WHERE ID = ?";
    public static String selectAllItem = "SELECT * FROM db_item ORDER BY ID";
    public static String selectItem = "SELECT * FROM db_item WHERE ID = ?";
    public static String deleteItem = "DELETE FROM db_item WHERE ID = ?";

}
