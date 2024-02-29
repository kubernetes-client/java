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

CRD_URLS=${CRD_URLS:-}
OUTPUT_DIR=${OUTPUT_DIR:-}
KUBERNETES_CRD_GROUP_PREFIX=${KUBERNETES_CRD_GROUP_PREFIX:-}
PACKAGE_NAME=${PACKAGE_NAME:-}
CLUSTER_NAME=${CLUSTER_NAME:-"crd-model-gen"}
APPLY_ARGS=${APPLY_ARGS:-}

print_usage() {
  echo "Usage: generate Java model classes from CRDs" >& 2
  echo " -n: the prefix of the target CRD's api group to generate." >& 2
  echo " -p: the base package name of the generated java project. " >& 2
  echo " -o: output directory of the generated java project. " >& 2
  echo " -u: url location of the YAML manifest to install CRDs to a Kubernetes cluster. " >& 2
  echo " -a: arguments to pass to kubectl when the CRDs are applied. " >& 2
  echo " -c: cluster name of kind. " >& 2
}

while getopts 'u:n:p:o:c:a:' flag; do
  case "${flag}" in
    u) CRD_URLS+=("${OPTARG}") ;;
    n) KUBERNETES_CRD_GROUP_PREFIX="${OPTARG}" ;;
    p) PACKAGE_NAME="${OPTARG}" ;;
    o) OUTPUT_DIR="${OPTARG}" ;;
    c) CLUSTER_NAME="${OPTARG}" ;;
    a) APPLY_ARGS="${OPTARG}" ;;
    *) print_usage
       exit 1 ;;
  esac
done

set -e

# create a KinD cluster on the host
kind create cluster --name ${CLUSTER_NAME}

# install CRDs to the KinD cluster and dump the swagger spec
for url in "${CRD_URLS[@]}"; do
  if [[ ! -z $url ]]; then
    kubectl create $APPLY_ARGS -f "$url"
  fi
done

sleep 5
kubectl get --raw="/openapi/v2" > /tmp/swagger

echo "Verifying CRD installation.."
kubectl get crd -o name \
  | while read L
    do
      if [[ $(kubectl get $L -o jsonpath='{.status.conditions[?(@.type=="NonStructuralSchema")].status}') == "True" ]]; then
        echo "$L failed publishing openapi schema because it's attached non-structral-schema condition."
        kind delete cluster --name ${CLUSTER_NAME}
        exit 1
      fi
      if [[ $(kubectl get $L -o jsonpath='{.spec.preserveUnknownFields}') == "true" ]]; then
        echo "$L failed publishing openapi schema because it explicitly disabled unknown fields pruning."
        kind delete cluster --name ${CLUSTER_NAME}
        exit 1
      fi
      echo "$L successfully installed"
    done

# destroy the KinD cluster
kind delete cluster --name ${CLUSTER_NAME}

# execute the generation script
bash java-crd-cmd.sh -n "${KUBERNETES_CRD_GROUP_PREFIX}" -p "${PACKAGE_NAME}" -l 2 -o "${OUTPUT_DIR}/gen" < /tmp/swagger

# only keep the model classes
mkdir -p "${OUTPUT_DIR}/src/main/java/${PACKAGE_NAME//.//}"
cp -r "${OUTPUT_DIR}/gen/src/main/java/${PACKAGE_NAME//.//}/models" "${OUTPUT_DIR}/src/main/java/${PACKAGE_NAME//.//}"
rm "${OUTPUT_DIR}/src/main/java/${PACKAGE_NAME//.//}/models/AbstractOpenApiSchema.java" # probably caused by https://github.com/OpenAPITools/openapi-generator/issues/16257
rm -rf "${OUTPUT_DIR}/gen"
