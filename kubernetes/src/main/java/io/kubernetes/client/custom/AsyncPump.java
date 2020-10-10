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
import java.util.concurrent.*;

public class AsyncPump implements Runnable {

  private Thread thread;
  private ExecutorService executorService;
  private byte[] buff;
  private InputStream is;
  private CompletableFuture<?> promise;
  private NoisyConsumer<byte[]> consumer;
  private NoisyConsumer<Exception> errorHandler;
  private NoisyRunnable onFinish;

  public AsyncPump(NoisyConsumer<byte[]> consumer, NoisyConsumer<Exception> errorHandler, NoisyRunnable onFinish) {
    buff = new byte[1024];
    this.consumer = consumer != null ? consumer : NoisyConsumer.NOP;
    this.errorHandler = errorHandler != null ? errorHandler : NoisyConsumer.NOP;
    this.onFinish = onFinish != null ? onFinish : NoisyRunnable.NOP;
    this.promise = new CompletableFuture<>();
  }

  public AsyncPump(NoisyConsumer<byte[]> consumer, NoisyRunnable onFinish) {
    this(consumer, Exception::printStackTrace, onFinish);
  }

  public AsyncPump(NoisyConsumer<byte[]> consumer) {
    this(consumer, NoisyRunnable.NOP);
  }

  public AsyncPump setExecutorService(ExecutorService executorService) {
    this.executorService = executorService;
    return this;
  }

  public AsyncPump stop() {
    if (thread != null)
      thread.interrupt();
    return this;
  }

  public AsyncPump startAsync(InputStream is) {
    this.is = is;

    if (executorService != null) {
      executorService.submit(this);
    } else {
      thread = new Thread(this);
      thread.setName("Async pump");
      thread.start();
    }
    return this;
  }

  public boolean waitForExit() {
    try {
      promise.get();
      return true;
    } catch (InterruptedException | ExecutionException e) {
      return false;
    }
  }

  public boolean waitForExit(long timeoutMs) {
    try {
      promise.get(timeoutMs, TimeUnit.MILLISECONDS);
      return true;
    } catch (InterruptedException | ExecutionException | TimeoutException e) {
      return false;
    }
  }

  public AsyncPump start(InputStream is) {
    this.is = is;
    return this;
  }

  @Override
  public void run() {
    int nRead;
    try {
      while ((nRead = is.read(buff)) > -1) {
        byte[] giveAway = new byte[nRead];
        System.arraycopy(buff, 0, giveAway, 0, nRead);
        consumer.accept(giveAway);
      }
      onFinish.run();
    } catch (Exception e) {
      try {
        errorHandler.accept(e);
      } catch (Exception exception) {
        promise.completeExceptionally(exception);
      }
    }
    promise.complete(null);
  }

  public interface NoisyConsumer<T> {
    NoisyConsumer NOP = t -> { };

    void accept(T t) throws Exception;
  }

  public interface NoisyRunnable {
    NoisyRunnable NOP = () -> { };

    void run() throws Exception;
  }
}
