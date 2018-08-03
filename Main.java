public class Main {

    public static void main(String[] args) {
        Visao v = new Visao();
        Operacao operacao = new Operacao();
        
        operacao.soma();
        
        int n1 = v.inInt("Digite o primeiro numero inteiro");
        int n2 = v.inInt("Digite o segundo numero inteiro");
        operacao.calculaMedia(n1,n2);
        
        int resposta = operacao.multiplicacao();
        v.inString("O produto dos numeros e " + resposta);
        
        double num1,num2, resposta2;
        num1 = v.inDouble("Digite o dividendo");
        num2 = v.inDouble("Digite o divisor");
        resposta2 = operacao.divisao(num1, num2);
        v.inString("O resultado da divisao dos numeros e " + resposta2);
        
        operacao.subtracao();
        
        num1 = v.inDouble("Numero 1: ");
        double peso1 = v.inDouble("Peso do numero 1: ");
        num2 = v.inDouble("Numero 2: ");
        double peso2 = v.inDouble("Peso do numero 2: ");
        v.inString("Media: "+operacao.mediaPonderada(num1, num2, peso1, peso2));
        
        operacao.calculaFatorial(v.inInt("Digite um valor inteiro: "));
    }
}
