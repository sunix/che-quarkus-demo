#!/bin/bash
cd sunix-quarkus-demo
ps aux | grep 'java' | awk '{print $2}' | xargs kill -9;
mvn compile quarkus:dev