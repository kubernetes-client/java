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

# This script generates the model classes from a released version of cert-manager CRDs
# under src/main/java/io/cert/manager/models.

# The crd-model-gen image used to be published to docker.pkg.github.com, which
# requires GitHub authentication and returns "Access is denied" for anonymous
# pulls (see kubernetes-client/java#3489). Build it locally from the Dockerfile
# in this repository instead, so the script works out of the box.
DEFAULT_IMAGE_NAME=local/crd-model-gen
DEFAULT_IMAGE_TAG=latest
IMAGE_NAME=${IMAGE_NAME:=$DEFAULT_IMAGE_NAME}
IMAGE_TAG=${IMAGE_TAG:=$DEFAULT_IMAGE_TAG}

# Build the crd-model-gen image locally if it is not already present, using the
# Dockerfile shipped in client-java-contrib/.
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
CONTRIB_DIR="$(cd "${SCRIPT_DIR}/.." && pwd)"
if ! docker image inspect "${IMAGE_NAME}:${IMAGE_TAG}" >/dev/null 2>&1; then
  echo "Building ${IMAGE_NAME}:${IMAGE_TAG} from ${CONTRIB_DIR}/Dockerfile ..."
  docker build -t "${IMAGE_NAME}:${IMAGE_TAG}" "${CONTRIB_DIR}"
fi

# a crdgen container is run in a way that:
#   1. it has access to the docker daemon on the host so that it is able to create sibling container on the host
#   2. it runs on the host network so that it is able to communicate with the KinD cluster it launched on the host
docker run \
  --rm \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$(pwd)":"$(pwd)" \
  --network host \
  ${IMAGE_NAME}:${IMAGE_TAG} \
  /generate.sh \
  -u https://github.com/jetstack/cert-manager/releases/download/v1.13.4/cert-manager.crds.yaml \
  -n io.cert-manager \
  -p io.cert.manager \
  -o "$(pwd)"
