package com.flux.uvew.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document(value = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private Set<String> subsribedToUsers;
    private Set<String> subsribers;
    private List<String> videoHistory;
    private List<String> likedVideos;
    private List<String> dislikedVideos;


}
