package io.kubernetes.client.util;

import io.kubernetes.client.ApiClient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

/**
 * Tests for the Config helper class
 */
public class ConfigTest {
    @Rule
    public final EnvironmentVariables environmentVariables
        = new EnvironmentVariables();
        
    @Test
    public void testDefaultClientNothingPresent() {
        environmentVariables.set("HOME", "/non-existent");
        try {
            ApiClient client = Config.defaultClient();
            assertEquals("http://localhost:8080", client.getBasePath());
        } catch (IOException ex) {
            fail("Unexpected exception: " + ex);
        }
    }

    public static String HOME_CONFIG = 
        "apiVersion: v1\n" +
        "clusters:\n" +
        "- cluster:\n" +
        "    server: http://home.dir.com\n" +
        "  name: foo\n" +
        "contexts:\n" + 
        "- context:\n" +
        "    cluster: foo\n" + 
        "  name: foo-context\n" +
        "current-context: foo-context\n";

    public static String KUBECONFIG = 
        "apiVersion: v1\n" +
        "clusters:\n" +
        "- cluster:\n" +
        "    server: http://kubeconfig.dir.com\n" +
        "  name: foo\n" +
        "contexts:\n" + 
        "- context:\n" +
        "    cluster: foo\n" + 
        "  name: foo-context\n" +
        "current-context: foo-context\n";

    File config = null;
    File dir = null;
    File kubedir = null;
    File configFile = null;

    @Before
    public void setUp() throws IOException {
        dir = new File("/tmp/tester");
        dir.mkdir();
        kubedir = new File(dir, ".kube");
        kubedir.mkdir();
        config = new File(kubedir, "config");
        FileWriter writer = new FileWriter(config);
        writer.write(HOME_CONFIG);
        writer.flush();
        writer.close();

        configFile = File.createTempFile("config", "");
        writer = new FileWriter(configFile);
        writer.write(KUBECONFIG);
        writer.flush();
        writer.close();
    }

    @After
    public void tearDown() throws IOException {
        if (config != null) {
            config.delete();
        }
        if (kubedir != null) {
            kubedir.delete();
        }
        if (dir != null) {
            dir.delete();
        }
        if (configFile != null) {
            configFile.delete();
        }
    }

    @Test
    public void testDefaultClientHomeDir() {
        try {
            environmentVariables.set("HOME", dir.getCanonicalPath());
            ApiClient client = Config.defaultClient();
            assertEquals("http://home.dir.com", client.getBasePath());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Unexpected exception: " + ex);
        }
    }

    @Test
    public void testDefaultClientKubeConfig() {
        try {
            environmentVariables.set("KUBECONFIG", configFile.getCanonicalPath());
            ApiClient client = Config.defaultClient();
            assertEquals("http://kubeconfig.dir.com", client.getBasePath());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Unexpected exception: " + ex);
        }
    }

    @Test
    public void testDefaultClientPrecedence() {
        try {
            environmentVariables.set("HOME", dir.getCanonicalPath());
            environmentVariables.set("KUBECONFIG", configFile.getCanonicalPath());
            ApiClient client = Config.defaultClient();
            // $KUBECONFIG should take precedence over $HOME/.kube/config
            assertEquals("http://kubeconfig.dir.com", client.getBasePath());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Unexpected exception: " + ex);
        }
    }
}
