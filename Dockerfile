FROM openjdk:17
EXPOSE 8080
ARG JAR_NAME
ARG encryption_password
ADD /target/${JAR_NAME}.jar /${JAR_NAME}.jar
CMD java -Djasypt.encryptor.password=$encryption_password -jar /${JAR_NAME}.jar
