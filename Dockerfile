FROM openjdk:17
EXPOSE 8080
ARG JAR_NAME
ARG encryption_password
ADD /target/service.jar /service.jar
CMD java -Djasypt.encryptor.password=$encryption_password -jar /service.jar
