//package com.example.demo.model;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.Set;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//public class Course {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String title;
//    private String abbreviation;
//    private int modules;
//    private double fee;
//
//    @ManyToMany(mappedBy = "course",fetch = FetchType.LAZY)
//    @JsonBackReference
//    private Set<Student> students;
//}
