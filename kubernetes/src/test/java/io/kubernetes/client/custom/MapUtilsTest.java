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

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MapUtilsTest {
    @Test
    public void testEquals() {
        Map<String, byte[]> left = new HashMap<String, byte[]>() {{
            put("foo", "bar".getBytes());
        }};
        Map<String, byte[]> right = new HashMap<String, byte[]>() {{
            put("foo", "bar".getBytes());
        }};
        assertTrue(MapUtils.equals(left, right));
    }

    @Test
    public void testNotEquals() {
        Map<String, byte[]> left = new HashMap<String, byte[]>() {{
            put("foo", "baz".getBytes());
        }};
        Map<String, byte[]> right = new HashMap<String, byte[]>() {{
            put("foo", "bar".getBytes());
        }};
        assertFalse(MapUtils.equals(left, right));
    }
}
