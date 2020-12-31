FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD build/libs/*.jar app.jar
ENTRYPOINT ["sh","-c","java -jar /app.jar"]