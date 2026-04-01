package br.com.ucsal.olimpiadas;

public class ParticipanteService {
    private long proximoId = 1;

    public Participante cadastrar(String nome, String email){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Noome INvalido");

        }
        Participante p = new Participante();
        p.setId(proximoId);
        p.setNome(nome);
        p.setEmail(email);
        return p;
    }
}
