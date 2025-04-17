package com.excellence.manytoone.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    @NotEmpty(message = "Please Provide FirstName")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotEmpty(message = "Please Provide MiddleName")
    @Column(name = "middle_name", nullable = false)
    private String middleName;

    @NotEmpty(message = "Please Provide LastName")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotEmpty(message = "Please Select Gender")
    @Column(name = "gender", nullable = false)
    private String gender;

    @NotEmpty(message = "Please Select Skill")
    @Column(name = "skill", nullable = false)
    private String[] skill;

    @Email(message = "Please Provide Valid Email")
    @NotEmpty(message = "Please Provide Email")
    @Column(name = "email", nullable = false)
    private String email;

    @NotEmpty(message = "Please Provide Mobile Number")
    @Column(name = "mobile", nullable = false)
    private String mobile;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please Provide BirthDate")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @NotEmpty(message = "Please Provide UserName")
    @Column(name = "user_name", nullable = false)
    private String userName;

    @Size(message = "Password Must Be Between 8 And 15 Characters", min = 8, max = 15)
    @NotEmpty(message = "Please Provide Password")
    @Column(name = "password", nullable = false)
    private String password;

    @Valid
    @NotNull(message = "Please Select Department")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}