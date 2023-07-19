import java.util.ArrayList;
import java.lang.String;

public class ShopCart {
    int     parcial=0;

    ProductStock stockCart;
    ArrayList<Stock> CC;

    public ShopCart(ProductStock estoque) {
        stockCart = estoque;
        this.CC = new ArrayList<>();
    }

    public void adicionaItem(String no, int qt) {
        CC.add(new Stock(no, qt));
    }
    public void buy() {
        int i;
        for (i = 0; i < stockCart.x.size(); i++) {
            for (Stock Stock : CC)
                if (stockCart.x.get(i).getNome().equals(Stock.getNome())) {
                    if (stockCart.x.get(i).getQuantidade() >= Stock.getQuantidade()) {
                        stockCart.x.get(i).setQuantidade(stockCart.x.get(i).getQuantidade() - Stock.getQuantidade());
                    } else {
                        System.out.println("A quantidade em estoque é insuficiente.");
                    }
                }
        }
    }

    public int totalPrice() {
        int i;
        for (i = 0; i < stockCart.x.size(); i++) {
            for (Stock Stock : CC)
                if (stockCart.x.get(i).getNome().equals(Stock.getNome())) {
                    if (stockCart.x.get(i).getQuantidade() >= Stock.getQuantidade()) {
                        parcial = parcial + (stockCart.x.get(i).getValor() * Stock.getQuantidade());
                    }
                }
        }
        return parcial;
    }

}