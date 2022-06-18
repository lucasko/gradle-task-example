FROM openjdk:args8

MAINTAINER lucasko

WORKDIR /code

COPY build/libs/gradle-task-example.jar /code/

CMD ['java' , '-jar' , '/code/gradle-task-example.jar']