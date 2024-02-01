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
package io.kubernetes.client.custom;

import java.util.Arrays;
import java.util.Map;

public class MapUtils {
    public static boolean equals(Map<String, byte[]> map1, Map<String, byte[]> map2) {
        if (map1 == map2) {
            return true; // Both pointing to the same instance
        }
        if (map1 == null || map2 == null || map1.size() != map2.size()) {
            return false; // One is null or their sizes are different
        }
        for (String key : map1.keySet()) {
            if (!map2.containsKey(key) || !Arrays.equals(map1.get(key), map2.get(key))) {
                // Key doesn't exist in map2 or the byte arrays are not equal
                return false;
            }
        }
        // All keys matched and their corresponding byte arrays are equal
        return true;
    }
}
