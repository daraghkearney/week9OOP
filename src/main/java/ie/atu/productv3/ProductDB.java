package ie.atu.productv3;

import ie.atu.productv2.Book;
import ie.atu.productv2.Software;

public class ProductDB {

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}

    public static ie.atu.productv2.Book getBook(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data


        ie.atu.productv2.Book myBook = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new ie.atu.productv2.Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new ie.atu.productv2.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
        }

        return myBook;
    }

    public static ie.atu.productv2.Software getSoftware(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data


        ie.atu.productv2.Software mySoftware = null;
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new ie.atu.productv2.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new ie.atu.productv2.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
        }

        return mySoftware;
    }
}

