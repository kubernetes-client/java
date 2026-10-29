/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.util.exception;

/**
 * Thrown when a kubeconfig exec credential plugin is not permitted to run by the configured {@link
 * io.kubernetes.client.util.ExecCredentialPluginPolicy}. The plugin process is never started.
 */
public class ExecCredentialPluginDeniedException extends RuntimeException {
  private final String command;

  public ExecCredentialPluginDeniedException(String command, String message) {
    super(message);
    this.command = command;
  }

  /** @return the exec plugin command which was denied. */
  public String getCommand() {
    return command;
  }
}
