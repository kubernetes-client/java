package io.kubernetes.client;

import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.util.WebSockets;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;

public class Exec {
    private ApiClient apiClient;

    /**
     * Simple Exec API constructor, uses default configuration
     */
    public Exec() {
        this(Configuration.getDefaultApiClient());
    }

    /**
     * Exec API Constructor
     * @param apiClient The api client to use.
     */
    public Exec(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the API client for these exec operations.
     * @returns The API client that will be used.
     */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Set the API client for subsequent exec operations.
     * @param apiClient The new API client to use.
     */
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    private String makePath(String namespace, String name, String[] command, String container, boolean stdin, boolean tty) {
        String path = "/api/v1/namespaces/" +
            namespace +
            "/pods/" +
            name +
            "/exec?" +
            "stdin=" + stdin +
            "&tty=" + tty +
            (container != null ? "&container=" + container : "") + 
            "&command=" + StringUtils.join(command, "&command=");
        return path;
    }

    /**
     * Execute a command in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param namespace The namespace of the Pod
     * @param name The name of the Pod
     * @param command The command to run
     * @param stdin If true, pass a stdin stream into the container 
     */
    public Process exec(String namespace, String name, String[] command, boolean stdin) throws ApiException, IOException {
        return exec(namespace, name, command, null, stdin, false);
    }

    /**
     * Execute a command in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param pod The pod where the command is run.
     * @param command The command to run
     * @param stdin If true, pass a stdin stream into the container 
     */
    public Process exec(V1Pod pod, String[] command, boolean stdin) throws ApiException, IOException {
        return exec(pod, command, null, stdin, false);
    }


    /**
     * Execute a command in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param pod The pod where the command is run.
     * @param command The command to run
     * @param stdin If true, pass a stdin stream into the container 
     * @param tty If true, stdin is a tty.
     */
    public Process exec(V1Pod pod, String[] command, boolean stdin, boolean tty) throws ApiException, IOException {
        return exec(pod, command, null, stdin, tty);
    }

    /**
     * Execute a command in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param pod The pod where the command is run.
     * @param command The command to run
     * @param container The container in the Pod where the command is run.
     * @param stdin If true, pass a stdin stream into the container.
     * @param tty If true, stdin is a TTY (only applies if stdin is true)
     */
    public Process exec(V1Pod pod, String[] command, String container, boolean stdin, boolean tty) throws ApiException, IOException {
        return exec(pod.getMetadata().getNamespace(), pod.getMetadata().getName(), command, container, stdin, tty);
    }

    /**
     * Execute a command in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param namespace The namespace of the Pod
     * @param name The name of the Pod
     * @param command The command to run
     * @param container The container in the Pod where the command is run.
     * @param stdin If true, pass a stdin stream into the container.
     * @param tty If true, stdin is a TTY (only applies if stdin is true)
     */
    public Process exec(String namespace, String name, String[] command, String container, boolean stdin, boolean tty) throws ApiException, IOException {
        String path = makePath(namespace, name, command, container, stdin, tty);

        ExecProcess exec = new ExecProcess();
        WebSockets.stream(path, "GET", apiClient, exec);

        return exec;
    }

    private static class ExecProcess extends Process implements WebSockets.SocketListener {
        private PipedInputStream pipeIn;
        private PipedOutputStream pipeOut;
        private PipedOutputStream pipeErr;
        private InputStream err;
        private OutputStream output;
        private InputStream input;
        private int statusCode;
        private Closeable closer;

        private static final Logger log = Logger.getLogger(ExecProcess.class);

        public ExecProcess() throws IOException {
            this.pipeIn = new PipedInputStream();
            this.pipeOut = new PipedOutputStream();
            this.pipeErr = new PipedOutputStream();
            this.input = new PipedInputStream(pipeOut);
            this.output = new PipedOutputStream(pipeIn);
            this.err = new PipedInputStream(pipeErr);
            this.statusCode = -1;
        }

        public OutputStream getOutputStream() {
            return output;
        }

        public InputStream getInputStream() {
            return input;
        }

        public InputStream getErrorStream() {
            return err;
        }

        public int waitFor() throws InterruptedException {
            synchronized(this) {
                this.wait();
            }
            return statusCode;
        }
  
        public int exitValue() {
            return statusCode;
        }

        public void destroy() {
            if (this.closer != null) {
                this.close();
            }
        }
              
        @Override
        public void open(String protocol, Closeable closer) {
            this.closer = closer;
        }

        private OutputStream findOutputStream(int val) {
            if (val == 1) {
                return pipeOut;
            }
            if (val == 2) {
                return pipeErr;
            }
            System.err.println("Unknown stream: " + val);
            return pipeOut;
        }

        @Override
        public void bytesMessage(InputStream in) {
            try {
                int val = in.read();
                OutputStream out = findOutputStream(val);

                byte[] buffer = new byte[4096];
                for (int read = in.read(buffer); read != -1; read = in.read(buffer)) {
                    out.write(buffer, 0, read);
                }
                out.flush();
            } catch (IOException ex) {
                log.error("Failure sending bytes message", ex);
            }
        }
        
        @Override
        public void textMessage(Reader in) {
            try {
                int val = in.read();
                OutputStream out = findOutputStream(val);
                // TODO: there has to be a better way to do this...
                char[] buffer = new char[4096];
                for (int read = in.read(buffer); read != -1; read = in.read(buffer)) {
                    String data = new String(buffer, 0, read);
                    out.write(data.getBytes("UTF-8"));
                }
                out.flush();
            } catch (IOException ex) {
                log.error("Failure sending text message", ex);
            }
        }
        
        @Override
        public void close() {
            try {
                pipeIn.close();
                pipeOut.close();
                output.close();
            } catch (IOException ex) {
                log.error("Failure closing exec process", ex);
            }
            // TODO: get status code here
            synchronized(this) {
                this.notifyAll();
            }
        }
    }
}
