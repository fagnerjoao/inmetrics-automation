# language: pt
@login
Funcionalidade: Login

  Contexto:
    Dado que eu esteja na pagina de login

  @login
  Cenário: Efetuar Login
    Quando efeutuo o login
    Então visualizo a pagina empregados