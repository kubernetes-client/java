#!/bin/bash

# Copyright 2017 The Kubernetes Authors.
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

# Script to generate protocol buffer classes from upstream Kubernetes proto files.
# Generates proto classes at proto/src/main/java/

set -o errexit
set -o nounset
set -o pipefail

SCRIPT_ROOT=$(dirname "${BASH_SOURCE}")
PROTO_ROOT="${SCRIPT_ROOT}/../proto"

pushd "${SCRIPT_ROOT}" > /dev/null
SCRIPT_ROOT=$(pwd)
popd > /dev/null

pushd "${PROTO_ROOT}" > /dev/null
PROTO_ROOT=$(pwd)
popd > /dev/null

TEMP_FOLDER=$(mktemp -d)
trap "rm -rf ${TEMP_FOLDER}" EXIT SIGINT

if [[ -z ${GEN_ROOT:-} ]]; then
    GEN_ROOT="${TEMP_FOLDER}/gen"
    echo ">>> Cloning gen repo"
    git clone --recursive https://github.com/kubernetes-client/gen.git "${GEN_ROOT}"
else
    echo ">>> Reusing gen repo at ${GEN_ROOT}"
fi

# Allow specifying Kubernetes branch/tag, default to master
KUBERNETES_BRANCH="${KUBERNETES_BRANCH:-master}"

echo ">>> Generating proto files from Kubernetes ${KUBERNETES_BRANCH}"
pushd "${GEN_ROOT}/proto" > /dev/null
# Download proto dependencies for the specified Kubernetes branch
bash dependencies.sh "${KUBERNETES_BRANCH}"
# Generate Java proto classes
bash generate.sh java "${PROTO_ROOT}/src/main/java/"
popd > /dev/null

echo ">>> Done."
