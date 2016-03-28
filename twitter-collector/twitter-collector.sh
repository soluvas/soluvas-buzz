#!/bin/bash
SCRIPT_DIR="$(dirname $0)"
# For production, create config/application.properties
java -cp $SCRIPT_DIR'/target/classes:'$SCRIPT_DIR'/target/dependency/*' org.soluvas.buzz.twitter.collector.TwitterCollectorApp "$@"
