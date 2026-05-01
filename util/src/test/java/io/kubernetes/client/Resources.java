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

import io.kubernetes.client.util.Streams;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Resources {

  public static URL getResource(String name) {
    return Resources.class.getClassLoader().getResource(name);
  }

  public static String toString(URL url, Charset charset) {
    try {
      return Streams.toString(new InputStreamReader(url.openStream(), charset));
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * Returns a filesystem path for the named classpath resource.
   *
   * <p>In Maven, test resources are extracted to {@code target/test-classes/} as real files, so
   * {@link ClassLoader#getResource(String)} returns a {@code file:} URL whose path can be used
   * directly as a filesystem path.
   *
   * <p>Under Bazel, resources are bundled inside the test JAR, so {@code getResource()} returns a
   * {@code jar:} URL. This method transparently extracts all classpath resources to a temporary
   * directory on the first call, and returns the path to the named resource within that directory.
   *
   * @param name resource name (relative to the classpath root), or {@code ""} for the root dir
   * @return an absolute filesystem path to the resource
   */
  public static String getPath(String name) {
    URL url = getResource(name);
    if (url != null && "file".equals(url.getProtocol())) {
      try {
        return new File(url.toURI()).getAbsolutePath();
      } catch (URISyntaxException e) {
        throw new RuntimeException(e);
      }
    }
    // Bazel (jar: URL) or empty-string root: extract all resources to a temp dir.
    Path dir = getExtractedResourceDir();
    return name.isEmpty() ? dir.toString() : dir.resolve(name).toString();
  }

  // ---- JAR extraction ----

  /** Holder class ensures the extracted resource directory is initialized exactly once. */
  private static final class ExtractedDirHolder {
    static final Path DIR = createExtractedResourceDir();

    private static Path createExtractedResourceDir() {
      try {
        Path tempDir = Files.createTempDirectory("k8s-test-resources-");
        extractClasspathResourcesToDir(tempDir);
        return tempDir;
      } catch (IOException e) {
        throw new RuntimeException("Failed to extract test resources", e);
      }
    }
  }

  private static Path getExtractedResourceDir() {
    return ExtractedDirHolder.DIR;
  }

  private static void extractClasspathResourcesToDir(Path destDir) throws IOException {
    URL rootUrl = Resources.class.getClassLoader().getResource("");
    if (rootUrl == null || !"jar".equals(rootUrl.getProtocol())) {
      return;
    }
    // rootUrl is like jar:file:/path/to/test.jar!/
    String jarUrlPath = rootUrl.getPath(); // "file:/path/to/test.jar!/"
    int sep = jarUrlPath.indexOf('!');
    if (sep < 0) {
      return;
    }
    String jarFilePath = new URL(jarUrlPath.substring(0, sep)).getPath();
    try (JarFile jar = new JarFile(jarFilePath)) {
      Enumeration<JarEntry> entries = jar.entries();
      while (entries.hasMoreElements()) {
        JarEntry entry = entries.nextElement();
        String entryName = entry.getName();
        // Skip directories and .class files — only extract resource files
        // (.class files are already on the classpath via the JAR itself).
        if (entry.isDirectory() || entryName.endsWith(".class")) {
          continue;
        }
        Path destFile = destDir.resolve(entryName);
        Files.createDirectories(destFile.getParent());
        try (InputStream is = jar.getInputStream(entry)) {
          Files.copy(is, destFile, StandardCopyOption.REPLACE_EXISTING);
        }
      }
    }
  }
}
