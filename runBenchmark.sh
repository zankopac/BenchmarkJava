#!/bin/sh

case "$1" in
-q|--quiet) quiet="-D-Dorg.owasp.esapi.logSpecial.discard=true"; shift  ;;
*)          quiet=""    ;;
esac
../../tools/hudson.tasks.Maven_MavenInstallation/myMaven/bin/mvn ${quiet} initialize
../../tools/hudson.tasks.Maven_MavenInstallation/myMaven/bin/mvn ${quiet} clean package cargo:run -Pdeploy
