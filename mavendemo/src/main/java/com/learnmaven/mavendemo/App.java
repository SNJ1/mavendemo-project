package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;
public class App 
{ 
	final static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {   
    	Calculator calc = new Calculator();
    	logger.debug(calc.add(1, 2));
    	logger.debug(calc.substract(4, 3));
    	logger.debug(calc.multiply(10, 10));
    	logger.debug(calc.divide(100, 10));       
    }
}
