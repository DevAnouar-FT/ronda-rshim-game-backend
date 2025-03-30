# Use Eclipse Temurin LTS JDK with Alpine for smallest footprint
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app
COPY . .

# Will be replaced with actual build commands later
RUN echo "Gateway service placeholder" > /tmp/placeholder

# Default Vert.x port
EXPOSE 8080

CMD ["sleep", "infinity"]
