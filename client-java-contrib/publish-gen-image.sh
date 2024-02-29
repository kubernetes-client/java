#!/usr/bin/env bash

GEN_IMAGE_NAME=docker.pkg.github.com/kubernetes-client/java/crd-model-gen
GEN_IMAGE_VERSION=v1.0.7

docker build -t ${GEN_IMAGE_NAME}:${GEN_IMAGE_VERSION} .
docker push ${GEN_IMAGE_NAME}:${GEN_IMAGE_VERSION}
