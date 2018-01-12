# Deploy to Maven release process

This document describes how to configure and use the [Maven release
plugin](http://maven.apache.org/maven-release/maven-release-plugin) to publish
to [Sonatype](http://central.sonatype.org/).

Releases are done on an as-needed basis, and this doc applies only to
[OWNERS](https://github.com/kubernetes-client/java/blob/master/OWNERS).

This does _not_ describe the process of cherry-picking changes onto release
branches.

## One time setup

You will need to have the following in place:

1. SSH keys for an account capable of pushing commits & tags to
   https://github.com/kubernetes-client/java. These will be used by the release
   plugin to push an updated pom.xml along with a tag corresponding to the
   release being performed. If you don't have these keys, follow [this
   guide](https://help.github.com/articles/connecting-to-github-with-ssh/).

2. [A Sonatype JIRA
   account](https://issues.sonatype.org/secure/Signup!default.jspa) that's been
   authorized to publish to `io.kubernetes:client-java`. With your credentials
   in-hand, place these in your `settings.xml` (typically
   `~/.m2/settings.xml`) config file. An example config is:
```xml
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>your-jira-id</username>
      <password>your-jira-pwd</password>
    </server>
  </servers>
</settings>
```

3. A GPG key - if you are a publisher, you should already have a copy. You will
   be prompted on STDIN to enter the key's passphrase during release.

## Doing a release

There are three stages to a release explained in detail below:

### 1. Collect requirements and propose your release

Prior to publishing a release, you need to collect three release-specific pieces
of information:

1. This release's version. We follow [semver](http://semver.org/) to determine
   release versions.

2. This release's changelog. This can generally be inferred from the commit
   history, which may need some modification to make presentable. A quick way
   to collect the commit history is to run
   `git log <last-release-tag>..HEAD --online`.

3. This release's Kubernetes API compatability changes (if applicable).
   Generally, if this release reduces functionality with a specific version of
   the Kubernetes API it's worth bumping the major version number to indicate a
   breaking change.

File an [issue](https://github.com/kubernetes-client/java/issues) with the
title `Propose release <VERSION>`, and open a PR against the `master` branch
with an updated changelog and compatibility matrix (if necessary). Once at
least one other
[OWNER](https://github.com/kubernetes-client/java/blob/master/OWNERS) LGTMs the
PR, merge it, and close the issue.

### 2. Publish the release to Maven Central

Before we can publish to Maven Central, we need decide on our release branch.

The release branch will always be of the form `release-<MAJOR>.<MINOR>`. Any
time a `<MAJOR>` or `<MINOR>` version number is incremented, a new release
branch needs to be created with `git checkout -b release-<MAJOR>.<MINOR>` _from
the branch containing the changes you want to release_. If you are only
releasing bug fixes for an existing `<MAJOR>.<MINOR>` release (a patch
release), you simply checkout that existing release branch `git checkout
release-<MAJOR>.<MINOR>`.

Now we are ready to perform the release.

Make sure there are no unstaged changes, otherwise `mvn` will reject the
release. There are two commands to be run in the root directory:

1. `mvn release:prepare -DdryRun=true`: This will perform a dry run of the
   automated SCM modifications that will performed in the next step. If
   everything looks OK - you're good to continue.

2. `mvn release:clean release:prepare release:perform`: This will first clean
   any staged modifications made in the prior run, commit a new `pom.xml`
   version, tag your source with the current release, build and sign your
   artifacts with your GPG key, and publish the release to Maven central.

At this point, you will have an unstaged change changing the value of the
version in `pom.xml` to `<NEXT_RELEASE>-SNAPSHOT`. Commit this change and push
it to the upstream _current_ release branch. This allows future development for
the next release to happen on this branch.

Finally, merge any changes in your release branch back into master by opening a
PR against the main repository. 

### 3. Release announcements

Now that the release is consumable, there are two things left to do:

1. Find the newly released tag that was pushed by `mvn release:prepare` under
   the [tags](https://github.com/kubernetes-client/java/tags) of the client
   library, and click "Add release notes". Title the release version of the form
   `MAJOR.MINOR.PATCH`, and include the changelog in the release description.

2. Send an email to `kubernetes-dev@googlegroups.com` with the subject
   `[ANNOUNCE] kubernetes-java-client <VERSION> is released`, and include a
   link to the release created in step 3.1 in the message body.

## Troubleshooting

Let's add entries here as we run into problems.

* **Authentication problems**: Ensure your git SSH keys & JIRA account have
  access to https://github.com/kubernetes-client/java and the
  `io.kubernetes:client-java` repositories respectively. If this is the case,
  check `mvn release:<command>` output for complaints of malformed
  `settings.xml` entries.

* **Undo a mistake**: If you've made a mistake during a release, and the
  release hasn't been published, running `mvn release:clean` will unstage local
  changes and remove generated release configuration, returning the state of
  your git repo to normal.
