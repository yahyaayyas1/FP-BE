FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/jangkau-0.0.1-SNAPSHOT.jar jangkau.jar
ENTRYPOINT ["java","-jar","/jangkau.jar"]
EXPOSE 8081