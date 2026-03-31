package br.com.ucsal.olimpiadas;

public class QuestaoService {
    private long proximoId = 1;
    public Questao cadastrar(Long provaId, String enunciado, String[] alternativas, char correta){
        Questao q = new Questao();
        q.setId(proximoId);
        q.setProvaId(provaId);
        q.setEnunciado(enunciado);
        q.setAlternativas(alternativas);
        q.setAlternativaCorreta(correta);
        return q;
    }
}
