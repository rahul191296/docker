FROM openjdk:latest

# Add Maintainer Info
LABEL maintainer="rahulkumar191296@gmail.com"


ADD target/ModAdmin.jar ModAdmin.jar

# Make port 8083 available to the world outside this container
EXPOSE 8083

# Run the jar file 
ENTRYPOINT ["java","-jar","ModAdmin.jar"]