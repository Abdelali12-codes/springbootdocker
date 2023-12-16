FROM maven:3.6.3 AS maven


WORKDIR /app
COPY . /app
# Compile and package the application to an executable JAR
RUN mvn clean package 


# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim


# Make port 8080 available to the world outside this container
EXPOSE 8080

COPY --from=maven target/demo-0.0.1-SNAPSHOT.jar app.jar
# Run the application when the container launches
CMD ["java", "-jar", "app.jar"]
