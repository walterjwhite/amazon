package com.walterjwhite.amazon;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.google.inject.AbstractModule;

public class AmazonModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(AWSCredentialsProvider.class).toProvider(AmazonCredentialsProvider.class);
  }
}
