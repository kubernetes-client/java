/*
Copyright 2024 The Kubernetes Authors.
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
package io.kubernetes.client.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import io.kubernetes.client.openapi.models.V1ObjectMeta;

public class V1MetadataExclusionStrategy implements com.google.gson.ExclusionStrategy {
    public boolean shouldSkipField(FieldAttributes f) {
        // Don't serialize the 'managedFields' field.
        return (f.getDeclaringClass().equals(V1ObjectMeta.class) && f.getName().equalsIgnoreCase("managedFields"));
    }

    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
}
