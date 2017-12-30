FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD website.jar website.jar
EXPOSE 8001
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/website.jar"]
