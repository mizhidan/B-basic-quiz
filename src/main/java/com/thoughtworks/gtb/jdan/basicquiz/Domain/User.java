package com.thoughtworks.gtb.jdan.basicquiz.Domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @NotNull
    private long id;
    @NotNull
    private String name;
    @NotNull
    private long age;
    @NotNull
    private String avatar;
    @NotNull
    private String description;
}
