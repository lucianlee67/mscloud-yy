FROM openjdk:17-jdk-slim
LABEL authors="lucianlee"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} feign80.jar
ENTRYPOINT ["java", "-jar", "cloud-consumer-feign-order80-1.0-SNAPSHOT.jar"]
