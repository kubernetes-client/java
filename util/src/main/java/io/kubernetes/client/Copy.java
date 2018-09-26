/*
Copyright 2017, 2018 The Kubernetes Authors.
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
package io.kubernetes.client;

import com.google.common.io.ByteStreams;
import io.kubernetes.client.models.V1Pod;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Copy extends Exec {
  private static final Logger log = LoggerFactory.getLogger(Copy.class);

  /** Simple Copy constructor, uses default configuration */
  public Copy() {
    super(Configuration.getDefaultApiClient());
  }

  /**
   * Copy Constructor
   *
   * @param apiClient The api client to use.
   */
  public Copy(ApiClient apiClient) {
    super(apiClient);
  }

  public InputStream copyFile(String namespace, String pod, String srcPath)
      throws ApiException, IOException {
    return copyFile(namespace, pod, null, srcPath);
  }

  public InputStream copyFile(V1Pod pod, String srcPath) throws ApiException, IOException {
    return copyFile(pod, null, srcPath);
  }

  public InputStream copyFile(V1Pod pod, String container, String srcPath)
      throws ApiException, IOException {
    return copyFile(
        pod.getMetadata().getNamespace(), pod.getMetadata().getName(), container, srcPath);
  }

  public InputStream copyFile(String namespace, String pod, String container, String srcPath)
      throws ApiException, IOException {
    Process proc =
        this.exec(
            namespace,
            pod,
            new String[] {"sh", "-c", "cat " + srcPath + " | base64"},
            container,
            false,
            false);
    try {
      proc.waitFor();
    } catch (InterruptedException ex) {
      log.warn("Interrupted waiting for copy to complete", ex);
    }
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ByteStreams.copy(proc.getInputStream(), bos);

    return new ByteArrayInputStream(Base64.decodeBase64(bos.toByteArray()));
  }

  public static void copyFile(String namespace, String pod, String srcPath, Path dest)
      throws ApiException, IOException {
    Copy c = new Copy();
    InputStream is = c.copyFile(namespace, pod, null, srcPath);
    FileOutputStream os = new FileOutputStream(dest.toFile());
    ByteStreams.copy(is, os);
    os.flush();
    os.close();
  }
}
