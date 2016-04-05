/**
 * Copyright (C) 2016 MIT Libraries
 * Licensed under: http://www.apache.org/licenses/LICENSE-2.0
 */
package edu.mit.lib.felt;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;

import static com.google.common.base.Strings.*;

/**
  * Camel TypeConverter for MARC XML to various formats
  * Not yet implemented
  *
  * @author richardrodgers
  */

public class MarcXmlTypeConverter {

  private final Path workDir;
  private final String repoAddr;

  public MarcXmlTypeConverter(Path workDir, String repoAddr) {
    this.workDir = workDir;
    this.repoAddr = repoAddr;
  }
}
