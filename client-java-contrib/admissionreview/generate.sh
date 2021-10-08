#!/bin/bash
LOCAL_MANIFEST_FILE=$PWD/admission-swagger-1.20.4.json

docker run --rm \
  -v $LOCAL_MANIFEST_FILE:$LOCAL_MANIFEST_FILE \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v $PWD:$PWD \
  -it docker.pkg.github.com/kubernetes-client/java/crd-model-gen:v1.0.6 \
  sh -c "source /gen/openapi/java-crd-cmd.sh -n v1 -p io.kubernetes.client.admissionreview -l 2 -o $PWD/gen < $LOCAL_MANIFEST_FILE"
