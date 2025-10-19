// just build all maven file

#build project with maven
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /home/app
COPY . .
RUN mvn -f /home/app/pom.xml clean package

#build with jar file

FROM openjdk:21-jdk-slim
VOLUME /tmp
EXPOSE 5000
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]