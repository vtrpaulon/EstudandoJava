public class EstudandoOperadores{
    
    public static void main(String[] args) {

        int x = 25;
        int y = 30;
        int res = x+y;
        System.out.println("x + y = "+res);

        int x2 = 50;
        int y2 = 30;
        int res2 = x2-y2;
        System.out.println("x2 - y2 = "+res2);
        
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

        int a = 6;
        int b = 2;
        int soma = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        System.out.println("A soma de a e b é: "+soma);
        System.out.println("A subtracao de a e b é: "+sub);
        System.out.println("A multiplicacao de a e b é: "+mult);
        System.out.println("A divisao de a e b é: "+div);
    }
}