package br.com.ucsal.olimpiadas;

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
}
