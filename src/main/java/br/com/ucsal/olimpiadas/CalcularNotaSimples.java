package br.com.ucsal.olimpiadas;

public class CalcularNotaSimples implements CalculadoraNota{

    @Override
    public int calcular(Tentativa tentativa) {
        int acertos = 0;

        for (var r : tentativa.getRespostas()){
            if (r.isCorreta()){
                acertos++;
            }
        }
        return acertos;
    }
}
