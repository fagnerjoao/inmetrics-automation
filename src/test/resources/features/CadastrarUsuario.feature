# language: pt
@cadastrar
Funcionalidade: Cadastrar Usuário

  Contexto:
    Dado que eu esteja na pagina de login


  @cadastrarUsuario
  Cenário:  Cadastrar Usuário
    Quando clico CADASTRE-SE
    E informo as credênciais de acesso
    E clico em CADASTRAR
    Então visusalizo a tela de login
