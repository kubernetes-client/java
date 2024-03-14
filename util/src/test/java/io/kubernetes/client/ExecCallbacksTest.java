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
package io.kubernetes.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import io.kubernetes.client.custom.IOTrio;
import io.kubernetes.client.openapi.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import org.junit.jupiter.api.Test;

class ExecCallbacksTest {

  @Test
  void maxTimeout() throws Exception {
    Exec exec = getExec((future, io) -> Thread.sleep(30_000L));

    long startTime = System.currentTimeMillis();
    Future<Integer> promise =
        exec.exec("ns-1", "pod1", null, null, null, 1_000L, true, "random-command");
    int exitCode = promise.get(10_000, TimeUnit.MILLISECONDS);
    long delta = System.currentTimeMillis() - startTime;

    assertThat(delta)
        .isGreaterThanOrEqualTo(1_000L)
        .isLessThanOrEqualTo(10_000L);
    assertThat(exitCode).isEqualTo(Integer.MAX_VALUE);
  }

  @Test
  void stderrTest() throws Exception {
    Exec exec =
        getExec(
            (future, io) -> {
              io.getErrors().write("Some error".getBytes());
              future.complete(1);
            });
    List<String> errors = new ArrayList<>();
    Future<Integer> promise =
        exec.exec(
            "ns-1",
            "pod1",
            io ->
                quietly(
                    () -> {
                      byte[] buff = new byte[10];
                      io.getStderr().read(buff);
                      errors.add(new String(buff));
                    }),
            null,
            null,
            100_000L,
            true,
            "random-command");

    assertThat(promise.get()).isEqualTo(1);
    assertThat(errors).containsExactly("Some error");
  }

  @Test
  void stdoutTest() throws Exception {
    Exec exec =
        getExec(
            (future, io) -> {
              io.getOutput().write("Some stream".getBytes());
              future.complete(0);
            });

    List<String> output = new ArrayList<>();
    Future<Integer> promise =
        exec.exec(
            "ns-1",
            "pod1",
            io ->
                quietly(
                    () -> {
                      byte[] buff = new byte[11];
                      io.getStdout().read(buff);
                      output.add(new String(buff));
                    }),
            null,
            null,
            100_000L,
            true,
            "random-command");

    assertThat(promise.get()).isZero();
    assertThat(output).containsExactly("Some stream");
  }

  @Test
  void onClosedTriggerTest() throws Exception {
    Exec exec = getExec((future, io) -> future.complete(9));

    List<Integer> codes = new ArrayList<>(1);
    Future<Integer> promise =
        exec.exec(
            "ns-1",
            "pod1",
            null,
            (code, io) -> codes.add(code),
            null,
            100_000L,
            true,
            "random-command");

    assertThat(promise.get()).isEqualTo(9);
    assertThat(codes).containsExactly(9);
  }

  @Test
  void mockedExecutionWithMixedEventsTest() throws Exception {
    Exec exec =
        getExec(
            (future, io) ->
                quietly(
                    () -> {
                      io.getErrors()
                          .write(
                              ("bash: cannot set terminal process group (-1): Inappropriate ioctl for device\n"
                                      + "bash: no job control in this shell\n")
                                  .getBytes());
                      read(io.getInput(), "uotime\n");
                      write(io.getErrors(), "uotime: command not found\n");
                      read(io.getInput(), "uptime\n");
                      write(
                          io.getOutput(),
                          " 00:44:54 up 30 days,  1:15,  0 users,  load average: 0,01, 0,04, 0,00\n");
                      read(io.getInput(), "exit\n");
                      write(io.getOutput(), "Bye!\n");
                      future.complete(5);
                    }));

    List<Integer> codes = new ArrayList<>(1);
    AtomicBoolean callbackInvoked = new AtomicBoolean(false);
    Future<Integer> promise =
        exec.exec(
            "ns-1",
            "pod1",
            io ->
                quietly(
                    () -> {
                      read(
                          io.getStderr(),
                          ("bash: cannot set terminal process group (-1): Inappropriate ioctl for device\n"
                              + "bash: no job control in this shell\n"));
                      write(io.getStdin(), "uotime\n");
                      read(io.getStderr(), "uotime: command not found\n");
                      write(io.getStdin(), "uptime\n");
                      read(
                          io.getStdout(),
                          " 00:44:54 up 30 days,  1:15,  0 users,  load average: 0,01, 0,04, 0,00\n");
                      write(io.getStdin(), "exit\n");
                      read(io.getStdout(), "Bye!\n");
                      callbackInvoked.set(true);
                    }),
            (code, io) -> codes.add(code),
            null,
            100_000L,
            true,
            "ssh",
            "pc",
            "ssh",
            "pi",
            "bash",
            "-i");

    assertThat(promise.get()).isEqualTo(5);
    assertThat(codes).containsExactly(5);
    assertThat(callbackInvoked).isTrue();
  }

