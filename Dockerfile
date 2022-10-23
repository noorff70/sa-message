#create a package first
#mvn package -Dmaven.test.skip

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/email-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/email.jar
COPY ${JAR_FILE} email.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","email.jar"]

# Make docker file
# C:\dev\repos\studyaid\sa-gateway>docker build -t sa-message .

# Make docker file
# docker build -t faizulnoor/sa-message .

#run docker file
#C:\dev\repos\studyaid\sa-gateway>docker run -d -p 8080:8080 -t sa-message-image