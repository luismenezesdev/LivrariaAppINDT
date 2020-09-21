# LivrariaAppINDT
Projeto para desenvolvimento da atividade de seleção

Tecnologias utilizadas:
-Database: Mysql 5.6.17
-Backend: Spring Boot + JPA + plugin Flyway
-Frontend: Html, Css, Javascript, JQuery

Configuração e instalação

Aplicativos instalados necessários:

-git
-mysql 5.6 ou superior
-Java ultima versao
-Eclipse IDE {
	baixar Spring tools através de Help > Eclipse Marketplace > Buscar Spring Tools > Install
}

Rodar Aplicação:
-Instalar e Inicializar o Mysql (recomendo configurar username e password como -> root);
-Pelo Eclipse, abrir o projeto em File > Open Projects from File System ;
-Directory ;
-Selecionar pasta LivrariaAppINDT;

*Caso tenho configurar usuario e senha root no mysql, pular passo a seguir:
	-Configurar em: src > main > resources > application.properties , username e password do Mysql

-No lado esquerdo (Project Explorer) em LivrariaAppINDT, clique direito, selecionar Run As > Spring Boot App.

-Nesse momento o schema e a tabela deve ser criadas automaticamente.

-Após isso, abrir o frontend em LivrariaAppINDT/frontend/index.html
