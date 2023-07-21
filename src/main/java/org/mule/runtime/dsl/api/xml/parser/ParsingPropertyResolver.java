/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 */
package org.mule.runtime.dsl.api.xml.parser;

/**
 * Resolve values for XML properties.
 * <p/>
 * Properties have the following syntax: ${PROPERTY_KEY} where the property key is the unique identifier for the property.
 * <p/>
 * During processing of XML configuration files not all properties will be resolved. Only the ones required to fully process the
 * XML configuration files. For instance the properties used within the <import/> element.
 * 
 * @since 4.2
 */
public interface ParsingPropertyResolver {

  /**
   * Resolver the value for a property key.
   * 
   * @param propertyKey property key
   * @return the property value
   */
  String resolveProperty(String propertyKey);

}
