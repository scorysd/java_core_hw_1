FROM bellsoft/liberica-openjdk-alpine:latest
COPY ./src ./source
RUN mkdir ./out 
RUN javac -s ./source/homework -d ./out ./source/homework/*.java
CMD java -classpath ./out homework.App