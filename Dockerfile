FROM jelastic/maven:3.9.5-openjdk-21 AS build
LABEL authors="gideon07"
WORKDIR /
COPY src src
COPY pom.xml pom.xml
RUN mvn clean install -Dmaven.test.skip=true

FROM eclipse-temurin:21-jdk
LABEL version=1.0-SNAPSHOT
COPY --from=build target/customerappdocker-0.0.1-SNAPSHOT.jar customerappdocker-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","customerappdocker-0.0.1-SNAPSHOT.jar"]