package dev.tobiadegbuji.realestatesaas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    //Created UUID generator. Generator creates a random UUID
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Version //Enables Optimistic Locking
    private Long version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp timestamp;

    @UpdateTimestamp
    private Timestamp lastModifiedDate;

    //Providing default value to deleted
    @Column(nullable = false, columnDefinition = "boolean default false")
    private boolean deleted;



}
