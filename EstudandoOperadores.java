public class EstudandoOperadores{
    
    public static void main(String[] args) {
        
        System.out.println("Calculando a area de uma figura");
        int baseFigura = 10;
        int alturaFigura = 15;
        int areaFigura = baseFigura*alturaFigura;
        System.out.println("Uma figura de base "+baseFigura+" altura "+alturaFigura+" possui area "+areaFigura);


        System.out.println("Calculando a area de um circulo raio 3.4");
        
        //Declarando o raio
        double raio = 3.4;
        //Declarando PI
        final double PI = 3.14159;
        //Formula do calculo da area
        double area = PI * raio * raio;
        //Exibindo o resultado
        System.out.println("Area = "+area);
        
        //Novo calculo
        System.out.println("Calculando a area de um circulo raio 10");
        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = "+area);
    }
}