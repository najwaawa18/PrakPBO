// CLASS: Buku
public class Buku {
    private String judul;
    private String isbn;
    private boolean tersedia;

    public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
        this.tersedia = true; // baru ditambahkan, default tersedia
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean status) {
        this.tersedia = status;
    }

    public String getInfo() {
        return judul + " (ISBN: " + isbn + ") - " + (tersedia ? "Tersedia" : "Sedang dipinjam");
    }
}