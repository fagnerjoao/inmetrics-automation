## Teste Inmetrics 


# Setup
- gem install bundler
- bundle install
- gem install cucumber
- gem install selenium-webdriver
- Install [JDK 8](https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html) 
- Install [Maven](https://maven.apache.org/install.html) 

# Ambientes 
- Web Site: http://http://www.inmrobo.tk/accounts/login/
- API:  https://inm-api-test.herokuapp.com/swagger-ui.html#/

# Cenários Web
Nome Cenário 		    | 	Tag
------------------- | -------------------------
Cadastrar Usuário	  | @cadastrarUsuario
Login			          | @login
Cadastar Funcionário| @cadastrarFuncionario
Editar Funcionário	| @editarFuncionario
Excluir Funcionário	| @rexcluirFuncionario

# Cenários API
Nome Cenário 		            | 	Tag
--------------------------- | --------------------
GET - Listar Todos Usuarios	| @getTodosUsuarios
GET - Listar Usuario		    | @getUsuario

# Execução dos Cenário:
cucumber -t 

**Exemplo:** 
  cucumber -t @adastrarFuncionario

# Resources

##### [Cucumber Docs](https://cucumber.io/docs)

##### [Cucumber School Lessons](https://cucumber.io/school#lessons)

##### [SeleniumHQ Documentation](http://www.seleniumhq.org/docs/)

##### [Junit Documentation](http://junit.org/javadoc/latest/index.html)

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### [Stack Overflow](http://stackoverflow.com/)