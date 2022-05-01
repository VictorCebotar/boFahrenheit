package nl.utwente.di.bookQuote;

import java.util.HashMap;
import java.util.Map;

public class Quoter {
    Map <String, Double> map = new HashMap<String, Double>();
    double getBookPrice(String isbn)
    {
        return Double.parseDouble(isbn)*9/5 + 32;
    }
}
