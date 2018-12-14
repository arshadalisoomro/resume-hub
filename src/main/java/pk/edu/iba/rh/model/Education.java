package pk.edu.iba.rh.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ADMIN on 12/14/2018.
 */

@Data
@Entity
@EqualsAndHashCode
@ToString
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationId;

    private String educationTitle;

    private String educationSchoolName;

    private String educationDuration;

    private String educationSummary;

}
