FROM openjdk:8-jdk-alpine
LABEL maintainer="sureshfs2019@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/spring-data-pcf-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spring-data-pcf.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-data-pcf.jar"]