FROM openjdk:8-jdk-alpine
COPY "./target/cards-api-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 9005
ENTRYPOINT ["java", "-jar", "app.jar"]