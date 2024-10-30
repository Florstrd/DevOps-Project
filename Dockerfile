# Use an official OpenJDK image as a base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory into the container
COPY target/dennis_project-0.0.1.jar dennis.project.jar

# Expose the port that the application will run on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "dennis.project.jar"]