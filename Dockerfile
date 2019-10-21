FROM openjdk:8-jre-alpine
ADD target/NodeMongoDBApp-1.0.jar NodeMongoDBApp.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "NodeMongoDBApp.jar"]