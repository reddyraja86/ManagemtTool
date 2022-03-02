# For Java 8, try this
FROM openjdk:8-jdk-alpine


# Refer to Maven build -> finalName
ARG JAR_FILE=target/ProductManagement-1.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} ProductManagement-1.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","ProductManagement-1.jar"]