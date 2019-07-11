package org.dimigo.oop;

public class Book {
    private String title;
    private String author;
    private int page;



    // 기본 생성자
    public Book() {
        System.out.println("기본 생성자 호출");
    }


    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }


    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

//    public String toString() {
////        return "책제목:" + title + ", 저자명:" + author +", 페이지:" + page;
////    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }

}
