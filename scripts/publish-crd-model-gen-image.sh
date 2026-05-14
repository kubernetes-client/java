#!/bin/bash

export IMAGE_REPOSITORY=docker.pkg.github.com
export IMAGE_NAME=kubernetes-client/java/crd-model-gen
export IMAGE_VERSION=v1.0.0

bash "$(dirname $0)/../client-java-contrib/publish-gen-image.sh"
