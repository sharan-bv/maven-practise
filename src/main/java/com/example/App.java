package com.example;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(8080);
        
        get("/", (req, res) -> "Hello World!");
        
        System.out.println("Server started on port 8080");
    }
}
