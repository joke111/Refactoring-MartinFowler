package chapter01.videorental.before;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_REGULAR = 1;
    private String _title;
    private int _priceCode;

    public Movie(String title, int printCode) {
        _title = title;
        _priceCode = printCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }
}