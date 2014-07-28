Material aula Vraptor 4 - UTFPR
============

<h3>Requisitos de ferramentas</h3>

<ul>
<li>JDK 8.0 <a href='http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html'>Download</a> </li>
<li>Eclipse Luna JEE <a href='http://eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/lunar'>Download</a> </li>
<li>Wildfly 8.1 <a href='http://wildfly.org/downloads/'>Download</a> </li>
</ul>

<h3>Importando e rodando o projeto no eclipse</h3>
<h4>Importando</h4>
<p>O projeto foi construido utilizando Maven então para importar no eclipse basta  
você utilizar a opção de <strong>import->maven->Existing Maven Projects.</strong> e escolher a pasta do projeto que você baixo. </p>
<h4>Construindo e rodando</h4>
<p>Para construir o .war e verificar se todas as dependências deram certo você deverá executar o projeto com a opção <strong>run->run as->Maven install</strong></p>
<p>Para rodar o projeto utilizaremos o Wildfly baixado anteriormente. 
A integração do Wildfly com o eclipse acontece através de um plugin do JbossAS que deve ser baixado pelo <strong>Help->Eclipse Marketplace->JBossTools</strong> instalar somente o JBossAS o restante pode deixar desmarcado.</p>
