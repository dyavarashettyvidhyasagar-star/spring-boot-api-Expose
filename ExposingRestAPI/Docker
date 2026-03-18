# Use official OpenJDK image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file from target folder
COPY target/ExposingRestAPI-0.0.1-SNAPSHOT.jar app.jar

# Expose the port (Render will override with $PORT)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java","-jar","app.jar"]
