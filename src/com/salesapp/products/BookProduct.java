/**
 * 
 */
package com.salesapp.products;


/**
 * BookProduct is an item belonging to the category 'Book' in the shopping store.
 *
 * @author archugs
 */
public class BookProduct extends Product {

	/**
	 * Default constructor to initialize a new book product.
	 */
	public BookProduct()
	{
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the <code>BookProduct</code> attributes.
	 *
	 * @param name - the name of the book product
	 * @param price - the price of the book product
	 * @param imported - boolean value of whether the book product imported or not
	 * @param quantity - quantity of book product items
	 */	
	public BookProduct(String name, double price, boolean imported, int quantity) 
	{
		super(name, price, imported, quantity);
		
	}

}