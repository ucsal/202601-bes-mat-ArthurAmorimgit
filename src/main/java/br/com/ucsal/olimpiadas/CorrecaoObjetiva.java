package br.com.ucsal.olimpiadas;

public class CorrecaoObjetiva implements CorrecaoQuestao {

    @Override
    public boolean corrigir(Questao questao, char resposta) {
       if (questao == null){
           return false;
       }

        return resposta == questao.getAlternativaCorreta();
    }
}
