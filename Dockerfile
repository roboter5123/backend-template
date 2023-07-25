FROM openjdk:17
EXPOSE 8080
ADD /target/{Project Name}.jar /{Project Name}.jar
CMD java -jar /{Project Name}.jar
