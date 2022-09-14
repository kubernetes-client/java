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

import io.kubernetes.client.Exec;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.Streams;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;
import java.util.function.Consumer;

public class KubectlExec extends Kubectl.ResourceAndContainerBuilder<V1Pod, KubectlExec>
    implements Kubectl.Executable<Integer> {
  private String[] command;
  private boolean stdin;
  private boolean tty;
  private Consumer<Throwable> onUnhandledError = Throwable::printStackTrace;

  KubectlExec() {
    super(V1Pod.class);
  }

  public KubectlExec command(String[] command) {
    this.command = command;
    return this;
  }

  public KubectlExec stdin(boolean stdin) {
    this.stdin = stdin;
    return this;
  }

  public KubectlExec tty(boolean tty) {
    this.tty = tty;
    return this;
  }

  public KubectlExec onUnhandledError(Consumer<Throwable> onUnhandledError) {
    this.onUnhandledError = onUnhandledError;
    return this;
  }

  @Override
  public Integer execute() throws KubectlException {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name(name).namespace(namespace));

    Exec exec = new Exec(apiClient);
    exec.setOnUnhandledError(onUnhandledError);

    try {
      Process proc = exec.exec(pod, command, container, stdin, tty);
      copyAsync(proc.getInputStream(), System.out, onUnhandledError);
      copyAsync(proc.getErrorStream(), System.err, onUnhandledError);
      if (stdin) {
        copyAsync(System.in, proc.getOutputStream(), onUnhandledError);
      }
      return proc.waitFor();
    } catch (InterruptedException | ApiException | IOException ex) {
      throw new KubectlException(ex);
    }
  }

  protected static Thread copyAsync(
      InputStream in, OutputStream out, Consumer<Throwable> onUnhandledError) {
    Thread t =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  Streams.copy(in, out);
                } catch (IOException ex) {
                  Optional.ofNullable(onUnhandledError)
                      .orElse(Throwable::printStackTrace)
                      .accept(ex);
                }
              }
            });
    t.start();
    return t;
  }
}
