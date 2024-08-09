# Menggunakan base image Java 17
FROM openjdk:17-jdk-slim

# Set WORKDIR ke /app
WORKDIR /app

# Menyalin file JAR dari target direktori ke dalam container
COPY target/jangkau-0.0.1-SNAPSHOT.jar /app/jangkau.jar

# Eksekusi aplikasi saat container dijalankan
ENTRYPOINT ["java", "-jar", "jangkau.jar"]
