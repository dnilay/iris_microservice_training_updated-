#!/bin/sh

while ! nc -z config-server 8088 ; do
    echo "Waiting for upcoming Config Server"
    sleep 3
done

while ! nc -z discovery-service 8061 ; do
    echo "Waiting for upcoming discovery-service"
    sleep 3
done

java -jar /opt/lib/employee-service-0.0.1-SNAPSHOT.jar
