package org.example;

public class DbConnection {
    private static DbConnection dbConnection;
    private String test = "test";
    private DbConnection(){

    }

    public void setTest(String test){
        this.test = test;
    }

    public String getTest(){
        return test;
    }

    public static DbConnection getDbConnection(){
        if(dbConnection==null){
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }

}
