# Use an OpenJDK base image
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the Java application JAR file into the container
COPY FactorialCalculator.class /app/

# Define the command to run your Java application
CMD ["java", "FactorialCalculator"]
