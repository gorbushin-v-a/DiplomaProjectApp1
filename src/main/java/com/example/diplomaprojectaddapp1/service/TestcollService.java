package com.example.diplomaprojectaddapp1.service;

import com.example.diplomaprojectaddapp1.documents.Testcoll;

import java.util.List;

public interface TestcollService {

    List<Testcoll> get();
    List<Testcoll> save(Testcoll testcoll);
}
