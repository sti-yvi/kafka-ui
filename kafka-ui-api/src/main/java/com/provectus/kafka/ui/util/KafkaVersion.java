package com.provectus.kafka.ui.util;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KafkaVersion {

  public static Optional<Float> parse(String version) throws NumberFormatException {
    try {
      final String[] parts = version.split("\\.");
      if (parts.length > 2) {
        version = parts[0] + "." + parts[1];
      }
      return Optional.of(Float.parseFloat(version.split("-")[0]));
    } catch (Exception e) {
      return Optional.empty();
    }
  }
}
