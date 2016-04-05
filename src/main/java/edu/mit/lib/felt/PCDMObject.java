/**
 * Copyright (C) 2016 MIT Libraries
 * Licensed under: http://www.apache.org/licenses/LICENSE-2.0
 */
package edu.mit.lib.felt;

import org.apache.camel.Handler;

/**
  * Camel Processor for constructing PCDM objects via fcrepo endpoints
  * @author richardrodgers
  */

public class PCDMObject {

  private static final String PREFIXES = "@prefix pcdm: <http://pcdm.org/models#>";
  private static final String OBJECT_PROP = "<> a pcdm:Object .";

  @Handler
  public String convert(Object body) {
      //System.out.println("In PCDMObject");
      return PREFIXES + "\n\n" + OBJECT_PROP;
  }
}
