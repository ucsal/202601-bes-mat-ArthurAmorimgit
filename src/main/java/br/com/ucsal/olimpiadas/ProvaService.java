package br.com.ucsal.olimpiadas;

import java.util.List;

public class ProvaService {
    private long proximoId = 1;
    public Prova cadastrar(String titulo){
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("titulo invalido");
        }
        Prova prova = new Prova();
        prova.setId(proximoId++);
        prova.setTitulo(titulo);
        return prova;
    }
    public List<Questao> buscarQuestoes(Long provaId, List<Questao> questoes){
        return questoes.stream().filter(q -> q.getProvaId() == provaId).toList();
    }
}
