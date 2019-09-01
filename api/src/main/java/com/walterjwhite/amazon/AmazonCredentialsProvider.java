package com.walterjwhite.amazon;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.walterjwhite.amazon.property.AmazonAccessKeyId;
import com.walterjwhite.amazon.property.AmazonSecretAccessKey;
import com.walterjwhite.property.impl.annotation.Property;
import javax.inject.Inject;
import javax.inject.Provider;

public class AmazonCredentialsProvider implements Provider<AWSCredentialsProvider> {
  protected final AWSCredentialsProvider amazonCredentialsProvider;

  @Inject
  public AmazonCredentialsProvider(
      @Property(AmazonAccessKeyId.class) String amazonAccessKeyId,
      @Property(AmazonSecretAccessKey.class) String amazonSecretAccessKey) {
    super();

    amazonCredentialsProvider =
        new DefaultAWSCredentialsProvider(amazonAccessKeyId, amazonSecretAccessKey);
  }

  @Override
  public AWSCredentialsProvider get() {
    return amazonCredentialsProvider;
  }
}
