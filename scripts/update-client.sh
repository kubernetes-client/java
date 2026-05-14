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

# Script to fetch latest swagger spec.
# Puts the updated spec at api/swagger-spec/

set -o errexit
set -o nounset
set -o pipefail

readonly ERROR_MAVEN_NOT_INSTALLED=80

if ! which mvn > /dev/null 2>&1; then
  echo "Maven is not installed." >&2
  exit ${ERROR_MAVEN_NOT_INSTALLED}
fi

SCRIPT_ROOT=$(dirname "${BASH_SOURCE}")
CLIENT_ROOT="${SCRIPT_ROOT}/../kubernetes"

pushd "${SCRIPT_ROOT}" > /dev/null
SCRIPT_ROOT=$(pwd)
popd > /dev/null

pushd "${CLIENT_ROOT}" > /dev/null
CLIENT_ROOT=$(pwd)
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

echo ">>> Running java generator from the gen repo"
"${GEN_ROOT}/openapi/java.sh" "${CLIENT_ROOT}" "${SCRIPT_ROOT}/../settings" 

echo ">>> Running formatter"
./mvnw spotless:apply

echo ">>> Done."
