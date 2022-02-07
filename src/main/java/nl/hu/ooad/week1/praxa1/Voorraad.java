package nl.hu.ooad.week1.praxa1;

public class Voorraad {
    private int aantal;
    private Product product;

    public Voorraad(Product product, int aantal) {
        this.product = product;
        this.aantal = aantal;
    }

    public Voorraad(Product product) {
        this(product, 0);
    }

    public int getAantal() {
        return aantal;
    }

    public Product getProduct() {
        return product;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }
}
