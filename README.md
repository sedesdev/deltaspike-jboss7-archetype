deltaspike-jboss7-archetype
======================

Resumo
------
Archetype para aplicativos DeltaSpike no JBoss 7, conforme arquitetura definida segundo princ�pios do DDD

Caracter�sticas do projeto:
---------------------------
* Weld CDI + JSF 2.0
* DeltaSpike 0.4 Core
* DeltaSpike 0.4 JPA
* DeltaSpike 0.4 Security
* DeltaSpike 0.4 JSF
* Hibernate Core 4.1.4
* Hibernate Validator 4.2.0
* Primefaces 3.5
* Richfaces 4.3.3
* PrettyFaces 3.3.3
* RestEasy Webservices 2.3.2

Obs.: � necess�rio JDK 1.6, Maven 3 e o JBoss 7.1.1.Final para executar.

Instala��o
----------

Realize do download do archetype, clicando em `Download ZIP` e descompacte o arquivo no diret�rio de sua prefer�ncia.

Dentro da pasta criada, execute `mvn compile install` para instalar o archetype no reposit�rio maven local

Crie um projeto
---------------

    mvn archetype:generate \
        -DarchetypeGroupId=br.jus.trese \
        -DarchetypeArtifactId=deltaspike-jboss7-archetype \
        -DarchetypeVersion=0.1-SNAPSHOT

Para facilitar, copiar e colar:     

    mvn archetype:generate -DarchetypeGroupId=br.jus.trese -DarchetypeArtifactId=deltaspike-jboss7-archetype -DarchetypeVersion=0.1-SNAPSHOT

Ao ser perguntado sobre o artifactID, responda com o nome da aplica��o.

Na �ltima pergunta, aperte ENTER


Importe o projeto no Eclipse
----------------------------

V� em File > Import > General > Existing Projects into Workspace


Criando um novo projeto no Eclipse
==================================

Execute `mvn compile install` para instalar o archetype no seu reposit�rio maven local

V� em Preferences > Maven > Archetypes e Add Local Catalog
Selecione o cat�logo do arquivo (archetype-catalog.xml)
Crie um novo Maven project e selecione o archetype (lembre de selecionar "Include snapshot archetypes").

Considera��es
=============

O projeto rec�m criado cont�m a estrutura padr�o para desenvolvimento de sistemas nas tecnologias acima descritas, servindo como um guia para iniciar a implementa��o propriamente dita.

IMPORTANTE: Quando o projeto estiver no Eclipse, trocar onde houver NOME_APLICACAO pelo nome do projeto do software

Refer�ncias Externas
====================

Como instalar o MAVEN:  
* http://maven3tutorial.blogspot.com.br/2011/02/instalando-o-maven-no-seu-computador.html

Criando projetos no Maven:

* http://www.mkyong.com/maven/how-to-create-a-web-application-project-with-maven/
* http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

Criando Archetypes:

* http://www.luckyryan.com/2013/02/15/create-maven-archetype-from-existing-project/
* http://maven.apache.org/guides/mini/guide-creating-archetypes.html

Criando reposit�rios no Github:

* http://blog.rueedlinger.ch/2012/09/use-github-as-maven-remote-repository/