/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.fluent;

import io.sundr.builder.annotations.ExternalBuildables;

@ExternalBuildables(
    editableEnabled = false,
    generateBuilderPackage = true,
    builderPackage = "io.kubernetes.client.fluent",
    value = {"io.kubernetes.client.openapi.models"})
public class Config {}
