FROM openjdk:17-alpine
COPY . .
COPY target/webapplication-0.0.1-SNAPSHOT.jar webapplication-0.0.1-SNAPSHOT.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","/webapplication-0.0.1-SNAPSHOT.jar"]
