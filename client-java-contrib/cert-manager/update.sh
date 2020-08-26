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

# build the crdgen image which includes all the toolchains needed for code generation
docker build .. -t crdgen

# a crdgen container is run in a way that:
#   1. it has access to the docker daemon on the host so that it is able to create sibling container on the host
#   2. it runs on the host network so that it is able to communicate with the KinD cluster it launched on the host
docker run \
  --rm \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$(pwd)":"$(pwd)" \
  -ti \
  --network host \
  crdgen /generate.sh \
  -u https://github.com/jetstack/cert-manager/releases/download/v0.16.1/cert-manager.crds.yaml \
  -n io.cert-manager \
  -p io.cert.manager \
  -o "$(pwd)"