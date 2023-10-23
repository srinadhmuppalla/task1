# Use an OpenJDK base image
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /usr/src/app

# Ensure the JAR file exists in the 'target' directory
COPY target/factorial-calculator-1.0-SNAPSHOT.jar ./app.jar

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]
