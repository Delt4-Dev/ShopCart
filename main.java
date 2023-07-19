import java.lang.String;

public class Principal {
    public static void main(String[] args){
        ProductStock estoque = new ProductStock();

        estoque.addToCart(new Stock("monitor",500,100));
        estoque.addToCart(new Stock("telefone",150,300));
        estoque.addToCart(new Stock("teclado",70,50));
        estoque.addToCart(new Stock("mouse",50,50));

        ShopCart carrinho = new ShopCart(estoque);

        carrinho.adicionaItem("monitor",2);
        carrinho.adicionaItem("telefone",5);
        carrinho.adicionaItem("teclado",2);

        carrinho.buy();

        System.out.println("A soma dos produtos: " + carrinho.totalPrice());
    }
}


