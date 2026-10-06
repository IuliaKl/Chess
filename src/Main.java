public class Main {


        public static void main(String[] args) {
            Figura[] figuras = {
                    new Figura("Пешка", "белый"),
                    new Figura("Конь", "белый"),
                    new Figura("Король", "белый"),
                    new Figura("Король", "черный"),
                    new Figura("Пешка", "черный"),

            };

            int whiteCount = 0;
            int blackCount = 0;

            for (Figura p : figuras) {
                if (p.isWhite()) {
                    whiteCount++;
                } else if (p.isBlack()) {
                    blackCount++;

                }

                int pawnCount = 0;
                int knightCount = 0;
                int kingCount = 0;
                int queenCount = 0;
                int rookCounter = 0;
                int elephantCounter = 0;
                if ("Пешка".equalsIgnoreCase(p.getName())) {
                    pawnCount++;
                } else if ("Конь".equalsIgnoreCase(p.getName())) {
                    knightCount++;
                } else if ("Король".equalsIgnoreCase(p.getName())) {
                    kingCount++;
                } else if ("Ферзь".equalsIgnoreCase(p.getName())) {
                    queenCount++;
                } else if ("Ладья".equalsIgnoreCase(p.getName())) {
                    rookCounter++;
                } else if ("Слон".equalsIgnoreCase(p.getName())) {
                    elephantCounter++;
                }

                int total = figuras.length;
                double blackPercent = 100.0 * blackCount / figuras.length;
                double whitePercent = (double) whiteCount / figuras.length * 100;


                System.out.println("Белых фигур: " + whiteCount);
                System.out.println("Черных фигур: " + blackCount);
                System.out.println("Пешек: " + pawnCount);
                System.out.println("Коней: " + knightCount);


            }  }
}
