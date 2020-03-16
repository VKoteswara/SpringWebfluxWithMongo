FROM openjdk:8
VOLUME /tmp
ADD target/springwebflusdemo.jar springwebflusdemo.jar
ENTRYPOINT [ "java", "-Dspring.data.mongodb.uri=mongodb://mongo/test","-jar", "springwebflusdemo.jar" ]