package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplJpa implements TeamService {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public int addTeam(Team team) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteTeam(int teamId) {
        // TODO Auto-generated method stub
        TeamService.super.deleteTeam(teamId);
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        TeamService.super.emptyArrayList();
    }

    @Override
    public List<Team> getAllTeams() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Team getTeamById(int teamId) {
        // TODO Auto-generated method stub
        return TeamService.super.getTeamById(teamId);
    }

    @Override
    public void updateTeam(Team team) {
        // TODO Auto-generated method stub
        TeamService.super.updateTeam(team);
    }

    

}