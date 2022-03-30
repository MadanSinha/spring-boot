FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/springboot_cicd.jar springboot_cicd.jar
ENTRYPOINT ["java","-jar","/springboot_cicd.jar"]
EXPOSE 8080