package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Match;
import com.wecp.progressive.service.MatchService;

public class MatchServiceImplJdbc implements MatchService {

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
    public Integer addMatch(Match match) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteMatch(int matchId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Match> getAllMatches() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Match> getAllMatchesByStatus(String status) {
        // TODO Auto-generated method stub
        return MatchService.super.getAllMatchesByStatus(status);
    }

    @Override
    public Match getMatchById(int matchId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateMatch(Match match) {
        
    }

    

}