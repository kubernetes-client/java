#!/usr/bin/env bash

# User-overridable variables
IMAGE_REPOSITORY=${IMAGE_REPOSITORY:-docker.pkg.github.com}
IMAGE_NAME=${IMAGE_NAME:-kubernetes-client/java/crd-model-gen}
IMAGE_VERSION=${IMAGE_VERSION:-v1.0.0}

IMAGE=${IMAGE_REPOSITORY}/${IMAGE_NAME}:${IMAGE_VERSION}
BUILD_DIR="$(dirname $0)"
docker build -t ${IMAGE} ${BUILD_DIR}
docker push ${IMAGE}
