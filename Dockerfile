FROM openjdk:17
EXPOSE 8080
ADD /target/backend-template.jar /backend-template.jar
CMD java -jar /backend-template.jar
