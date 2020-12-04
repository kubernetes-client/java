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
package io.kubernetes.client.extended.kubectl;

import static io.kubernetes.client.util.Strings.isNullOrEmpty;

import io.kubernetes.client.Copy;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.exception.CopyNotSupportedException;
import java.io.IOException;
import java.nio.file.Paths;

public class KubectlCopy extends Kubectl.ResourceAndContainerBuilder<V1Pod, KubectlCopy>
    implements Kubectl.Executable<Boolean> {
  private String from;
  private String to;
  private Boolean toPod;
  private boolean dir;

  KubectlCopy() {
    super(V1Pod.class);
    this.toPod = null;
  }

  public KubectlCopy directory() {
    this.dir = true;
    return this;
  }

  public KubectlCopy from(String file) {
    this.from = file;
    return this;
  }

  public KubectlCopy fromPod(String fileInPod) {
    this.from = fileInPod;
    this.toPod = false;
    return this;
  }

  public KubectlCopy to(String file) {
    this.to = file;
    return this;
  }

  public KubectlCopy toPod(String fileInPod) {
    this.to = fileInPod;
    this.toPod = true;
    return this;
  }

  @Override
  public Boolean execute() throws KubectlException {
    validate();
    Copy cp = new Copy(apiClient);
    try {
      if (toPod) {
        cp.copyFileToPod(namespace, name, container, Paths.get(from), Paths.get(to));
      } else {
        if (this.dir) {
          cp.copyDirectoryFromPod(namespace, name, container, from, Paths.get(to));
        } else {
          cp.copyFileFromPod(namespace, name, container, from, Paths.get(to));
        }
      }
      return true;
    } catch (ApiException | IOException | CopyNotSupportedException ex) {
      throw new KubectlException(ex);
    }
  }

  private void validate() throws KubectlException {
    if (toPod == null) {
      throw new KubectlException("You must specify either from or to a pod");
    }
    if (isNullOrEmpty(from)) {
      throw new KubectlException("From file missing");
    }
    if (isNullOrEmpty(to)) {
      throw new KubectlException("To file missing");
    }
  }
}
