#!/bin/bash

# Copyright 2020 The Kubernetes Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# This script orchestrates the code generation procedure. It is executed inside a crdgen
# container in order to minimize the environment dependencies on the host, being Docker only.

CRD_URL=${CRD_URL:-}
OUTPUT_DIR=${OUTPUT_DIR:-}
KUBERNETES_CRD_GROUP_PREFIX=${KUBERNETES_CRD_GROUP_PREFIX:-}
PACKAGE_NAME=${PACKAGE_NAME:-}

print_usage() {
  echo "Usage: generate Java model classes from CRDs" >& 2
  echo " -n: the prefix of the target CRD's api group to generate." >& 2
  echo " -p: the base package name of the generated java project. " >& 2
  echo " -o: output directory of the generated java project. " >& 2
  echo " -u: url location of the YAML manifest to install CRDs to a Kubernetes cluster. " >& 2
}

while getopts 'u:n:p:o:' flag; do
  case "${flag}" in
    u) CRD_URL="${OPTARG}" ;;
    n) KUBERNETES_CRD_GROUP_PREFIX="${OPTARG}" ;;
    p) PACKAGE_NAME="${OPTARG}" ;;
    o) OUTPUT_DIR="${OPTARG}" ;;
    *) print_usage
       exit 1 ;;
  esac
done

# create a KinD cluster on the host
kind create cluster

# install CRDs to the KinD cluster and dump the swagger spec
kubectl apply -f "${CRD_URL}"
sleep 5
kubectl get --raw="/openapi/v2" > /tmp/swagger

# destroy the KinD cluster
kind delete cluster

# execute the generation script
bash java-crd-cmd.sh -n "${KUBERNETES_CRD_GROUP_PREFIX}" -p "${PACKAGE_NAME}" -l 2 -o "${OUTPUT_DIR}/gen" < /tmp/swagger

# only keep the model classes
mkdir -p "${OUTPUT_DIR}/src/main/java/${PACKAGE_NAME//.//}"
cp -r "${OUTPUT_DIR}/gen/src/main/java/${PACKAGE_NAME//.//}/models" "${OUTPUT_DIR}/src/main/java/${PACKAGE_NAME//.//}"
rm -rf "${OUTPUT_DIR}/gen"