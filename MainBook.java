public class MainBook {
    public static void main(String[] args) {
        Book b1 = new Book("title", "Author", "978-3-16-148410-0", 2, 300);
        Book b2 = new Book();

        b2.setTitle("title2");
        b2.setAuthor("author2");
        b2.setISBN("978-3-16-148410-5");
        b2.setPages(400);
        b2.setEdition(5);

        b1.printBook();
        b2.printBook();
    }

    public static class Book {
        private String title;
        private String Author;
        private String ISBN;
        private int edition;
        private int pages;

        public Book() {
            title = "";
            Author = "";
            ISBN = "";
            edition = 1;
            pages = 0;
        }

        public Book(String title, String Author, String ISBN, int edition, int pages) {
            this.title = title;
            this.Author = Author;
            this.ISBN = ISBN;
            this.edition = edition;
            this.pages = pages;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public int getEdition() {
            return edition;
        }

        public void setEdition(int edition) {
            this.edition = edition;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public void printBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + Author);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Edition: " + edition);
            System.out.println("Pages: " + pages);

        }
    }
}