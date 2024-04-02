package second;

import java.time.LocalDate;

public class Book {
    private String name;
    private String publisher;
    private int price;
    private LocalDate pubDate;

    public Book(String name, String publisher, int price, LocalDate pubDate) {
        this.name = name;
        this.publisher = publisher;
        this.price = price;
        this.pubDate = pubDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }
}
