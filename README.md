Aplicando SOLID. Arthur Ferreira de Amorim
S –

Push 1: Fiz mudanças na classe App separando responsabilidades e criando classes para cadastro de participantes e questões.

Commit 2: Criei a classe ProvaService e também a TentativaService para calcular a nota.

Commit 3: Criei a classe TabuleiroCriar e removi essa lógica da App. Também deleguei a busca de questões para o ProvaService.
Criei essas Classes:
* ParticipanteService: cadastro de participantes
* ProvaService: gerenciamento de provas e questões
* QuestaoService: cadastro de questões
* TentativaService:  cálculo de nota
* TabuleiroCriar: impressão do tabuleiro
  ======================================================================
  O –

Antes, a correção da questão estava fixa dentro da classe Questao:

public boolean isRespostaCorreta(char marcada) {
return marcada == alternativaCorreta;
}
Criei a interface:
public interface CorrecaoQuestao {
boolean corrigir(Questao questao, char resposta);
}

Agora a classe Questao usa:
public boolean isRespostaCorreta(char marcada) {
return correcao.corrigir(this, marcada);
}
=====================================================================

L –

Apliquei garantindo que qualquer implementação das interfaces funcione corretamente no sistema.

Interfaces usadas:

* CorrecaoQuestao
* CalculadoraNota

Implementações:
* CorrecaoObjetiva
* CalcularNotaSimples

Adicionei validações para evitar erros, como:
if (correcao == null) {
throw new IllegalStateException("Correção não definida");
}

=======================================================================
I –
Utilizei interfaces simples e específicas:

* CorrecaoQuestao: apenas corrige
* CalculadoraNota:apenas calcula nota

Evitei criar interfaces grandes com vários métodos.

========================================================================
D –

Antes, o sistema criava objetos diretamente com new em vários lugares.

Centralizei as dependências na classe App:

static final CalculadoraNota CALCULADORA = new CalcularNotaSimples();
static final CorrecaoQuestao CORRECAO_OBJETIVA = new CorrecaoObjetiva();

E usei elas no sistema:
TentativaService service = new TentativaService(CALCULADORA);
q.setCorrecao(CORRECAO_OBJETIVA);

=======================================================================