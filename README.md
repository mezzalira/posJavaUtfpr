<h2>Material aula Vraptor 4 - UTFPR</h2>

<p>Projeto desenvolvido com Vraptor 4, Hibernate 4.5, CDI, EJB e Bootstrap 3.2</p>

============

<h3>Requisitos de ferramentas</h3>

<ul>
<li>JDK 8.0 <a href='http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html'>Download</a> </li>
<li>Eclipse Luna JEE <a href='http://eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/lunar'>Download</a> </li>
<li>Wildfly 8.1 <a href='http://wildfly.org/downloads/'>Download</a> </li>
</ul>

<h3>Importando e rodando o projeto no eclipse</h3>
<h4>Importando</h4>
<p>O projeto foi construido utilizando Maven para importar no eclipse basta  
você utilizar a opção de <strong>import->maven->Existing Maven Projects</strong> e escolher a pasta do projeto que você baixo. </p>
<h4>Construindo e rodando</h4>
<p>Para construir o .war e verificar se todas as dependências deram certo você deverá executar o projeto com a opção <strong>run->run as->Maven install</strong></p>
<p>Para rodar o projeto utilizaremos o Wildfly baixado anteriormente. 
A integração do Wildfly com o eclipse acontece através de um plugin do JbossAS que deve ser baixado pelo <strong>Help->Eclipse Marketplace->JBossTools</strong> instalar somente o JBossAS o restante pode deixar desmarcado.</p>
<p>Para configurar o servidor no eclipse basta utilizar a opção <strong>Servers->new Server->JBoss->wildfly</strong> segue alguns links para ajudar:</p>

<ul>
<li>http://www.mastertheboss.com/wildfly-8/configuring-eclipse-to-use-wildfly-8</li>
<li>http://www.horochovec.com.br/blog/2014/02/17/configurando-wildfly-8-no-eclipse-kepler/</li>
<li>http://pablonobrega.wordpress.com/2014/05/28/configurando-o-wildfly-no-eclipse-kepler/</li>
</ul>

<p>Após configurado o server para rodar basta clicar sobre o projeto e escolher a opção <strong>run->run as->run on server</strong></p>

<h3>Acessando</h3>

<p>Para acessar basta digitar a seguinte url no navegador http://localhost:8080/aulaVraptor/</p>


<h3>Slideshare</h3>

<a href="http://www.slideshare.net/slideshow/embed_code/37579461">Visualizar Slide</a>