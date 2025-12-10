# ✅ Use Java 17
FROM eclipse-temurin:17-jdk

# ✅ Set working directory inside container
WORKDIR /app

# ✅ Copy jar from target folder
COPY target/*.jar app.jar

# ✅ Expose port (Render will map it automatically)
EXPOSE 8080

# ✅ Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
