private double peso;
    private double altura;

    public CalculadoraIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String interpretarResultadoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc < 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }

    public static void main(String[] args) {
        // uso
        double peso = 70.0;  
        double altura = 1.75; 

        CalculadoraIMC calculadora = new CalculadoraIMC(peso, altura);
        double imc = calculadora.calcularIMC();
        String resultado = calculadora.interpretarResultadoIMC();

        System.out.println("IMC: " + imc);
        System.out.println("Resultado: " + resultado);
    }
    }
