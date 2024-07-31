FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/jangkau-0.0.1-SNAPSHOT.jar jangkau.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/jangkau.jar"]