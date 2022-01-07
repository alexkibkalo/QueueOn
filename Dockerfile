FROM openjdk:14
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} queue-on.jar
ENTRYPOINT ["java","-jar","queue-on.jar"]
