FROM $(organizacion)/jdk8-apm-alpine
ADD *.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]