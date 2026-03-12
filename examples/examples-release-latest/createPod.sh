#!/bin/bash

# creates a pod and runs 
# Example.java(list pods for all namespaces) on starting of pod

# Exit on any error.
set -e

if ! which minikube > /dev/null; then
  echo "This script requires minikube installed."
  exit 100
fi

dir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

export REPO_ROOT=${dir}/..

cd ${REPO_ROOT}
mvn install

cd ${REPO_ROOT}/examples
mvn package

eval $(minikube docker-env)
docker build -t test/examples:1.0 .
kubectl apply -f test.yaml
