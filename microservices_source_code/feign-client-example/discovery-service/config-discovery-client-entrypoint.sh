#!/bin/sh

while ! nc -z config-server 8088 ; do
    echo "Waiting for upcoming Config Server"
    sleep 5
done

java -jar /opt/lib/discovery-service-0.0.1-SNAPSHOT.jar

