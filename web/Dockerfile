FROM tomcat:8-jre8  
MAINTAINER lpradel

RUN echo "export JAVA_OPTS=\"-Dapp.env=staging\"" > /usr/local/tomcat/bin/setenv.sh  
COPY ./testeNetshoes-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/testeNetshoes.war

CMD ["catalina.sh", "run"] 
