public class Avioes {

    public static void main (String[] args){
        Aeronave a1 = new Aeronave("Delta", 30, 500, 1000, 100);
        Aeronave a2 = new Aeronave("Boeing", 100, 600, 2000, 150);
        Aeronave a3 = new Aeronave("Airbus", 150, 550, 2500, 200);
        Aeronave a4 = new Aeronave("Cessna", 2, 200, 400, 20);

        Aeronave [] aeronaves = { a1, a2, a3, a4 };

        double maiorPassageiros = 0;
        Aeronave aeronaveMaiorPassageiros = null;

        for (int i = 0; i < aeronaves.length; i++){
            if (aeronaves[i].getPassageiros() > maiorPassageiros){
                maiorPassageiros = aeronaves[i].getPassageiros();
                aeronaveMaiorPassageiros = aeronaves[i];
            }
        }

        System.out.println(aeronaveMaiorPassageiros);

        double maiorAutonomia = 0;
        Aeronave aeronaveMaiorAutonomia = null;

        for (int i = 0; i < aeronaves.length; i++){
            if (aeronaves[i].calcularAutonomia() > maiorAutonomia){
                maiorAutonomia = aeronaves[i].calcularAutonomia();
                aeronaveMaiorAutonomia = aeronaves[i];
            }
        }

        System.out.println(aeronaveMaiorAutonomia);

        double maiorDistancia = 0;
        Aeronave aeronaveMaiorDistancia = null;

        for (int i = 0; i < aeronaves.length; i++){
            if(aeronaves[i].calcularDistanciaMaxima() > maiorDistancia){
                maiorDistancia = aeronaves[i].calcularDistanciaMaxima();
                aeronaveMaiorDistancia = aeronaves[i];
            }
        }


        System.out.println(aeronaveMaiorDistancia);














    }



}
