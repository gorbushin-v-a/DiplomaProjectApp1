package com.example.diplomaprojectaddapp1.service;

import com.example.diplomaprojectaddapp1.documents.Testcoll;
import com.example.diplomaprojectaddapp1.repository.TestcollRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class TestcollSericeImpl implements TestcollService{

    private TestcollRepository testcollRepository;

    @Override
    public List<Testcoll> get() {
        return testcollRepository.findAll();
    }

    @Override
    public List<Testcoll> save(Testcoll testcoll) {
        return Collections.singletonList(testcollRepository.save(testcoll));
    }
}
