package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    public Employer() {

    }
    @NotNull(message = "Location is required")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters long")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @OneToMany
    @JoinColumn
    private List<Employer> jobs=new ArrayList<>();
    public List<Employer> getEmployer() {
        return jobs;
    }

}
