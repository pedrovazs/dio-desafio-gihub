public class Sobrecarga {
    public static void main(String[] args) {
        System.out.println(
                "Área do Quadrado: " + AreaQuadrilatero.calculaArea(2, 2)
        );
        System.out.println(
                "Área do Retângulo: " + AreaQuadrilatero.calculaArea(2, 6)
        );
        System.out.println(
                "Área do Trapézio: " + AreaQuadrilatero.calculaArea(2, 4, 12)
        );

    }
}
