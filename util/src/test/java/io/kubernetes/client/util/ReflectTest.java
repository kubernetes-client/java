/*
Copyright 2018 The Kubernetes Authors.
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
package io.kubernetes.client.util;

import static org.junit.Assert.*;

import io.kubernetes.client.models.V1Namespace;
import org.junit.Test;

public class ReflectTest {

  @Test
  public void testGetMetadata() throws Exception {
    V1Namespace ns = new V1Namespace();
    Reflect.objectMetadata(ns);
  }
}
