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

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.Streams;
import io.kubernetes.client.util.exception.CopyNotSupportedException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Base64InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.FilenameUtils;
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

  public InputStream copyFileFromPod(String namespace, String pod, String srcPath)
      throws ApiException, IOException {
    return copyFileFromPod(namespace, pod, null, srcPath);
  }

  public InputStream copyFileFromPod(V1Pod pod, String srcPath) throws ApiException, IOException {
    return copyFileFromPod(pod, null, srcPath);
  }

  public InputStream copyFileFromPod(V1Pod pod, String container, String srcPath)
      throws ApiException, IOException {
    return copyFileFromPod(
        pod.getMetadata().getNamespace(), pod.getMetadata().getName(), container, srcPath);
  }

  public InputStream copyFileFromPod(String namespace, String pod, String container, String srcPath)
      throws ApiException, IOException {
    Process proc =
        this.exec(
            namespace,
            pod,
            new String[] {"sh", "-c", "cat " + srcPath + " | base64"},
            container,
            false,
            false);
    return new Base64InputStream(proc.getInputStream());
  }

  public void copyFileFromPod(
      String namespace, String name, String container, String srcPath, Path destination)
      throws ApiException, IOException {
    try (InputStream is = copyFileFromPod(namespace, name, container, srcPath);
        FileOutputStream fos = new FileOutputStream(destination.toFile())) {
      Streams.copy(is, fos);
      fos.flush();
    }
  }

  public void copyDirectoryFromPod(V1Pod pod, String srcPath, Path destination)
      throws ApiException, IOException, CopyNotSupportedException {
    copyDirectoryFromPod(pod, null, srcPath, destination);
  }

  public void copyDirectoryFromPod(V1Pod pod, String container, String srcPath, Path destination)
      throws ApiException, IOException, CopyNotSupportedException {
    copyDirectoryFromPod(
        pod.getMetadata().getNamespace(),
        pod.getMetadata().getName(),
        container,
        srcPath,
        destination);
  }

  public void copyDirectoryFromPod(String namespace, String pod, String srcPath, Path destination)
      throws ApiException, IOException, CopyNotSupportedException {
    copyDirectoryFromPod(namespace, pod, null, srcPath, destination);
  }

  public void copyDirectoryFromPod(
      String namespace, String pod, String container, String srcPath, Path destination)
      throws ApiException, IOException, CopyNotSupportedException {
    // Test that 'tar' is present in the container?
    if (!isTarPresentInContainer(namespace, pod, container)) {
      throw new CopyNotSupportedException("Tar is not present in the target container");
    }
    copyDirectoryFromPod(namespace, pod, container, srcPath, destination, true);
  }

  /**
   * Copy directory from a pod to local.
   *
   * @param namespace
   * @param pod
   * @param container
   * @param srcPath
   * @param destination
   * @param enableTarCompressing: false if tar is not present in target container
   * @throws IOException
   * @throws ApiException
   */
  public void copyDirectoryFromPod(
      String namespace,
      String pod,
      String container,
      String srcPath,
      Path destination,
      boolean enableTarCompressing)
      throws IOException, ApiException {
    if (!enableTarCompressing) {
      TreeNode tree = new TreeNode(true, srcPath, true);
      createDirectoryTree(tree, namespace, pod, container, srcPath);
      createDirectoryStructureFromTree(tree, namespace, pod, container, srcPath, destination);
      return;
    }
    Future<Integer> future =
        copyDirectoryFromPodAsync(namespace, pod, container, srcPath, destination);
    try {
      int code = future.get().intValue();
      if (code != 0) {
        throw new IOException("Copy failed (" + code + ")");
      }
    } catch (InterruptedException | ExecutionException ex) {
      throw new IOException(ex);
    }
  }

  public Future<Integer> copyDirectoryFromPodAsync(
      String namespace, String pod, String container, String srcPath, Path destination)
      throws IOException, ApiException {
    final Process proc =
        this.exec(
            namespace,
            pod,
            new String[] {"sh", "-c", "tar cz - " + srcPath + " | base64"},
            container,
            false,
            false);
    try (InputStream is = new Base64InputStream(new BufferedInputStream(proc.getInputStream()));
        ArchiveInputStream archive = new TarArchiveInputStream(new GzipCompressorInputStream(is))) {
      for (ArchiveEntry entry = archive.getNextEntry();
          entry != null;
          entry = archive.getNextEntry()) {
        if (!archive.canReadEntryData(entry)) {
          log.error("Can't read: {}", entry);
          continue;
        }
        String normalName = FilenameUtils.normalize(entry.getName());
        if (normalName == null) {
          throw new IOException("Invalid entry: " + entry.getName());
        }
        File f = new File(destination.toFile(), normalName);
        if (entry.isDirectory()) {
          if (!f.isDirectory() && !f.mkdirs()) {
            throw new IOException("create directory failed: " + f);
          }
        } else {
          File parent = f.getParentFile();
          if (!parent.isDirectory() && !parent.mkdirs()) {
            throw new IOException("create directory failed: " + parent);
          }
          try (OutputStream fs = new FileOutputStream(f)) {
            Streams.copy(archive, fs);
            fs.flush();
          }
        }
      }
    }
    return new ProcessFuture(proc);
  }

  // This creates directories and files using tree of files and directories under container
  private void createDirectoryStructureFromTree(
      TreeNode tree,
      String namespace,
      String pod,
      String container,
      String srcPath,
      Path destination)
      throws IOException, ApiException {
    // Code for creating invidual directory and files
    createDirectory(tree, destination);
    createFiles(tree, namespace, pod, container, srcPath, destination);
  }

  // Method to create files from directories/files tree in destination
  private void createFiles(
      TreeNode node,
      String namespace,
      String pod,
      String container,
      String srcPath,
      Path destination)
      throws IOException, ApiException {
    if (node == null) {
      return;
    }
    for (TreeNode childNode : node.getChildren()) {
      if (!childNode.isDir) {
        // Create file which is under 'node'
        String filePath = genericPathBuilder(destination.toString(), childNode.name);
        File f = new File(filePath);
        if (!f.createNewFile()) {
          throw new IOException("Failed to create file: " + f);
        }
        String modifiedSrcPath = genericPathBuilder(srcPath, childNode.name);
        try (InputStream is = copyFileFromPod(namespace, pod, modifiedSrcPath);
            OutputStream fs = new FileOutputStream(f)) {
          Streams.copy(is, fs);
          fs.flush();
        }
      } else {
        String newSrcPath = genericPathBuilder(srcPath, childNode.name);
        // TODO: Change this once the method genericPathBuilder is changed to varargs
        Path newDestination = Paths.get(destination.toString(), childNode.name);
        createFiles(childNode, namespace, pod, container, newSrcPath, newDestination);
      }
    }
  }

  // Method to create directories in destination path
  private void createDirectory(TreeNode node, Path destination) throws IOException {
    if (node == null) {
      return;
    }
    if (!node.isRoot) {
      // String directoryPath = genericPathBuilder(destination.toString(), node.name);
      File f = new File(destination.toString());
      // File f = new File(directoryPath);
      if (!f.mkdirs()) {
        throw new IOException("Failed to create directory: " + f);
      }
    }
    for (TreeNode childNode : node.getChildren()) {
      if (childNode.isDir) {
        String path = genericPathBuilder(destination.toString(), childNode.name);
        Path newPath = Paths.get(path);
        createDirectory(childNode, newPath);
      }
    }
  }

  // Method to create a tree of files and directory of location inside container
  private void createDirectoryTree(
      TreeNode node, String namespace, String pod, String container, String srcPath)
      throws IOException, ApiException {
    if (node.isDir) {
      final Process proc =
          this.exec(
              namespace,
              pod,
              new String[] {"sh", "-c", "ls -F " + srcPath},
              container,
              false,
              false);

      try (InputStream is = proc.getInputStream();
          BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
        String line = "";
        while ((line = reader.readLine()) != null) {
          int len = line.length();
          // line = stripFileSeparators(line);
          if (line.charAt(line.length() - 1) == '/') {
            TreeNode subDirTree =
                new TreeNode(
                    true,
                    line.substring(0, len - 1),
                    false); // Stripping off '/' in the end of directory
            String path = genericPathBuilder(srcPath, subDirTree.name);
            createDirectoryTree(subDirTree, namespace, pod, container, path);
            node.getChildren().add(subDirTree);
          } else {
            node.getChildren().add(new TreeNode(false, line, false));
          }
        }
      }
    }
  }

  /*
  Generic method to create path.
  TODO: Change this to varargs
  */
  private String genericPathBuilder(String first, String second) {
    StringBuilder pathBuilder = new StringBuilder(first);
    pathBuilder.append(File.separator);
    pathBuilder.append(second);
    return pathBuilder.toString();
  }

  public static void copyFileFromPod(String namespace, String pod, String srcPath, Path dest)
      throws ApiException, IOException {
    Copy c = new Copy();
    try (InputStream is = c.copyFileFromPod(namespace, pod, null, srcPath);
        FileOutputStream os = new FileOutputStream(dest.toFile())) {
      Streams.copy(is, os);
      os.flush();
    }
  }

  public void copyFileToPod(
      String namespace, String pod, String container, Path srcPath, Path destPath)
      throws ApiException, IOException {

    try {
      int exit = copyFileToPodAsync(namespace, pod, container, srcPath, destPath).get();
      if (exit != 0) {
        throw new IOException("Failed to copy: " + exit);
      }
    } catch (InterruptedException | ExecutionException ex) {
      throw new IOException(ex);
    }
  }

  public Future<Integer> copyFileToPodAsync(
      String namespace, String pod, String container, Path srcPath, Path destPath)
      throws ApiException, IOException {
    // Run decoding and extracting processes
    final Process proc = execCopyToPod(namespace, pod, container, destPath);

    // Send encoded archive output stream
    File srcFile = new File(srcPath.toUri());
    try (ArchiveOutputStream archiveOutputStream =
            new TarArchiveOutputStream(proc.getOutputStream());
        FileInputStream input = new FileInputStream(srcFile)) {
      ArchiveEntry tarEntry = new TarArchiveEntry(srcFile, destPath.getFileName().toString());

      archiveOutputStream.putArchiveEntry(tarEntry);
      Streams.copy(input, archiveOutputStream);
      archiveOutputStream.closeArchiveEntry();

      return new ProcessFuture(proc);
    }
  }

  public void copyFileToPod(
      String namespace, String pod, String container, byte[] src, Path destPath)
      throws ApiException, IOException {
    try {
      int exit = copyFileToPodAsync(namespace, pod, container, src, destPath).get();
      if (exit != 0) {
        throw new IOException("Copy failed: " + exit);
      }
    } catch (InterruptedException | ExecutionException ex) {
      throw new IOException(ex);
    }
  }

  public Future<Integer> copyFileToPodAsync(
      String namespace, String pod, String container, byte[] src, Path destPath)
      throws ApiException, IOException {
    // Run decoding and extracting processes
    final Process proc = execCopyToPod(namespace, pod, container, destPath);

    try (ArchiveOutputStream archiveOutputStream =
        new TarArchiveOutputStream(proc.getOutputStream())) {

      ArchiveEntry tarEntry = new TarArchiveEntry(new File(destPath.getFileName().toString()));
      ((TarArchiveEntry) tarEntry).setSize(src.length);

      archiveOutputStream.putArchiveEntry(tarEntry);
      Streams.copy(new ByteArrayInputStream(src), archiveOutputStream);
      archiveOutputStream.closeArchiveEntry();

      return new ProcessFuture(proc);
    }
  }

  private Process execCopyToPod(String namespace, String pod, String container, Path destPath)
      throws ApiException, IOException {
    // TODO: This assumes Linux and won't work on Windows Containers (for many reasons...)
    String parentPath = destPath.getParent() != null ? destPath.getParent().toString() : ".";
    parentPath = parentPath.replace("\\", "/");
    return this.exec(
        namespace,
        pod,
        new String[] {"sh", "-c", "tar -xmf - -C " + parentPath},
        container,
        true,
        false);
  }

  private boolean isTarPresentInContainer(String namespace, String pod, String container)
      throws ApiException, IOException {
    final Process proc =
        this.exec(
            namespace, pod, new String[] {"sh", "-c", "tar --version"}, container, false, false);
    // This will work for POSIX based operating systems
    try {
      int status = proc.waitFor();
      return status != 127;
    } catch (InterruptedException ex) {
      throw new IOException(ex);
    } finally {
      proc.destroy();
    }
  }

  private static class ProcessFuture implements Future<Integer> {
    private Process proc;

    ProcessFuture(Process proc) {
      this.proc = proc;
    }

    // TODO: support cancelling?
    public boolean cancel(boolean interupt) {
      return false;
    }

    public boolean isCancelled() {
      return false;
    }

    public Integer get() throws InterruptedException {
      proc.waitFor();
      proc.destroy();
      return proc.exitValue();
    }

    public Integer get(long timeout, TimeUnit unit) throws InterruptedException {
      proc.waitFor(timeout, unit);
      proc.destroy();
      return proc.exitValue();
    }

    public boolean isDone() {
      return proc.isAlive();
    }
  }
}
