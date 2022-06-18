FROM openjdk:8

MAINTAINER lucasko

COPY build/libs/gradle-task-example.jar /code/

WORKDIR /code

CMD ['java','-jar','/code/gradle-task-example.jar']