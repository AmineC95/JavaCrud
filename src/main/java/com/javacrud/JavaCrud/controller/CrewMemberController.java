package com.javacrud.JavaCrud.controller;


import com.javacrud.JavaCrud.CrewMember;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class CrewMemberController {
    private List<CrewMember> crewMemberList = new ArrayList<CrewMember>();

    @PostMapping("/post")
    public void createCrew(@RequestBody CrewMember crewMember){
            crewMemberList.add(crewMember);
        }
    @GetMapping("/get")
    public List<CrewMember> getCrewMembers() {
        return this.crewMemberList.stream().filter(crewMember -> crewMember.getSalary()>10000).toList();
    }

    @PutMapping("/put")
    public void updateCrew(@RequestBody CrewMember crewMember) {
        this.crewMemberList.stream()
        .filter(crewMember1 -> crewMember1.getName().equals(crewMember.getName()))
        .findFirst().get().setName("Simon");


    }
    @DeleteMapping("/del")
    public void deleteCrew(@RequestBody CrewMember crewMember) {

        crewMemberList = crewMemberList.stream()
                .filter(e -> !e.getName().equals(crewMember.name) && !e.getJob().equals(crewMember.job))
                .collect(Collectors.toList());
    }

}
