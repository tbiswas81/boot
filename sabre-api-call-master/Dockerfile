FROM tomcat:7-jre8-alpine

COPY ./target/sabre-api-1.2.4.RELEASE.war /usr/local/tomcat/webapps/sabre.war

EXPOSE 8180 

CMD ["catalina.sh","run"]
