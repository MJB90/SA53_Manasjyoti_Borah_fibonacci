FROM openjdk:11-jdk

COPY dev.yml /fiboAPI/dev.yml
COPY /target/fiboAPI-1.0-SNAPSHOT.jar /fiboAPI/fiboAPI-1.0-SNAPSHOT.jar

WORKDIR /fiboAPI

RUN java -version

CMD ["java","-jar","fiboAPI-1.0-SNAPSHOT.jar","server","dev.yml"]

EXPOSE 8080-8081