  // helper functions

  private Exec getExec(NoisyBiConsumer<CompletableFuture<Integer>, PipedIO> remoteProcess) {
    return new MockedExecution((fut, io) -> quietly(() -> remoteProcess.accept(fut, io)));
  }

  private void quietly(NoisyRunnable task) {
    try {
      task.run();
    } catch (Exception e) {
      fail(e);
    }
  }

  private String read(InputStream is, String expectedText) {
    String readText = read(is, expectedText.length());
    assertThat(readText).isEqualTo(expectedText);
    return readText;
  }

  private void write(OutputStream os, String text) {
    quietly(() -> os.write(text.getBytes()));
  }

  private String read(InputStream is, int count) {
    try {
      byte[] buff = new byte[count];
      is.read(buff);
      return new String(buff);
    } catch (IOException e) {
      fail(e);
    }
    return null;
  }

  private interface NoisyBiConsumer<V1, V2> {
    void accept(V1 value1, V2 value2) throws Exception;
  }

  private interface NoisyRunnable {
    void run() throws Exception;
  }

  // mocked EXEC/Process and the IO pipe

  private static class MockedExecution extends Exec {
    private final BiConsumer<CompletableFuture<Integer>, PipedIO> remoteProcess;
    private final IOTrio localIO;

    private MockedExecution(BiConsumer<CompletableFuture<Integer>, PipedIO> remoteProcess) {
      this.remoteProcess = remoteProcess;
      localIO = new IOTrio();
    }

    @Override
    public Process exec(
        String namespace,
        String name,
        String[] command,
        String container,
        boolean stdin,
        boolean tty)
        throws ApiException, IOException {
      CompletableFuture<Integer> taskPromise = new CompletableFuture<>();
      PipedIO pipedIO = new PipedIO(localIO);
      runAsync("mocked exec", () -> remoteProcess.accept(taskPromise, pipedIO));

      return new Process() {
        @Override
        public OutputStream getOutputStream() {
          return localIO.getStdin();
        }

        @Override
        public InputStream getInputStream() {
          return localIO.getStdout();
        }

        @Override
        public InputStream getErrorStream() {
          return localIO.getStderr();
        }

        @Override
        public int waitFor() throws InterruptedException {
          try {
            return taskPromise.get();
          } catch (ExecutionException e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public int exitValue() {
          try {
            return taskPromise.get(1, TimeUnit.MILLISECONDS);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          } catch (ExecutionException e) {
            throw new RuntimeException(e);
          } catch (TimeoutException e) {
            throw new IllegalThreadStateException();
          }
        }

        @Override
        public void destroy() {
          taskPromise.complete(1);
        }
      };
    }
  }

  private static class PipedIO {
    private final PipedOutputStream errors;
    private final PipedOutputStream output;
    private final PipedInputStream input;
    private final IOTrio localIO;

    public PipedIO(IOTrio localIO) {
      this.localIO = localIO;
      try {
        output = new PipedOutputStream();
        localIO.setStdout(new PipedInputStream(output));

        errors = new PipedOutputStream();
        localIO.setStderr(new PipedInputStream(errors));

        input = new PipedInputStream();
        localIO.setStdin(new PipedOutputStream(input));

      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    public IOTrio getLocalIO() {
      return localIO;
    }

    public OutputStream getErrors() {
      return errors;
    }

    public OutputStream getOutput() {
      return output;
    }

    public InputStream getInput() {
      return input;
    }
  }
}
