#!/usr/bin/env bash

set -x
set -e

ls 
pwd
ls /


mvn \
    -Dtest=RunCukesTest \
    -Dwebdriver.timeouts.implicitlywait=15000 \
    -Dcukes.config.file=config.properties \
    -Dwebdriver.remote.driver=chrome \
    clean verify
