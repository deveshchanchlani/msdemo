#!/bin/sh
while ! nc -z $1 $2; do sleep 5; done
java -Djava.security.egd=file:/dev/./urandom -jar "$3"