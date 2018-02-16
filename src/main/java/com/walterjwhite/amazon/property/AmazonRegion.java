package com.walterjwhite.amazon.property;

import com.amazonaws.regions.Regions;
import com.walterjwhite.google.guice.property.property.DefaultValue;
import com.walterjwhite.google.guice.property.property.GuiceProperty;

public interface AmazonRegion extends GuiceProperty {
  @DefaultValue Regions Default = Regions.US_EAST_1;
}
