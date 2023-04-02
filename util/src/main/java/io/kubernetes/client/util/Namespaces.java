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
package io.kubernetes.client.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/** Namespaces provides a set of helpers for operating namespaces. */
public class Namespaces {

  public static final String NAMESPACE_ALL = "";

  public static final String NAMESPACE_DEFAULT = "default";

  public static final String NAMESPACE_KUBESYSTEM = "kube-system";

  public static String getPodNamespace() throws IOException {
    return new String(
        Files.readAllBytes(new File(Config.SERVICEACCOUNT_NAMESPACE_PATH).toPath()),
        StandardCharsets.UTF_8);
  }
}
