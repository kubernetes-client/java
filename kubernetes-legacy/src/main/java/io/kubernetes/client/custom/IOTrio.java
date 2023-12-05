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
package io.kubernetes.client.custom;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiConsumer;

/**
 * A collection of all the 3 main pipes used in stdio: STDIN, STDOUT and STDERR. As working with the
 * named pipes is usually carried out asynchronously, this collection also provides means to
 * initiate and handle the close() event. A close() initiator calls the {@link #close(int, long)}
 * method expressing its intent to close the communication channel. Handlers are notified of this
 * intent and its up to the handlers to decide what's to be done next. Calling {@link #close(int,
 * long)} does not close the streams or do anything else besides notifying the handlers.
 */
public class IOTrio {
  private InputStream stdout;
  private InputStream stderr;
  private OutputStream stdin;
  private final Collection<BiConsumer<Integer, Long>> closeHandlers;

  public IOTrio() {
    closeHandlers = new ArrayList<>();
  }

  public InputStream getStdout() {
    return stdout;
  }

  public void setStdout(InputStream stdout) {
    this.stdout = stdout;
  }

  public InputStream getStderr() {
    return stderr;
  }

  public void setStderr(InputStream stderr) {
    this.stderr = stderr;
  }

  public OutputStream getStdin() {
    return stdin;
  }

  public void setStdin(OutputStream stdin) {
    this.stdin = stdin;
  }

  /**
   * Capture the CLOSE intent and handle it accordingly.
   *
   * @param handler the handler that's invoked when someone intends to close this communication.
   *     Multiple handlers can be registered
   */
  public void onClose(BiConsumer<Integer, Long> handler) {
    closeHandlers.add(handler);
  }

  /**
   * Express an intent to close this communication. This intent will be relayed to all the
   * registered handlers and it's up to them what to do with it.
   *
   * @param code proposed exit code
   * @param timeout time in milliseconds given to terminate this communication. Negative timeout
   *     means no timeout (i.e. wait for as long as it takes). 0 means "stop it now".
   */
  public void close(int code, long timeout) {
    closeHandlers.forEach(handler -> handler.accept(code, timeout));
  }
}
