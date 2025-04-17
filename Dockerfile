# pull a base image which gives all required tools and libraries
FROM openjdk:17-jdk-alpine

# create a folder where the app will be stored
WORKDIR /app

# copy source code from host machine to container
COPY src/main/Main.java .

# compile the application code
RUN javac Main.java

# run the application
CMD ["java", "Main"]
