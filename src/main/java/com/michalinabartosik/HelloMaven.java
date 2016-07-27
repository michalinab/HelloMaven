package com.michalinabartosik;
import spark.Spark;

public class HelloMaven{
	public static void main(String[]args){
	/*System.out.println("Hello Maven");*/
	
        Spark.get("/", (req, res) ->  "Hello World");
    }
}

