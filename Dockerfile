# Use a Java runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the Java source files to the container
COPY src/main/java/AkseliDocker.java .

# Compile the Java application
RUN javac AkseliDocker.java

# Run the Java application
CMD ["java", "AkseliDocker"]
