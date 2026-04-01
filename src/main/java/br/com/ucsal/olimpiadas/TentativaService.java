package br.com.ucsal.olimpiadas;

public class TentativaService {
   private CalculadoraNota calculadora;
   public TentativaService(CalculadoraNota calculadora){
       this.calculadora = calculadora;
   }


    public int calcularNota(Tentativa tentativa){
      return calculadora.calcular(tentativa);
    }
}
