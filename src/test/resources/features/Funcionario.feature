# language: pt
@cadastrar
Funcionalidade: Funcionario

  Contexto:
    Dado que eu esteja lgoado no sitema


  @cadastrarFuncionario
  Esquema do Cenário: Cadastrar Funcionário
    Quando clico em NOVO FUNCIONÁRIO
    E envio o formulário preeenchido com os dados  "<nome>" "<cargo>" "<cpf>" "<salario>" "<sexo>" "<tipoContratacao>" "<dataAdm>" do funcionário
    Então visualizo a mensagem de funcinário cadastrado com sucesso
    Exemplos:
      | nome            | cargo       | cpf            | salario | sexo      | tipoContratacao | dataAdm    |
      | Fulano da Silva | Analista Jr | 974.744.707-05 | 150000  | Masculino | clt             | 17/04/2017 |

  @editarFuncionario
  Esquema do Cenário: Editar Dados do Funcionário
    Quando faço a busca pelo funcionário "<funcionario>"
    E clico em EDITAR
    E envio o formulário com os dados "<cargo>" "<salario>" "<tipoContrataca>" do funcionário editados
    Então visualizo a mensagem de funcinário editado com sucesso
    Exemplos:
      | funcionario     | cargo          | salario | tipoContrataca |
      | Fulano da Silva | Analista Pleno | 300000  | CLT            |

  @excluirFuncionario
  Esquema do Cenário: Excluir Funcionário
    Quando faço a busca pelo funcionário "<funcionario>"
    E clico em EXCLUIR
    Então valido que o funcionário removido com sucesso
    Exemplos:
      | funcionario     |
      | Fulano da Silva |