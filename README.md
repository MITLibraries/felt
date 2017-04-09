# felt - Fedora ELectronic Theses Workflow #

[![Build Status](https://travis-ci.org/MITLibraries/felt.svg?branch=master)](https://travis-ci.org/MITLibraries/felt)

Felt is a rudimentary tool to support ethesis ingest into a Fedora4 repository.
It is a standalone (CLI) Apache Camel container that observes a configured directory,
and processes XML-encoded descriptive metadata files, PDF files of the complete thesis,
and a set of page TIFFs.

## Requirements ##

The tool needs to compile and run on a Java8 VM, using Gradle as the build tool.

## Deployment ##

Compile the tool as a so-called 'fat' jar:

    ./gradlew fatJar

which will include all the dependencies, so the service is started with this simple invocation:

    java -jar felt-all-<version>.jar -w <work directory> -r <repository API base>

Just Ctrl-C to terminate the container. For convenience, the work directory may be omitted and
defaults to the CWD, and the repository also defaults to a local test instance at:

    localhost:8080/rest

Simply place ethesis artifacts into the work directory to trigger ingest.

## Constraints and Limits ##

Currently, there are constraints on the workflow. First, the metadata file must be ingested _before_ any of the other artifacts.
Second, the workflow relies on file names to provide unique resource names in the repository. Thus, the artifacts _must_
be named as follows (with the unique id as 'id'):

    id.xml -> metadata file
    id.pdf -> PDF of thesis
    id/001.tif
    id/002.tif -> TIFF pages
