package pk.edu.iba.rh.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */

@Data
@Entity
@EqualsAndHashCode
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;

    private String userTagLine;

    private String userSummary;

    private int userAge;

    private String userPhoneNumber;

    private String userAddress;

    private String userWebsite;

    private String userEmail;

    private String userNationality;

    @OneToMany(
            cascade = CascadeType.MERGE,
            orphanRemoval = true
    )
    private List<Link> socialLinks = new ArrayList<>();

    @OneToMany(
            cascade = CascadeType.MERGE,
            orphanRemoval = true
    )
    private List<Skill> skills = new ArrayList<>();

    @OneToMany(
            cascade = CascadeType.MERGE,
            orphanRemoval = true
    )
    private List<Education> educations = new ArrayList<>();

    @OneToMany(
            cascade = CascadeType.MERGE,
            orphanRemoval = true
    )
    private List<Experience> experiences = new ArrayList<>();

}
