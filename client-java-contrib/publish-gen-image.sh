#!/usr/bin/env bash

GEN_BASE_IMAGE_NAME=ghcr.io/yue9944882/crd-model-gen-base  # TODO: move this to kubernetes-client group after the permission issue fixed
GEN_BASE_IMAGE_VERSION=v1.0.0

docker build -t ${GEN_BASE_IMAGE_NAME}:${GEN_BASE_IMAGE_VERSION} .
docker push ${GEN_BASE_IMAGE_NAME}:${GEN_BASE_IMAGE_VERSION}

GEN_IMAGE_NAME=docker.pkg.github.com/kubernetes-client/java/crd-model-gen
GEN_IMAGE_VERSION=v1.0.6

docker build -t ${GEN_IMAGE_NAME}:${GEN_IMAGE_VERSION} .
docker push ${GEN_IMAGE_NAME}:${GEN_IMAGE_VERSION}
