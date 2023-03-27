package com.cassandra.poc.demo.entity;

import com.datastax.driver.core.utils.UUIDs;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
  @PrimaryKey
  private UUID id = UUIDs.timeBased();;

  private String name;
  private Integer age;
  private Integer salary;

}
